// 4_People.kt
// Composing data classes using data classes
import check.valid

data class FullName(val name: String) {
  init {
    println("Checking FullName $name")
    valid(
      name.split(" ").size > 1,
      "$name needs at least first and last names"
    )
  }
}

data class BirthDate(val dob: String) {
  init {
    println("TODO: Check BirthDate $dob")
  }
}

data class EmailAddress(val address: String) {
  init {
    println("TODO: Check EmailAddress $address")
  }
}

data class Person(
  val name: FullName,
  val dateOfBirth: BirthDate,
  val email: EmailAddress
) {
  init {
    println("TODO: Check Person")
  }
}

fun main() {
  val person = Person(
    FullName("Bruce Eckel"),
    BirthDate("7/8/1957"),
    EmailAddress("mindviewinc@gmail.com")
  )
  println(person)
}
