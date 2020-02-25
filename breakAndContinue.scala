package scala_basics
import scala.util.control.Breaks
import util.control.Breaks._
object breakAndContinue extends App {
 var j: Int=0
  println("\nBreak Example")
   breakable {
     for (i <- 3 to 10) {
         j += 1
       print(j+"\t")
       if (j >= 5) break
     }
   }
  println("\nContinue Example")
  var num = 0
  val findName = "LINKU sekhar barik ak linku sekhar BARIK SEKHAR"
   breakable{
    for (i <- 0 until findName.length) {
      if (findName.charAt(0) == 'l') {
        break()
      }else num +=1
    }
    println(s"found $num l's in the string")
  }
  // nested break
  val inner = new Breaks
  val outer = new Breaks

   outer.breakable{
     for (i <- 1 to 5){
       inner.breakable{
         for (j <- 'a' to 'e'){
           if (i == 1 && j == 'c') inner.break else println(s"i: $i, j: $j")
           if (i == 2 && j == 'b') outer.break
         }
       }
     }
   }
  /*
   Alternate solution to handle break and continue
   */
  def sumOfMax(arr:Array[Int],lmt: Int):Int ={
    var somOfI: Int =0
    for (i <- arr){
      somOfI += i
      if(somOfI > lmt) return  lmt
    }
    somOfI
  }
  val a = Array.range(0 , 5)
  println(sumOfMax(a,5))
}
