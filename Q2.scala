object Q2 {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 4.0f

    println(-(-b) * a + c * d - (-1)) // 27

    println({
      a += 1; a
    }) // value of a = 3

    println(-2 * (g - k) + c) // 4.6000004

    println({
      c = c + 1; c
    }) //value of c = 5

    println({
      c += 1; a+=1;
      c*a
    }) // 6*4 = 24
  }
}
