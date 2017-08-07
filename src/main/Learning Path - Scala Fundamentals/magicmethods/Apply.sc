object Apply {
//  object companion
  class Add() {
    def apply(first: Int, second: Int): Int = first + second
  }

  object Add {
    def apply(): Add = new Add()
  }

  val add = Add()
  //can be called without apply.
  add.apply(3, 3)
  add(5,11)
  add(15,10)
}