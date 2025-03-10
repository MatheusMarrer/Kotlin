fun main() {
println("Digite a quantidade de Km percorridos:")
var qtd_km = readLine()!!.toDouble()
println("Digite a quantidade de dias alugados:")
var qtd_dias = readLine()!!.toInt()
var preco_km = qtd_km * 0.20
var preco_diaria = qtd_dias * 90
var total = preco_diaria + preco_km
println("O total a ser pago é: R$ $total")
}
