// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

trait ComplexValidator2[V1, V2]
    extends ((Indefinite[V1], Indefinite[V2]) => Validity2[V1, V2]) {
  def <->[V3](that: ComplexValidator1[V3]): ComplexValidator3[V1, V2, V3] =
    ComplexValidator3 { (value1, value2, value3) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3)
      Validity3(thisValidity._1, thisValidity._2, thatValidity._1)
    }

  def <->[V3, V4](that: ComplexValidator2[V3, V4]): ComplexValidator4[V1, V2, V3, V4] =
    ComplexValidator4 { (value1, value2, value3, value4) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4)
      Validity4(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2)
    }

  def <->[V3, V4, V5](that: ComplexValidator3[V3, V4, V5]): ComplexValidator5[V1, V2, V3, V4, V5] =
    ComplexValidator5 { (value1, value2, value3, value4, value5) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5)
      Validity5(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3)
    }

  def <->[V3, V4, V5, V6](that: ComplexValidator4[V3, V4, V5, V6]): ComplexValidator6[V1, V2, V3, V4, V5, V6] =
    ComplexValidator6 { (value1, value2, value3, value4, value5, value6) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6)
      Validity6(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4)
    }

  def <->[V3, V4, V5, V6, V7](that: ComplexValidator5[V3, V4, V5, V6, V7]): ComplexValidator7[V1, V2, V3, V4, V5, V6, V7] =
    ComplexValidator7 { (value1, value2, value3, value4, value5, value6, value7) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7)
      Validity7(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5)
    }

  def <->[V3, V4, V5, V6, V7, V8](that: ComplexValidator6[V3, V4, V5, V6, V7, V8]): ComplexValidator8[V1, V2, V3, V4, V5, V6, V7, V8] =
    ComplexValidator8 { (value1, value2, value3, value4, value5, value6, value7, value8) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8)
      Validity8(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9](that: ComplexValidator7[V3, V4, V5, V6, V7, V8, V9]): ComplexValidator9[V1, V2, V3, V4, V5, V6, V7, V8, V9] =
    ComplexValidator9 { (value1, value2, value3, value4, value5, value6, value7, value8, value9) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9)
      Validity9(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10](that: ComplexValidator8[V3, V4, V5, V6, V7, V8, V9, V10]): ComplexValidator10[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10] =
    ComplexValidator10 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10)
      Validity10(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11](that: ComplexValidator9[V3, V4, V5, V6, V7, V8, V9, V10, V11]): ComplexValidator11[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11] =
    ComplexValidator11 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11)
      Validity11(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12](that: ComplexValidator10[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12]): ComplexValidator12[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12] =
    ComplexValidator12 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      Validity12(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13](that: ComplexValidator11[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13]): ComplexValidator13[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13] =
    ComplexValidator13 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13)
      Validity13(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14](that: ComplexValidator12[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14]): ComplexValidator14[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14] =
    ComplexValidator14 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14)
      Validity14(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15](that: ComplexValidator13[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15]): ComplexValidator15[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15] =
    ComplexValidator15 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15)
      Validity15(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16](that: ComplexValidator14[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16]): ComplexValidator16[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16] =
    ComplexValidator16 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16)
      Validity16(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17](that: ComplexValidator15[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17]): ComplexValidator17[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17] =
    ComplexValidator17 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17)
      Validity17(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18](that: ComplexValidator16[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18]): ComplexValidator18[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18] =
    ComplexValidator18 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18)
      Validity18(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19](that: ComplexValidator17[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19]): ComplexValidator19[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19] =
    ComplexValidator19 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19)
      Validity19(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20](that: ComplexValidator18[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20]): ComplexValidator20[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20] =
    ComplexValidator20 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20)
      Validity20(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17, thatValidity._18)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21](that: ComplexValidator19[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21]): ComplexValidator21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21] =
    ComplexValidator21 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21)
      Validity21(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17, thatValidity._18, thatValidity._19)
    }

  def <->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22](that: ComplexValidator20[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22]): ComplexValidator22[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22] =
    ComplexValidator22 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22) =>
      val thisValidity = this(value1, value2)
      val thatValidity = that(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22)
      Validity22(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17, thatValidity._18, thatValidity._19, thatValidity._20)
    }

  def -->[V3](thatBuilder: (V1, V2) => ComplexValidator1[V3]): ComplexValidator3[V1, V2, V3] =
    ComplexValidator3 { (value1, value2, value3) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3)
        Validity3(thisValidity._1, thisValidity._2, thatValidity._1)
      }
      else {
        Validity3(thisValidity._1, thisValidity._2, value3.unknown)
      }
    }

  def -->[V3, V4](thatBuilder: (V1, V2) => ComplexValidator2[V3, V4]): ComplexValidator4[V1, V2, V3, V4] =
    ComplexValidator4 { (value1, value2, value3, value4) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4)
        Validity4(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2)
      }
      else {
        Validity4(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown)
      }
    }

  def -->[V3, V4, V5](thatBuilder: (V1, V2) => ComplexValidator3[V3, V4, V5]): ComplexValidator5[V1, V2, V3, V4, V5] =
    ComplexValidator5 { (value1, value2, value3, value4, value5) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5)
        Validity5(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3)
      }
      else {
        Validity5(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown)
      }
    }

  def -->[V3, V4, V5, V6](thatBuilder: (V1, V2) => ComplexValidator4[V3, V4, V5, V6]): ComplexValidator6[V1, V2, V3, V4, V5, V6] =
    ComplexValidator6 { (value1, value2, value3, value4, value5, value6) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6)
        Validity6(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4)
      }
      else {
        Validity6(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7](thatBuilder: (V1, V2) => ComplexValidator5[V3, V4, V5, V6, V7]): ComplexValidator7[V1, V2, V3, V4, V5, V6, V7] =
    ComplexValidator7 { (value1, value2, value3, value4, value5, value6, value7) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7)
        Validity7(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5)
      }
      else {
        Validity7(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8](thatBuilder: (V1, V2) => ComplexValidator6[V3, V4, V5, V6, V7, V8]): ComplexValidator8[V1, V2, V3, V4, V5, V6, V7, V8] =
    ComplexValidator8 { (value1, value2, value3, value4, value5, value6, value7, value8) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8)
        Validity8(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6)
      }
      else {
        Validity8(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9](thatBuilder: (V1, V2) => ComplexValidator7[V3, V4, V5, V6, V7, V8, V9]): ComplexValidator9[V1, V2, V3, V4, V5, V6, V7, V8, V9] =
    ComplexValidator9 { (value1, value2, value3, value4, value5, value6, value7, value8, value9) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9)
        Validity9(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7)
      }
      else {
        Validity9(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10](thatBuilder: (V1, V2) => ComplexValidator8[V3, V4, V5, V6, V7, V8, V9, V10]): ComplexValidator10[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10] =
    ComplexValidator10 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10)
        Validity10(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8)
      }
      else {
        Validity10(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11](thatBuilder: (V1, V2) => ComplexValidator9[V3, V4, V5, V6, V7, V8, V9, V10, V11]): ComplexValidator11[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11] =
    ComplexValidator11 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11)
        Validity11(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9)
      }
      else {
        Validity11(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12](thatBuilder: (V1, V2) => ComplexValidator10[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12]): ComplexValidator12[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12] =
    ComplexValidator12 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
        Validity12(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10)
      }
      else {
        Validity12(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13](thatBuilder: (V1, V2) => ComplexValidator11[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13]): ComplexValidator13[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13] =
    ComplexValidator13 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13)
        Validity13(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11)
      }
      else {
        Validity13(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14](thatBuilder: (V1, V2) => ComplexValidator12[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14]): ComplexValidator14[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14] =
    ComplexValidator14 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14)
        Validity14(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12)
      }
      else {
        Validity14(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15](thatBuilder: (V1, V2) => ComplexValidator13[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15]): ComplexValidator15[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15] =
    ComplexValidator15 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15)
        Validity15(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13)
      }
      else {
        Validity15(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16](thatBuilder: (V1, V2) => ComplexValidator14[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16]): ComplexValidator16[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16] =
    ComplexValidator16 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16)
        Validity16(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14)
      }
      else {
        Validity16(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown, value16.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17](thatBuilder: (V1, V2) => ComplexValidator15[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17]): ComplexValidator17[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17] =
    ComplexValidator17 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17)
        Validity17(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15)
      }
      else {
        Validity17(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18](thatBuilder: (V1, V2) => ComplexValidator16[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18]): ComplexValidator18[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18] =
    ComplexValidator18 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18)
        Validity18(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16)
      }
      else {
        Validity18(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19](thatBuilder: (V1, V2) => ComplexValidator17[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19]): ComplexValidator19[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19] =
    ComplexValidator19 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19)
        Validity19(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17)
      }
      else {
        Validity19(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20](thatBuilder: (V1, V2) => ComplexValidator18[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20]): ComplexValidator20[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20] =
    ComplexValidator20 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20)
        Validity20(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17, thatValidity._18)
      }
      else {
        Validity20(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown, value20.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21](thatBuilder: (V1, V2) => ComplexValidator19[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21]): ComplexValidator21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21] =
    ComplexValidator21 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21)
        Validity21(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17, thatValidity._18, thatValidity._19)
      }
      else {
        Validity21(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown, value20.unknown, value21.unknown)
      }
    }

  def -->[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22](thatBuilder: (V1, V2) => ComplexValidator20[V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22]): ComplexValidator22[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22] =
    ComplexValidator22 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22) =>
      val thisValidity = this(value1, value2)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22)
        Validity22(thisValidity._1, thisValidity._2, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10, thatValidity._11, thatValidity._12, thatValidity._13, thatValidity._14, thatValidity._15, thatValidity._16, thatValidity._17, thatValidity._18, thatValidity._19, thatValidity._20)
      }
      else {
        Validity22(thisValidity._1, thisValidity._2, value3.unknown, value4.unknown, value5.unknown, value6.unknown, value7.unknown, value8.unknown, value9.unknown, value10.unknown, value11.unknown, value12.unknown, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown, value20.unknown, value21.unknown, value22.unknown)
      }
    }
}

object ComplexValidator2 {
  def apply[V1, V2](ascertainValidity: (Indefinite[V1], Indefinite[V2]) => Validity2[V1, V2]): ComplexValidator2[V1, V2] =
    new ComplexValidator2[V1, V2] {
      def apply(value1: Indefinite[V1], value2: Indefinite[V2]) = ascertainValidity(value1, value2)
    }
}
