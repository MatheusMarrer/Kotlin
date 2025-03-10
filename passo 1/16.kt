fun main() {
println("Digite a quantidade de cigarros fumados por dia:")
var qtd_cigarros = readLine()!!.toInt()

println("Digite a quantidade de anos que você já fumou:")
var qtd_anos = readLine()!!.toInt()

var minutos_perdidosCG= 10

var total_minutos = qtd_cigarros * minutos_perdidosCG * 365 * qtd_anos
val dias_perdidos = total_minutos / 1440

println("O fumante perdeu aproximadamente $dias_perdidos dias de vida.")


}
