// Data classes
import check.range

data class Stars(val n: Int) {
  init {
    range(n in 1..10, n)
  }
}

fun f1(stars: Stars) = Stars(stars.n * 10)

fun f2(stars: Stars) = Stars(stars.n + 10)

fun main() {
  val stars1 = Stars(6)
  // stars1.n = 99;  // Can't modify n
  println(stars1)
  println(f1(stars1))
  println(f2(stars1))
  val stars2 = Stars(11)
  println(f1(stars2))
  // Data classes can be keys in hashed data structures,
  // because they define equals() and hashCode():
  val m: HashMap<Stars, String> = HashMap()
  m[stars1] = "stars1"
  m[stars2] = "stars2"
  println(m)
  // Automatically-generated copy() still
  // performs the constructor check:
  val copied = stars1.copy(n=11)
  println(copied)
}
