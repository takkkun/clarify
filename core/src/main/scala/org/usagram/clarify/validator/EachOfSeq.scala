package org.usagram.clarify.validator

class EachOfSeq[-V](validator: Validator[V]) extends Each[Seq[V], Int] {
  protected def validateEach(values: Seq[V]) =
    values.zipWithIndex.flatMap {
      case (value, index) => validator.validate(value).map(index -> _)
    }.toMap
}

object EachOfSeq {
  def apply[V](validator: Validator[V]): EachOfSeq[V] = new EachOfSeq(validator)
}
