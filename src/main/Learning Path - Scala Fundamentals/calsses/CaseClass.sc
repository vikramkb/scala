object CaseClass {
  //case class includes default implmentations for equals, hashcode...etc
  //constructor also val is not required with case class
  // new is optional
  //case class can not sub class other sub class
  case class Employee(firstName: String, lastName: String)

  val emp1 = Employee("vikram", "k")
  val emp2 = Employee("vikram", "k")
  emp1.equals(emp2)
  emp1 == emp2
  println(emp1)
  println(emp2)

  //comes with case class
  val name = emp1 match {
    case Employee(f, s) => f
    case _ => "Unknown"
  }

  name
}