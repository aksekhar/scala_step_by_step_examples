
package scala_basics

object scalaString2 extends App{

   val str = "U Me Aur Hum"
   println(str.map(c => (c.toByte+32).toChar))
 val newStr =  str.map {
     c => c.toUpper
   }
  println(newStr)

   /*
     Patterns in Strings.
     1. Creating num pattern by r method and searching first and all matching patterns
   */

  val numPattern = "[0-9]+".r

  val address =
    """ 501, MR Resedency,
      |Mahadevpura,
      |Bangalore, 560048
      |""".stripMargin
  val Nonum =
    """501, MR Resedency,
      |Mahadevpura,
      |Bangalore
      |""".stripMargin

     println(numPattern.findFirstIn(address))
     val numbers = numPattern.findAllIn(address).toArray
     numbers.foreach(println)
    // Creating Regex object by using regex class scala.util.matching.Regex
    import scala.util.matching.Regex
    val numPart = new Regex("[0-9]+")
    println("Using numPart: "+numPattern.findFirstIn(address))
    val noNummAddr = "No Number in this string lets see how its work "
    println(numPattern.findFirstIn(noNummAddr))
    // As returning a None we can use some function to handle our output.

   println(numPattern.findFirstIn(noNummAddr).getOrElse("NoMatch"))
   /*
     Replacing Patterns
     1. Ex replacing all number and CAPITAL letter to  from a string to X
    */

   val maskNum = address.replaceAll("[A-Z,0-9]","X")
   println(maskNum)
  // using regular expression, replace all and replace first
    println( numPattern.replaceAllIn(address,"y"))
    println( numPattern.replaceFirstIn (address,"y"))

    /*
     Accessing a Character
    */
    println(str.length)
    println(str.charAt(0)+" or  "+ str(0))
    println(str(2)+" -: str(2) Behind actual code execute is :-  "+ str.apply(2))
    /*
      Own method to String class
     */

    implicit class stringIncrement(s: String) {
      def increment = s.map(c => (c +1).toChar)
    }
   println("HAL".increment)
  /* Other way

  class strIncrement(s: String) {
    def inc = s.map(c => (c +1).toChar)
  }
  implicit  def incStrs(c: String) = new strIncrement(c)

  println("HAL".incStrs) */


 }
