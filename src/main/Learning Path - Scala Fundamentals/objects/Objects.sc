object Objects {
  //singleton
  //usages of object
  //need a factory
  //implement matching pattern
  //need default values
  //need main method
  object MyObject {
    def add(x: Int, y:Int) = x + y
  }

  val obj1 = MyObject
  val obj2 = MyObject
  obj1 == obj2
  //pointing to same ref
  obj1 eq obj2

  obj1.add(10, 20)
}