object BasicFunction{
  def add(x: Int, y:Int) : Int = {
    return x+y
  }

  def add1(x: Int, y:Int) : Int = {
    x+y
  }

  def add2(x: Int, y:Int) : Int = x+y

  def add3(x: Int, y:Int) = x+y

  add(4,5)
  add1(4,5)
  add2(4,5)
  add3(4,5)

  def abs(x: Int) = if(x<0) -x else x

  abs(-5)
  abs(10)

  var x = 20
  def modifyX(): Unit = {
    x +=  30
  }
  println(x)
  modifyX()
  println(x)

  def `method with space`(x : Int) = x
  println(`method with space`(10))

  def isItTrue_?(x : Boolean) = x == true
  isItTrue_?(true)
  isItTrue_?(false)

  def printMyFamily(fatherName: String, motherName: String, childName: String = "Not applicable"): Unit = {
      print(fatherName, motherName, childName)
  }

  printMyFamily("vikram", "swathi")
  printMyFamily(motherName = "swathi", fatherName = "vikram")
  printMyFamily("vikram", "swathi", "vignesh")
}
