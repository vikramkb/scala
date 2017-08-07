object WhileLoop {
  var n = 100
  while (n > 0) {
    print(n)
    print(",")
    n -= 1
  }

  val n1 = (1 to 100).reverse.mkString(",")
  println(n1)

  println((100 to 1 by -5).mkString(","))

}
