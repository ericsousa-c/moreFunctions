fun main() {
    println(media(false, 5f, 10f, 4f, 9.5f, "", false, 115613, 1f, 2f))

}

fun media1(vararg notas: Float): Float {   //deixa o numero de parametros indeterminado
    return 0f
}

fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) soma += n
    }
    return soma / notas.size
}