package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Classes and Objects\n")
    println("1. Classes in Scala")
    val aPerson = new Person("Phijose", 24)
    println(aPerson)
    println("2. Objects in Scala")
    println(PersonUtils.greet(aPerson))
    println("3. Companion Object")
    val anotherPerson = Person("Joel",22)
    println(anotherPerson)
    println("4. Case Classes")
    val acar = Car("BMW","M2 Coupe",4)
    println(acar)
  }
}

class Person(val name: String,val age: Int = 25){
  override def toString: String = s"Hi, ${this.name} you are ${this.age} years old"
}

object PersonUtils {
  def greet(person: Person) = s"Have a Good Day ${person.name}"
}

object Person{
  def apply(name: String, age: Int): Person = new Person(name, age)
}

case class Car(brand:String, name: String, noOfPassengers: Int)