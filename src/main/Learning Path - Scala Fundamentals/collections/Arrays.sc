object Arrays {
  //array is mutable
  //arrays in scala converted to primitive arrays in java
  val a: Array[Int] = Array(1, 2, 3, 4)
  a.head
  a.tail
  a.init
  a.min
  a.max
  a.isEmpty
  a(0)

  //repeated parameters use array
  def myPrint(z : Any*) {
    println(z.mkString(", "))
  }

  myPrint()
  myPrint("A", "B", "C")
  myPrint(List("A", "B", "C"))
  //converts list into repeated parameters
  myPrint(List("A", "B", "C"):_*)
}