package org.usagram.clarify.validator

import org.usagram.clarify.error.OutOfRange

import scala.collection.immutable.NumericRange

class Between[-V](lower: V, upper: V, isInclusive: Boolean)(implicit ordering: Ordering[V]) extends Validator[V] {
  def validate(value: V) =
    failIf(!lowerSatisfied(value) || !upperSatisfied(value)) {
      OutOfRange(lower, upper, isInclusive)
    }

  private def lowerSatisfied(value: V): Boolean =
    ordering.gteq(value, lower)

  private def upperSatisfied(value: V): Boolean =
    if (isInclusive) ordering.lteq(value, upper) else ordering.lt(value, upper)
}

object Between {
  def apply(range: Range): Between[Int] = new Between(range.start, range.end, range.isInclusive)

  def apply[V](range: NumericRange[V])(implicit ordering: Ordering[V]): Between[V] =
    new Between(range.start, range.end, range.isInclusive)

  def apply[V](range: Range.Partial[V, NumericRange[V]])(implicit ordering: Ordering[V], numeric: Numeric[V]): Between[V] =
    apply(range.by(numeric.one))
}
