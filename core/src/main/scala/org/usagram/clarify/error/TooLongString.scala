package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class TooLongString(limit: Int) extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} is too long, is up to at most $limit characters"
}
