object SetCollection {
  val s1 = Set(1,2,3,4,5)
  val s2 = Set(1,2,2,3, 3, 4, 5)

  val s3 = Set(1,10, 9)

  s1 diff s3
  s3 diff s1
  s1 union s3
  s1 intersect s3

  //++ same as union. But works with any other collection
  s1 ++ s3
  s1 ++ List(1, 100, 200)
  s3 -- s1
  s3 -- List(1, 10)
  //- is for single element. -- is for other collection.
  s3 - 1

  s2(1) //does s2 contains 1
  s2.apply(1) // same as S2(1)
  s2.contains(1)
}