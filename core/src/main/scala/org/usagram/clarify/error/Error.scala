package org.usagram.clarify.error

import org.usagram.clarify.Tags

trait Error {
  def message(tags: Tags): String
}

object Error extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} has an error"
}
