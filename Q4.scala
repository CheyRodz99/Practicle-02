object Q4 {
  def main(args: Array[String]): Unit = {
    val basePrice = 15.0
    val baseAttendance = 120
    val attendanceChange = 20
    val costPerPerformance = 500
    val costPerAttendee = 3

    def calculateAttendance(price: Double): Int = {
      if (price == basePrice) {
        baseAttendance
      } else if (price < basePrice) {
        baseAttendance + ((basePrice - price) / 5 * attendanceChange).toInt
      } else {
        baseAttendance - ((price - basePrice) / 5 * attendanceChange).toInt
      }
    }

    def calculateProfit(price: Double): Double = {
      val revenue = price * calculateAttendance(price)
      val totalCost = costPerPerformance + calculateAttendance(price) * costPerAttendee
      revenue - totalCost
    }

    val minPrice = 10.0
    val maxPrice = 20.0
    val step = 0.5
    var bestPrice = minPrice
    var maxProfit = calculateProfit(minPrice)

    var currentPrice = minPrice
    while (currentPrice <= maxPrice) {
      val currentProfit = calculateProfit(currentPrice)
      if (currentProfit > maxProfit) {
        maxProfit = currentProfit
        bestPrice = currentPrice
      }
      currentPrice += step
    }

    println(s"The best ticket price to maximize profit is Rs. $bestPrice")
    println(s"The maximum profit achievable is Rs. $maxProfit")
  }
}
