// 1-10 stars for giving feedback
import check.range

fun f1(stars: Int): Int {
  range(stars in 1..10, stars)
  return stars * 10
}

fun f2(stars: Int): Int {
  range(stars in 1..10, stars)
  return stars + 10
}

fun main() {
  var stars1 = 6
  println(stars1)
  println(f1(stars1))
  println(f2(stars1))
  val stars2 = 11
  println(f1(stars2))
  stars1 = 99
  println(f2(stars1))
}
