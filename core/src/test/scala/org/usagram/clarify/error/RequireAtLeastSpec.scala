package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class RequireAtLeastSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = RequireAtLeast(2)

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label requires at least 2 items")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) requires at least 2 items")
      }
    }

    describe("when limit = 1") {
      val tags = Tags(Indefinite(None))

      val error = RequireAtLeast(1)

      it("returns a message with unit \"item\"") {
        error.message(tags) should be("(no label) requires at least 1 item")
      }
    }
  }
}
