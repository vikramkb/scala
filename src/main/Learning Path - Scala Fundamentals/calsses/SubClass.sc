object SubClass {
  class Employee(val firstNmae : String, val lastName : String, val salary: Int) {
    def totalSalary = salary + 1000

    override def equals(obj: scala.Any): Boolean = {
      val otherEmploy = obj.asInstanceOf[Employee]
      firstNmae.equals(otherEmploy.firstNmae) && lastName.equals(otherEmploy.lastName) && salary.equals(otherEmploy.salary)
    }
  }
  class Manager(firstName : String, lastName : String, salary: Int, val incentive : Int)
    extends Employee(firstName, lastName, salary) {
    override def totalSalary : Int = { super.totalSalary + incentive }
  }

  val vikram = new Manager("vikram", "k", 10000, 2000)
  vikram.firstNmae
  vikram.lastName
  vikram.salary
  vikram.incentive
  vikram.totalSalary

  val vikramEmp : Employee = vikram
  vikramEmp.firstNmae
  vikramEmp.lastName
  //call Manager total salary
  vikramEmp.totalSalary
  //can not access the department properties
//  vikramEmp.incentive

  

}