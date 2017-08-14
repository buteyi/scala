package testpackt

class C(id: Int) extends B(id :Int) with Something{
  println("hhhhhhh")

  def printC() = println(name)
}
