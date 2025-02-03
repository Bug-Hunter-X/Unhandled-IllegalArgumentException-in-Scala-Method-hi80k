```scala
class MyClass[T](val value: T) {
  def myMethod(x: Int): Option[T] = {
    if (x > 0) {
      Some(value)
    } else {
      None
    }
  }
}

val myInstance = new MyClass[String]("Hello")
println(myInstance.myMethod(-1))
println(myInstance.myMethod(1))
```