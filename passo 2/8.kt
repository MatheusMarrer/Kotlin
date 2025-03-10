fun main() {
    print("Digite a distância em km: ")
    val distancia = readLine()!!.toFloat()
    val preco = if (distancia <= 200) {
        distancia * 0.50f
    } else {
        distancia * 0.45f
    }
    println("O preço da passagem é R$$preco.")
}
