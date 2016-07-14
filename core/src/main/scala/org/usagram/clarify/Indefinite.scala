package org.usagram.clarify

import org.usagram.clarify.error.Error

final class Indefinite[+V] private (value: V, val tags: Tags) {
  def validateWith(validateValue: V => Iterable[Error]): Definite[V] = {
    val errors = validateValue(value)

    if (errors.isEmpty) {
      valid
    }
    else {
      invalid(errors)
    }
  }

  private[clarify] def valid: Valid[V] = Valid(value, tags)

  private[clarify] def invalid(errors: Iterable[Error]): Invalid[V] = Invalid(value, tags, errors)

  private[clarify] def unknown: Unknown[V] = Unknown(value, tags)

  def label(label: String): Indefinite[V] =
    updateTags(tags.copy(label = new Indefinite(Some(label), metaTags(Some("label")))))

  private def metaTags(label: Option[String]): Tags = Tags(Indefinite(label))

  private def updateTags(newTags: Tags): Indefinite[V] = new Indefinite(value, newTags)
}

object Indefinite {
  def apply[V](value: V): Indefinite[V] = new Indefinite(value, Tags.empty)
}
