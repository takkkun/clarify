package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class ShouldBeLessThanOrEqualToSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = ShouldBeLessThanOrEqualTo("a value")

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label should be less than or equal to a value")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) should be less than or equal to a value")
      }
    }
  }
}
