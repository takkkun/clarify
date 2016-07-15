// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity4[+V1, +V2, +V3, +V4](_1: Definite[V1], _2: Definite[V2], _3: Definite[V3], _4: Definite[V4])
    extends Validity with Product4[Definite[V1], Definite[V2], Definite[V3], Definite[V4]] {
  val values = Iterable(_1, _2, _3, _4)

  def resolve[R](resolve: (V1, V2, V3, V4) => R): R =
    if (isValid) {
      resolve(_1.value, _2.value, _3.value, _4.value)
    }
    else {
      throw InvalidValueException.fromInvalidValues(invalidValues)
    }
}
