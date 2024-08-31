import java.time.LocalDate

open class Empleado(
    DNI: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    direccion: String,
    ciudadProcedencia: String,
    val codigoEmpleado: String,
    val numeroHorasExtras: Int,
    val fechaIngreso: LocalDate,
    val area: String,
    val cargo: String,
    val esEmpleadoPlanilla: Boolean, // Booleano para determinar el tipo de empleado
    val salarioMensual: Double? = null, // Salario mensual, solo relevante para Planilla
    val porcentajeAdicionalHoraExtra: Double? = null, // Porcentaje adicional, solo relevante para Planilla
    val honorariosPorHora: Double? = null, // Honorarios por hora, solo relevante para Eventual
    val horasTotales: Int? = null, // Horas totales, solo relevante para Eventual
    val fechaTerminoContrato: LocalDate? = null // Fecha de término, solo relevante para Eventual
) : Persona(DNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia)