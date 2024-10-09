package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    val a = 30
    println("a = "+a)
    val b = if (a > 9) 70 else 0
    println("b = "+b)
    val c = 9
    println("c = "+c)
    val greater = if (a > b) "a" else if (b > a) "b" else "c"
    println({
      greater match {
        case "a" => "a is greater"
        case "b" => "b is greater"
        case "c" => "c is greater"
        case _ => "something bad happened"
      }
    })

  }
}