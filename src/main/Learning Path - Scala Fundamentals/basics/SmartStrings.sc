object SmartStrings {
  val s1 = "Ravi Teja, one of the top Telugu film heroes,\n" +
    " will be grilled by the Special Investigation Team (SIT)\n" +
    " of the excise department \n" +
    "on the drugs issue on Friday.\n"

  val s2 =
    """Ravi Teja, one of the top Telugu film heroes,
      |will be grilled by the Special Investigation Team (SIT)
      |of the excise department
      |on the drugs issue on Friday.
    """.stripMargin

  val s3 =
    """Ravi Teja, one of the top Telugu film heroes,
      @will be grilled by the Special Investigation Team (SIT)
      @of the excise department
      @on the drugs issue on Friday.
    """.stripMargin('@')

  val s4 = """Time now is 01:18AM"""
  val r = """[0-9][0-9]""".r
  r.findAllIn(s4).toList

  val str = String.format("week ends are %s and %s", "Saturday", "Sunday")
  "week ends are %s and %s".format("Saturday", "Sunday")
  "week ends are %2$s and %1$s".format("Saturday", "Sunday")
  import java.time._
  "today date is %1$tB-%1$te-%1$tY".format(LocalDate.now)

  val cost=10.55
  val item = "kitkat"
  s"cost of bar is $cost"
  s"cost of bar is $cost + 3"
  s"cost of bar is ${cost + 3}"
  f"cost of $item%s is $$${cost + 3}%1.2f"

}