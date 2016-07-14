package org.usagram.clarify.generation.generator

object Fragments {
  def ComplexValidator(n: Int) = s"ComplexValidator$n"

  def Validity(n: Int) = s"Validity$n"

  def Product(n: Int) = s"Product$n"

  def V(n: Int) = new Fragment(n)("V" + _)

  def Indefinite(n: Int) = new Fragment(n)("Indefinite[" + V(_) + "]")

  def Definite(n: Int) = new Fragment(n)("Definite[" + V(_) + "]")

  def value(n: Int) = new Fragment(n)("value" + _)

  def valueArg(n: Int) = new Fragment(n)(n => s"${value(n)}: ${Indefinite(n)}")

  def __(n: Int) = new Fragment(n)("_" + _)

  def __Arg(n: Int) = new Fragment(n)(n => s"${__(n)}: ${Definite(n)}")

  def thisValidity(n: Int) = new Fragment(n)("thisValidity._" + _)

  def thatValidity(n: Int) = new Fragment(n)("thatValidity._" + _)
}
