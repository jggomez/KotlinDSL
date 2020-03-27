import java.time.LocalDateTime

val antes = "antes"
val despues = "despues"

infix fun Int.dias(tiempo: String) {
    when (tiempo) {
        antes -> print("${LocalDateTime.now().minusDays(this.toLong())} \n")
        despues -> print("${LocalDateTime.now().plusDays(this.toLong())} \n")
    }
}

fun main() {
    2 dias despues
    2 dias antes
}