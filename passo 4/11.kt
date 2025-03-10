fun main() {
    var pares = 0
    var impares = 0

    for (i in 1..6) {
        print("Digite o $iº número: ")
        val num = readLine()!!.toInt()

        if (num % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }
    println("Pares: $pares, Ímpares: $impares")
}
