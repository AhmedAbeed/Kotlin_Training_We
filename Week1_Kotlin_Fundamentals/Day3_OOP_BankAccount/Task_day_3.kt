data class Transaction(val type: String, val amount: Double)

class Account(var nameOfUser: String, var balance: Double) {

    val history = mutableListOf<Transaction>()

    init {
        println("تم إنشاء حساب لـ $nameOfUser برصيد ابتدائي $balance")
    }

    fun deposit(amount: Double) {
        if (amount <= 0.0) {
            println("عملية مرفوضة")
        } else {
            balance += amount
            history.add(Transaction("deposit", amount))
            println("ur account now is $balance")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            history.add(Transaction("withdraw", amount))
            println("ur account now is $balance")
        } else {
            println("عملية مرفوضة: الرصيد غير كاف")
        }
    }

    fun printHistory() {
        println(history)
    }
}






fun main() {
    println("pls enter ur name:")
    val name = readlnOrNull() ?: "Guest"

    val acc = Account(name, 5000.0)

    println("choose ur operation:")
    println("1.check ur account \n2.deposit \n3.withdraw \n4.Exit \n5.history")

    val choose = readlnOrNull()

    when (choose) {


        "1" -> println("ur balance is ${acc.balance}")

        "2" -> {
            println("اكتب مبلغ الإيداع:")
            val depositAmount = readln().toDouble()
            acc.deposit(depositAmount)

        }

        "3" -> {
            println("اكتب مبلغ السحب:")
            val withdrawAmount = readln().toDouble()
            acc.withdraw(withdrawAmount)
        }

        "4" -> println("Exit")

        "5" -> acc.printHistory()

        else -> println("اختيار غير صحيح")
    }

    println("u wanna another thing ?")
    var answer = readlnOrNull()
    while (answer == "yes") {
        println("1.check ur account \n2.deposit \n3.withdraw \n4.Exit \n5.history")

        val choose = readlnOrNull()



        when (choose) {
            "1" -> {
                println("ur balance is ${acc.balance}")
                println("u wanna another thing ?")
                answer = readlnOrNull()

            }

            "2" -> {
                println("اكتب مبلغ الإيداع:")
                val depositAmount = readln().toDouble()
                acc.deposit(depositAmount)
                println("u wanna another thing ?")
                answer = readlnOrNull()
            }

            "3" -> {
                println("اكتب مبلغ السحب:")
                val withdrawAmount = readln().toDouble()
                acc.withdraw(withdrawAmount)
                println("u wanna another thing ?")
                answer = readlnOrNull()
            }

            "4" -> {
                println("Exit")
                println("u wanna another thing ?")
                answer = readlnOrNull()
            }

            "5" -> {
                acc.printHistory()
                println("u wanna another thing ?")
                answer = readlnOrNull()
            }


            else -> println("اختيار غير صحيح")
        }

        println("thank you ! have a good day <3")
    }


}


