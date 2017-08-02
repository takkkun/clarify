package org.usagram.clarify.validator

class EachOfMap[-V, K](validator: Validator[V]) extends Each[Map[K, V], K] {
  protected def validateEach(values: Map[K, V]) =
    values.flatMap {
      case (key, value) => validator.validate(value).map(key -> _)
    }
}

object EachOfMap {
  def apply[V, K](validator: Validator[V]): EachOfMap[V, K] = new EachOfMap(validator)
}
