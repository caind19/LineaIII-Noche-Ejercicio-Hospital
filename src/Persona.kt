import java.time.LocalDate

open class Persona (
    val DNI: String,
    val nombre: String,
    val apellido: String,
    val fechaNacimiento: LocalDate,
    val direccion: String,
    val ciudadProcedencia: String,
)