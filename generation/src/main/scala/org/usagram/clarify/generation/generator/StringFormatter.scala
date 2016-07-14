package org.usagram.clarify.generation.generator

class StringFormatter(string: String) {
  def indent(spaces: Int): String = {
    val indent = " " * spaces
    string.lines.map { s => if (s.isEmpty) s else indent + s }.mkString("\n")
  }

  def strip: String =
    string.stripMargin.trim + "\n"
}

object StringFormatter {
  import scala.language.implicitConversions

  implicit def toStringFormatter(string: String): StringFormatter =
    new StringFormatter(string)
}
