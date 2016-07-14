package org.usagram.clarify

trait Validity extends Product {
  def values: Iterable[Definite[Any]]

  def validValues: Iterable[Valid[Any]] =
    values.collect { case validValue: Valid[_] => validValue }

  def invalidValues: Iterable[Invalid[Any]] =
    values.collect { case invalidValue: Invalid[_] => invalidValue }

  def isValid: Boolean =
    values.forall(_.isValid)

  def isInvalid: Boolean = !isValid
}
