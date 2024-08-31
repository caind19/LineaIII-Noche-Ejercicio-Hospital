class Medico(
    dni: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: String,
    direccion: String,
    ciudadProcedencia: String,
    codigoEmpleado: String,
    horasExtras: Int,
    fechaIngreso: String,
    area: String,
    cargo: String,
    esPorPlanilla: Boolean, // Se asume que todos los médicos son por planilla
    salario: Double,        // Salario mensual para los médicos
    honorariosPorHora: Double, // Se ignora en médicos
    val especialidad: String,
    val servicio: String,
    val numeroConsultorio: Int
) : Empleado(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado,
    horasExtras, fechaIngreso, area, cargo, esPorPlanilla, salario, honorariosPorHora)