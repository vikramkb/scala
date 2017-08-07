object FilterFunction {
  val a = 1 to 10
  a.filter(x => x%2 == 0)
  a.filter(_%2 == 0) //even numbers
  a.filterNot(_%2 == 0) //odd numbers
  a.exists(_%2 == 0) //does it have even numbers

  val filterVowels = (s : String)  => s.toLowerCase.filter(c => Set('a', 'e', 'i', 'o', 'u').contains(c))
  filterVowels("vikram")
  filterVowels("apple")

  val s = Set("apple", "green", "red", "orange", "banana")
  s.filter(x => filterVowels(x).size > 1)
  s.filter(filterVowels(_).size > 1)

  val m = Map(1 -> "A", 2 -> "B", 3 -> "C", 4 -> "D", 5 -> "E", 6 -> "F")
  m.filterKeys(k => k%2 == 0)
}