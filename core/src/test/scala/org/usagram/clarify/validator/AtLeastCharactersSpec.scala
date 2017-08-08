package org.usagram.clarify.validator

import org.usagram.clarify.InvalidValueException
import org.usagram.clarify.error.TooShortString

import org.scalatest._
import org.scalatest.OptionValues._

class AtLeastCharactersSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns an AtLeastCharacters with given limit") {
      val validator = AtLeastCharacters(8)
      val error = validator.validate("a value")
      error.value.asInstanceOf[TooShortString].limit should be(8)
    }

    describe("when take limit = 0 or less") {
      it("throws InvalidValueException") {
        intercept[InvalidValueException] {
          AtLeastCharacters(0)
        }
      }
    }
  }

  describe("#validate") {
    val validator = AtLeastCharacters(8)

    describe("when limit or more") {
      it("returns no errors") {
        val error = validator.validate("a value+")
        error should be(empty)
      }
    }

    describe("when below limit") {
      it("returns TooShortString") {
        val error = validator.validate("a value")
        error should be(defined)
        error.value should be(TooShortString(8))
      }
    }
  }
}
