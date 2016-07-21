import scopt.OptionParser

case class Parameters(args: Array[String] = Array())

object Parameters {
  val parser = new OptionParser[Parameters]("myapp") {
    head("myapp", "1.0")

    arg[String]("<args>...").unbounded().optional().action( (x, c) =>
      c.copy(args = c.args :+ x) ).text("optional unbounded args")
    
  }
}