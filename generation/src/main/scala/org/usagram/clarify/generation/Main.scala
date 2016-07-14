package org.usagram.clarify.generation

import org.usagram.clarify.generation.generator._

import java.nio.file._

object Main {
  def main(args: Array[String]) {
    val packageName = "org.usagram.clarify"
    val dir = Paths.get("core/src/main/scala").resolve(packageToDir(packageName))
    val range = 1 to 22

    for (product <- range map ComplexValidatorGenerator(packageName).apply) {
      val path = dir.resolve(product.fileName)
      Files.write(path, product.content.getBytes)
    }

    for (product <- range map ValidityGenerator(packageName).apply) {
      val path = dir.resolve(product.fileName)
      Files.write(path, product.content.getBytes)
    }
  }

  private def packageToDir(packageName: String): Path =
    Paths.get(packageName.replace(".", "/"))
}
