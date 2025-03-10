fun main() {
    print("Digite o peso (kg): ")
    val peso = readLine()!!.toFloat()
    print("Digite a altura (m): ")
    val altura = readLine()!!.toFloat()

    val imc = peso / (altura * altura)
    println("Seu IMC é: %.2f".format(imc))

    when {
        imc < 18.5 -> println("Abaixo do peso")
        imc in 18.5..24.9 -> println("Peso ideal")
        imc in 25.0..29.9 -> println("Sobrepeso")
        imc in 30.0..39.9 -> println("Obesidade")
        else -> println("Obesidade mórbida")
    }
}
