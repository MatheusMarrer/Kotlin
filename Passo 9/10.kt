fun main() {
    println("Digite quantos termos da sequência de Fibonacci você deseja:")
    val termos = readLine()!!.toInt()

    Fibonacci(termos)
}

fun Fibonacci(termos: Int) {
    var a = 0
    var b = 1

    for (i in 1..termos) {
        if (i != termos) {
            print("$a >> ")
        } else {
            print("$a ")
        }
        val temp = a
        a = b
        b = temp + b
    }
    println("FIM")
}
