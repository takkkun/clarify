package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class UpToAtMost(limit: Int) extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} is up to at most $quantity"

  private def quantity: String = limit match {
    case 1 => "1 item"
    case n => s"$n items"
  }
}
