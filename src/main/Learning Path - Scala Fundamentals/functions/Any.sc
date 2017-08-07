object Any{
  //scala.Any is the super class for any object
  //scala.AnyVal is the sub class of Any and super class for all primitives
  //scala.AnyRef is the sub class of Any and super class for any objects

  //This can return String if x < 0 else return Int
  //The common ancestor for String and Int is Any. So the function return type is Any
  def diffReturnType(x: Int) = {
    if(x < 0) "x is less than 0"
    else x
  }
}