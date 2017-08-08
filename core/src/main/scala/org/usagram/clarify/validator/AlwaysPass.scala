package org.usagram.clarify.validator

class AlwaysPass[-V]() extends Validator[V] {
  def validate(value: V) = pass
}

object AlwaysPass extends AlwaysPass[Any] {
  def apply[V](): AlwaysPass[V] = AlwaysPass
}
