package org.usagram.clarify.validator

import org.usagram.clarify.Tags
import org.usagram.clarify.error.Error

import org.scalatest._
import org.scalatest.OptionValues._

class ValidatorSpec extends FunSpec {
  import Matchers._

  case class TrackingValidator(error: Option[Error]) extends Validator[Any] {
    private var called = false

    def validate(value: Any) = {
      called = true
      error
    }

    def isCalled: Boolean =
      called
  }

  case object LeftError extends Error {
    def message(tags: Tags) = "left error"
  }

  case object RightError extends Error {
    def message(tags: Tags) = "right error"
  }

  describe("validator by #&&") {
    describe("when occurred an error in left validator") {
      it("returns an error in left validator") {
        val left = TrackingValidator(Some(LeftError))
        val right = TrackingValidator(Some(RightError))
        val validator = left && right
        val error = validator.validate("a value")
        error should be(defined)
        error.value should be(LeftError)
      }

      it("don't call right validator") {
        val left = TrackingValidator(Some(LeftError))
        val right = TrackingValidator(Some(RightError))
        val validator = left && right
        validator.validate("a value")
        left.isCalled should be(true)
        right.isCalled should be(false)
      }
    }

    describe("when occurred an error in right validator") {
      it("returns an error in right validator") {
        val left = TrackingValidator(None)
        val right = TrackingValidator(Some(RightError))
        val validator = left && right
        val error = validator.validate("a value")
        error should be(defined)
        error.value should be(RightError)
      }
    }

    describe("when didn't occur an error in both validators") {
      it("returns no errors") {
        val left = TrackingValidator(None)
        val right = TrackingValidator(None)
        val validator = left && right
        val error = validator.validate("a value")
        error should be(empty)
      }

      it("calls both validators") {
        val left = TrackingValidator(None)
        val right = TrackingValidator(None)
        val validator = left && right
        validator.validate("a value")
        left.isCalled should be(true)
        right.isCalled should be(true)
      }
    }
  }

  describe("validator by #/") {
    describe("when didn't occur an error in left validator") {
      it("returns no errors") {
        val left = TrackingValidator(None)
        val right = TrackingValidator(Some(RightError))
        val validator = left / right
        val error = validator.validate("a value")
        error should be(empty)
      }
    }

    describe("when didn't occur an error in right validator") {
      it("returns no errors") {
        val left = TrackingValidator(Some(LeftError))
        val right = TrackingValidator(None)
        val validator = left / right
        val error = validator.validate("a value")
        error should be(empty)
      }
    }

    describe("when occurred an error in both validators") {
      it("returns an error in right validator") {
        val left = TrackingValidator(Some(LeftError))
        val right = TrackingValidator(Some(RightError))
        val validator = left / right
        val error = validator.validate("a value")
        error should be(defined)
        error.value should be(RightError)
      }
    }
  }

  describe("validator by #\\") {
    describe("when didn't occur an error in left validator") {
      it("returns no errors") {
        val left = TrackingValidator(None)
        val right = TrackingValidator(Some(RightError))
        val validator = left \ right
        val error = validator.validate("a value")
        error should be(empty)
      }
    }

    describe("when didn't occur an error in right validator") {
      it("returns no errors") {
        val left = TrackingValidator(Some(LeftError))
        val right = TrackingValidator(None)
        val validator = left \ right
        val error = validator.validate("a value")
        error should be(empty)
      }
    }

    describe("when occurred an error in both validators") {
      it("returns an error in left validator") {
        val left = TrackingValidator(Some(LeftError))
        val right = TrackingValidator(Some(RightError))
        val validator = left \ right
        val error = validator.validate("a value")
        error should be(defined)
        error.value should be(LeftError)
      }
    }
  }
}
