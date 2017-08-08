package org.usagram.clarify.validator

import org.usagram.clarify.error.{ ShouldBeLessThan, ShouldBeLessThanOrEqualTo }

import org.scalatest._
import org.scalatest.OptionValues._

class LessThanSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns a LessThan with given that") {
      val validator = LessThan(100)
      val error = validator.validate(100)
      error.value.asInstanceOf[ShouldBeLessThan[Int]].value should be(100)
    }
  }

  describe("#validate") {
    val validator = LessThan(100)

    describe("when be less than that") {
      it("returns no errors") {
        val error = validator.validate(99)
        error should be(empty)
      }
    }

    describe("when be not less than that") {
      it("returns ShouldBeLessThan") {
        val error = validator.validate(100)
        error should be(defined)
        error.value.asInstanceOf[ShouldBeLessThan[Int]].value should be(100)
      }
    }
  }

  describe("#orEqual") {
    it("returns a LessThanOrEqualTo with that") {
      val validator = LessThan(100).orEqual
      val error = validator.validate(101)
      error.value.asInstanceOf[ShouldBeLessThanOrEqualTo[Int]].value should be(100)
    }
  }
}
