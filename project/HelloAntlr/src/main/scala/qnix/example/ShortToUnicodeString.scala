package qnix.example

import qnix.example.ArrayInitParser._


class ShortToUnicodeString extends ArrayInitBaseListener {

  override def enterInit(ctx: InitContext) {
    print("\"")
  }

  override def exitInit(ctx: InitContext) {
    print("\"")
  }

  override def enterValue(ctx: ValueContext) {
    val value = Integer.valueOf(ctx.INT().getText)
    print("\\u%04x".format(value))
  }
}
