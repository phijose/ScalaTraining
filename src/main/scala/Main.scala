package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Pattern Matching\n")
    sealed trait Edibles
    case class Fruit(name: String) extends Edibles
    case class Vegitable(name: String) extends Edibles
    println("1. Pattern Matching with case classes and sealed traits")
    def printEdible(edibles: Edibles): String = edibles match {
      case Fruit(edible) => s"Fruit -> $edible"
      case Vegitable(edible) => s"Vegitable -> $edible"
    }
    println(printEdible(Fruit("Apple")))
    println("2. Guards in Pattern Matching")
    def checkNegative(num:Int) = num match {
      case n if num < 0 => "the Number is Negative"
      case n if num > 0 => "the Number is Positive"
      case _ => "the number is Zero"
    }
    println(checkNegative(1))
    println("3. Nested Pattern Matching")
    case class Address(city: String,postalCode: Int)
    case class Person(name: String, address: Address)
    def greetNYCs(person: Person): String = person match {
      case Person(name,Address("New York", _)) => s"Hi $name be happy NewYorker!"
      case Person(name,Address(city, _)) => s"Hi $name from $city!"
    }
    println(greetNYCs(Person("Phijose",Address("New York",10001))))
    println("4. Pattern Matching on Tuples")
    def tupleMatch(tuple :(Int,String)): String = tuple match {
      case (_,"One") => "the word is One"
      case (num, word) => s"$num is $word"
    }
    println(tupleMatch((1,"One")))
    println("5. Pattern Matching with Collections")
    val listOf1to5 = (1 to 5).toList
    def sumOfList(list: List[Int] ):Int = list match {
      case Nil => 0
      case head :: tail => head + sumOfList(tail)
    }
    println("Sum is "+sumOfList(listOf1to5))
    println("6. Pattern Matching on Case Object")
    sealed trait TrafficLight
    case object Red extends TrafficLight
    case object Yellow extends TrafficLight
    case object Green extends TrafficLight
    def signal(light: TrafficLight): String = light match {
      case Red => "Stop"
      case Yellow => "Get Ready"
      case Green => "Go"
    }
    println(signal(Yellow))
  }
}