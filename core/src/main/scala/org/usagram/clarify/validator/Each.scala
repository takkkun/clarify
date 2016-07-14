package org.usagram.clarify.validator

import org.usagram.clarify.error.ErrorAt

class Each[-V](validator: Validator[V]) extends Validator[Iterable[V]] {
  def validate(values: Iterable[V]) =
    values.zipWithIndex.flatMap { elem =>
      val (value, index) = elem
      val errors = validator.validate(value)

      if (errors.isEmpty) {
        None
      }
      else {
        Some(ErrorAt(index, errors))
      }
    }
}

object Each {
  def apply[V](validator: Validator[V]): Each[V] = new Each(validator)
}
