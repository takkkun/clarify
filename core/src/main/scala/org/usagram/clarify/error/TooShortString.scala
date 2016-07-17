package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class TooShortString(limit: Int) extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} is too short, requires at least $limit characters"
}
