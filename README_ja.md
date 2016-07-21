# CLIアプリケーション作成用テンプレート(Scala)

ScalaでCLIアプリケーションを作成するためのテンプレートです。

[src/main/scala/App.scala](src/main/scala/App.scala)を編集することでCLIアプリケーションを作成することができます。

このテンプレートではコマンドラインオプションの解析ユーティリティとして、[scopt](https://github.com/scopt/scopt)を使用していsます。  
[Parametersクラス](src/main/scala/Parameters.scala)を修正することで任意のコマンドラインオプションを定義することも可能です。

## コマンドライン引数の取得方法
デフォルトのParametersクラスではすべてのコマンドライン引数はargs: Array[String]に配列として設定されます。

``` scala
object App {
  def apply(params: Parameters) = {
    params.args.foreach(println)
  }
}
```

## コマンド実行結果の標準出力への出力
標準の`println`メソッドを使用してください。

``` scala
  println(params.args(0))
```

