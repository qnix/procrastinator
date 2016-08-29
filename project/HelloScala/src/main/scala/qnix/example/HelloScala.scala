package qnix.example

object Func {
  def factorial(n: BigInt): BigInt = {
    def iter(n: BigInt, p: BigInt): BigInt = {
      if (n <= 0)
        p
      else
        iter(n - 1, n * p)
    }
    iter(n, 1)
  }
}

object HelloScala {
  def main(args: Array[String]) {
    println(">>>> HelloScala")
    println(Func.factorial(100))
  }
}
