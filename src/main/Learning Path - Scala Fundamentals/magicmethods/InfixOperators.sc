object InfixOperators {
  //infix operators to be used with spaces without .
  val x = 10
  x.+(10)
  x + 20

  class Num(val x:Int) {
    def add(y:Int): Int = x+y
    def add(y:Int, z:Int): Int = x + y + z
//    def +(y:Int): Int = x + y
    def +(y:Int): Num = new Num(x+y)
    def addMe(y:Int): Num = new Num(x+y)
  }
  val ten = new Num(10)
  ten.add(1)
  ten add 1
  ten add (1, 2)
  (ten+1).x
  ten+1+2+3+4+5 add 6
  ten addMe 1 addMe 2 addMe 3 add 4
}