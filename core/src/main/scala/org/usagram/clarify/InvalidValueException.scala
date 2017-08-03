package org.usagram.clarify

class InvalidValueException(message: String, val invalidValues: Iterable[Invalid[Any]]) extends Exception(message)

object InvalidValueException {
  def fromInvalidValues(invalidValues: Iterable[Invalid[Any]]): InvalidValueException = {
    val messages = invalidValues.map { invalidValue =>
      invalidValue.error.message(invalidValue.tags)
    }

    new InvalidValueException(messages.mkString(", "), invalidValues)
  }
}
