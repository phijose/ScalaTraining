package com.tigmaminds.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Advanced operations on collections\n")
    println("1. Grouping and Aggregation")
    val transactions = List(("food", 20), ("clothes", 40), ("food", 15), ("electronics", 90), ("clothes", 50))
    val groupedTotals = transactions
      .groupBy(_._1)
      .map { case (category, trans) =>
        (category, trans.map(_._2).sum)
      }
    println(groupedTotals)
    println("2. Sliding Window")
    val numbers = List(1, 2, 3, 4, 5, 6)
    val slidingAvg = numbers.sliding(3).map(window => window.sum / window.size.toDouble).toList
    println(slidingAvg)
    println("3. Fold and Reduce with Custom Accumulators")
    val words = List("hello", "world", "functional", "programming")
    val concatenated = words.foldLeft("Words: ")((acc, word) => acc + word + ", ")
    println(concatenated.stripSuffix(", "))
    println("4. FlatMap with Multiple Levels")
    val matrix = List(
      List(1, 2, 3),
      List(4, 5, 6),
      List(7, 8, 9)
    )
    val flattenedMatrix = matrix.flatMap(row => row.map(_ * 2))
    println(flattenedMatrix)
    println("5. Collect with Pattern Matching")
    val mixedList = List(1, "apple", 2.5, "banana", 4, 5.0)
    val onlyInts = mixedList.collect { case i: Int => i * 2 }
    println(onlyInts)
    println("6. Zipping and Unzipping Collections")
    val names = List("Alice", "Bob", "Charlie")
    val scores = List(85, 92, 78)
    val results = names.zip(scores).map { case (name, score) => s"$name scored $score" }
    println(results)
    println("7. Partitioning")
    val numbers2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val (even, odd) = numbers2.partition(_ % 2 == 0)
    println(even)
    println(odd)
    println("8. Advanced Map Transformations with MapValues")
    val students = Map("Alice" -> List(85, 92, 78), "Bob" -> List(88, 76, 95))
    val averages = students.mapValues(grades => grades.sum / grades.length).toMap
    println(averages.toList)
    println("9. Using view for Lazy Evaluation")
    val largeList = (1 to 1000000).toList
    val evenSquares = largeList.view.filter(_ % 2 == 0).map(x => x * x).take(10).toList
    println(evenSquares)
  }
}