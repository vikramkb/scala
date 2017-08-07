object MapFunction {
  import scala.language.postfixOps
  val l = List(1,2,3,4,5)
  val increment = (v:Int) => v+1
  val square = (v:Int) => v*v

  l.map(increment)
  l.map(square)
  l.map((v:Int) => v*v*v)
  l.map(v => v*v*v)
  l.map(v => v*v*v)
  l.map(_ * 4)
  l.map(4*)

  val s = List("vikram", "vishant", "vignesh", "munna")
  s.map(x => x.size)
  s.map(x => x -> x.size)

  val m = Map('India -> 4, 'China -> 5, 'USA -> 8)
  m.map(t => Symbol("Team " + t._1.name) -> t._2)

  "Vikram".map(1+)
  "Vikram".map(_ + 1)
  "Vikram".map(c => (c+1).toChar)
  Some(10).map(1+)

}