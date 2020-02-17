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

    /*
      Replacements for ++ and −−
     */

     var i =10
     i += 1; i *= 2; i -= 2; i /=10

    println("value of i after calc: "+i)
    /*
      Comparing  floating point number
      0.2 + 0.1 = what is the value? In below example its show that its not 0.3
      So how to compare ?
     */
    val j = 0.3
    val k = 0.1 + 0.2
    if (j == k){
      println("equal")
    }else {
      println(k)
    }
    // Creating a function for comparing above values

    def ~=(x:Double,y:Double,precision:Double) ={
      if((x-y).abs < precision) true else false
    }
    println(~=(j,k,0.0001)) // approx equal

    val Bint = BigInt(1232243333)
      println(Bint+i);println(Bint.getClass);println(Bint.isValidLong)
     val bint1 = Bint*Bint*Bint
    //println(bint1.getClass)

    val  r = scala.util.Random
    println("Next Random value: "+r.nextInt(100))
    var aa = 0 to r.nextInt(10)
    println(aa)
   val cc= for (i <- 0 to r.nextInt( 10)) yield r.nextPrintableChar()
    println(cc)

    var numRange = 1 to 10

    var    numRange2 = (1 to 10 by 3).toList
    for(i <- numRange) print(i+"\t")
    println("\n")
    for(i <- numRange2) print(i+"\t")
    println("\n")
    import scala.language.postfixOps
    val    numRange1 = 1 to 10 by 2 toArray
    val pi = scala.math.Pi
    println(f"$pi/2")
    println(s"$pi/2")
    //Curency format
    var formatter = java.text.NumberFormat.getIntegerInstance
    println(formatter.format(10000000))
      formatter = java.text.NumberFormat.getInstance()
    println(formatter.format(100000.33))
    val locale = new java.util.Locale("de", "DE")
    val formatr = java.text.NumberFormat.getIntegerInstance(locale)
    println(formatr.format(10000000))
    formatter = java.text.NumberFormat.getCurrencyInstance
    println(formatter.format(10000000))
    println(formatter.format(100000.33))
    import java.util.{Currency, Locale}
    val de = Currency.getInstance(new Locale("de", "DE"))
    formatter.setCurrency(de)
    println(formatter.format(100000.33))


     }

}
