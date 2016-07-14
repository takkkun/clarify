package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class RequireAtLeast(size: Int) extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} requires at least $sizeAndUnit"

  private def sizeAndUnit: String = size match {
    case 1 => "1 item"
    case n => s"$n items"
  }
}
