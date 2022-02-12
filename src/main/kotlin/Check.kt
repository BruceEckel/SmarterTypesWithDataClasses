package check

fun valid(exp: Boolean, errInfo: String): Boolean {
  if (!exp) {
    println("Type failure: $errInfo")
    return false // Should actually throw an exception
    // But this allows us to see everything in the examples
  }
  return true
}

fun range(exp: Boolean, errInfo: Any): Boolean =
  valid(exp, "$errInfo out of range")
