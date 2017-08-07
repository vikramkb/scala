object FunctionsWithinFunctions {
  import scala.language.postfixOps
  val f:(Int, Int => Int) => Int = (x:Int, y:Int => Int) => y(x)
  f(10, (x:Int) => 2*x)

  //simplified version f
  val f1 = (x:Int, y:Int => Int) => y(x)
  //second parameter is a function takes int and returns square
  f1(10, (x:Int) => 2*x)
  //Int is know through type inference
  f1(10, x => 2*x)
  //_ to represent what ever argument comes
  f1(10, 2*_)
  //postfix implementation of *. Need import.
  f1(10, 2*)


}