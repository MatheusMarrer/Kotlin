fun main() {
    var a = 1
    var b = 1

    println("Os 10 primeiros elementos da sequência de Fibonacci são:")
    print("$a $b ")

    for (i in 3..10) {
        val proximo = a + b
        print("$proximo ")
        a = b
        b = proximo
    }
}

