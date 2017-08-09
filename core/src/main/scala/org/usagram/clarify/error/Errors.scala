package org.usagram.clarify.error

import org.usagram.clarify.{ Tags, Indefinite }

import scala.util.matching.Regex

case class Errors[K](errors: Map[K, Error]) extends Error {
  def message(tags: Tags) = {
    val label = s"${tags.label getOrElse "(no label)"}"
    val unit = if (errors.size > 1) "errors" else "error"
    val detail = Errors.messages(errors).mkString(", ")
    s"$label has ${errors.size} $unit: $detail"
  }

}

object Errors {
  private val replacements = Map(
    "\\" -> "\\\\\\\\",
    "'" -> "\\\\'"
  )

  private val regex = new Regex(s"[${replacements.keys.map(Regex.quote).mkString}]")

  def messages[K](errors: Map[K, Error]): Iterable[String] =
    errors.map {
      case (key, error) =>
        val escapedKey = regex.replaceAllIn(key.toString, m => replacements(m.matched))
        val tags = Tags(Indefinite(Some(s"value of '$escapedKey'")))
        error.message(tags)
    }
}
