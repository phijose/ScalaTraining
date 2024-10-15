package com.tigmaminds.scala

import scala.collection.mutable

object Main {
  def main(args: Array[String]): Unit = {
    println("Higher Order functions")
//    var fabList = mutable.Seq[Int]()
    val sum = (1 to 10).toList.fold(100)(_ + _)
    println("\nsum of 1 to 10 with 100 = "+sum)
    val tenMultiplier = multiplier(10)
    println("function return function = "+tenMultiplier(2))
    val fruits = List("Apple", "Orange", "Guava", "Banana")
    println("Binary function as argument Sorting = "+fruits.sortWith(_ < _))
    println("function as Argument = "+listModifier(fruits,(x:String) => x.length))
    val greeter = appendStringInFront("Hi!, ")_
    println("Currying function = " + greeter("Bineesh"))

  }
  private def multiplier(x: Int) =
    (a :Int) => a * x
  private def listModifier(arr: List[String], any: String => Int) =
    arr.map(x => x+"-"+any(x))
  private def appendStringInFront(a:String)(b:String) =
    a + b
}