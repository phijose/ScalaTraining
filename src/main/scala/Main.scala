package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Introduction to functional programing\n Same input, Same Value, Always")
    println(add(2, 3))
    println(add(2, 3))
    val numbers = Array(1, 2, 3, 4, 5, 6)
    println(getEvenNumbers(numbers).mkString("Array(", ", ", ")"));
    println(getEvenNumbers(numbers).mkString("Array(", ", ", ")"));
  }

  def getEvenNumbers(numbers: Array[Int]): Array[Int] = {
    numbers.filter(_ % 2 == 0);
  }

  def add(a :Int, b: Int): Int = {
    a + b
  }
}