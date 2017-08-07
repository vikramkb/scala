object ForComprehension {
  for(i <- 1 to 5) {
    print(i)
  }

  val result = for(i <- 1 to 5) yield i*2
  val result1 = (1 to 5).map(i => i*2)

  for(i <- List(1,2,3,5);
      j <- List(6,7,8,9)) yield (i,j)
  for(i <- 1 to 5;
      j <- 6 to 9) yield (i,j)
  (1 to 5).flatMap(x => (6 to 9).map(y => (x, y)))

  for(i <- 1 to 5 if i%2 == 0;
      j <- 6 to 7) yield (i,j)
  for(i <- 1 to 5
      if i%2 == 0;
      j <- 6 to 7) yield (i,j)

  (1 to 5).filter(i => i % 2 == 0).flatMap(i => (6 to 7).map(j => (i, j)))
  (1 to 5).withFilter(i => i % 2 == 0).flatMap(i => (6 to 7).map(j => (i, j)))

}