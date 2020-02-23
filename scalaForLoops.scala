package scala_basics

object scalaForLoops  extends App{

  val a = Array("apple", "banana", "orange")
  val b = Array(1,2,3)
  //for loop
  for (i <- a) print(i+"\t" )
  //for loop with block
  for (i <- a) {
    var fruits = i.capitalize
    print(fruits+"\t")
  }
  //creating new value
  val fruits = for (i <- a) yield i.toUpperCase()
  for (f <- fruits) print(f+"\t")
  println("\n")
  for (i <- 0 until a.length) {
    println(s"$i is ${a(i)}")
  }
  for ((e,count) <- a.zipWithIndex){
    println(s"$count is $e")
  }
  for (i <- 1 to 20 if i %2 ==0  ) print(i+"\t")
  println("\n")
 val names = Map("fname"->"Ak","mname"->"Sekhar")
  for((k,v)<- names){
    println(s"Key is $k value is $v")
    //foreach
    a.foreach(println)
    a.foreach(i => println(i.toUpperCase))
    //In case algorithm required multiple lines
    val num = Array(1,2,3,4,5,6,7,8,9)
    num.foreach { n =>
      if (n%2 == 0){
        println(s"$n is even number")
      } else{
        println(s"$n is odd number")
      }
    }
   }
  val c=  for(i <-b;j <- a) yield Map(i ->j)
  c.foreach(println)
  for {
    i <- 1 to 2
    j <- 3 to 4
    k <- 5 to 6
  }print(s"$i $j $k")

  var bike = scala.collection.mutable.ArrayBuffer[String]()
  bike +="Classic"
  bike +="Pulsor"
  bike +="Raj Doot"
 println()
 val bikes= for(b <- bike) yield b.toUpperCase()
  bikes.foreach(println)
  //Alternatively
  bike.map(_.toUpperCase).foreach(println)

}
