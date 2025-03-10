fun main() {
    print("Digite o comprimento do primeiro lado: ")
    val a = readLine()!!.toFloat()
    print("Digite o comprimento do segundo lado: ")
    val b = readLine()!!.toFloat()
    print("Digite o comprimento do terceiro lado: ")
    val c = readLine()!!.toFloat()

    if (a == b && b == c) {
        println("O triângulo é EQUILÁTERO.")
    } else if (a == b || b == c || a == c) {
        println("O triângulo é ISÓSCELES.")
    } else {
        println("O triângulo é ESCALENO.")
    }
}
