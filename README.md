# Scala Training

## Task 5
```shell
Scala Seq
Seq is a trait which represents indexed sequences that are guaranteed immutable. You can access elements by using their indexes. It maintains insertion order of elements.
Original Seq = List(1, 5, 43, 6, 9, 78, 77, 3, 3, 6)
seq.isEmpty = false
seq.endsWith(List(3, 3)) = false
seq.lastIndexOf(3) = 8
seq.reverse = List(6, 3, 3, 77, 78, 9, 6, 43, 5, 1)
seq.contains(3) = true

Scala Vector
Vector is a general-purpose, immutable data structure. It provides random access of elements. It is good for large collection of elements.
Original vector = Vector(1, 3, 7, 45, 33, 68, 2, 999)
map in vector = Vector(3, 9, 21, 135, 99, 204, 6, 2997)

Scala List
List is used to store ordered elements. It extends LinearSeq trait. It is a class for immutable linked lists. This class is good for last-in-first-out (LIFO), stack-like access patterns.
List(Apple, 5, 5, 6, 10)
List(Apple, Mango, Guava, Banana, Watermelon)

Scala Queue
Queue implements a data structure that allows inserting and retrieving elements in a first-in-first-out (FIFO) manner.
Original Queue = Queue(87, 66, 80)
Added 3 in queue = Queue(87, 66, 80, 3)
Dequeued Queue = Queue(66, 80, 3)

Scala Stream
Stream is a lazy list. It evaluates elements only when they are required. This is a feature of scala. Scala supports lazy computation. It increases performance of your program.
toList() = List(100, 200, 85)
foreach() =
100
200
85
()
LazyList = 1 to 1000

Scala Map
Map is used to store elements. It stores elements in pairs of key and values. In scala, you can create map by using two ways either by using comma separated pairs or by using rocket operator.
Original aMap = HashMap(a -> apple, b -> bat)
Merging = HashMap(a -> apple, b -> bat, c -> cat)

Scala ListMap
This class implements immutable maps by using a list-based data structure. It maintains insertion order and returns ListMap. This collection is suitable for small elements.
Original aMap = HashMap(a -> aeroplane, b -> ball, d -> dog)
Merging = HashMap(a -> apple, b -> bat, d -> dog)

```