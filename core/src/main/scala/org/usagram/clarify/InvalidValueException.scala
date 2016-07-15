package org.usagram.clarify

class InvalidValueException(message: String, val invalidValues: Iterable[Invalid[Any]]) extends Exception(message)

object InvalidValueException {
  def fromInvalidValues(invalidValues: Iterable[Invalid[Any]]): InvalidValueException = {
    val messages = for {
      invalidValue <- invalidValues
      error <- invalidValue.errors
    } yield error.message(invalidValue.tags)

    new InvalidValueException(messages.mkString(", "), invalidValues)
  }
}
