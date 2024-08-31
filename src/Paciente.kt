import java.time.LocalDate

class Paciente (
    DNI: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    direccion: String,
    ciudadProcedencia: String,
    val numeroHistoriaClinica : String,
    val sexo : String,
    val grupoSanguineo : String,
    val medicamentosAlergia : String,
): Persona(DNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia)