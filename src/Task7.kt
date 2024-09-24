fun main() {
    println("Enter month: ")
    val month = readln().toInt() ?: return

    println("Enter year: ")
    val year = readln().toInt() ?: return

    if(month !=2 ){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 12 ){
            println("This month have 31 days")
        } else if( month == 4 || month == 6 || month == 9 || month == 11 ){
            println("This month have 30 days")
        }else{
            println("Invalid month")
        }
    }else{
        if(year % 4 == 0){
            println("This month have 29 days")
        }else{
            println("This month have 28 days")
        }
    }
}