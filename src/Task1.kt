// create a fibonacci array
fun FibonancciArray(numbersOfArray: Int): Array<Int> {
    val numbers : Array<Int> = Array(numbersOfArray) { 0 }
    numbers[0] = 1
    numbers[1] = 1
    for (i in 2.. numbersOfArray - 1 ) {
        numbers[i] = numbers[i - 2] + numbers[i - 1]
    }
    return numbers
}
// print
fun main() {
    val fibonacciArray = FibonancciArray(numbersOfArray = 20)
    for (i in fibonacciArray.size -1 downTo 0) {
        print("${fibonacciArray[i]} ")
    }
}