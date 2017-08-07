object Unit {
  //Unit is similar to void
  val g = ()
  val unitType = print("hello")
  //unit is considered as primitive. Super type is AnyVal

  def dontDoThis(u : Unit) = "this function is called"

  dontDoThis(())

  //missing equal returns Unit
  def incorrectAdd(x: Int, y: Int) {
    x+y
  }

  def add(x:Int, y:Int) = {
    x+y
  }

  println(incorrectAdd(2, 3))
  println(add(2,3))

}
