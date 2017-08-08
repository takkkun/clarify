package org.usagram.clarify.validator

import org.usagram.clarify.error.Mismatch

import org.scalatest._
import org.scalatest.OptionValues._

class MatchSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    describe("when Regex") {
      it("returns a Match with given regex") {
        val validator = Match("\\bo\\w+".r)
        val error = validator.validate("a value")
        error.value.asInstanceOf[Mismatch].regex.regex should be("\\bo\\w+")
      }
    }

    describe("when String") {
      it("returns a Match with given string") {
        val validator = Match("A value")
        val error = validator.validate("a value")
        error.value.asInstanceOf[Mismatch].regex.regex should be("^\\QA value\\E$")
      }
    }
  }

  describe(".insensitively") {
    it("returns an insensitively Match with given string") {
      val validator = Match.insensitively("other value")
      val error = validator.validate("a value")
      error.value.asInstanceOf[Mismatch].regex.regex should be("(?i)^\\Qother value\\E$")
    }
  }

  describe("#validate") {
    val validator = Match("^a value$".r)

    describe("when match that") {
      it("returns no errors") {
        val error = validator.validate("a value")
        error should be(empty)
      }
    }

    describe("when don't match that") {
      it("returns Mismatch") {
        val error = validator.validate("other value")
        error should be(defined)
        error.value should be(a[Mismatch])
        error.value.asInstanceOf[Mismatch].regex.regex should be("^a value$")
      }
    }
  }
}
