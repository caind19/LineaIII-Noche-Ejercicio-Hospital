import java.time.LocalDate

class Paciente (
    DNI: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: String,
    direccion: String,
    ciudadProcedencia: String,
    val numeroHistoriaClinica : String,
    val sexo : String,
    val grupoSanguineo : String,
    val medicamentosAlergia : List<String>,
): Persona(DNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia)