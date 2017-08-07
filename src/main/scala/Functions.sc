object Functions{
  def abs(x : Double) = if (x >= 0) x else -x
  abs(-10)

  def fact(n : Int) : Int = if(n <= 0) 1 else n * fact(n-1)
  fact(5)

  //default arguments
  def greet(msg : String, left : String = "[", right : String = "]") = {
    println(left + msg + right)
  }

  greet("Hello")
  greet("Hello", "(", ")")

  def sum(nums : Int*) : Int = {
    var result = 0
    for(num <- nums) {
      result += num
    }
    return result
  }

  sum(1,2,3)
}