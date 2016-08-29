package qnix.example

import org.scalatest._

class FuncSpec extends FlatSpec with Matchers {
  "Func.factorial" should "compute the factorial of a number!" in {
    Func.factorial(0) shouldEqual(1)
    Func.factorial(1) shouldEqual(1)
    Func.factorial(2) shouldEqual(2)
    Func.factorial(3) shouldEqual(6)
    Func.factorial(4) shouldEqual(24)
    Func.factorial(5) shouldEqual(120)
  }
}
