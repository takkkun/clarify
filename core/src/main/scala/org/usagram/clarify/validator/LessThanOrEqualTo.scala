package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldBeLessThanOrEqualTo

class LessThanOrEqualTo[-V](that: V)(implicit ordering: Ordering[V]) extends Validator[V] {
  def validate(value: V) =
    failIf(ordering.gt(value, that)) {
      ShouldBeLessThanOrEqualTo(that)
    }
}

object LessThanOrEqualTo {
  def apply[V](that: V)(implicit ordering: Ordering[V]): LessThanOrEqualTo[V] = new LessThanOrEqualTo(that)
}
