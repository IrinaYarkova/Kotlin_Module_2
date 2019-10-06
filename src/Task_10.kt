fun main(args: Array<String>){

    var cities: ArrayList<String> = arrayListOf("Москва", "Курск", "Москва")
    val cities2: MutableSet<String> = mutableSetOf()

    var i = 1

    println("--- Программа для хранения названия городов ---")
    while (i > 0) {
        println("\nМеню\n" +
                "1 - Добавить название города в программу\n" +
                "2 - Посмотреть в консоли список всех добавленных городов\n" +
                "3 - Посмотреть список добавленных городов без повторений\n" +
                "4 - Выход из программы"
        )
        var input: String? = readLine()

        when (input) {
            "1" -> {
                println("Введите название города")
                input = readLine()
                cities.add(input!!)
                println("Город добавлен")
            }
            "2" -> {
                println("Список городов: ")
                for (city in cities) println(city)
            }
            "3" -> {
                for (city in cities) cities2 += setOf(city)

                println("Список городов без повторений: ")
                for (city in cities2) println(city)
            }
            "4" -> i = 0
        }
    }


}
