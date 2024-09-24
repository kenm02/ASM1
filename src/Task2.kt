fun String.turnOffBit3OfByte2(): String {
    val number = this.toLong(16)

    val binaryString = number.toString(2).padStart(32, '0')

    val binaryCharArray = binaryString.toCharArray()

    binaryCharArray[13] = '0'

    val newBinaryString = String(binaryCharArray)


    val newNumber = newBinaryString.toLong(2)

    return newNumber.toString(16).padStart(8, '0')
}

fun main() {
    val testCases = mapOf(
        "12345678" to "12341678",
        "FFFFFFFF" to "FFFFFBFF",
        "00000000" to "00000000",
        "ABCD1234" to "ABC91234",
        "55555555" to "55551555",
        "13579BDF" to "13575BDF"
    )

    for ((input, expected) in testCases) {
        val result = input.turnOffBit3OfByte2()
        println("Input: $input, Expected: $expected, Result: $result")
        assert(result == expected) { "Test case failed for input $input: expected $expected but got $result" }
    }
}

