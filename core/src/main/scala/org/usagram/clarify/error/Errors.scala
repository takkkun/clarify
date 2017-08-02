package org.usagram.clarify.error

import org.usagram.clarify.Tags
import org.usagram.clarify.Indefinite

case class Errors[K](errors: Map[K, Error]) extends Error {
  def message(tags: Tags) = {
    val label = s"${tags.label getOrElse "(no label)"}"
    val unit = if (errors.size > 1) "errors" else "error"
    s"$label has ${errors.size} $unit: ${format(errors)}"
  }

  private def format(errors: Map[K, Error]): String = {
    val messages = errors.map {
      case (key, error) =>
        val tags = Tags(Indefinite(Some(s"value of $key")))
        error.message(tags)
    }

    val init = messages.init
    val last = messages.last

    if (init.isEmpty) last else s"${init.mkString(", ")} and $last"
  }
}
