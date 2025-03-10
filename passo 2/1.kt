fun main() {
    println("Qual a velocidade do carro? ")
   var velo = readLine()!!.toInt()
    if (velo > 80) {
        println("Você foi multado!")
        var excesso = velo - 80
        var multa = excesso * 5
        println("Valor da multa: R$ $multa")

    } else {
        println("Você está dentro do limite!")
    }
}
