object MapCollection {
  //apply takes tuple *
  val m1 = Map(("A", 1), ("B", 2), ("C", 3))
  val m2 = Map("A" -> 1, "B" -> 2, "C" -> 3)

  m1.get("A")
  m1("A")
  m1.apply("A")
  m1.get("X") // returns None
//  m1("X") //NoSuchElementException
  //prefer get over apply

  m1.toList
  m1.toSet
  m1.keys
  m1.keySet
  m1.values //returns MapLike
  m1.values.toSet

  //Symbol maintains string pool. These are perfect for Map keys
  val s1 = Symbol("xyz")
  val s2 = 'xyz
  s1 == s2

  val m3 : Map[Symbol, Int] = Map('x -> 1, 'y -> 2, 'z -> 3);
  m3.get('x)
}