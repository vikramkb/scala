object ControlStructures{
  import scala.math._
  val age = 25;
  val trainClass = if(age > 60) "Senior Citizen" else "General"
  val anyClass = if(age>60) "Senior"
  val anyType = ()

  val x = 10
  val x0 = 2
  val y = 20
  val y0 = 2
  val distance = {
    val dx = x - x0
    val dy = y - y0
    sqrt(dx*dx + dy*dy)
  }

  for(i <- 1 to 10)
    println(i)

  for(c <- "vikram") println(c)

  for(i <- 1 to 3; j <- 1 to 3) print(i+j)

  for(i <- 1 to 3; j <- 1 to 3 if i != j) print(i+j)

  for(i <- 1 to 10) yield i % 3
}