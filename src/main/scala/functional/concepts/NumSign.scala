
object NumSign {
  def signnum(x : Int) : Int = x match {
    case _ if(x > 0) => 1
    case _ if(x < 0) => -1
    case _ => 0
  }
  
  def main(args : Array[String]) : Unit = {
    println("Signum: "+ signnum(77))
    println("Signum: "+ signnum(-77))
    println("Signum: "+ signnum(0))
  }
}