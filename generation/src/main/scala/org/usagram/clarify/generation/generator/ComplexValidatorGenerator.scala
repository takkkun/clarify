package org.usagram.clarify.generation.generator

class ComplexValidatorGenerator(packageName: String) extends Generator {
  import StringFormatter._
  import Fragments._
  import scala.language.postfixOps

  def apply(n: Int) = new Product(ComplexValidator(n), content(n))

  private def content(n: Int): String = {
    val apposeMethods = (1 to (22 - n)).map(apposeMethodCode(n, _))
    val subsequentMethods = (1 to (22 - n)).map(subsequentMethodCode(n, _))
    val allMethods = apposeMethods ++ subsequentMethods

    s"""
      |// GENERATED CODE: DO NOT EDIT
      |
      |package $packageName
      |
      |trait ${ComplexValidator(n)}[${V(1) to n}]
      |    extends (${Indefinite(1) to n enclose} => ${Validity(n)}[${V(1) to n}]) {
      |${allMethods.mkString("\n").indent(2)}
      |}
      |
      |object ${ComplexValidator(n)} {
      |  def apply[${V(1) to n}](ascertainValidity: ${Indefinite(1) to n enclose} => ${Validity(n)}[${V(1) to n}]): ${ComplexValidator(n)}[${V(1) to n}] =
      |    new ${ComplexValidator(n)}[${V(1) to n}] {
      |      def apply(${valueArg(1) to n}) = ascertainValidity(${value(1) to n})
      |    }
      |}
    """.strip
  }

  private def apposeMethodCode(n: Int, argSize: Int): String = {
    val returnSize = n + argSize

    val returnComplexValidator = ComplexValidator(returnSize)
    val returnValidity = Validity(returnSize)
    val returnV = V(1) to returnSize

    val argStart = n + 1
    val argEnd = returnSize

    val argComplexValidator = ComplexValidator(argSize)
    val argV = V(argStart) to argEnd

    s"""
      |def <->[$argV](that: $argComplexValidator[$argV]): $returnComplexValidator[$returnV] =
      |  $returnComplexValidator { ${value(1) to returnSize enclose} =>
      |    val thisValidity = this(${value(1) to n})
      |    val thatValidity = that(${value(argStart) to argEnd})
      |    $returnValidity(${thisValidity(1) to n}, ${thatValidity(1) to argSize})
      |  }
    """.strip
  }

  private def subsequentMethodCode(n: Int, argSize: Int): String = {
    val returnSize = n + argSize

    val returnComplexValidator = ComplexValidator(returnSize)
    val returnValidity = Validity(returnSize)
    val returnV = V(1) to returnSize

    val argStart = n + 1
    val argEnd = returnSize

    val argComplexValidator = ComplexValidator(argSize)
    val argV = V(argStart) to argEnd

    s"""
      |def -->[$argV](thatBuilder: ${V(1) to n enclose} => $argComplexValidator[$argV]): $returnComplexValidator[$returnV] =
      |  $returnComplexValidator { ${value(1) to returnSize enclose} =>
      |    val thisValidity = this(${value(1) to n})
      |
      |    if (thisValidity.isValid) {
      |      val thatValidity = thisValidity.resolve(thatBuilder)(${value(argStart) to argEnd})
      |      $returnValidity(${thisValidity(1) to n}, ${thatValidity(1) to argSize})
      |    }
      |    else {
      |      $returnValidity(${thisValidity(1) to n}, ${value(argStart) to argEnd member "unknown"})
      |    }
      |  }
    """.strip
  }
}

object ComplexValidatorGenerator {
  def apply(packageName: String): ComplexValidatorGenerator = new ComplexValidatorGenerator(packageName)
}
