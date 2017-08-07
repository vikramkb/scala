object ParameterizedTypes {

  def test[T](b: Boolean, x : T, y:T) : T = {
    if(b) x else y
  }
  test(b = true, 1, 2)
  test(false, 1, 2)
  test(true, "x", 2)

  def foo(x:Int) = x
}