object Constructors {

  //main constructor
  class Employee(val firstName: String, val lastName: String, val location: String, val age: Int) {
    //all require is called within constructor
    require(firstName.nonEmpty, "first name can not empty")

    if (age < 18)
      throw new IllegalArgumentException("emplyee age can not be less than 18")

    //better way
    def this(firstName: String, lastName: String) = this(firstName, lastName, "Hyderabad", 18)

    def this(firstName: String) = {
      this(firstName, "", "Hyderabad", 18)
      //side effect
    }

    def fullName = s"${firstName} ${lastName}"

    def copy(firstName: String = this.firstName, lastName: String = this.lastName, location: String = this.location, age: Int = this.age) = {
      new Employee(firstName, lastName, location, age)
    }
  }

  val vikram = new Employee("vikram", "k")
  vikram.firstName
  vikram.lastName
  vikram.location
  vikram.fullName

  val vignesh = new Employee("vignesh")
  vignesh.firstName
  vignesh.lastName
  vignesh.location
  vignesh.fullName

  val vikram1 = vikram.copy(location = "Nagole, Hyderabad")
  vikram1.location
  // Throw IlleagalArgumentException as validation is failed
  //  new Employee("")

  try {
    new Employee("")
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
  } finally {
    println("called in any case")
  }

  try {
    new Employee(firstName = "Vishant", "k", "Hyd", age = 3)
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
  }


}