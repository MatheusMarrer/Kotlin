fun main() {
print("Digite uma distância em metros: ")
var metros = readLine()!!.toDouble()

var quilometros = metros / 1000
var hectometros = metros / 100
var decametros = metros / 10
var decimetros = metros * 10
var centimetros = metros * 100
var milimetros = metros * 1000

println("A distância de $metros m corresponde a:")
println("$quilometros Km")
println("$hectometros Hm")
println("$decametros Dam")
println("$decimetros dm")
println("$centimetros cm")
println("$milimetros mm")
}
