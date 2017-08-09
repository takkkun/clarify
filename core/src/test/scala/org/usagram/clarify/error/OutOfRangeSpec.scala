package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class OutOfRangeSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = OutOfRange(10, 100, isInclusive = true)

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label is out of range [10, 100]")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) is out of range [10, 100]")
      }
    }

    describe("when isInclusive = false") {
      val tags = Tags(Indefinite(None))

      val error = OutOfRange(10, 100, isInclusive = false)

      it("returns a message with [lower, upper)") {
        error.message(tags) should be("(no label) is out of range [10, 100)")
      }
    }
  }
}
