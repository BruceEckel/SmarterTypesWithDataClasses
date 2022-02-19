// Data classes
// "A type is a set of values"
// "Make illegal values unrepresentable"
import check.range

data class Stars(val n: Int) {
  init {
    range(n in 1..10, n)
  }
}

fun f1(stars: Stars) = Stars(stars.n + 5)

fun f2(stars: Stars) = Stars(stars.n * 5)

fun main() {
  val stars1 = Stars(4)
  // stars1.n = 99;  // Can't modify n
  println(stars1)
  println(f1(stars1))
  println(f2(f1(stars1)))
  println(stars1)
  val stars2 = Stars(11)
  println(stars2)
  println(f1(stars2))
  println(stars2)
  // Data classes can be keys in hashed data structures,
  // because they define equals() and hashCode():
  val m = mapOf(Stars(4) to "four", Stars(9) to "nine")
  println(m)
  // Automatically-generated copy() still
  // performs the constructor check:
  val copied = stars1.copy(n=12)
  println(copied)
}
