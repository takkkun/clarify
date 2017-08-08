package org.usagram.clarify.validator

import org.usagram.clarify.error.OutOfRange

import org.scalatest._
import org.scalatest.OptionValues._

class BetweenSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    describe("when Range") {
      it("returns a Between with given range") {
        def assertError(error: OutOfRange[Int]): Unit = {
          error.lower should be(10)
          error.upper should be(100)
          error.isInclusive should be(true)
        }

        val validator = Between(10 to 100)
        val error = validator.validate(101)
        assertError(error.value.asInstanceOf[OutOfRange[Int]])
      }
    }

    describe("when NumericRange") {
      it("returns a Between with given range") {
        def assertError(error: OutOfRange[Long]): Unit = {
          error.lower should be(10)
          error.upper should be(100)
          error.isInclusive should be(false)
        }

        val validator = Between(10L until 100L)
        val error = validator.validate(100)
        assertError(error.value.asInstanceOf[OutOfRange[Long]])
      }
    }
  }

  describe(".inclusively") {
    it("returns an inclusive Between with given lower and upper") {
      def assertError(error: OutOfRange[BigDecimal]): Unit = {
        error.lower should be(BigDecimal("10.0"))
        error.upper should be(BigDecimal("100.0"))
        error.isInclusive should be(true)
      }

      val validator = Between.inclusively(BigDecimal("10.0"), BigDecimal("100.0"))
      val error = validator.validate(BigDecimal("100.01"))
      assertError(error.value.asInstanceOf[OutOfRange[BigDecimal]])
    }
  }

  describe(".exclusively") {
    it("returns an exclusive Between with given lower and upper") {
      def assertError(error: OutOfRange[BigDecimal]): Unit = {
        error.lower should be(BigDecimal("10.0"))
        error.upper should be(BigDecimal("100.0"))
        error.isInclusive should be(false)
      }

      val validator = Between.exclusively(BigDecimal("10.0"), BigDecimal("100.0"))
      val error = validator.validate(BigDecimal("100.0"))
      assertError(error.value.asInstanceOf[OutOfRange[BigDecimal]])
    }
  }

  describe("#validate") {
    describe("with isInclusive = true") {
      val validator = Between(10 to 100)

      describe("when within the range") {
        it("returns no errors") {
          val error1 = validator.validate(10)
          error1 should be(empty)
          val error2 = validator.validate(100)
          error2 should be(empty)
        }
      }

      describe("when out of the range") {
        it("returns OutOfRange") {
          def assertError(error: OutOfRange[Int]): Unit = {
            error.lower should be(10)
            error.upper should be(100)
            error.isInclusive should be(true)
          }

          val error1 = validator.validate(9)
          error1 should be(defined)
          assertError(error1.value.asInstanceOf[OutOfRange[Int]])
          val error2 = validator.validate(101)
          error2 should be(defined)
          assertError(error2.value.asInstanceOf[OutOfRange[Int]])
        }
      }
    }

    describe("with isInclusive = false") {
      val validator = Between(10 until 100)

      describe("when within the range") {
        it("returns no errors") {
          val error1 = validator.validate(10)
          error1 should be(empty)
          val error2 = validator.validate(99)
          error2 should be(empty)
        }
      }

      describe("when out of the range") {
        it("returns OutOfRange") {
          def assertError(error: OutOfRange[Int]): Unit = {
            error.lower should be(10)
            error.upper should be(100)
            error.isInclusive should be(false)
          }

          val error1 = validator.validate(9)
          error1 should be(defined)
          assertError(error1.value.asInstanceOf[OutOfRange[Int]])
          val error2 = validator.validate(100)
          error2 should be(defined)
          assertError(error2.value.asInstanceOf[OutOfRange[Int]])
        }
      }
    }
  }
}
