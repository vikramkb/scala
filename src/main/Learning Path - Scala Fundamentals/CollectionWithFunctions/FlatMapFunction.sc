object FlatMapFunction {
  val a = List(1,2,3,4,5)
  //returns list of list
  a.map(x => List(-x, 0, x))

  //flatten list of list to one list
  a.map(x => List(-x, 0, x)).flatten
  a.flatMap(x => List(-x, 0, x))

  val b : List[List[List[Int]]] = List(List(List(1,2,3), List(4,5,6)),
               List(List(7,8,9), List(10,11,12)))
  b.flatMap(c => c)
  b.flatMap(c => c).flatMap(c => c)

  val r = 1 to 5
  //creates set with number and it's square for every number between 1 to 5
  r.flatMap(n => Set(n, n*n))

  val m = Map(1-> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four")
  m.flatMap(t => Map(t._1 -> t._2, t._1 * 100 -> (t._2 + " Hundred")))

  Some(20).map(s => Some(s+3))
  Some(20).flatMap(s => Some(s+3))

}