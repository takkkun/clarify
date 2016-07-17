package org.usagram.clarify.error

import org.usagram.clarify.Tags

import scala.util.matching.Regex

case class Mismatch(regex: Regex) extends Error {
  def message(tags: Tags) = s"${tags.label getOrElse "(no label)"} does not match $regex"
}
