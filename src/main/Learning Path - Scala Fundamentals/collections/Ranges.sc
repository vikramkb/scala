object Ranges {
  val r1 = 1 to 10
  val r2 = 1 until 10 //excludes 10
  r1.tail
  r2.tail
  r1.last
  r2.last

  1 to 1000 by 50
  (1 to 10) ++ (11 to 20)

  Range(2, 8)
  Range(2, 8, 2)
  Range.inclusive(1, 8)
  Range.inclusive(1, 8, 2)

  Range.inclusive(1, 8, 2).toList

  for(i <- 1 to 8) print(i)
}