fun main(args: Array<String>){

    var rating = 0

    println("Тест на проверку знаний простейшей математики. \nВведите номер правильного ответа.")
    println("----------------------------------------------------------")

    println("1 Вопрос. \nЧему равно выражение '5 + 2 * 3 - 8 / 2' ? \n1) 11\n2) 7 \n3) 17")
    var result: String? =  readLine()
    if(result == "2") rating++
    println("----------------------------------------------------------")

    println("2 Вопрос. \nВерно ли неравенство -123,5 > 5.1 ? \n1) ДА\n2) НЕТ")
    result = readLine()
    if(result == "2") rating++
    println("----------------------------------------------------------")

    println("3 Вопрос. \nПродолжтите последовательность '1, 2, 3, 5, 8, 13, ...' \n1) 20\n2) 18 \n3) 21")
    result =  readLine()
    if(result == "3") rating++
    println("----------------------------------------------------------")

    println("4 Вопрос. \nЧему равен Х '6X + 2 = 20' \n1) 3\n2) -3 \n3) 2")
    result =  readLine()
    if(result == "1") rating++
    println("----------------------------------------------------------")

    println("5 Вопрос. \nВерно ли равенство '12X + 3 = 3X + 12' ? \n1) НЕТ\n2) ДА")
    result =  readLine()
    if(result == "2") rating++
    println("----------------------------------------------------------")

    println("Результат:")
    when(rating){
        in 0..2 -> println("Ваши знания на двойку!")
        3 -> println("Оценка удовлетворительно!")
        4 -> println("Ваши знания математики на четыре!")
        5 -> println("У вас отличные знания математики!")
    }

}
