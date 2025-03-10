fun main() {
    var soma = 0
    println("Digite um número: ")
    var num = readLine()!!.toInt()

    while (num != 1111){
        soma += num
        println("Digite um número: ")
         num = readLine()!!.toInt()
    }
    println("A soma é $soma")
}
