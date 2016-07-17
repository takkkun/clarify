package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldEqualTo

class EqualTo[-V](that: V)(implicit ordering: Ordering[V]) extends Validator[V] {
  def validate(value: V) =
    failIf(!ordering.equiv(value, that)) {
      ShouldEqualTo(that)
    }
}

object EqualTo {
  def apply[V](that: V)(implicit ordering: Ordering[V]): EqualTo[V] = new EqualTo(that)
}
