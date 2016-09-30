import scala.collection.mutable.ListBuffer

object ListSum {
  def main(args: Array[String]) : Unit = {
    val numList = List(3, 5, 8, 7)
    println("Imperative total: " + sumImp(numList))
    println("Declarative total: " + sumDec(numList))
    println("Declarative Map: " + mapDec(numList))
    println("Imperative Map: " + mapImp(numList))
  }
  /*
   * Imperative style of programming
   * where use of var/mutability is most notable and the functions are bloated
   */
  def sumImp(numList: List[Int]): Int = {
    var sum = 0;
    for (i <- numList) {
      sum += i
    }
    sum
  }
  
  /*
   * Declarative style/functional programming keeping immutability in mind
   * foldleft just take two parameter one variable and the other is an anonymous
   * function within the {(c,e) => c + e}
   */
  def sumDec(numList: List[Int]): Int = {
    numList.foldLeft(0){(c, e) => c + e}
  }
  
  def mapDec(numList: List[Int]): List[Int] = {
    var newList = new ListBuffer[Int]
    for(i <- numList) {
      newList += i * 2
    }
    newList.toList
  }
  
  /**
   * Imperative style
   * focussing on the function and not on looping
   * Due to immutability achieved you can run concurrently on with multiple threads
   * and becomes kind of scalable
   */
  def mapImp(numList: List[Int]): List[Int] = {
    numList.map{(x) => x * 2}
  }
}
