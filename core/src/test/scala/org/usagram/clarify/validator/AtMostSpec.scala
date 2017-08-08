package org.usagram.clarify.validator

import org.usagram.clarify.error.{ UpToAtMost, TooLongString }

import org.scalatest._
import org.scalatest.OptionValues._

class AtMostSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an AtMost with given limit") {
      val validator = AtMost(1)
      val error = validator.validate(Seq("a value", "other value"))
      error.value.asInstanceOf[UpToAtMost].limit should be(1)
    }
  }

  describe("#validate") {
    val validator = AtMost(1)

    describe("when limit or less") {
      it("returns no errors") {
        val error = validator.validate(Seq("a value"))
        error should be(empty)
      }
    }

    describe("when over limit") {
      it("returns UpToAtMost") {
        val error = validator.validate(Seq("a value", "other value"))
        error should be(defined)
        error.value should be(UpToAtMost(1))
      }
    }
  }

  describe("#characters") {
    it("returns an AtMostCharacters with limit") {
      val validator = AtMost(100).characters
      val error = validator.validate("x" * 101)
      error.value.asInstanceOf[TooLongString].limit should be(100)
    }
  }
}
