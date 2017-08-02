// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

case class Validity14[+V1, +V2, +V3, +V4, +V5, +V6, +V7, +V8, +V9, +V10, +V11, +V12, +V13, +V14](_1: Definite[V1], _2: Definite[V2], _3: Definite[V3], _4: Definite[V4], _5: Definite[V5], _6: Definite[V6], _7: Definite[V7], _8: Definite[V8], _9: Definite[V9], _10: Definite[V10], _11: Definite[V11], _12: Definite[V12], _13: Definite[V13], _14: Definite[V14])
    extends Validity with Product14[Definite[V1], Definite[V2], Definite[V3], Definite[V4], Definite[V5], Definite[V6], Definite[V7], Definite[V8], Definite[V9], Definite[V10], Definite[V11], Definite[V12], Definite[V13], Definite[V14]] {
  val values = Seq(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)

  def resolve[R](resolve: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14) => R): R =
    if (isValid) {
      resolve(_1.value, _2.value, _3.value, _4.value, _5.value, _6.value, _7.value, _8.value, _9.value, _10.value, _11.value, _12.value, _13.value, _14.value)
    }
    else {
      throw InvalidValueException.fromInvalidValues(invalidValues)
    }
}
