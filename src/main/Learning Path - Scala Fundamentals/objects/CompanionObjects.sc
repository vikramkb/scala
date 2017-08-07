object CompanionObjects {

  //name should be same as object
  case class SecretAgent(name : String) {
    def shoot(n: Int): Unit = {
      import SecretAgent._
      decrementBullets(n)
    }
  }

  //name should be same as claa
  object SecretAgent {
    private var numBullets = 5000

    private def decrementBullets(count: Int): Unit = {
      if(numBullets - count < 0)
        numBullets = 0
      else
        numBullets -= count
    }

    def remainingBullets: Int = numBullets
  }

  val agent1 = new SecretAgent("agent 1")
  val agent2 = new SecretAgent("agent 2")
  val agent3 = new SecretAgent("agent 3")
  agent1.shoot(1000)
  agent2.shoot(500)
  agent3.shoot(250)

  SecretAgent.remainingBullets

}