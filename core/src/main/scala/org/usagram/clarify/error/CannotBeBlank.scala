package org.usagram.clarify.error

import org.usagram.clarify.Tags

sealed trait CannotBeBlank extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} cannot be blank"
}

case object CannotBeBlank extends CannotBeBlank
