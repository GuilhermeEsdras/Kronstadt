// fun readDoubles() = readLine()!!.split(' ').map() { it.toDouble() }
fun leReal() = readLine()!!.toDouble()

fun calculaMediaPonderada (n1: Double, p1: Int, n2: Double, p2: Int, n3: Double, p3: Int): Double {
    return (((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3))
}

fun main(args: Array<String>) {
    val A = leReal()
    val B = leReal()
    val C = leReal()

    print ("MEDIA = ")
    println (String.format("%.2f", calculaMediaPonderada(A, 2, B, 3, C, 5)).toDouble())
}