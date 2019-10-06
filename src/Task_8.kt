fun main(args: Array<String>){

    println("--- Программа для расчета по вкладу ---")
    println("Введите сумму вклада: ")
    var input: String? =  readLine()
    var sum: Int = input!!.toInt()

    println("Введите длительность вклада в месяцах: ")
    input =  readLine()
    var quantity:Int = input!!.toInt()

    println("Введите ежемесячный процент по вкладу: ")
    input =  readLine()
    var percent:Int = input!!.toInt()

    var i = 0

    while (i < quantity) {
        i++
        var profit = sum * percent / 100
        sum += profit

        println("В " + i + " месяце сумма вклада увеличится на " + profit + " и составит " + sum + " руб")
    }

}