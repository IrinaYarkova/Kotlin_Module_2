fun main(args: Array<String>){
    var counters: Array<Array<String>> = Array(3) { Array(3) {""} }

    counters[0] = arrayOf("Россия", "Китай", "Норвегия")
    counters[1] = arrayOf("Москва", "Пекин", "Осло")
    counters[2] = arrayOf("Рубль", "Юань", "Крона")

    for((j, row) in counters.withIndex()){
        for((i) in row.withIndex()){
            print(counters[i][j] + " ")
        }
        println()
    }

}

