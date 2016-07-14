// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity3[+V1, +V2, +V3](_1: Definite[V1], _2: Definite[V2], _3: Definite[V3])
    extends Validity with Product3[Definite[V1], Definite[V2], Definite[V3]] {
  val values = Iterable(_1, _2, _3)

  def resolve[R](resolve: (V1, V2, V3) => R): R =
    if (isValid) {
      resolve(_1.value, _2.value, _3.value)
    }
    else {
      // TODO: to properly
      val messages = for {
        value <- invalidValues
        error <- value.errors
      } yield error.message(value.tags)

      throw new Exception(messages.mkString(", "))
    }
}
