package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Tuples and Option Types\n")
    val vegies = (1,"Cabbage",44.25,true)
    println("vegies = "+vegies)
    println(s"SNo.${vegies._1} ${vegies._2} ${vegies._3}rs ${if (vegies._4) "Paid" else "Not Paid"}")
    println("evenProvider(2) = "+evenProvider(2))
    println("evenProvider(1) = "+evenProvider(1))
    val tuple = (1, 2, 3)
    val transformed = tuple match {
      case (a, b, c) => (a , b , c )
    }
    println("tuple match = "+ transformed)  // (2, 4, 6)
  }
  def evenProvider(a: Int): Option[Int] = {
    if (a%2==0) Some(a) else None
  }
}