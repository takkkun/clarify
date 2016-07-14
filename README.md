clarify
=======

A simple validation library for Scala.

Usage
-----

```scala
import org.usagram.clarify._

class Person(val name: String, val age: Int)

object Person {
  val validator = {
    import org.usagram.clarify.validator._

    val name: Validator[String] = NotBlank

    val age: Validator[Int] = GreaterThanOrEqualTo.zero

    name <-> age
  }

  def apply(name: Indefinite[String], age: Indefinite[Int]): Person =
    validator(name, age).resolve(new Person(_, _))
}
```

How to create a validator
-------------------------

```scala
import org.usagram.clarify.validator.Validator
import org.usagram.clarify.error.Error
import org.usagram.clarify.tags.Tags

class MyValidator() extends Validator[Boolean] {
  override def validate(value: Boolean): Iterable[Error] =
    failIf(!value) {
      MyError
    }
}

object MyError extends Error {
  override def message(tags: Tags): String =
    s"${tags.label getOrElse "(no label)"} is not true"
}
```
