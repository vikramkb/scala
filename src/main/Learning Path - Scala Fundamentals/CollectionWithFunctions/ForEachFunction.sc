object ForEachFunction {
  val a = 1 to 10
  //observe the return of map
  println(a.map(x => println(x)))
  println(a.foreach(x => println(x)))
  a.foreach(x => println(x))
  a.foreach(println(_))
  a.foreach(println)
  a foreach println
}