package com.tigmaminds.scala

import scala.util.{Failure, Success, Try}

object Main {
  def main(args: Array[String]): Unit = {
    println("Error Handling\n")
    println("1. Using Try")
    println(catchError(divideTry(5,1)))
    println(catchError(divideTry(5)))
    println("2. Using Either")
    catchLeftRight(divideEither(5,1))
    catchLeftRight(divideEither(5))
    println("3. Option")
    val map = Map(1 -> "one", 2 -> "two")
    var result: Option[String] = map.get(3)
    result match {
      case Some(value) => println(s"Found: $value")
      case None => println("Key not found")
    }
    println("4. Pattern match on Exception")
    try {
      val result = 10 / 0
      println(s"Result: $result")
    } catch {
      case e: ArithmeticException => println(s"Error: ${e.getMessage}")
    }
    println("5. For with try")
    val tryFor = for {
      a <- Try(10 / 2)
      b <- Try(a * 2)
    } yield b
    tryFor match {
      case Success(value) => println(s"Result: $value")
      case Failure(exception) => println(s"Error: ${exception.getMessage}")
    }
  }

  def catchError(a: Try[Int]) = {
    a match {
      case Success(a) => s"value is = $a"
      case Failure(e) => s"value is = $e"
    }
  }
  def divideTry(a: Int, b: Int = 0): Try[Int] = Try {
    a / b
  }

  def divideEither(a: Int, b: Int = 0): Either[String,Int] = {
  if (b == 0) Left("Cannot devide by zero")
  else Right(a / b)
  }
  def catchLeftRight(anyVal: Either[String,Int]) = anyVal match {
    case Left(a) => println(a)
    case Right(b) => println(s"value is = $b")
  }

}