fun main() {
    print("Digite o tipo de carro alugado (popular ou luxo): ")
    val tipoCarro = readLine()!!
    print("Quantos dias de aluguel? ")
    val dias = readLine()!!.toInt()
    print("Quantos Km percorridos? ")
    val km = readLine()!!.toInt()

    val precoDia = if (tipoCarro == "popular") 90 else 150
    val precoKm = if (tipoCarro == "popular") {
        if (km <= 100) km * 0.20 else km * 0.10
    } else {
        if (km <= 200) km * 0.30 else km * 0.25
    }

    val total = (precoDia * dias) + precoKm
    println("O preço total a ser pago é: R$%.2f".format(total))
}
