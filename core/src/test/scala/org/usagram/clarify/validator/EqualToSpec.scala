package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldEqualTo

import org.scalatest._
import org.scalatest.OptionValues._

class EqualToSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an EqualTo with given that") {
      val validator = EqualTo("A value")
      val error = validator.validate("a value")
      error.value.asInstanceOf[ShouldEqualTo[String]].value should be("A value")
    }
  }

  describe("#validate") {
    val validator = EqualTo("a value")

    describe("when equal to that") {
      it("returns no errors") {
        val error = validator.validate("a value")
        error should be(empty)
      }
    }

    describe("when don't equal to that") {
      it("returns ShouldEqualTo") {
        val error = validator.validate("other value")
        error should be(defined)
        error.value.asInstanceOf[ShouldEqualTo[String]].value should be("a value")
      }
    }
  }
}
