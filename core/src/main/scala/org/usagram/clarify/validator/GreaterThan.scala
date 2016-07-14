package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldBeGreaterThan

class GreaterThan[-V](that: V)(implicit ordering: Ordering[V]) extends Validator[V] {
  def validate(value: V) =
    failIf(ordering.lteq(value, that)) {
      ShouldBeGreaterThan(that)
    }

  def orEqual: GreaterThanOrEqualTo[V] = GreaterThanOrEqualTo(that)
}

object GreaterThan {
  def apply[V](that: V)(implicit ordering: Ordering[V]): GreaterThan[V] = new GreaterThan(that)

  def zero[V](implicit ordering: Ordering[V], numeric: Numeric[V]): GreaterThan[V] = apply(numeric.zero)
}
