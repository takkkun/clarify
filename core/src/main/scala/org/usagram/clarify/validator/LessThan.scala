package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldBeLessThan

class LessThan[-V](that: V)(implicit ordering: Ordering[V]) extends Validator[V] {
  def validate(value: V) =
    failIf(ordering.gteq(value, that)) {
      ShouldBeLessThan(that)
    }

  def orEqual: LessThanOrEqualTo[V] = LessThanOrEqualTo(that)
}

object LessThan {
  def apply[V](that: V)(implicit ordering: Ordering[V]): LessThan[V] = new LessThan(that)
}
