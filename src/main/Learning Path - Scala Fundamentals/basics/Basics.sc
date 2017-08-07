object Basics {
  val v = 10
//  v = 20
  var x = 10
  x = 20

  lazy val l = {
    println("evaluated");30
  }
  l // no evaluated is printed
//  lazy var lv = {}
  // no lazy var

  val `my var` = 10
  `my var`
  val `val` = 20
  `val`
  val `notReserved` = 20
  notReserved

  //opchar can be used after _
  val `isTrue_?` = true

  //Int is converted to RichInt and calls abs
  -5.abs

  val value = 10
  var result = ""
  if(value > 10)
    result = "greater than 10"
  else if(value < 10)
    result = "less than 10"
  else
    result = "equals 10"

  val result1 = if(value > 10) "greater than 10"
                else if(value < 10) "less than 10"
                else "equals 10"





}