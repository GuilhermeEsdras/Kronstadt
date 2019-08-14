/* Função lambda que lê duas Strings na mesma linha e converte para inteiros */
fun readInts() = readLine()!!.split(' ').map { it.toInt() }

/* Função lambda que multiplica dois números inteiros e retorna o resultado */
fun multiplica(x: Int, y: Int) = x * y

/* Função que recebe dois números inteiros e retorna um Int (a soma dos dois) */
fun soma(x: Int, y: Int): Int {
    return x + y
}

/* Função que recebe uma String como parâmetro, printa a messagem e retorna um Unit (sem retorno) */
fun printaMensagem(messagem: String): Unit {
    print(messagem)
}

/* Função que recebe uma String e a imprime com um prefixo na frente */
fun printaMensagemComPrefixo(mensagem: String, prefixo: String = "Digite") {
    print ( "$prefixo $mensagem" )
}

fun main(args: Array<String>) {
    
    print("Digite dois números separados por espaço: ")
    val (a, b) = readLine()!!.split(' ') // Lê duas Strings na mesma linha
    println("Soma: " + (a.toInt() + b.toInt())) // Converte as Strings para Inteiro, soma as duas e depois imprime na tela

    /* Outra forma */
    printaMensagem ("Digite dois números separados por espaço: ")
    val (a2, b2) = readLine()!!.split(' ').map(String::toInt)
    print ("Soma (teste): " + a2 + b2)
    println ("| Soma: " + (a2 + b2))
    
    printaMensagemComPrefixo ("dois números separados por espaço: ")
    val (a3, b3) = readInts()

    val umaStr = "Multiplicação: "
    var outraStr = "Soma: "

    print (umaStr); println(multiplica(a3, b3))
    print (outraStr)
    println(soma(a3, b3))

}