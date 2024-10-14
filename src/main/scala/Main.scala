package com.tigmaminds.scala

import scala.collection.immutable.{BitSet, ListSet}
import scala.collection.mutable

object Main {
  def main(args: Array[String]): Unit = {
    print("Scala Set\n" +
      "It is used to store unique elements in the set. It does not maintain any order for storing elements. " +
      "You can apply various operations on them. It is defined in the Scala.collection.immutable package.\n")
    var aSet =  mutable.Set(1,2,8,2,4,5)
    println("Original = "+aSet)
    aSet += 3
    println("Adding element = "+aSet)
    val immutableSet = Set(3,8,9,-1,-100)
    println("Immutable Set = "+immutableSet)
    aSet =(aSet ++ immutableSet).to(mutable.SortedSet)
    println("merging and converting to Sorted Set = "+aSet)
    println("\nBit Set")
    println("Bitsets are sets of non-negative integers which are represented as variable-size arrays of bits" +
      " packed into 64-bit words. The memory footprint of a bitset is determined by the largest number stored" +
      " in it. It extends Set trait.")
    val bitSet = BitSet.fromSpecific(aSet.filter(x=>x>0))
    println("Bit Set are = "+bitSet)
    var definition = "ListSet class implements immutable sets using a list-based data structure. Elements" +
      " are stored internally in reversed insertion order, which means the newest element is at the head of " +
      "the list. It maintains insertion order."
    println("\nListSet\n"+definition)
    var listSet = ListSet(definition.split(" ").map(x=>x.length): _*)
    println(listSet)
    println("\nScala Seq\nSeq is a trait which represents indexed sequences that are guaranteed immutable. " +
      "You can access elements by using their indexes. It maintains insertion order of elements.")
    val seq = Seq(1,5,43,6,9,78,77,3,3,6)
    println("Original Seq = "+seq)
    println("seq.isEmpty = "+seq.isEmpty+
      "\nseq.endsWith(List(3, 3)) = "+seq.endsWith(List(3,3)) +
      "\nseq.lastIndexOf(3) = "+seq.lastIndexOf(3) +
      "\nseq.reverse = "+seq.reverse +
      "\nseq.contains(3) = "+seq.contains(3))
    println("\nScala Vector\nVector is a general-purpose, immutable data structure. It provides random " +
      "access of elements. It is good for large collection of elements.")
    val vector = Vector(1,3,7,45,33,68,2,999)
    println("Original vector = "+vector)
    println("map in vector = "+vector.map(_*3))
    println("\nScala List\nList is used to store ordered elements. It extends LinearSeq trait. It is a class " +
      "for immutable linked lists. This class is good for last-in-first-out (LIFO), stack-like access patterns.")
    var fruits = List("Apple","Mango","Guava","Banana")
    fruits :+= "Watermelon"
    println(fruits.collect(x=>if (x != "Apple") x.length else x))
    println(fruits)
    println("\nScala Queue\nQueue implements a data structure that allows inserting and retrieving elements " +
      "in a first-in-first-out (FIFO) manner.")
    val aQueue = mutable.Queue(87,66,80)
    println("Original Queue = "+aQueue)
    aQueue.enqueue(3)
    println("Added 3 in queue = "+aQueue)
    aQueue.dequeue()
    println("Dequeued Queue = "+aQueue)
    println("\nScala Stream\nStream is a lazy list. It evaluates elements only when they are required. This" +
      " is a feature of scala. Scala supports lazy computation. It increases performance of your program.")
    var aLazyList = 100 #:: 200 #:: 85 #:: LazyList.empty
    println("toList() = "+aLazyList.toList+"\nforeach() =")
    println(aLazyList.foreach(x => println(x)))
    val value1to1000 = (1 to 1000).to(LazyList)
    println("LazyList = "+value1to1000.head+" to "+value1to1000.last)
    println("\nScala Map\nMap is used to store elements. It stores elements in pairs of key and values. In " +
      "scala, you can create map by using two ways either by using comma separated pairs or by using rocket " +
      "operator.")
    var aMap = mutable.Map("a"->"apple","b"->"bat")
    println("Original aMap = "+aMap)
    println("Merging = "+(aMap+("c"->"cat")))
    println("\nScala ListMap\nThis class implements immutable maps by using a list-based data structure. It " +
      "maintains insertion order and returns ListMap. This collection is suitable for small elements.")
    var aListMap = mutable.Map("a"->"aeroplane","b"->"ball","d"->"dog")
    println("Original aMap = "+aListMap)
    println("Merging = "+(aListMap++aMap))
  }
}