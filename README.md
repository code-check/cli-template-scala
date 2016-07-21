# CLI template for Scala

This is template app for making CLI application with Scala.  
You can make CLI application by editing [src/main/scala/App.scala](src/main/scala/App.scala)

This app uses [scopt](https://github.com/scopt/scopt) to parse command line parameters.  
You can parse any additional option parameters by editing [Parameter.scala](src/main/scala/Parameters.scala)

## How to get input parameters
As default, Parameters has all commandline parameters as args: Array[String].

``` scala
object App {
  def apply(params: Parameters) = {
    params.args.foreach(println)
  }
}
```

## How to output result
You can use `println` method

``` scala
  println(params.args(0))
```
