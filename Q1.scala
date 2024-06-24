object Q1 {
  def main(args: Array[String]): Unit = {
    var k = 2
    var j = 2
    var i = 2
    var m = 5
    var n = 5
    var f = 12.0f
    var g = 4.0f
    var c = "X"

    val a = k + 12 * m
    val b = m / j
    val cValue = n % j
    val d = m / j * j
    val e = f + 10 * 5 + g
    i += 1
    val fValue = i*n

    println(s"a) k + 12 * m = $a")
    println(s"b) m / j = $b")
    println(s"c) n % j = $cValue")
    println(s"d) m / j * j = $d")
    println(s"e) f + 10 * 5 + g = $e")
    println(s"f) ++i * n = $fValue")
  }
}
