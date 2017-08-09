package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class TooShortStringSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = TooShortString(100)

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label is too short, requires at least 100 characters")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) is too short, requires at least 100 characters")
      }
    }

    describe("when limit = 1") {
      val tags = Tags(Indefinite(None))

      val error = TooShortString(1)

      it("returns a message with unit \"character\"") {
        error.message(tags) should be("(no label) is too short, requires at least 1 character")
      }
    }
  }
}
