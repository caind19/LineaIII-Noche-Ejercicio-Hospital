import java.time.LocalDateTime

class Cita (
    val paciente: Paciente,
    val medico: Medico,
    val servicio: String,
    val fechaHora: LocalDateTime,
)