package org.usagram.clarify

import org.usagram.clarify.error.Error

import org.scalatest._
import org.scalatest.OptionValues._

class IndefiniteSpec extends FunSpec {
  import Matchers.{ value => _, _ }

  private val value = Indefinite("a value").label("value")

  describe("#validateWith") {
    describe("when validation result has no errors") {
      it("returns a Valid") {
        val result = value.validateWith(_ => None)
        result should be(a[Valid[_]])

        val valid = result.asInstanceOf[Valid[String]]
        valid.value should be("a value")
        valid.tags.label.value should be("value")
      }
    }

    describe("when validation result has an error") {
      it("returns an Invalid") {
        val error = new Error { def message(tags: Tags) = "an error" }
        val result = value.validateWith(_ => Some(error))
        result should be(an[Invalid[_]])

        val invalid = result.asInstanceOf[Invalid[String]]
        invalid.value should be("a value")
        invalid.tags.label.value should be("value")
        invalid.error should be(error)
      }
    }
  }

  describe("#label") {
    it("returns a labeled Indefinite") {
      val labeledValue = value.label("otherValue")
      labeledValue.tags.label.value should be("otherValue")
    }
  }
}
