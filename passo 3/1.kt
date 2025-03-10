fun main() {
    println("Digite o primeiro número: ")
    var n1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    var n2 = readLine()!!.toInt()
    if (n1 > n2){
        println("O primeiro valor é o maior!")
    } else {
        if (n1 < n2){
            println("O segundo valor é o maior!")
        } else {
            println("Não existe valor maior, os dois são iguais")
        }
    }
}