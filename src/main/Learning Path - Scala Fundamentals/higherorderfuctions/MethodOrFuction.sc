object MethodOrFuction {
  object Test {
    //Functions are their own objects
    val f = (x:Int) => x+1
    //Methods are not functions. Methods belong to context
    def g(x:Int) = x+1
  }

  //retries f reference and calls apply
  Test.f.apply(5)
  Test.f(5)
  //method
  Test.g(10)

  
}