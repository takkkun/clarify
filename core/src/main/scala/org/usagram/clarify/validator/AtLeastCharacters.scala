package org.usagram.clarify.validator

import org.usagram.clarify.error.TooShortString

class AtLeastCharacters(limit: Int) extends Validator[String] {
  def validate(value: String) =
    failIf(value.length < limit) {
      TooShortString(limit)
    }
}

object AtLeastCharacters {
  def apply(limit: Int): AtLeastCharacters = new AtLeastCharacters(limit)
}
