package higherorderfuctions

object Closures{
  def main(args: Array[String]): Unit = {
    var sum = 0
    val updateSum = (x:Int) => {
      sum = sum + x
    }
    println(sum)
    //updateSum function executes in ListUtil class.
    //the sum variable is automatically accessible in some other scope using closures
    new ListUtil(List(1,2,3,4)).addAll(updateSum)
    println(sum)
    new ListUtil(List(1,2,3,4)).addAll(updateSum)
    println(sum)
  }
}
