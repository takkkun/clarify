package org.usagram.clarify.validator

import org.usagram.clarify.error.UpToAtMost

class AtMost[-V](limit: Int) extends Validator[Iterable[V]] {
  def validate(value: Iterable[V]) =
    failIf(value.size > limit) {
      UpToAtMost(limit)
    }

  def characters: AtMostCharacters =
    AtMostCharacters(limit)
}

object AtMost {
  def apply[V](limit: Int): AtMost[V] = new AtMost(limit)
}
