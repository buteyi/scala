package testpackt

object Accounts {
  private var lastNumber = 0
  var s = Map(1 -> "e")

  def newUniqueNumber() = { lastNumber += 1; lastNumber}
}
