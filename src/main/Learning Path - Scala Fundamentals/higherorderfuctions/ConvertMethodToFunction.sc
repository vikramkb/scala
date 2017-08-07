object ConvertMethodToFunction {
  def abs(x:Int): Int = if(x < 0) -x else x

  //f is function which is abs. _ denotes not know the value at that time
  val f = abs _

  abs(-5) //method
  //calls abs with -5
  f.apply(-5) //function
  //calls abs with -5
  f(-5)

  class Num(x:Int) {
    def add1(y:Int) = x+y
    def add2(y:Int, z:Int) = x+y+z
  }

  class Str(x:String) {
    def add1(y:String) = x + y
    def add2(y:String, z:String) = x+y+z
  }

  //parameterized class. Idea is to call the function with the constructor value
  class AnyType[T](x: T) {
    def apply(f: T => T) = f(x)
  }

  val twenty = new Num(20)
  //add1 function
  val twentyAddFn = twenty.add1 _

  //x in AnyType is 10 which is Int
  val tenInt = new AnyType[Int](10)
  val thirtyInt = new AnyType[Int](30)
  //call add function with 10
  tenInt(twentyAddFn)
  tenInt(twenty.add1 _)
  tenInt(twenty.add1)

  //add2 is the function which takes 2 Int and return Int
  //add2(30, _: Int) fills 30 in return add2(_:Int). something like
  //add2(_:Int) = 10+20+z
  //Finally which is passed to tenInt. AnyType.apply calls add2(10) which fills z.
  // Hence it returns 10+20+30
  tenInt(twenty.add2(30, _: Int))
  tenInt.apply(twenty.add2(30, _: Int))
  thirtyInt.apply(twenty.add2(30, _: Int))

  val vikram = new Str("Vikram")
  //add1 function
  val vikramAddFn = vikram.add1 _

  val vigneshType = new AnyType[String]("Vignesh")
  vigneshType(vikramAddFn)
  //observe output order.
  vigneshType(vikram.add2("Vishant", _))
  vigneshType(vikram.add2(_, "Vishant"))

}