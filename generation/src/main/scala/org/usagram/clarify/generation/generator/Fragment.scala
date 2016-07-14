package org.usagram.clarify.generation.generator

class Fragment(start: Int, end: Option[Int] = None, enclosed: Boolean = false)(builder: Int => String) {
  def to(n: Int): Fragment =
    new Fragment(start, Some(n), enclosed)(builder)

  def enclose: Fragment =
    new Fragment(start, end, true)(builder)

  def decorate(decorator: String => String): Fragment =
    new Fragment(start, end, enclosed)(builder andThen decorator)

  def prefix(prefix: String): Fragment = decorate(prefix + _)

  def postfix(postfix: String): Fragment = decorate(_ + postfix)

  def member(member: String): Fragment = postfix(s".$member")

  override def toString = {
    val strings = end match {
      case Some(n) => start to n map builder
      case None    => Iterable(start) map builder
    }

    if (strings.size == 1) {
      strings.head
    }
    else if (enclosed) {
      strings.mkString("(", ", ", ")")
    }
    else {
      strings.mkString(", ")
    }
  }
}
