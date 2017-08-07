object ListCollection{
  //List is immutable collection.
  // Duplicates are allowed.
  // Access by index, searchable
  //List is a companion object
  val l1 = List(1,2,3,4,5)
  val l2 = List.apply(1,2,3,4,5)
  //Nil is empty List
  val l3 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
  //infix operator
  5 :: Nil
  Nil.::(5)

  l1.head
  l1.tail
  l1.init
  l1.last

  l1(1)
  //apply on List itself. other apply above is on companion object.
  l1.apply(1)
  l1(4)
  l1.min
  l1.max
  l1.isEmpty
  l1.nonEmpty
  l1.updated(0, 100)

  l1.mkString("|")
  l1.mkString("[", "*", "]")
}