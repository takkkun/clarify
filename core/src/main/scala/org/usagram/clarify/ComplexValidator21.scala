// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

trait ComplexValidator21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21]
    extends ((Indefinite[V1], Indefinite[V2], Indefinite[V3], Indefinite[V4], Indefinite[V5], Indefinite[V6], Indefinite[V7], Indefinite[V8], Indefinite[V9], Indefinite[V10], Indefinite[V11], Indefinite[V12], Indefinite[V13], Indefinite[V14], Indefinite[V15], Indefinite[V16], Indefinite[V17], Indefinite[V18], Indefinite[V19], Indefinite[V20], Indefinite[V21]) => Validity21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21]) {
  def <->[V22](that: ComplexValidator1[V22]): ComplexValidator22[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22] =
    ComplexValidator22 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21)
      val thatValidity = that(value22)
      Validity22(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thisValidity._13, thisValidity._14, thisValidity._15, thisValidity._16, thisValidity._17, thisValidity._18, thisValidity._19, thisValidity._20, thisValidity._21, thatValidity._1)
    }

  def -->[V22](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21) => ComplexValidator1[V22]): ComplexValidator22[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22] =
    ComplexValidator22 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value22)
        Validity22(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thisValidity._13, thisValidity._14, thisValidity._15, thisValidity._16, thisValidity._17, thisValidity._18, thisValidity._19, thisValidity._20, thisValidity._21, thatValidity._1)
      }
      else {
        Validity22(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thisValidity._13, thisValidity._14, thisValidity._15, thisValidity._16, thisValidity._17, thisValidity._18, thisValidity._19, thisValidity._20, thisValidity._21, value22.unknown)
      }
    }
}

object ComplexValidator21 {
  def apply[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21](ascertainValidity: (Indefinite[V1], Indefinite[V2], Indefinite[V3], Indefinite[V4], Indefinite[V5], Indefinite[V6], Indefinite[V7], Indefinite[V8], Indefinite[V9], Indefinite[V10], Indefinite[V11], Indefinite[V12], Indefinite[V13], Indefinite[V14], Indefinite[V15], Indefinite[V16], Indefinite[V17], Indefinite[V18], Indefinite[V19], Indefinite[V20], Indefinite[V21]) => Validity21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21]): ComplexValidator21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21] =
    new ComplexValidator21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21] {
      def apply(value1: Indefinite[V1], value2: Indefinite[V2], value3: Indefinite[V3], value4: Indefinite[V4], value5: Indefinite[V5], value6: Indefinite[V6], value7: Indefinite[V7], value8: Indefinite[V8], value9: Indefinite[V9], value10: Indefinite[V10], value11: Indefinite[V11], value12: Indefinite[V12], value13: Indefinite[V13], value14: Indefinite[V14], value15: Indefinite[V15], value16: Indefinite[V16], value17: Indefinite[V17], value18: Indefinite[V18], value19: Indefinite[V19], value20: Indefinite[V20], value21: Indefinite[V21]) = ascertainValidity(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21)
    }
}
