fun main() {
    println("Enter your number: ")
    val input = readln()
    val number = input.toIntOrNull()
    if (number == null || number !in 10 .. 99) {
        println("Invalid input")
        return
    }
    val binary = Integer.toBinaryString(number)
    val hex = Integer.toHexString(number)
    println("Binary: $binary")
    print("Hex: $hex")
}