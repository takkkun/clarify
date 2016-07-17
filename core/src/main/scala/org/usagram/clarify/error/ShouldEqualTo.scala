package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class ShouldEqualTo[V](value: V) extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} should equal to $value"
}
