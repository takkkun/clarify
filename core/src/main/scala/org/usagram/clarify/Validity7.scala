// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity7[+V1, +V2, +V3, +V4, +V5, +V6, +V7](_1: Definite[V1], _2: Definite[V2], _3: Definite[V3], _4: Definite[V4], _5: Definite[V5], _6: Definite[V6], _7: Definite[V7])
    extends Validity with Product7[Definite[V1], Definite[V2], Definite[V3], Definite[V4], Definite[V5], Definite[V6], Definite[V7]] {
  val values = Seq(_1, _2, _3, _4, _5, _6, _7)

  def resolve[R](resolve: (V1, V2, V3, V4, V5, V6, V7) => R): R =
    if (isValid) {
      resolve(_1.value, _2.value, _3.value, _4.value, _5.value, _6.value, _7.value)
    }
    else {
      throw new InvalidValueException(invalidValues)
    }
}
