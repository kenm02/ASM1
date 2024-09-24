fun main() {
    var money = 4000000.0
    //login
    print("Enter your username: ")
    val username = readLine()!!
    var typeTime = 0
    while (typeTime <= 3){
        print("Enter your password: ")
        val password = readLine()!!
        if(password.length < 6){
            println("Please enter password more than 6 characters")
            typeTime ++
        }else{
            println("Your balance: $money VND")
            break
        }
    }
    if(typeTime > 3){
        println("You entered wrong password more 3 times. Your account is locked! ")
        return
    }

    // choose option
    while (true){
        println("-----------------------------------------")
        println("Choose an option: ")
        println("1.Withdraw money.")
        println("2.Check remaining amount of money. ")
        println("3.Exit.")
        println("-----------------------------------------")
        print("Your choice: ")
        val choice = readLine()!!

        when(choice){
            //Draw money
            "1" -> {
                var flag = true
                while (flag){
                    print("Enter money you want to draw: ")
                    val drawmoney = readLine()?.toDoubleOrNull()
                    if(drawmoney == null){
                        print("Please enter money: ")
                    }else{
                        if(drawmoney <= 100000.0){
                            println("Please enter money more than 100000 VND!")
                        }else if(drawmoney > money){
                            println("Please enter money less than balance!")
                        }else{
                            money -= drawmoney
                            println("Transaction successfull! your new balance: $money VND")
                            println("Do you want to do another transaction? Y/N?")
                            val answer = readLine()!!.toString()
                            if(answer.uppercase() == "y"){
                                flag = true
                            }else {
                                println("Your transaction finished ! Please take your card")
                                flag = false
                            }
                        }
                    }
                }
            }

            "2" ->{
                println("Your balance: $money VND")
            }
            "3" ->{
                return
            }
            else ->{
                println("Invalid option! Choose again!")
            }
        }
    }
}