package org.usagram.clarify

trait Validity extends Product {
  def values: Seq[Definite[Any]]

  def validValues: Seq[Valid[Any]] =
    values.collect { case validValue: Valid[_] => validValue }

  def invalidValues: Seq[Invalid[Any]] =
    values.collect { case invalidValue: Invalid[_] => invalidValue }

  def isValid: Boolean =
    values.forall(_.isValid)

  def isInvalid: Boolean = !isValid
}
