package org.usagram.clarify.validator

class AlwaysFail[-V]() extends Validator[V] {
  def validate(value: V) = fail
}

object AlwaysFail extends AlwaysFail[Any] {
  def apply[V](): AlwaysFail[V] = AlwaysFail
}
