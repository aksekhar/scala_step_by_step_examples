package scala_basics
import  org.joda.time.DateTime

object scalaNumbers {

  def main(args: Array[String]): Unit = {

   //Range of Numbers MinValue and MaxValue
    println(Byte.MinValue+" - "+Byte.MaxValue)
    println(Short.MinValue+" - "+Short.MaxValue)
    println(Int.MinValue+" - "+Int.MaxValue)
    println(Long.MinValue+" - "+Long.MaxValue)
    println(Float.MinValue+" - "+Float.MaxValue)
    println(Double.MinValue+" - "+Double.MaxValue)

    println("Converting String to Int "+ "111".toInt)
    println("Converting String to Float "+ "111".toFloat)
    println("Converting String to Double "+ "111111111111111111111111111".toDouble)

    println("BigInt "+  BigInt("2"))
    println("BigInt "+  BigDecimal("2"))

    //Datetime
    println("DateTimeNow\t"+DateTime.now)

    def toInt(s: String): Option[Int] ={
     try{
       Some(s.toInt)
     } catch {
        case e: NumberFormatException => None
      }
     }
    println(toInt("09"))
    println(toInt("0S").getOrElse(0))

    toInt("08") match {
      case Some(n) => println(n)
      case None => println("Boom! That wasn't a number.")
    }
    toInt("0A") match {
      case Some(n) => println(n)
      case None => println("Boom! That wasn't a number.")
    }

    println(s"toDouble ${10.toDouble} toFloat ${10.toFloat}  toInt ${10.11.toInt}")

    val a = 1111L
    println(a.isValidByte+" "+a.isValidShort)

    val b =  if (a.isValidShort) {
          a.toShort
      }
    println(b)
    //
    val  x = 1
     println(x.getClass)
    /*
      If you see above line  println(x.getClass) its return Int class
      But we can force a type using alternative ways like below
     */
    val x1 = 0: Float
    val x2 = 1F
    val x3: Float = 1

    println(s"x1 type: ${x1.getClass}\n x2 type: ${x2.getClass}\n x3 type:  ${x3.getClass}")
    val x4 = 0x20L

    println(x4+" "+x4.getClass)


    //Other examples
    val name = "Ak"
    val ak = name: Object
    println(ak.getClass)
    //For numeric type  we can set  zero, For others we can do like below:
    val fName = null.isInstanceOf[String]
    println(fName.getClass)





  }

}
