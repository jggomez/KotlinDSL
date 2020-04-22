import java.time.LocalDateTime

val antes = "antes"
val despues = "despues"

infix fun Int.dias(tiempo: String) {
    when (tiempo) {
        antes -> println("${LocalDateTime.now().minusDays(this.toLong())}")
        despues -> println("${LocalDateTime.now().plusDays(this.toLong())}")
    }
}

fun main() {
    2 dias despues
    2 dias antes
}