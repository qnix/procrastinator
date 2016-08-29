package qnix.example

import org.scalatest._

class HelloScalaSpec extends FlatSpec with Matchers {
  "HelloScala" should "have a test!" in {
    Func.factorial(5) shouldEqual(120)
  }
}
