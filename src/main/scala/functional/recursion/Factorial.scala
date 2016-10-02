import scala.annotation.tailrec

object Factorial {
  def main(args: Array[String]) : Unit = {
    println("Factorial Loop:" + factorial(5))
    println("Factorial Recursion:" + factorial(5))
  }
  
  def factorial(i:Int) : Int = {
    var fact = 1;
    for(i <- 1 to i) {
      fact *= i
    }
    fact
  }
  /*
   * Very Important aspect: all method arguments in scala are
   * vals so no reassignment
   */
  def factRecur(i : Int) : Int = {
    /**
     * Tail call optimization wants the last call to be the same function
     * replaces the last call with internal looping to avoid StackOverFlow Exception
     */
    @tailrec
    def recurLoop(i : Int, acc : Int) : Int =  i match {
      case 0 => acc
      case _ => recurLoop(i - 1, acc*i)
    }
    recurLoop(i, 1)
  }
}