package org.usagram.clarify.validator

import org.usagram.clarify.Indefinite
import org.usagram.clarify.error.TooShortString

class AtLeastCharacters(limit: Int) extends Validator[String] {
  def validate(value: String) =
    failIf(value.length < limit) {
      TooShortString(limit)
    }
}

object AtLeastCharacters {
  val validator = {
    val limit: Validator[Int] = GreaterThanOrEqualTo.one

    limit
  }

  def apply(limit: Int): AtLeastCharacters =
    validator(Indefinite(limit) label "limit").resolve(new AtLeastCharacters(_))
}
