fun main() {
    println("enter your string: ")
    val word = readLine()?:return

    // Đếm số từ trong chuỗi.
    val words = word.trim().split("\\s+".toRegex())
    val numbersOfWords = words.size

    //Viết hoa chữ cái đầu tiên của từ nếu nó bắt đầu cho một câu.
    var flag = true
    val stringBuilder = StringBuilder()

    for (word in words) {
        if(flag && word.isNotEmpty()){
            stringBuilder.append(word) // convert fist char to upper
        }else{
            stringBuilder.append(word) //add word to string
        }
        // add " "
        stringBuilder.append(" ")

        if(word.endsWith(".")){
            flag = true
        }else{
            flag = false
        }

    }
    // resulf
    val result = stringBuilder.toString().trim()

    println("Number of words: $numbersOfWords")
    println("String after convert: $result")
}
