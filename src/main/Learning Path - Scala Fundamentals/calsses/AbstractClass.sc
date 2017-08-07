object AbstractClass {
  abstract class Animal {
    def name: String
    def makeSound: String

    override def toString: String = s"${name} ${makeSound}"
  }

  class Dog(val name: String) extends Animal {
    override def makeSound: String = "barks"
  }

  class Lion(val name: String) extends Animal {
    override def makeSound: String = "roars"
  }

  val dog : Animal = new Dog("dog1")
  val lion : Animal = new Lion("lion1")
  println(dog)
  println(lion)

}