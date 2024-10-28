package com.tigmaminds.scala

import scala.language.implicitConversions

object Main {
  def main(args: Array[String]): Unit = {
    println("Implicit and Type Classes\n")
    println("1. Implicits in Scala")
    def greet(name: String)(implicit greeting: String): String = s"$greeting, $name!"
    implicit val defaultGreeting: String = "Hello"
    println(greet("Scala"),greet("Scala").getClass)
    implicit def intToString(x: Int): String = x.toString
    val str: String = 100 // Automatically converted to "100"
    println(str,str.getClass)
    println("2. Type Classes in Scala")
    implicit val intShow: Show[Int] = new Show[Int] {
      def show(value: Int): String = s"Int: $value"
    }
    implicit val stringShow: Show[String] = new Show[String] {
      def show(value: String): String = s"String: $value"
    }
    def showValue[A: Show](value: A): String = {
      implicitly[Show[A]].show(value)
    }
    println(showValue(123),showValue(123).getClass)
    println(showValue("Scala"),showValue("Scala").getClass)
    println("3. Syntax Enrichment with Implicit Classes")
    println(123.show,123.show.getClass)
    println("Scala".show,"Scala".show.getClass)
  }

  implicit class ShowOps[A](value: A)(implicit showInstance: Show[A]) {
    def show: String = showInstance.show(value)
  }

  trait Show[A] {
    def show(value: A): String
  }
}