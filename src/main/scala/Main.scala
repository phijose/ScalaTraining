package com.tigmaminds.scala

import org.apache.spark.sql.{SaveMode, SparkSession}
import org.apache.spark.sql.functions.{col, explode}
import com.fasterxml.jackson.databind.{ObjectMapper, SerializationFeature}

import java.io.File

object Main {
  def main(args: Array[String]): Unit = {
    println("File I/O and Working with JSON")
    System.setProperty("hadoop.home.dir", "C:\\Users\\phijo\\Documents\\GitHub\\winutils\\hadoop-3.3.6")

    val spark = SparkSession.builder()
      .appName("Task 15")
      .master("local")
      .getOrCreate()

    val jsonDF = spark.read
      .json("./src/main/resources/quotes.json")

    val newJson = jsonDF.select(explode(col("quotes")).as("quotes"))
      .select(
        col("quotes.id").as("id"),
        col("quotes.author").as("author"),
        col("quotes.quote").as("quote"),
      )

    println("Actual File :")
    jsonDF.show()
    println("Transformed file :")
    newJson.show(5)

//    this is also not working in both working dir or external dir
//    newJson.toJSON.coalesce(1).write.mode(SaveMode.Overwrite).format("json").save("C:\\Users\\phijo\\Desktop\\new2.json")

    val mapper = new ObjectMapper()
    mapper.enable(SerializationFeature.INDENT_OUTPUT)
    val jsonObjects = newJson.toJSON.collect().map(mapper.readTree)
    mapper.writeValue(new File("C:\\Users\\phijo\\Desktop\\new.json"), jsonObjects)

//    this is not working
//    mapper.writeValue(new File("C:\\Users\\phijo\\Documents\\scala\\Training\\src\\main\\resources\\new.json"), jsonObjects)

    spark.stop()
  }
}