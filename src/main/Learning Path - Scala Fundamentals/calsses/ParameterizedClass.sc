
object ParameterizedClass {
    case class MyList[T]() {
        var elements: List[T] = List[T]()
        def add(value:T): Unit = {
          elements = elements  :+ value
        }
        def size: Int = elements.size
    }

    val intList = new MyList[Int]
    intList.add(10)
    intList.add(20)
    intList.size
}