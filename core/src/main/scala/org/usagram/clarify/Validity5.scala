// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity5[+V1, +V2, +V3, +V4, +V5](_1: Definite[V1], _2: Definite[V2], _3: Definite[V3], _4: Definite[V4], _5: Definite[V5])
    extends Validity with Product5[Definite[V1], Definite[V2], Definite[V3], Definite[V4], Definite[V5]] {
  val values = Iterable(_1, _2, _3, _4, _5)

  def resolve[R](resolve: (V1, V2, V3, V4, V5) => R): R =
    if (isValid) {
      resolve(_1.value, _2.value, _3.value, _4.value, _5.value)
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
