package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {

//    DataTypes and Values
    val x: Int = 42
    println("Int :"+x)

    val l: Long = 999999999999900099L
    println("Long :"+l)

    val d: Double = 3.14
    println("Double :"+d)

    val f: Float = 2.71F
    println("Float :"+f)

    val b: Boolean = true
    println("Boolean :"+b)

    val c: Char = 'A'
    println("Char :"+c)

    val s: String = "Hello"
    println("String :"+s)

    val n: String = null
    println("Null :"+n)

    val optionalVal: Option[String] = None
    println("Option :"+optionalVal.getOrElse("Default Value"))

    var game = "Cricket"
    println("Using var"+s"Before : $game")
    game = "Football"
    println("Using var"+s"After : $game")

// String Interpolation
    val name = "Scala"
    val age = 10
    println(s"Hello, $name! You are $age years old.")
    println(s"The sum of 5 and 3 is ${5 + 3}.")  // Can include expressions
  }
}