package qnix.example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest._

@RunWith(classOf[JUnitRunner])
class HelloScalaSpec extends FlatSpec with Matchers {
  "HelloScala" should "have a test!" in {
    Func.factorial(5) shouldEqual(120)
  }
  "Test One" should "be run first" in {
    1 should equal (1)
  }
  "Test Two" should "run second" in {
    (1 + 1) should equal (2)
  }
}
