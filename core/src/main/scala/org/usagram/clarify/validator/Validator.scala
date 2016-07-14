package org.usagram.clarify.validator

import org.usagram.clarify.error.Error

trait Validator[-V] {
  def validate(value: V): Iterable[Error]

  def pass: Iterable[Error] =
    Iterable.empty

  def fail: Iterable[Error] =
    fail(Error)

  def fail(error: Error): Iterable[Error] =
    Iterable(error)

  def failIf(condition: => Boolean)(error: => Error): Iterable[Error] =
    if (condition) {
      fail(error)
    }
    else {
      pass
    }

  def &&[V1 <: V](that: Validator[V1]): Validator[V1] =
    Validator { value =>
      val thisErrors = validate(value)

      if (thisErrors.isEmpty) {
        that.validate(value)
      }
      else {
        thisErrors
      }
    }

  def /[V1 <: V](that: Validator[V1]): Validator[V1] =
    Validator { value =>
      val thisErrors = validate(value)
      val thatErrors = that.validate(value)

      if (thisErrors.isEmpty || thatErrors.isEmpty) {
        pass
      }
      else {
        thatErrors
      }
    }

  def \[V1 <: V](that: Validator[V1]): Validator[V1] = that / this
}

object Validator {
  def apply[V](validateValue: V => Iterable[Error]): Validator[V] =
    new Validator[V] {
      def validate(value: V) = validateValue(value)
    }

  import scala.language.implicitConversions
  import org.usagram.clarify.{ ComplexValidator1, Validity1 }

  implicit def toComplex[A](validator: Validator[A]): ComplexValidator1[A] =
    ComplexValidator1 { value1 =>
      Validity1(value1.validateWith(validator.validate))
    }
}
