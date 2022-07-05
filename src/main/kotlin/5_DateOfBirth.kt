// 5_DateOfBirth.kt
// For a type with a "small" set of pre-definable values, use an enum
import check.range

data class Day(val n: Int) {
  init {
    range(n in 1..31, "Day($n)")
  }
}

enum class Month(private val maxDays: Int) {
  NONE(0),  // Only needed for this example
  JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30),
  MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
  OCTOBER(31), NOVEMBER(30), DECEMBER(31);
  companion object {
    fun number(n: Int): Month =
      if (range(n in 1..12, "Month.number($n)"))
        values()[n]
      else NONE
  }
  fun checkDay(day: Day) =
    range(day.n <= maxDays, "Month($this) $day")
}

data class Year(val n: Int) {
  init {
    range(n in 1901..2022, "Year($n)")
  }
}

data class Birthday(
  val m: Month,
  val d: Day,
  val y: Year
) {
  init {
    m.checkDay(d)
  }
}

fun test(m: Int, d: Int, y: Int) {
  println("$m/$d/$y")
  println(Birthday(Month.number(m), Day(d), Year(y)))
}

fun main() {
  test(7, 8, 1957)
  test(0, 32, 1857)
  test(2, 31, 2022)
  test(9, 31, 2022)
  test(4, 31, 2022)
  test(6, 31, 2022)
  test(11, 31, 2022)
  test(12, 31, 2022)
}
