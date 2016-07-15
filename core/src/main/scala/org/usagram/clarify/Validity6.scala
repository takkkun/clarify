// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity6[+V1, +V2, +V3, +V4, +V5, +V6](_1: Definite[V1], _2: Definite[V2], _3: Definite[V3], _4: Definite[V4], _5: Definite[V5], _6: Definite[V6])
    extends Validity with Product6[Definite[V1], Definite[V2], Definite[V3], Definite[V4], Definite[V5], Definite[V6]] {
  val values = Iterable(_1, _2, _3, _4, _5, _6)

  def resolve[R](resolve: (V1, V2, V3, V4, V5, V6) => R): R =
    if (isValid) {
      resolve(_1.value, _2.value, _3.value, _4.value, _5.value, _6.value)
    }
    else {
      throw InvalidValueException.fromInvalidValues(invalidValues)
    }
}
