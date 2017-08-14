package testpackt

/**
  * Created by john on 17/7/21.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val fg = f _ compose g _
    val s = fg("abc")

    val person3 = new Person()

    val person = new Person("john")
    println(person)
    val person2 = new Person("bill", 18)
    println(person2)
    val a = Accounts.newUniqueNumber()
    println(a)
    val two = Accounts.newUniqueNumber()
    println(two)
    println(Accounts.s)
    val animal = new Animal()
    val is = person.isInstanceOf[Person]
    val as = person.asInstanceOf[Person]
    println(as)
    val r = failingFn(12)
    println(is)
    println(r)
//
//    val ff = new A {
//      override var name: String = "john"
//      override val id: Int = 32
//    }
//    println(ff.toString)
    val c = new C(12)
    c.printC()
    var Number(n) = "213123"
    println(Number.toString)

    var fun = mulBy(2)
    val result = fun(3)
    println(result)


  }

  def failingFn(i: Int): Int = {

    try {
      val x = 42 + 5
      x + ((throw new Exception("fail!")): Int)
    }
    catch {
      case e: Exception => 43
    }
  }



  def mulBy(factor: Int) = (x: Int) => factor * x


  def f(s: String) = "1" + s + "1"

  def g(s: String) = "2" + s + "2"
}
