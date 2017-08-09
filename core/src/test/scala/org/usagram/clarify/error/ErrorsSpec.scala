package org.usagram.clarify.error

import org.usagram.clarify.{ Indefinite, Tags }

import org.scalatest._

class ErrorsSpec extends FunSpec {
  import Matchers._

  describe("#message") {
    val error = Errors(Map("a value" -> Error, "other value" -> Error))

    describe("when Tags#label is Some(string)") {
      val tags = Tags(Indefinite(Some("a label")))

      it("returns a message include the label") {
        error.message(tags) should be("a label has 2 errors: value of 'a value' has an error, value of 'other value' has an error")
      }
    }

    describe("when Tags#label is None") {
      val tags = Tags(Indefinite(None))

      it("returns a message include the default label") {
        error.message(tags) should be("(no label) has 2 errors: value of 'a value' has an error, value of 'other value' has an error")
      }
    }

    describe("when number of errors = 1") {
      val tags = Tags(Indefinite(None))

      val error = Errors(Map("a value" -> Error))

      it("returns a message with unit \"error\"") {
        error.message(tags) should be("(no label) has 1 error: value of 'a value' has an error")
      }
    }

    describe("when a key is including characters to be escaped") {
      val tags = Tags(Indefinite(None))

      val error = Errors(Map("\\(' _ ')/" -> Error))

      it("returns a message with the key escaped") {
        error.message(tags) should be("(no label) has 1 error: value of '\\\\(\\\' _ \\\')/' has an error")
      }
    }
  }
}
