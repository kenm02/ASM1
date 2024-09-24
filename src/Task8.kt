fun enterAccount(): String{
    while (true){
        print("Enter Your Account: ")
        val pan = readLine()?: " "
        println(pan.length)
        if(pan.all { it.isDigit() } && pan.length in 12 .. 19 ){
            return pan
        }
        println("Invalid account numer. Please enter again ! ")
    }
}

fun luhnAgorithm(pan: String): Boolean {
    var total = 0
    val reversePan = pan.reversed()
    for (i in reversePan.indices) {
        var digit = reversePan[i].digitToInt()
        if (i % 2 == 1) {
            digit *= 2
            if (digit > 9) {
                digit -= 9
            }
        }
        total += digit
    }
    return total % 10 == 0
}
fun typeOfCard(pan: String): String{
    return when{
        pan.startsWith('4')-> "VISA Card"
        pan.matches(Regex("^5[1-5][0-9]{14}|^222[1-9][0-9]{12}|^22[3-9][0-9]{13}|^2[3-6][0-9]{14}|^27[01][0-9]{13}|^2720[0-9]{12}")) ->"Master Card"
        pan.matches(Regex("^35(2[8-9]|[3-8][0-9])[0-9]{12}")) -> "JBC Card"
        else -> "Unknown Card"
    }
}
fun main() {
    val pan = enterAccount()
    if(luhnAgorithm(pan)){
        println(typeOfCard(pan))
    }else{
        println("Invalid PAN code")
    }
}