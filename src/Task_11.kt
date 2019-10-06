fun main(args: Array<String>) {

    var emploees: Map<Int, String> = mapOf(1 to "Котова М. А.", 2 to "Максимов А. Ю.", 3 to "Усов Р. Н.")
    var i = 1

    println("--- Программа для поиска сотрудника по рабочему месту ---")
    while (i > 0) {
        println("\nМеню\n" +
                "1 - Добавить сотрудника\n" +
                "2 - Найти сотрудника по номеру рабочего места\n" +
                "3 - Выход из программы")
        var input: String?  = readLine()

        when(input){
            "1" -> {println("Введите ФИО сотрудника:")
                var name: String? = readLine()
                println("Введите номер рабочего места сотрудника:")
                input = readLine()
                emploees += mapOf(input!!.toInt() to name!!)
                println("Сотрудник добавлен")}

            "2" -> {println("Введите номер рабочего места сотрудника:")
                input = readLine()
                var place = input!!.toInt()
                println("Рабочее место №"+ place + " занимает " + emploees.getValue(place))}

            "3" -> i = 0
        }

    }

}