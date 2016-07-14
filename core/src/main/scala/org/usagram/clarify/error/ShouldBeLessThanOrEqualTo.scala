package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class ShouldBeLessThanOrEqualTo[V](value: V) extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} should be less than or equal to $value"
}
