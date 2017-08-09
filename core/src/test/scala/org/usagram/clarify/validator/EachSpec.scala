package org.usagram.clarify.validator

import org.usagram.clarify.error.{ Errors, Error }

import org.scalatest._
import org.scalatest.OptionValues._

class EachSpec extends FunSpec {
  import Matchers._

  describe(".seq") {
    it("returns an Each[Seq[V], Int] with given validator") {
      val validator = Each.ofSeq(AlwaysFail)
      val error = validator.validate(Seq("a value", "other value"))
      error.value.asInstanceOf[Errors[Int]].errors should be(Map(0 -> Error, 1 -> Error))
    }
  }

  describe(".set") {
    it("returns an Each[Set[V], V] with given validator") {
      val validator = Each.ofSet[String](AlwaysFail)
      val error = validator.validate(Set("a value", "other value"))
      error.value.asInstanceOf[Errors[String]].errors should be(Map("a value" -> Error, "other value" -> Error))
    }
  }

  describe(".map") {
    it("returns an Each[Map[K, V], K] with given validator") {
      val validator = Each.ofMap[Int, String](AlwaysFail)
      val error = validator.validate(Map("one" -> 1, "two" -> 2))
      error.value.asInstanceOf[Errors[String]].errors should be(Map("one" -> Error, "two" -> Error))
    }
  }
}
