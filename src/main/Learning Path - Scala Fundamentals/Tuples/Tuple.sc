object Tuples {
  val t = (34, "vikram", "k", "hyd")
  t._1
  t._2
  t._3

  val tup1 : (Int, String, String, String) = t
  //Tuple1, Tuple2 .... upto Tuple22 are available
  val tup2 : Tuple4[Int, String, String, String] = t
  tup1
  tup2

  val pair : Tuple2[Int, Int] = (5, 10)
  val pairSwap: (Int, Int) = pair.swap

  val vikramPhonePair = "vikram" -> "900"
  vikramPhonePair._1
  vikramPhonePair._2

}