package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class ShouldBeLessThanSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = ShouldBeLessThan("a value")

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label should be less than a value")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) should be less than a value")
      }
    }
  }
}
