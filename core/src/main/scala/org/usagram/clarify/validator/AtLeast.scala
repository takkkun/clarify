package org.usagram.clarify.validator

import org.usagram.clarify.Indefinite
import org.usagram.clarify.error.RequireAtLeast

class AtLeast[-V](limit: Int) extends Validator[Iterable[V]] {
  def validate(value: Iterable[V]) =
    failIf(value.size < limit) {
      RequireAtLeast(limit)
    }
}

object AtLeast {
  val validator = {
    val limit: Validator[Int] = GreaterThanOrEqualTo.one

    limit
  }

  def apply[V](limit: Int): AtLeast[V] =
    validator(Indefinite(limit) label "limit").resolve(new AtLeast(_))

  def one[V]: AtLeast[V] = apply(1)
}
