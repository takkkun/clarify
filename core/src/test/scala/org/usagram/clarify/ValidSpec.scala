package org.usagram.clarify

import org.scalatest._

class ValidSpec extends FunSpec {
  import Matchers._

  private val valid = Valid("a value", Tags.empty)

  describe("#isValid") {
    it("returns always true") {
      valid.isValid should be(true)
    }
  }

  describe("#isInvalid") {
    it("returns always false") {
      valid.isInvalid should be(false)
    }
  }
}
