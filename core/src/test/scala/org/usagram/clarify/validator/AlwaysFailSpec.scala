package org.usagram.clarify.validator

import org.usagram.clarify.error.Error

import org.scalatest._
import org.scalatest.OptionValues._

class AlwaysFailSpec extends FunSpec {
  import Matchers._

  describe(".apply") {
    it("returns AlwaysFail") {
      val validator = AlwaysFail()
      validator should be(AlwaysFail)
    }
  }

  describe("#validate") {
    it("returns always Error") {
      val error = AlwaysFail.validate("a value")
      error should be(defined)
      error.value should be(Error)
    }
  }
}
