package org.usagram.clarify.validator

import org.usagram.clarify.error.Mismatch

import scala.util.matching.Regex
import java.util.regex.Pattern

class Match(regex: Regex) extends Validator[String] {
  def validate(value: String) =
    failIf(regex.findFirstIn(value).isEmpty) {
      Mismatch(regex)
    }
}

object Match {
  def apply(regex: Regex): Match = new Match(regex)

  def apply(string: String): Match = new Match(regex(string))

  def insensitively(string: String): Match = new Match(s"(?i)${regex(string)}".r)

  private def regex(string: String): Regex = s"^${Pattern.quote(string)}$$".r
}
