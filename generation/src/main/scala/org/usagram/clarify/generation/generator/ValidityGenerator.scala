package org.usagram.clarify.generation.generator

class ValidityGenerator(packageName: String) extends Generator {
  import StringFormatter._
  import Fragments._
  import scala.language.postfixOps

  def apply(n: Int) = new Product(Validity(n), content(n))

  private def content(n: Int): String =
    s"""
      |// GENERATED CODE: DO NOT EDIT
      |
      |package $packageName
      |
      |case class ${Validity(n)}[${V(1) to n prefix "+"}](${__Arg(1) to n})
      |    extends Validity with ${Product(n)}[${Definite(1) to n}] {
      |  val values = Iterable(${__(1) to n})
      |
      |  def resolve[R](resolve: ${V(1) to n enclose} => R): R =
      |    if (isValid) {
      |      resolve(${__(1) to n member "value"})
      |    }
      |    else {
      |      // TODO: to properly
      |      val messages = for {
      |        value <- invalidValues
      |        error <- value.errors
      |      } yield error.message(value.tags)
      |
      |      throw new Exception(messages.mkString(", "))
      |    }
      |}
    """.strip
}

object ValidityGenerator {
  def apply(packageName: String): ValidityGenerator = new ValidityGenerator(packageName)
}