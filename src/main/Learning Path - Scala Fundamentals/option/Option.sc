import java.util.Optional

object Options {

  //  Option[T] is abstract super class. Some[T] and None are sub classes
  class Employee(val firstName: String, val middleName: Option[String], val lastName: String) {
    def this(firstName: String, middleName: String, lastName: String) = {
      this(firstName, Some(middleName), lastName)
    }

    def this(firstName: String, lastName: String) = {
      this(firstName, None, lastName)
    }

    def this() = {
      this("Unknown", None, "Unknown")
    }

    override def toString: String = s"${firstName}-${middleName}-${lastName}"
  }

  val emp1 = new Employee("vikram", "babu", "k")
  val emp2 = new Employee("vikram", "k")
  val emp3 = new Employee()

  emp1
  emp2
  emp3
  emp1.middleName.get
  emp2.middleName.getOrElse("no middle name")

  def getValueByMatching(name: Option[String]): String = {
    name match {
      case Some(name) => name
      case None => "No middle name"
    }
  }

  getValueByMatching(emp1.middleName)
  getValueByMatching(emp2.middleName)
  getValueByMatching(emp3.middleName)
}