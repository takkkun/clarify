package org.usagram.clarify.error

import org.usagram.clarify.Tags

case class ErrorAt(index: Int, errors: Iterable[Error]) extends Error {
  def message(tags: Tags) =
    errors.size match {
      case 0 => s"no errors at $index"
      case 1 => s"1 error is found at $index: ${messageDetail(tags)}"
      case n => s"$n errors are found at $index: ${messageDetail(tags)}"
    }

  private def messageDetail(tags: Tags): String = {
    val init = errors.init
    val last = errors.last

    if (init.isEmpty) {
      last.message(tags)
    }
    else {
      s"${init.map(_ message tags).mkString(", ")} and ${last message tags}"
    }
  }
}
