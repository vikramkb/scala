object Currying{
  val f = (x:Int) => (y:Int) => (z:Int) => x+y+z
//  def f1(x:Int)(y:Int)(z:Int) = x+y+z

  val g = (x:Int, y:Int) => x+y
  g(10,20)

  //observe gc signature is same as f signature
  val gc = g.curried
  g(10,20)
  gc(10)(20)
  val guc = Function.uncurried(gc)
  guc(10,20)

  val h3p = (x:Int, y:Int, z:Int) => x+y+z
  //returns function (Int,Int) => Int
  val h2p = h3p(2,_:Int,_:Int)
  //returns function(Int) => Int
  val h1p = h2p(3, _:Int)
  h1p(4)

}