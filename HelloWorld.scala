//obj called as singleton instance ,lazily initialized when first accessed
// similar to cls, bt only one instance  will be created automatically
//main is entry point to any  scala app
object HelloWorld{
  def main (args : Array[String]) : Unit = { //return of main null
    println("hello world")
  }
}