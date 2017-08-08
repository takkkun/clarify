package org.usagram.clarify.validator

import org.usagram.clarify.error.{ Errors, Error, ShouldBeLessThanOrEqualTo }

import org.scalatest._
import org.scalatest.OptionValues._

class EachOfMapSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an EachOfMap with given validator") {
      val validator = EachOfMap[Int, String](AlwaysFail)
      val error = validator.validate(Map("one" -> 1, "two" -> 2))
      error.value.asInstanceOf[Errors[String]].errors should be(Map("one" -> Error, "two" -> Error))
    }
  }

  describe("#validate") {
    val validator = EachOfMap[Int, String](LessThanOrEqualTo(2))

    describe("when all values are valid") {
      it("returns no errors") {
        val error = validator.validate(Map("one" -> 1, "two" -> 2))
        error should be(empty)
      }
    }

    describe("when a value is invalid") {
      it("returns Errors contained errors in the inner validator") {
        val error = validator.validate(Map("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4))
        error should be(defined)
        error.value.asInstanceOf[Errors[String]].errors should be(Map("three" -> ShouldBeLessThanOrEqualTo(2), "four" -> ShouldBeLessThanOrEqualTo(2)))
      }
    }
  }
}
