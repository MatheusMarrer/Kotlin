fun main() {
    var total_homem = 0.0
    var total_mulher = 0.0
    var continuar = "S"

    while (continuar == "S") {
        println("Digite o salário: ")
        val salario = readLine()!!.toDouble()

        println("Digite o sexo (M para masculino, F para feminino): ")
        val sexo = readLine()?.uppercase()

        if (sexo == "M") {
            total_homem += salario
        } else if (sexo == "F") {
            total_mulher += salario
        } else {
            println("Sexo inválido!")
        }

        println("Deseja continuar? (S para sim, N para não): ")
        continuar = readLine()!!.uppercase()
    }

    println("Total pago a homens: R$ $total_homem")
    println("Total pago a mulheres: R$ $total_mulher")
}
