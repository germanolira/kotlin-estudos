val numbers = listOf(1, 3, 10, 20, 50, 100)
print(2 in numbers)
// false

print(2135 in 0.25123)
// true

// Random number
fun main() {
  val bingo = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val number = 34

  println(number)
  println(number in bingo)
}