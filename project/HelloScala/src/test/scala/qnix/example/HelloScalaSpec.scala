package qnix.example

import org.scalatest._

class HelloScalaSpec extends FlatSpec with Matchers {
  "HelloScala" should "have a test!" in {
    "no test" should equal ("no test")
  }
}
