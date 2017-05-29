
object Main {
  def main(args: Array[String]) = {
    args.zipWithIndex.foreach{ case(v,i) =>
      println(s"argv[$i]: $v")
    }
  }
}
