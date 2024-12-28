```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y 
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // This will print 15
  val result = obj.myMethod _ //Partial function application
  println(result(10)) //This will also print 15
  println(result.apply(10)) //This will also print 15
}
```