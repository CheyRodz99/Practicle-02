
import scala.io.StdIn

object Q3 {
  def normalWH(normalWh: Int): Int = {
    normalWh * 250;
  }

  def overTime(ot: Int): Int = {
    ot * 85;
  }

  def taxPay(tot: Int): Double = {
    tot * 0.12;
  }

  def totIncome(normalWh: Int, overTWh: Int): Int = {
    normalWH(normalWh) + overTime(overTWh);
  }

  def takeHomeSalary(normalWh: Int, overTWh: Int): Double = {
    totIncome(normalWh, overTWh) - taxPay(totIncome(normalWh, overTWh));
  }

  def main(args: Array[String]): Unit = {
    print("Enter Normal Working Hours : ");
    var normalWh: Int = StdIn.readInt();
    print("Enter OT hours : ");
    var overTwh: Int = StdIn.readInt();

    println("Takehome salary is : " + takeHomeSalary(normalWh, overTwh));
  }
}
