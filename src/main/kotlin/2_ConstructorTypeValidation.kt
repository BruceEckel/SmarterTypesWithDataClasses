package example2
// "A type is a set of values"
// "Make illegal values unrepresentable"
import check.range

class Stars(val n: Int) {
  init {
    range(n in 1..10, n)
  }
  override fun toString() = "Stars($n)"
}

fun f1(stars: Stars): Stars {
  return Stars(stars.n * 10)
}

fun f2(stars: Stars): Stars {
  return Stars(stars.n + 10)
}

fun main() {
  val stars1 = Stars(6)
  println(stars1)
  println(f1(stars1))
  println(f2(stars1))
  val stars2 = Stars(11)
  println(f1(stars2))
}
