object ReturnMultipleValues {
  val mul3 = (x:Int, y:Int) => (3*x, 3*y)
  mul3(2, 3)

  val f = (x:Int, y:String) => (x, y, 5.0)
  f(2, "hello")

  def test(x : (Int, String)) = x._1 + x._2

}