package org.usagram.clarify.validator

import org.usagram.clarify.error.CannotBeBlank

class NotBlank() extends Validator[String] {
  def validate(value: String) =
    failIf(value.isEmpty) {
      CannotBeBlank
    }
}

object NotBlank extends NotBlank
