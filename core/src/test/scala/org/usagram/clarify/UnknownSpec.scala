package org.usagram.clarify

import org.scalatest._

class UnknownSpec extends FunSpec {
  import Matchers._

  private val unknown = Unknown("a value", Tags.empty)

  describe("#isValid") {
    it("returns always false") {
      unknown.isValid should be(false)
    }
  }

  describe("#isInvalid") {
    it("returns always true") {
      unknown.isInvalid should be(true)
    }
  }
}
