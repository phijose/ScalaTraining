# Scala Training

## Task 7
```text
Immutable Collections and Operations

fruits.groupBy(_.length) = HashMap(5 -> List(apple, guava, peach), 6 -> List(orange, banana))
fruits.map(_.capitalize) = List(Apple, Orange, Banana, Guava, Peach)
fruits.foldRight('') = apple -> orange -> banana -> guava -> peach
fruits.sorted = List(apple, banana, guava, orange, peach)
fruits.sortWith(_ > _) = List(peach, orange, guava, banana, apple)
fruits.take(2) = List(apple, orange)
fruits.drop(2) = List(banana, guava, peach)
fruitLen.zip(fruits) = List((5,apple), (6,orange), (6,banana), (5,guava), (5,peach))
fruits.partition = (List(orange, banana),List(apple, guava, peach))
flatmap = List(1, 2, 2, 4, 3, 6)
```