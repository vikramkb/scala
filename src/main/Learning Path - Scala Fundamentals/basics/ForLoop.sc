object ForLoop {
  var result = ""
  for(i <- 1 to 100) {
    result += i + ","
  }
  println(result)

  var l1 = List(1, 2, 3, 4)
  var l2 = List[Int]()
  for(i <- l1) {
    l2 = l2:+(i+1)
  }
  l2

  val l3 = for(i <- l1) yield i+1
}