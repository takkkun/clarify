package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class OutOfRange[V](lower: V, upper: V, isInclusive: Boolean) extends Error {
  def message(tags: Tags) = {
    val range = if (isInclusive) s"[$lower, $upper]" else s"[$lower, $upper)"
    s"${tags.label getOrElse "(no label)"} is out of range $range"
  }
}
