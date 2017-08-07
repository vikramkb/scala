object CurryingListExample {
  def filter(list : List[Int], f : Int => Boolean): List[Int]= {
    if(list.isEmpty) list
    else if(f(list.head)) list.head :: filter(list.tail, f)
    else filter(list.tail, f)
  }

  val mod = (div : Int, num : Int) => num % div == 0

  filter((1 to 10).toList, mod.curried(2))
  filter((1 to 10).toList, mod.curried(5))

  //explanation of filter((1 to 10).toList, mod(2))
  // returns Int => Boolean which is equivalent to
  // (num : Int) => Boolean = 2 % div == 0
  //filter()
}

