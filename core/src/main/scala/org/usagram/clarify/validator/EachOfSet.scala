package org.usagram.clarify.validator

class EachOfSet[V](validator: Validator[V]) extends Each[Set[V], V] {
  protected def validateEach(values: Set[V]) =
    values.flatMap { value =>
      validator.validate(value).map(value -> _)
    }.toMap
}

object EachOfSet {
  def apply[V](validator: Validator[V]): EachOfSet[V] = new EachOfSet(validator)
}
