
object Recursion {
//  f(5) n: 5 -> 120
//  5 * f(4) -> 5 * 24
//  4 * f(3) -> 4 * 6
//  3 * f(2) -> 3 * 2
//  2 * f(1) -> 2 * 1
//  f(1) -> 1
  def fact(n: BigInt): BigInt = {
    if (n == 0 || n == 1) 1
    else n * fact(n - 1)
  }

  def some(x: Short) = x
  //observe error. tailrec annotation to check the function eligible for the tail recursion
//  @scala.annotation.tailrec
//  def fact1(n: BigInt): BigInt = {
//    if (n == 0 || n == 1) 1
//    else n * fact1(n - 1)
//  }


  fact(1234)
  fact(BigInt("1234"))
  // stack overflow
//    fact(BigInt("10000"))

//  t(5) n: 5, acc: 1 -> 120
//  t(4, 5) -> 120
//  t(3, 20) -> 120
//  t(2, 60) -> 120
//  t(1, 120) -> 120

  def tailRecursionFact(n: BigInt, acc: BigInt = 1): BigInt = {
    if (n == 0 || n == 1) acc
    else tailRecursionFact(n - 1, acc * n)
  }

  //tail call optimization
  @scala.annotation.tailrec
  def tailRecursionFact1(n: BigInt, acc: BigInt = 1): BigInt = {
    if (n == 0 || n == 1) acc
    else tailRecursionFact1(n - 1, acc * n)
  }

  tailRecursionFact(5)
  tailRecursionFact(BigInt("10000"))

  tailRecursionFact1(5)
  tailRecursionFact1(BigInt("10000"))


  def factorial(n:BigInt) : BigInt = {
    @scala.annotation.tailrec
    def tailRecFact(n: BigInt, acc: BigInt = 1): BigInt = {
      if (n == 0 || n == 1) acc
      else tailRecFact(n - 1, acc * n)
    }

    tailRecFact(n, 1)
  }

  factorial(5)
  factorial(BigInt("10000"))

}