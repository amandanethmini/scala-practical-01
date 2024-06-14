object areaOfDisk {
  def areaOfDisk(r: Double): Double = math.Pi * r * r

  def main(args: Array[String]): Unit = {
    val r = 5
    val area = areaOfDisk(r)
    println("Area of a disk is " + area)
  }

}
