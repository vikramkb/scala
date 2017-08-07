object Basic {
  //don't use var. var is mutating.
  class Employee(val firstName: String, val lastName: String, var age : Int) {

  }

  //Uniform access principle
  val vikram = new Employee("vikram", "k", 34)
  vikram.firstName
  vikram.lastName
  vikram.age
  vikram.age += 1
  vikram.age

  //java style getter and setter
  import scala.beans.BeanProperty
  class Employee1(@BeanProperty val firstName:String, @BeanProperty val lastName: String, @BeanProperty var age : Int)
  val vignesh = new Employee1("vignesh", "k", 9)
  vignesh.getFirstName
  vignesh.getLastName
  vignesh.getAge
  vignesh.setAge(vignesh.getAge + 1)
  vignesh.getAge
}