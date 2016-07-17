package org.usagram.clarify.validator

import org.usagram.clarify.error.TooLongString

class AtMostCharacters(limit: Int) extends Validator[String] {
  def validate(value: String) =
    failIf(value.length > limit) {
      TooLongString(limit)
    }
}

object AtMostCharacters {
  def apply(limit: Int): AtMostCharacters = new AtMostCharacters(limit)
}
