package org.usagram.clarify

class InvalidValueException(val invalidValues: Seq[Invalid[Any]], message: String) extends Exception(message) {
  def this(invalidValues: Seq[Invalid[Any]]) =
    this(invalidValues, invalidValues.map(_.message).mkString(", "))
}
