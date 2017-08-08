package org.usagram.clarify.validator

import org.usagram.clarify.error.{ Error, CannotBeBlank }

import org.scalatest._
import org.scalatest.OptionValues._

class OptionallySpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an Optionally with given validator") {
      val validator = Optionally(AlwaysFail)
      val error = validator.validate(Some("a value"))
      error.value should be(Error)
    }
  }

  describe("#validate") {
    val validator = Optionally(NotBlank)

    describe("when take None") {
      it("returns no errors") {
        val error = validator.validate(None)
        error should be(empty)
      }
    }

    describe("when take Some(valid value)") {
      it("returns no errors") {
        val error = validator.validate(Some("a value"))
        error should be(empty)
      }
    }

    describe("when take Some(invalid value)") {
      it("returns an error in the inner validator") {
        val error = validator.validate(Some(""))
        error should be(defined)
        error.value should be(CannotBeBlank)
      }
    }
  }
}
