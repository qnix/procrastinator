package qnix.example

import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import org.antlr.v4.runtime.tree.ParseTree


object HelloAntlr {
  def main(args: Array[String]) {
    // create a CharStream that reads from command line args, or standard input
    val input: ANTLRInputStream = {
      if (args.isEmpty)
        new ANTLRInputStream(Console.readLine())
      else
        new ANTLRInputStream(args.mkString(" "))
    }

    // create a lexer that feed off of input CharStream
    val lexer: ArrayInitLexer = new ArrayInitLexer(input)

    // create a buffer of tokens pulled from the lexer
    val tokens: CommonTokenStream = new CommonTokenStream(lexer)

    // create a parser that feeds off the token buffer
    val parser: ArrayInitParser = new ArrayInitParser(tokens)

    val tree: ParseTree = parser.init() // begin parsing at init rule

    // println(tree.toStringTree(parser))

    // Create a generic parse tree walker that can trigger callbacks
    val walker: ParseTreeWalker = new ParseTreeWalker
    // Walk the tree created during the parse, trigger callbacks
    walker.walk(new ShortToUnicodeString(), tree)
    println()
  }
}
