// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity2[+V1, +V2](_1: Definite[V1], _2: Definite[V2])
    extends Validity with Product2[Definite[V1], Definite[V2]] {
  val values = Iterable(_1, _2)

  def resolve[R](resolve: (V1, V2) => R): R =
    if (isValid) {
      resolve(_1.value, _2.value)
    }
    else {
      throw InvalidValueException.fromInvalidValues(invalidValues)
    }
}
