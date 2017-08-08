package org.usagram.clarify

import org.usagram.clarify.error.Error

import org.scalatest._

// adopt Validity5 as a sample
class ValiditySpec extends FunSpec {
  import Matchers._

  val validity = Validity5(
    Valid("a value", Tags.empty),
    Invalid(100, Tags.empty, Error),
    Unknown(200.0, Tags.empty),
    Valid(true, Tags.empty),
    Invalid('A', Tags.empty, Error)
  )

  describe("#values") {
    it("returns definite values") {
      val Seq(string, int, double, boolean, char) = validity.values
      string should be(a[Valid[_]])
      string.value should be("a value")
      int should be(an[Invalid[_]])
      int.value should be(100)
      double should be(an[Unknown[_]])
      double.value should be(200.0)
      boolean should be(a[Valid[_]])
      boolean.value should be(true: Any)
      char should be(an[Invalid[_]])
      char.value should be('A')
    }
  }

  describe("#validValues") {
    it("returns only Valid values") {
      validity.validValues should have size 2
      val Seq(string, boolean) = validity.validValues
      string should be(a[Valid[_]])
      boolean should be(a[Valid[_]])
    }
  }

  describe("#invalidValues") {
    it("returns only Inalid values") {
      validity.invalidValues should have size 2
      val Seq(int, char) = validity.invalidValues
      int should be(an[Invalid[_]])
      char should be(an[Invalid[_]])
    }
  }

  describe("#isValid") {
    describe("when enclosing only valid values") {
      val validity = Validity5(
        Valid("a value", Tags.empty),
        Valid(100, Tags.empty),
        Valid(200.0, Tags.empty),
        Valid(true, Tags.empty),
        Valid('A', Tags.empty)
      )

      it("returns true") {
        validity.isValid should be(true)
      }
    }

    describe("when include an invalid value") {
      val validity = Validity5(
        Valid("a value", Tags.empty),
        Valid(100, Tags.empty),
        Valid(200.0, Tags.empty),
        Valid(true, Tags.empty),
        Invalid('A', Tags.empty, Error)
      )

      it("returns false") {
        validity.isValid should be(false)
      }
    }
  }

  describe("#isInvalid") {
    describe("when enclosing only valid values") {
      val validity = Validity5(
        Valid("a value", Tags.empty),
        Valid(100, Tags.empty),
        Valid(200.0, Tags.empty),
        Valid(true, Tags.empty),
        Valid('A', Tags.empty)
      )

      it("returns false") {
        validity.isInvalid should be(false)
      }
    }

    describe("when include an invalid value") {
      val validity = Validity5(
        Valid("a value", Tags.empty),
        Valid(100, Tags.empty),
        Valid(200.0, Tags.empty),
        Valid(true, Tags.empty),
        Invalid('A', Tags.empty, Error)
      )

      it("returns true") {
        validity.isInvalid should be(true)
      }
    }
  }
}
