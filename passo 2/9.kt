fun main() {
    print("Digite o comprimento do primeiro segmento: ")
    val a = readLine()!!.toFloat()
    print("Digite o comprimento do segundo segmento: ")
    val b = readLine()!!.toFloat()
    print("Digite o comprimento do terceiro segmento: ")
    val c = readLine()!!.toFloat()

    if (a + b > c && a + c > b && b + c > a) {
        println("É possível formar um triângulo com esses segmentos.")
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}
