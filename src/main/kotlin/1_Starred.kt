// 1_Starred.kt
// Using 1-10 stars for customer feedback.
import check.range

fun f1(stars: Int): Int {
  range(stars in 1..10, stars)
  return stars + 5
}

fun f2(stars: Int): Int {
  range(stars in 1..10, stars)
  return stars * 5
}

fun main() {
  var stars1 = 4
  println(stars1)
  println(f1(stars1))
  println(f2(f1(stars1)))
  val stars2 = 11
  println(f1(stars2))
  stars1 = 99
  println(f2(stars1))
}
