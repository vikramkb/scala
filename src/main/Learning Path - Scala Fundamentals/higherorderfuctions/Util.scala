package higherorderfuctions

class ListUtil(l : List[Int]) {
  def addAll(f: Int => Unit): Unit = {
    l.foreach(num => f(num))
  }
  def addAll(f: (Int,Int) => Int): Int = {
    l.foreach(num => f(num))
  }
}
