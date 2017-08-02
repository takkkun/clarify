package org.usagram.clarify.validator

import org.usagram.clarify.error.{ Errors, Error }

trait Each[-V <: Iterable[_], K] extends Validator[V] {
  def validate(values: V) = {
    val errors = validateEach(values)
    if (errors.isEmpty) pass else fail(Errors(errors))
  }

  protected def validateEach(values: V): Map[K, Error]
}

object Each {
  def seq[V](validator: Validator[V]): Each[Seq[V], Int] = EachOfSeq(validator)

  def set[V](validator: Validator[V]): Each[Set[V], V] = EachOfSet(validator)

  def map[V, K](validator: Validator[V]): Each[Map[K, V], K] = EachOfMap(validator)
}
