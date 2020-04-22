class Carro {
    infix fun acelerar(velocidad: Int) {
        println("Acelerando a $velocidad")
    }
}

val saludo = "Hola Kotlin"
fun String.fuerte() = toUpperCase()

fun proceso(num: Int, func: (num: Int) -> String) {
    print(func(num * 2))
}

class HTML(val html: String) {

    fun crearJSON() {
        println("Creando JSON => $html")
    }

}

fun transformar(html: String, func: HTML.(html: String) -> Unit) {
    HTML(html).func(html)
}


fun main() {

    transformar("HTML HTML") {
        crearJSON()
    }

    val carro = Carro()
    carro acelerar 10

    println(saludo.fuerte())

    proceso(2) { result ->
        "Este proceso tiene este resultado => $result"
    }
}