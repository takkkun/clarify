package org.usagram.clarify.validator

import org.usagram.clarify.error.{ ShouldBeGreaterThan, ShouldBeGreaterThanOrEqualTo }

import org.scalatest._
import org.scalatest.OptionValues._

class GreaterThanSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns a GreaterThan with given that") {
      val validator = GreaterThan(10)
      val error = validator.validate(10)
      error.value.asInstanceOf[ShouldBeGreaterThan[Int]].value should be(10)
    }
  }

  describe(".zero") {
    it("returns a GreaterThan with that = 0") {
      val validator = GreaterThan.zero
      val error = validator.validate(0)
      error.value.asInstanceOf[ShouldBeGreaterThan[Int]].value should be(0)
    }
  }

  describe("#validate") {
    val validator = GreaterThan.zero

    describe("when be greater than that") {
      it("returns no errors") {
        val error = validator.validate(1)
        error should be(empty)
      }
    }

    describe("when be not greater than that") {
      it("returns ShouldBeGreaterThan") {
        val error = validator.validate(0)
        error should be(defined)
        error.value.asInstanceOf[ShouldBeGreaterThan[Int]].value should be(0)
      }
    }
  }

  describe("#orEqual") {
    it("returns a GreaterThanOrEqualTo with that") {
      val validator = GreaterThan.zero.orEqual
      val error = validator.validate(-1)
      error.value.asInstanceOf[ShouldBeGreaterThanOrEqualTo[Int]].value should be(0)
    }
  }
}
