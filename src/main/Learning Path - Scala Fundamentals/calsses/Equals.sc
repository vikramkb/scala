object Equals {
  class Employee(val firstNmae : String, val lastName : String, val salary: Int) {
    def totalSalary = salary + 1000

    override def equals(obj: scala.Any): Boolean = {
      val otherEmploy = obj.asInstanceOf[Employee]
      firstNmae.equals(otherEmploy.firstNmae) && lastName.equals(otherEmploy.lastName) && salary.equals(otherEmploy.salary)
    }

    override def hashCode(): Int = {
      var result = 19
      result = 31 * result + firstNmae.hashCode
      result = 31 * result + lastName.hashCode
      result = 31 * result + salary.hashCode
      result
    }


    override def toString = s"Employee($firstNmae, $lastName, $salary, $totalSalary, $hashCode)"
  }

  val emp1 = new Employee("vikram", "k", 1000)
  val emp2 = new Employee("vikram", "k", 1000)
  emp1.equals(emp2)
  emp1 == emp2
  emp1 != emp2
  emp1 eq emp2

  println(emp1)
  println(emp2)

}