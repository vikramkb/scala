object ScalaBasics {
  import scala.math._
  val immutableNum = 8 * 5 + 2
  var mutableNum = 8 * 5 + 2
  mutableNum = 50
  1.to(10)
  1 to 10
  "Hello".intersect("World")

  val x : BigInt = 23434343
  x * x * x * x

  "Hello000".distinct // no braces for accessors which doesn't modify the state
  "hello"(4)
  "hello".apply(4)
  sqrt(4)
  1.to(10).map(sqrt(_))
  6.*(7)

  "Hello".permutations.toArray

  "Hello"*3

  "abc".sum
  ('a' + 'b' + 'c').toChar

}