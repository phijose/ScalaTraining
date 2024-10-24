package com.tigmaminds.scala

case class Point(x: Int, y: Int)

case class Rectangle(length: Double, width: Double)

object Rectangle {
  def area(rect: Rectangle): Double = rect.length * rect.width
  def perimeter(rect: Rectangle): Double = 2 * (rect.length + rect.width)
}

object Main {
  def main(args: Array[String]): Unit = {
    println("Case Classes and Companion Objects\n\n1. case class")
    val point1 = Point(1, 2)
    val point2 = Point(1, 2)
    println("Object equality = "+(point1 == point2))
    val point3 = point1.copy(y = 3)
    println("Create Copy of object with update only required = "+point3)
    point1 match {
      case Point(x, y) => println(s"case class matching = Point at ($x, $y)")  // Output: Point at (1, 2)
    }
    val rect1 = Rectangle(5.0, 3.0)
    println("2. Using object with case class")
    println(s"Area: ${Rectangle.area(rect1)}")
    println(s"Perimeter: ${Rectangle.perimeter(rect1)}")
  }
}