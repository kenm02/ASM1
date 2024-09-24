fun main() {
    println("enter your string: ")
    val word = readLine()?:return

    val words = word.trim().split("\\s+".toRegex())
    val numbersOfWords = words.size

    var flag = true
    val stringBuilder = StringBuilder()

    for (word in words) {
        if(flag && word.isNotEmpty()){
            stringBuilder.append(word) 
        }else{
            stringBuilder.append(word) 
        }
        stringBuilder.append(" ")

        if(word.endsWith(".")){
            flag = true
        }else{
            flag = false
        }

    }
    val result = stringBuilder.toString().trim()

    println("Number of words: $numbersOfWords")
    println("String after convert: $result")
}
