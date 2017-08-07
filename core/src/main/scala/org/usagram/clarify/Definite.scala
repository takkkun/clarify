package org.usagram.clarify

import org.usagram.clarify.error.Error

sealed trait Definite[+V] {
  def value: V

  def tags: Tags

  def isValid: Boolean

  def isInvalid: Boolean = !isValid
}

final case class Valid[+V](value: V, tags: Tags) extends Definite[V] {
  val isValid = true
}

final case class Invalid[+V](value: V, tags: Tags, error: Error) extends Definite[V] {
  val isValid = false

  def message: String = error.message(tags)
}

final case class Unknown[+V](value: V, tags: Tags) extends Definite[V] {
  val isValid = false
}
