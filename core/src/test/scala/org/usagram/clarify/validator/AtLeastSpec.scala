package org.usagram.clarify.validator

import org.usagram.clarify.InvalidValueException
import org.usagram.clarify.error.{ RequireAtLeast, TooShortString }

import org.scalatest._
import org.scalatest.OptionValues._

class AtLeastSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an AtLeast with given limit") {
      val validator = AtLeast(2)
      val error = validator.validate(Seq("a value"))
      error.value.asInstanceOf[RequireAtLeast].limit should be(2)
    }

    describe("when take limit = 0 or less") {
      it("throws InvalidValueException") {
        intercept[InvalidValueException] {
          AtLeast(0)
        }
      }
    }
  }

  describe(".one") {
    it("returns an AtLeast with limit = 1") {
      val validator = AtLeast.one
      val error = validator.validate(Seq.empty)
      error.value.asInstanceOf[RequireAtLeast].limit should be(1)
    }
  }

  describe("#validate") {
    val validator = AtLeast.one

    describe("when limit or more") {
      it("returns no errors") {
        val error = validator.validate(Seq("a value"))
        error should be(empty)
      }
    }

    describe("when below limit") {
      it("returns RequireAtLeast") {
        val error = validator.validate(Seq.empty)
        error should be(defined)
        error.value should be(RequireAtLeast(1))
      }
    }
  }

  describe("#characters") {
    it("returns an AtLeastCharacters with limit") {
      val validator = AtLeast(10).characters
      val error = validator.validate("x" * 9)
      error.value.asInstanceOf[TooShortString].limit should be(10)
    }
  }
}
