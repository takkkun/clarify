package org.usagram.clarify.validator

import org.usagram.clarify.error.TooLongString

import org.scalatest._
import org.scalatest.OptionValues._

class AtMostCharactersSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an AtMostCharacters with given limit") {
      val validator = AtMostCharacters(6)
      val error = validator.validate("a value")
      error.value.asInstanceOf[TooLongString].limit should be(6)
    }
  }

  describe("#validate") {
    val validator = AtMostCharacters(7)

    describe("when limit or less") {
      it("returns no errors") {
        val error = validator.validate("a value")
        error should be(empty)
      }
    }

    describe("when below limit") {
      it("returns TooLongString") {
        val error = validator.validate("a value+")
        error should be(defined)
        error.value should be(TooLongString(7))
      }
    }
  }
}
