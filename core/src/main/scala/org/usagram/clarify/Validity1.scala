// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity1[+V1](_1: Definite[V1])
    extends Validity with Product1[Definite[V1]] {
  val values = Iterable(_1)

  def resolve[R](resolve: V1 => R): R =
    if (isValid) {
      resolve(_1.value)
    }
    else {
      val messages = for {
        value <- invalidValues
        error <- value.errors
      } yield error.message(value.tags)

      throw new Exception(messages.mkString(", "))
    }
}
