package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldBeGreaterThanOrEqualTo

import org.scalatest._
import org.scalatest.OptionValues._

class GreaterThanOrEqualToSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns a GreaterThanOrEqualTo with given that") {
      val validator = GreaterThanOrEqualTo(10)
      val error = validator.validate(9)
      error.value.asInstanceOf[ShouldBeGreaterThanOrEqualTo[Int]].value should be(10)
    }
  }

  describe(".zero") {
    it("returns a GreaterThanOrEqualTo with that = 0") {
      val validator = GreaterThanOrEqualTo.zero[Int]
      val error = validator.validate(-1)
      error.value.asInstanceOf[ShouldBeGreaterThanOrEqualTo[Int]].value should be(0)
    }
  }

  describe(".one") {
    it("returns a GreaterThanOrEqualTo with that = 1") {
      val validator = GreaterThanOrEqualTo.one[Int]
      val error = validator.validate(0)
      error.value.asInstanceOf[ShouldBeGreaterThanOrEqualTo[Int]].value should be(1)
    }
  }

  describe("#validate") {
    val validator = GreaterThanOrEqualTo.zero[Int]

    describe("when be greater than or equal to that") {
      it("returns no errors") {
        val error = validator.validate(0)
        error should be(empty)
      }
    }

    describe("when be not greater than or equal to that") {
      it("returns ShouldBeGreaterThanOrEqualTo") {
        val error = validator.validate(-1)
        error should be(defined)
        error.value.asInstanceOf[ShouldBeGreaterThanOrEqualTo[Int]].value should be(0)
      }
    }
  }
}
