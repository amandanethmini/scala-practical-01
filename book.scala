object book {
  def bookCoverPrice(n: Int) = n * 24.95
  def discount(n: Int): Double = bookCoverPrice(n) * 0.4
  def shippingCost(n: Int): Double =
    if (n <= 50) n * 3 else (n * 3) + (n - 50) * 0.75
  def total(n: Int): Double = bookCoverPrice(n) - discount(n) + shippingCost(n)

  def main(args: Array[String]): Unit = {
    var n = 60
    var totalPrice = total(n)
    println(" the total wholesale cost for 60 copies " + totalPrice)
  }
}
