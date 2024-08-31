import java.time.LocalDate

class Medico(
    dni: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    direccion: String,
    ciudadProcedencia: String,
    codigoEmpleado: String,
    numeroHorasExtras: Int,
    fechaIngreso: LocalDate,
    area: String,
    cargo: String,
    esEmpleadoPlanilla: Boolean,
    salarioMensual: Double?,
    porcentajeAdicionalHoraExtra: Double?,
    honorariosPorHora: Double?,
    horasTotales: Int?,
    fechaTerminoContrato: LocalDate?,
    val especialidad: String,
    val servicio: String,
    val numeroConsultorio: String
) : Empleado(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, numeroHorasExtras, fechaIngreso, area, cargo, esEmpleadoPlanilla, salarioMensual, porcentajeAdicionalHoraExtra, honorariosPorHora, horasTotales, fechaTerminoContrato)