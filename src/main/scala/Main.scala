package com.tigmaminds.scala

//import java.time.Duration
import scala.concurrent.{Await, Future, duration}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.{Duration, DurationInt}
import scala.util.{Failure, Success}

object Main {
  def main(args: Array[String]): Unit = {
    println("Monads and For Comprehensions")
    usingOption()
    usingEither()
    usingFuture()
  }

  private def usingOption(): Unit = {
    def getUser(id: Int): Option[String] = Some("John")
    def getEmail(user: String): Option[String] = Some("john@example.com")
    def sendEmail(email: String): Option[Boolean] = Some(true)

    val result = for {
      user <- getUser(1)
      email <- getEmail(user)
      sent <- sendEmail(email)
    } yield sent
    println("Using Option :- "+result)
  }

  private def usingEither(): Unit = {
    def validateAge(age: Int): Either[String, Int] =
      if (age >= 18) Right(age) else Left("Underage")

    def findPerson(age: Int): Either[String, String] =
      if (age == 21) Right("Person found") else Left("Person not found")

    val result = for {
      age <- validateAge(21)
      person <- findPerson(age)
    } yield person
    println("Using Either :- "+result)
  }

  private def usingFuture(): Unit = {
    def fetchUser(id: Int): Future[String] = Future("John")

    def fetchEmail(user: String): Future[String] = Future("john@example.com")

    def sendNotification(email: String): Future[Boolean] = Future(true)

    val result = for {
      user <- fetchUser(1)
      email <- fetchEmail(user)
      sent <- sendNotification(email)
    } yield sent

    try {
      val resultValue = Await.result(result, 5.seconds)
      println("Using Future :- " + resultValue)
    } catch {
      case e: Exception => println("Error: " + e.getMessage)
    }
  }
}