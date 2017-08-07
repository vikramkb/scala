object RightAssociativeColons {
  //right colon allows to use object towards right instead of left
  class Num(val x:Int) {
    def +:(y:Int): Int = x+y
    def +(y:Int): Int = x+y
  }

  val num = new Num(10)
  num.+:(10)
  10 +: num

  num + 10
  //below thing can not be done
//  10 + num

}