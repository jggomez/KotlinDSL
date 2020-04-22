class Reunion(val nombre: String) {

    val agendar = this

    infix fun inicio(hora: IntRange) {
        print("reunión $nombre a las $hora")
    }

    infix fun final(hora: IntRange) {
        print("reunión $nombre a las $hora")
    }
}

infix fun String.reunion(block: Reunion.() -> Unit) {
    Reunion(this).apply {
        block()
    }
}

fun main() {
    "daily" reunion {
        agendar inicio 3..5
        agendar final 4..5
    }
}
