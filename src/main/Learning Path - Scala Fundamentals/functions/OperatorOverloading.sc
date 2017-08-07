object OperatorOverloading {
  def +:(x:Int, y:Int) = x + y
  +:(3, 2)

  def add(x:Int, y:Int) = {
    println("int add is called")
    x + y
  }
  def add(x:BigInt, y:BigInt) = {
    println("BigInt add is called")
    x + y
  }
  def add(x:Double, y:Double) = {
    println("double add is called")
    x + y
  }

  add(2, 3)
  add(BigInt("2"), BigInt("3"))
  add(10.3, 10.3)
}