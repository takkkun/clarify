package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class TooLongStringSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = TooLongString(100)

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label is too long, is up to at most 100 characters")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) is too long, is up to at most 100 characters")
      }
    }

    describe("when limit = 1") {
      val tags = Tags(Indefinite(None))

      val error = TooLongString(1)

      it("returns a message with unit \"character\"") {
        error.message(tags) should be("(no label) is too long, is up to at most 1 character")
      }
    }
  }
}
