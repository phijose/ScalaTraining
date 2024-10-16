package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Immutable Collections and Operations\n")
    val fruits = List("apple","orange","banana","guava","peach")
    println("fruits.groupBy(_.length) = "+fruits.groupBy(_.length))
    println("fruits.map(_.capitalize) = "+fruits.map(_.capitalize))
    println("fruits.foldRight('') = "+fruits.foldRight("")
    ((a:String,b:String) => if(b!="") a +" -> "+ b else a))
    println("fruits.sorted = "+fruits.sorted)
    println("fruits.sortWith(_ > _) = "+fruits.sortWith(_ > _))
    println("fruits.take(2) = "+fruits.take(2))
    println("fruits.drop(2) = "+fruits.drop(2))
    val fruitLen = fruits.map(_.length)
    println("fruitLen.zip(fruits) = "+fruitLen.zip(fruits))
    println("fruits.partition = "+fruits.partition(_.length % 2 == 0))
    println("flatmap = "+(1 to 3).toList.flatMap(x => List(x,x*2)))
  }
}