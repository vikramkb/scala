object Test1 {
  val l = List("0,Will,33,385", "2,Hugh,55,221",
    "0,Will,33,385",
    "1,Jean-Luc,26,2",
    "2,Hugh,55,221")

//  33, 385
//  55, 221

  l.map(line => {
    val fields = line.split(",")
    (fields(2), fields(3))
  })

  def fun( f: (x: Int, y:Int)) {

  }
}

// 33, 385
// 33, 15
//33, (400, 2)
//33, (385+15)/2
// 33, 100

// 33, (385, 1)
// 33, (15, 1)
// 23, (20, 1)

//33, (400, 2)
