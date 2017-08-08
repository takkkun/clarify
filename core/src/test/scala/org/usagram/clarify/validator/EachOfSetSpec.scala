package org.usagram.clarify.validator

import org.usagram.clarify.error.{ Errors, Error, CannotBeBlank }

import org.scalatest._
import org.scalatest.OptionValues._

class EachOfSetSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an EachOfSet with given validator") {
      val validator = EachOfSet[String](AlwaysFail)
      val error = validator.validate(Set("a value", "other value"))
      error.value.asInstanceOf[Errors[String]].errors should be(Map("a value" -> Error, "other value" -> Error))
    }
  }

  describe("#validate") {
    val validator = EachOfSet(NotBlank)

    describe("when all values are valid") {
      it("returns no errors") {
        val error = validator.validate(Set("a value", "other value"))
        error should be(empty)
      }
    }

    describe("when a value is invalid") {
      it("returns Errors contained errors in the inner validator") {
        val error = validator.validate(Set("a value", ""))
        error should be(defined)
        error.value.asInstanceOf[Errors[String]].errors should be(Map("" -> CannotBeBlank))
      }
    }
  }
}
