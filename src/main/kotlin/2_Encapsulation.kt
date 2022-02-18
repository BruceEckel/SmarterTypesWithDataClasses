package example2
// Encapsulation with pre- and post-condition checks
import check.range

fun condition(s: Int) = range(s in 1..10, s)

class Stars(n: Int) {
  private var n: Int
  init {
    condition(n) // Precondition
    this.n = n
  }
  fun f1(stars: Int): Int {
    condition(stars) // Precondition
    n = stars + 5
    condition(n) // Postcondition
    return n
  }
  fun f2(stars: Int): Int {
    condition(stars) // Precondition
    n = stars * 5
    condition(stars) // Postcondition
    return n
  }
  override fun toString() = "Stars($n)"
}

fun main(args: Array<String>) {
  val stars1 = Stars(6)
  println(stars1)
  println(stars1.f1(4))
  println(stars1.f2(stars1.f1(4)))
  println(stars1)
  val stars2 = Stars(11)
  println(stars2.f1(3))
}