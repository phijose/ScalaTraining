package com.tigmaminds.scala

object Main {

  def star(n: Int) = {
    var tem = 1
    while(tem<n) {
      for(i <- 1 to tem)
        print(" * ")
      println()
      tem+=1
    }
  }

  def doWhile(): Unit = {
    var a = 4
    do{
      println(a+". Hi its a Do While!")
      a-=1
    }while(a>0)
  }

  def evenAndOdd(a: Int=10): Unit = {
    println("\nOdd Even Combination : ")
    for(i <- 1 to a by(2); j <- 2 to a by(2))
      print(s"($i,$j) ")
  }

  val even = (n: Int) => for(i <- 2 to n by(2)) println(i)

  var prompt = "Loops and Functions"

  def simpleExp: Unit = println("\n"+this.prompt)


  def main(args: Array[String]): Unit = {
    simpleExp
    this.prompt="Stars"
    simpleExp
    star(5)
    this.prompt="Even"
    simpleExp
    even(10)
    this.prompt="Do While"
    simpleExp
    doWhile()
    evenAndOdd()
  }
}