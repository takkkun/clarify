package org.usagram.clarify.validator

import org.usagram.clarify.error.Error

trait Validator[-V] {
  def validate(value: V): Option[Error]

  def &&[V1 <: V](that: Validator[V1]): Validator[V1] =
    Validator { value =>
      validate(value) orElse that.validate(value)
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

  protected def pass: Option[Error] =
    None

  protected def fail: Option[Error] =
    fail(Error)

  protected def fail(error: Error): Option[Error] =
    Some(error)

  protected def failIf(condition: => Boolean)(error: => Error): Option[Error] =
    if (condition) {
      fail(error)
    }
    else {
      pass
    }
}

object Validator {
  def apply[V](validateValue: V => Option[Error]): Validator[V] =
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
