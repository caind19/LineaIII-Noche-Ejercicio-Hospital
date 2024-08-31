open class Empleado(
    DNI: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: String,
    direccion: String,
    ciudadProcedencia: String,
    val codigoEmpleado: String,
    val horasExtras: Int,
    val fechaIngreso: String,
    val area: String,
    val cargo: String,
    val esPorPlanilla: Boolean,  // Atributo booleano para indicar si es empleado por planilla
    val salario: Double,         // Salario mensual si es empleado por planilla
    val honorariosPorHora: Double // Honorarios por hora si es empleado eventual
) : Persona(DNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia)