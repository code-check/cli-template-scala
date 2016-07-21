
object Main {
  def main(args: Array[String]) = {
    Parameters.parser.parse(args, Parameters()) match {
      case Some(p) =>
        App(p)
      case None =>
    }
  }
}