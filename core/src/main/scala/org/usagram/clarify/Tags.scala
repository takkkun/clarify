package org.usagram.clarify

class Tags private (val label: Option[String] = None) {
  def copy(label: Indefinite[Option[String]] = Indefinite(this.label)): Tags =
    Tags(label)
}

object Tags {
  def empty: Tags =
    new Tags()

  val validator = {
    import org.usagram.clarify.validator._

    val label: Validator[Option[String]] = Optionally(NotBlank)

    label
  }

  def apply(label: Indefinite[Option[String]]): Tags =
    validator(label).resolve(new Tags(_))
}
