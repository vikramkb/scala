object FunctionReturnsFunction {
  val g = (x:Int) => (y:Int) => x+y
  g(10)(20)
}