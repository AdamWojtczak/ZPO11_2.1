import scala.util.Try

object Password {
  val someValue = "test"
  def JednaWielka(string:String): Boolean = {
    for (c <- string)
      if (c.isUpper == true)
        true
    false
  }
  def JednaMala(string:String): Boolean = {
    for (c <- string)
      if (c.isLower == true)
        true
    false
  }
  def JednaCyfra(string:String): Boolean = {
    for (c <- string)
      if (Try(c.toInt).isSuccess)
        true
    false
  }
  def DwieCyfry(string:String): Boolean = {
    var x = 0
    for (c <- string)
      if (Try(c.toInt).isSuccess)
        x += 1
    if (x > 1)
      true
    false
  }
  def dlugosc(a: Int) = (b: Int) => {

  }
  def main(args: Array[String])
  {

  }
}