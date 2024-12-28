```scala
class MyClass(var x: Int) {
  def myMethod(y: Int): Int = {
    x + y 
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // This will print 15

  //Create a copy of the object to avoid modification of the original object's state.
  val obj2 = new MyClass(obj.x) 
  val result = obj2.myMethod _
  obj.x = 20
  println(result(10)) // This will still print 15, because it is independent of obj.x. 
  println(obj.myMethod(10))//This will print 30 because obj.x has been modified.
}
```