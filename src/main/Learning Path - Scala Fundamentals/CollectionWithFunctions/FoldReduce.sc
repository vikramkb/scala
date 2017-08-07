object FoldReduce {
  //foldLeft and foldRight does a reduce operation with seed value
  //reduceLeft and reduceRight does not use seed value.
  (1 to 10).foldLeft(0)((total, next) => total + next)
  (1 to 10).foldLeft(0)( _ + _)
  (1 to 10).foldLeft(0)((total, next) => {
    println(s"total = $total, next $next")
    total + next
  })
  //no need of initializer total to 0
  (1 to 10).reduceLeft((total, next) => {
    println(s"total = $total, next $next")
    total + next
  })
  (1 to 10).reduceLeft(_ + _)

  (1 to 10).foldRight(0)((next, total) => {
    println(s"total = $total, next $next")
    total + next
  })

  //no need of initializer total to 0
  (1 to 10).reduceRight((next, total) => {
    println(s"total = $total, next $next")
    total + next
  })

  (1 to 10).sum
  (1 to 10).product

}