package org.usagram.clarify.validator

import org.scalatest._

class AlwaysPassSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns AlwaysPass") {
      val validator = AlwaysPass()
      validator should be(AlwaysPass)
    }
  }

  describe("#validate") {
    it("returns no errors") {
      val error = AlwaysPass.validate("a value")
      error should be(empty)
    }
  }
}
