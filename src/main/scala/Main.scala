package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Inheritance and Traits\n")
    println("1. Basic Inheritance")
    class Parent {
      def greet: () => Unit = () => println("Hello from Parent")
    }
    class Child extends Parent {
      override def greet: () => Unit = ()  => println("Hello from Child")
    }
    val child = new Child()
    child.greet()

    println("2. Constructor Inheritance")
    class Parent1(name: String) {
      println(s"Parent Constructor: $name")
    }
    class Child1(name: String, age: Int) extends Parent1(name) {
      println(s"Child Constructor: $name, $age")
    }
    val child1 = new Child1("John", 30)

    println("3. Trait basic usage")
    trait Greetable {
      def greet(): Unit = println("Hello from Trait")
    }
    class Person extends Greetable
    val person = new Person()
    person.greet()
    println("4. Using Multiple Traits")
    trait Walkable {
      def walk(): Unit = println("Walking...")
    }
    trait Talkable {
      def talk(): Unit = println("Talking...")
    }
    class Human extends Walkable with Talkable
    val human = new Human()
    human.walk()
    human.talk()
    println("5. Traits with Abstract Members")
    trait Animal {
      def sound(): String
    }
    class Dog extends Animal {
      override def sound(): String = "Woof"
    }
    val dog = new Dog()
    println(dog.sound())
    println("6. Combining Inheritance and Traits")
    trait Flyer {
      def fly(): Unit = println("Flying...")
    }
    trait Swimmer {
      def swim(): Unit = println("Swimming...")
    }
    class Bird extends Flyer
    class Duck extends Bird with Swimmer
    val duck = new Duck()
    duck.fly()
    duck.swim()
  }
}