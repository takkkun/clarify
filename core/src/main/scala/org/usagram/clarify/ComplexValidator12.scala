// GENERATED CODE: DO NOT EDIT

package org.usagram.clarify

trait ComplexValidator12[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12]
    extends ((Indefinite[V1], Indefinite[V2], Indefinite[V3], Indefinite[V4], Indefinite[V5], Indefinite[V6], Indefinite[V7], Indefinite[V8], Indefinite[V9], Indefinite[V10], Indefinite[V11], Indefinite[V12]) => Validity12[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12]) {
  def <->[V13](that: ComplexValidator1[V13]): ComplexValidator13[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13] =
    ComplexValidator13 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13)
      Validity13(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1)
    }

  def <->[V13, V14](that: ComplexValidator2[V13, V14]): ComplexValidator14[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14] =
    ComplexValidator14 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14)
      Validity14(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2)
    }

  def <->[V13, V14, V15](that: ComplexValidator3[V13, V14, V15]): ComplexValidator15[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15] =
    ComplexValidator15 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15)
      Validity15(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3)
    }

  def <->[V13, V14, V15, V16](that: ComplexValidator4[V13, V14, V15, V16]): ComplexValidator16[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16] =
    ComplexValidator16 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15, value16)
      Validity16(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4)
    }

  def <->[V13, V14, V15, V16, V17](that: ComplexValidator5[V13, V14, V15, V16, V17]): ComplexValidator17[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17] =
    ComplexValidator17 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15, value16, value17)
      Validity17(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5)
    }

  def <->[V13, V14, V15, V16, V17, V18](that: ComplexValidator6[V13, V14, V15, V16, V17, V18]): ComplexValidator18[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18] =
    ComplexValidator18 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15, value16, value17, value18)
      Validity18(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6)
    }

  def <->[V13, V14, V15, V16, V17, V18, V19](that: ComplexValidator7[V13, V14, V15, V16, V17, V18, V19]): ComplexValidator19[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19] =
    ComplexValidator19 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15, value16, value17, value18, value19)
      Validity19(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7)
    }

  def <->[V13, V14, V15, V16, V17, V18, V19, V20](that: ComplexValidator8[V13, V14, V15, V16, V17, V18, V19, V20]): ComplexValidator20[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20] =
    ComplexValidator20 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15, value16, value17, value18, value19, value20)
      Validity20(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8)
    }

  def <->[V13, V14, V15, V16, V17, V18, V19, V20, V21](that: ComplexValidator9[V13, V14, V15, V16, V17, V18, V19, V20, V21]): ComplexValidator21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21] =
    ComplexValidator21 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15, value16, value17, value18, value19, value20, value21)
      Validity21(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9)
    }

  def <->[V13, V14, V15, V16, V17, V18, V19, V20, V21, V22](that: ComplexValidator10[V13, V14, V15, V16, V17, V18, V19, V20, V21, V22]): ComplexValidator22[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22] =
    ComplexValidator22 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
      val thatValidity = that(value13, value14, value15, value16, value17, value18, value19, value20, value21, value22)
      Validity22(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10)
    }

  def -->[V13](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator1[V13]): ComplexValidator13[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13] =
    ComplexValidator13 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13)
        Validity13(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1)
      }
      else {
        Validity13(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown)
      }
    }

  def -->[V13, V14](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator2[V13, V14]): ComplexValidator14[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14] =
    ComplexValidator14 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14)
        Validity14(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2)
      }
      else {
        Validity14(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown)
      }
    }

  def -->[V13, V14, V15](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator3[V13, V14, V15]): ComplexValidator15[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15] =
    ComplexValidator15 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15)
        Validity15(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3)
      }
      else {
        Validity15(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown)
      }
    }

  def -->[V13, V14, V15, V16](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator4[V13, V14, V15, V16]): ComplexValidator16[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16] =
    ComplexValidator16 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15, value16)
        Validity16(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4)
      }
      else {
        Validity16(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown, value16.unknown)
      }
    }

  def -->[V13, V14, V15, V16, V17](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator5[V13, V14, V15, V16, V17]): ComplexValidator17[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17] =
    ComplexValidator17 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15, value16, value17)
        Validity17(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5)
      }
      else {
        Validity17(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown)
      }
    }

  def -->[V13, V14, V15, V16, V17, V18](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator6[V13, V14, V15, V16, V17, V18]): ComplexValidator18[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18] =
    ComplexValidator18 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15, value16, value17, value18)
        Validity18(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6)
      }
      else {
        Validity18(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown)
      }
    }

  def -->[V13, V14, V15, V16, V17, V18, V19](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator7[V13, V14, V15, V16, V17, V18, V19]): ComplexValidator19[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19] =
    ComplexValidator19 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15, value16, value17, value18, value19)
        Validity19(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7)
      }
      else {
        Validity19(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown)
      }
    }

  def -->[V13, V14, V15, V16, V17, V18, V19, V20](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator8[V13, V14, V15, V16, V17, V18, V19, V20]): ComplexValidator20[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20] =
    ComplexValidator20 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15, value16, value17, value18, value19, value20)
        Validity20(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8)
      }
      else {
        Validity20(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown, value20.unknown)
      }
    }

  def -->[V13, V14, V15, V16, V17, V18, V19, V20, V21](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator9[V13, V14, V15, V16, V17, V18, V19, V20, V21]): ComplexValidator21[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21] =
    ComplexValidator21 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15, value16, value17, value18, value19, value20, value21)
        Validity21(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9)
      }
      else {
        Validity21(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown, value20.unknown, value21.unknown)
      }
    }

  def -->[V13, V14, V15, V16, V17, V18, V19, V20, V21, V22](thatBuilder: (V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12) => ComplexValidator10[V13, V14, V15, V16, V17, V18, V19, V20, V21, V22]): ComplexValidator22[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22] =
    ComplexValidator22 { (value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22) =>
      val thisValidity = this(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)

      if (thisValidity.isValid) {
        val thatValidity = thisValidity.resolve(thatBuilder)(value13, value14, value15, value16, value17, value18, value19, value20, value21, value22)
        Validity22(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, thatValidity._1, thatValidity._2, thatValidity._3, thatValidity._4, thatValidity._5, thatValidity._6, thatValidity._7, thatValidity._8, thatValidity._9, thatValidity._10)
      }
      else {
        Validity22(thisValidity._1, thisValidity._2, thisValidity._3, thisValidity._4, thisValidity._5, thisValidity._6, thisValidity._7, thisValidity._8, thisValidity._9, thisValidity._10, thisValidity._11, thisValidity._12, value13.unknown, value14.unknown, value15.unknown, value16.unknown, value17.unknown, value18.unknown, value19.unknown, value20.unknown, value21.unknown, value22.unknown)
      }
    }
}

object ComplexValidator12 {
  def apply[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12](ascertainValidity: (Indefinite[V1], Indefinite[V2], Indefinite[V3], Indefinite[V4], Indefinite[V5], Indefinite[V6], Indefinite[V7], Indefinite[V8], Indefinite[V9], Indefinite[V10], Indefinite[V11], Indefinite[V12]) => Validity12[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12]): ComplexValidator12[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12] =
    new ComplexValidator12[V1, V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12] {
      def apply(value1: Indefinite[V1], value2: Indefinite[V2], value3: Indefinite[V3], value4: Indefinite[V4], value5: Indefinite[V5], value6: Indefinite[V6], value7: Indefinite[V7], value8: Indefinite[V8], value9: Indefinite[V9], value10: Indefinite[V10], value11: Indefinite[V11], value12: Indefinite[V12]) = ascertainValidity(value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
    }
}
