package org.usagram.clarify.validator

class Optionally[-V](validator: Validator[V]) extends Validator[Option[V]] {
  def validate(value: Option[V]) =
    value.fold(pass)(validator.validate)
}

object Optionally {
  def apply[V](validator: Validator[V]): Optionally[V] = new Optionally(validator)
}
