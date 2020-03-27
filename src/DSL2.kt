class Reunion(val nombre: String) {

    val iniciar = this

    infix fun a(hora: IntRange) {
        print("reunión $nombre a las $hora")
    }
}

infix fun String.reunion(block: Reunion.() -> Unit) {
    Reunion(this).also {
        it.block()
    }
}

fun main() {
    "daily" reunion {
        iniciar a 3..5
    }
}
