package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldBeLessThanOrEqualTo

import org.scalatest._
import org.scalatest.OptionValues._

class LessThanOrEqualToSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns a LessThanOrEqualTo with given that") {
      val validator = LessThanOrEqualTo(100)
      val error = validator.validate(101)
      error.value.asInstanceOf[ShouldBeLessThanOrEqualTo[Int]].value should be(100)
    }
  }

  describe("#validate") {
    val validator = LessThanOrEqualTo(100)

    describe("when be less than or equal to that") {
      it("returns no errors") {
        val error = validator.validate(100)
        error should be(empty)
      }
    }

    describe("when be not less than or equal to that") {
      it("returns ShouldBeLessThanOrEqualTo") {
        val error = validator.validate(101)
        error should be(defined)
        error.value.asInstanceOf[ShouldBeLessThanOrEqualTo[Int]].value should be(100)
      }
    }
  }
}
