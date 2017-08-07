object Functions {
  //trait - pure abstracted construct which has abstract methods in it
  //construct which has abstract methods
  //Function1 takes Int as parameter and returns Int
  //Function2 takes Int, Int and return Int
  /// upto Function22
  val f1:Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(x: Int): Int = x + 1
  }

  val ff1:(Int => Int) = new Function1[Int, Int] {
    override def apply(x: Int): Int = x + 1
  }

  val fff1:(Int => Int) = (x: Int) => x+1

  val ffff1 = (x:Int) => x+1

  val f0:Function0[Int] = new Function0[Int] {
    override def apply(): Int = 10
  }

  val ff0:(() => Int) = new Function0[Int] {
    override def apply(): Int = 10
  }
  val fff0:(() => Int) = () => 10
  val ffff0 = () => 10

  val f2:Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(x: Int, y: Int): Int = x + y
  }

  val fff2:(Int, Int) => Int = (x:Int, y:Int) => x+y
  val ffff2 = (x:Int, y:Int) => x+y

  f0.apply()
  f0()
  ff0()
  fff0()
  ffff0()

  f1.apply(3)
  f1(3)
  ff1(3)
  fff1(3)
  ffff1(3)

  f2.apply(2, 3)
  fff2(2, 3)
  ffff2(2, 3)


}