```scala
class MyClass[T](val value: T) {
  def myMethod(x: Int): T = {
    if (x > 0) {
      value
    } else {
      throw new IllegalArgumentException("x must be positive")
    }
  }
}

val myInstance = new MyClass[String]("Hello")
println(myInstance.myMethod(-1))
```