class Avion() {
    val derecha = "derecha"
    val izquierda = "izquerda"

    infix fun gire(movimiento: String) {
        print("Gire a la $movimiento \n")
    }

    infix fun acelerar(velocidad: Int) {
        print("Acelerando a $velocidad \n")
    }

    infix fun frene(velocidad: Int) {
        print("Frenando a $velocidad\n")
    }
}

infix fun String.volar(block: Avion.(Avion) -> Unit) {
    val avion = Avion()
    avion.block(avion)
}

fun main() {
    "AV 1090" volar {
        it gire derecha
        it gire izquierda
        it acelerar 800
        it frene 10
    }
}
