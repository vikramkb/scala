object FunctionsAsArgs {
  def transformInt(x:Int, t: Int => Int) : Int = {
    t(x)
  }

  val square = (x: Int) => x*x
  val cube = (x: Int) => x*x*x

  transformInt(10, (x: Int) => x*x)
  transformInt(10, cube)
  transformInt(10, (x:Int) => x/2)
  transformInt(10, (x:Int) => x/2)
}