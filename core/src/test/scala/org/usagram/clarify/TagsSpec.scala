package org.usagram.clarify

import org.scalatest._
import org.scalatest.OptionValues._

class TagsSpec extends FunSpec {
  import Matchers._

  describe(".empty") {
    it("returns an empty Tags") {
      val tags = Tags.empty
      tags.label should be(empty)
    }
  }

  describe(".apply") {
    it("returns a Tags") {
      val tags = Tags(label = Indefinite(Some("value")))
      tags.label.value should be("value")
    }

    describe("when take an empty label") {
      it("throws InvalidValueException") {
        intercept[InvalidValueException] {
          Tags(label = Indefinite(Some("")))
        }
      }
    }
  }

  describe("#copy") {
    val tags = Tags(label = Indefinite(Some("value")))

    it("returns a copied Tags") {
      val copiedTags = tags.copy(Indefinite(Some("otherValue")))
      copiedTags.label.value should be("otherValue")
    }
  }
}
