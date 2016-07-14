package org.usagram.clarify.validator

import org.usagram.clarify.error.ShouldBeGreaterThanOrEqualTo

class GreaterThanOrEqualTo[-V](that: V)(implicit ordering: Ordering[V]) extends Validator[V] {
  def validate(value: V) =
    failIf(ordering.lt(value, that)) {
      ShouldBeGreaterThanOrEqualTo(that)
    }
}

object GreaterThanOrEqualTo {
  def apply[V](that: V)(implicit ordering: Ordering[V]): GreaterThanOrEqualTo[V] = new GreaterThanOrEqualTo(that)

  def zero[V](implicit ordering: Ordering[V], numeric: Numeric[V]): GreaterThanOrEqualTo[V] = apply(numeric.zero)

  def one[V](implicit ordering: Ordering[V], numeric: Numeric[V]): GreaterThanOrEqualTo[V] = apply(numeric.one)
}
