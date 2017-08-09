package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class CannotBeBlankSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        CannotBeBlank.message(tags) should be("a label cannot be blank")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        CannotBeBlank.message(tags) should be("(no label) cannot be blank")
      }
    }
  }
}
