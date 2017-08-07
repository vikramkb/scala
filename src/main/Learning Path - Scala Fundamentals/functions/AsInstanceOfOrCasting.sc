object AsInstanceOfOrCasting {
  //asInstanceOf is used to do casting
  val x : Any = 10
  println(x.asInstanceOf[Int])

  def mulBy100(x:Any): Any = {
    if(x.isInstanceOf[Int]) x.asInstanceOf[Int]*100
    else "Can't do"
  }
  mulBy100(2)
  mulBy100("2")

  def mulBy100ByMatch(x:Any): Any = {
    x match {
      case x: Int => x * 100
      case _ => "Can't do"
    }
  }
  mulBy100ByMatch(2)
  mulBy100ByMatch("2")


}