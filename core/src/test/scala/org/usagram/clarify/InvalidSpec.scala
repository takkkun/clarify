package org.usagram.clarify

import org.usagram.clarify.error.Error

import org.scalatest._

class InvalidSpec extends FunSpec {
  import Matchers._

  private val invalid = Invalid("a value", Tags.empty, Error)

  describe("#isValid") {
    it("returns always false") {
      invalid.isValid should be(false)
    }
  }

  describe("#isInvalid") {
    it("returns always true") {
      invalid.isInvalid should be(true)
    }
  }

  describe("#message") {
    it("returns the message of #error") {
      invalid.message should be("(no label) has an error")
    }
  }
}
