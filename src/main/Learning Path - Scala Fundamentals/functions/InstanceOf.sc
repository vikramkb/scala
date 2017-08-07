object InstanceOf {
  3.isInstanceOf[Int]
  BigInt(3).isInstanceOf[BigInt]
//  String -> Object -> CharSequence -> AnyRef -> Any
  "abc".isInstanceOf[String]
  "abc".isInstanceOf[CharSequence]
  "abc".isInstanceOf[AnyRef]
  "abc".isInstanceOf[Any]
  "abc".isInstanceOf[Object]
  ().isInstanceOf[Unit]
  ().isInstanceOf[AnyVal]
}