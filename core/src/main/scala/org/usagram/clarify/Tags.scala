package org.usagram.clarify

class Tags private (val label: Option[String]) {
  def copy(label: Indefinite[Option[String]] = Indefinite(this.label)): Tags =
    Tags(label)
}

object Tags {
  def empty: Tags =
    new Tags(None)

  val validator = {
    import org.usagram.clarify.validator._

    val label: Validator[Option[String]] = Optionally(NotBlank)

    label
  }

  def apply(label: Indefinite[Option[String]]): Tags =
    validator(label).resolve(new Tags(_))
}
