package org.usagram.clarify.validator

import org.usagram.clarify.Indefinite
import org.usagram.clarify.error.RequireAtLeast

class Least[-V](size: Int) extends Validator[Iterable[V]] {
  def validate(value: Iterable[V]) =
    failIf(value.size < size) {
      RequireAtLeast(size)
    }
}

object Least {
  val validator = {
    val size: Validator[Int] = GreaterThanOrEqualTo.one

    size
  }

  def apply[V](size: Int): Least[V] =
    validator(Indefinite(size)).resolve(new Least(_))

  def one[V]: Least[V] = apply(1)
}
