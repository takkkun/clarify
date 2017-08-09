package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

import scala.util.matching.Regex

class MismatchSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = Mismatch(new Regex("abc"))

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label does not match abc")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) does not match abc")
      }
    }
  }
}
