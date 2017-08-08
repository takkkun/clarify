package org.usagram.clarify.validator

import org.usagram.clarify.error.{ Errors, Error, CannotBeBlank }

import org.scalatest._
import org.scalatest.OptionValues._

class EachOfSeqSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an EachOfSeq with given validator") {
      val validator = EachOfSeq(AlwaysFail)
      val error = validator.validate(Seq("a value", "other value"))
      error.value.asInstanceOf[Errors[Int]].errors should be(Map(0 -> Error, 1 -> Error))
    }
  }

  describe("#validate") {
    val validator = EachOfSeq(NotBlank)

    describe("when all values are valid") {
      it("returns no errors") {
        val error = validator.validate(Seq("a value", "other value"))
        error should be(empty)
      }
    }

    describe("when a value is invalid") {
      it("returns Errors contained errors in the inner validator") {
        val error = validator.validate(Seq("a value", "", ""))
        error should be(defined)
        error.value.asInstanceOf[Errors[Int]].errors should be(Map(1 -> CannotBeBlank, 2 -> CannotBeBlank))
      }
    }
  }
}
