import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Scanner

fun main() {
    val hospital = Hospital()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Seleccione una opción:")
        println("1. Registrar paciente")
        println("2. Registrar médico")
        println("3. Registrar cita médica")
        println("4. Listar médicos por especialidad")
        println("5. Listar pacientes atendidos por médico")
        println("6. Salir")

        when (scanner.nextInt()) {
            1 -> {
                // Registrar paciente
                scanner.nextLine() // Consumir el salto de línea
                println("Ingrese DNI del paciente:")
                val dni = scanner.nextLine()
                println("Ingrese nombre del paciente:")
                val nombre = scanner.nextLine()
                println("Ingrese apellido del paciente:")
                val apellido = scanner.nextLine()
                println("Ingrese fecha de nacimiento (yyyy-mm-dd):")
                val fechaNacimiento = LocalDate.parse(scanner.nextLine())
                println("Ingrese dirección del paciente:")
                val direccion = scanner.nextLine()
                println("Ingrese ciudad de procedencia del paciente:")
                val ciudadProcedencia = scanner.nextLine()
                println("Ingrese número de historia clínica:")
                val numeroHistoriaClinica = scanner.nextLine()
                println("Ingrese sexo del paciente:")
                val sexo = scanner.nextLine()
                println("Ingrese grupo sanguíneo del paciente:")
                val grupoSanguineo = scanner.nextLine()
                println("Ingrese lista de medicamentos a los que es alérgico (separados por comas):")
                val medicamentosAlergicos = scanner.nextLine().split(",").map { it.trim() }

                val paciente = Paciente(
                    DNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                    numeroHistoriaClinica, sexo, grupoSanguineo, medicamentosAlergia
                )
                hospital.registrarPaciente(paciente)
                println("Paciente registrado exitosamente.")
            }
            2 -> {
                // Registrar médico
                scanner.nextLine() // Consumir el salto de línea
                println("Ingrese DNI del médico:")
                val dni = scanner.nextLine()
                println("Ingrese nombre del médico:")
                val nombre = scanner.nextLine()
                println("Ingrese apellido del médico:")
                val apellido = scanner.nextLine()
                println("Ingrese fecha de nacimiento (yyyy-mm-dd):")
                val fechaNacimiento = LocalDate.parse(scanner.nextLine())
                println("Ingrese dirección del médico:")
                val direccion = scanner.nextLine()
                println("Ingrese ciudad de procedencia del médico:")
                val ciudadProcedencia = scanner.nextLine()
                println("Ingrese código del empleado:")
                val codigoEmpleado = scanner.nextLine()
                println("Ingrese número de horas extras:")
                val numeroHorasExtras = scanner.nextInt()
                println("Ingrese fecha de ingreso (yyyy-mm-dd):")
                val fechaIngreso = LocalDate.parse(scanner.next())
                println("Ingrese área del médico:")
                val area = scanner.nextLine()
                println("Ingrese cargo del médico:")
                val cargo = scanner.nextLine()
                println("¿Es empleado por planilla? (true/false):")
                val esEmpleadoPlanilla = scanner.nextBoolean()
                println("Ingrese salario mensual (dejar en blanco si es eventual):")
                val salarioMensual = if (esEmpleadoPlanilla) scanner.nextDouble() else null
                println("Ingrese porcentaje adicional por hora extra (dejar en blanco si es eventual):")
                val porcentajeAdicionalHoraExtra = if (esEmpleadoPlanilla) scanner.nextDouble() else null
                println("Ingrese honorarios por hora (dejar en blanco si es por planilla):")
                val honorariosPorHora = if (!esEmpleadoPlanilla) scanner.nextDouble() else null
                println("Ingrese número total de horas (dejar en blanco si es por planilla):")
                val horasTotales = if (!esEmpleadoPlanilla) scanner.nextInt() else null
                println("Ingrese fecha de término del contrato (dejar en blanco si es por planilla):")
                val fechaTerminoContrato = if (!esEmpleadoPlanilla) LocalDate.parse(scanner.next()) else null
                println("Ingrese especialidad del médico:")
                val especialidad = scanner.nextLine()
                println("Ingrese servicio del médico:")
                val servicio = scanner.nextLine()
                println("Ingrese número de consultorio:")
                val numeroConsultorio = scanner.nextLine()

                val medico = Medico(
                    dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                    codigoEmpleado, numeroHorasExtras, fechaIngreso, area, cargo, esEmpleadoPlanilla,
                    salarioMensual, porcentajeAdicionalHoraExtra, honorariosPorHora, horasTotales, fechaTerminoContrato,
                    especialidad, servicio, numeroConsultorio
                )
                hospital.registrarEmpleado(medico)
                println("Médico registrado exitosamente.")
            }
            3 -> {
                // Registrar cita médica
                scanner.nextLine() // Consumir el salto de línea
                println("Ingrese DNI del paciente:")
                val dniPaciente = scanner.nextLine()
                println("Ingrese código del médico:")
                val codigoMedico = scanner.nextLine()
                println("Ingrese servicio de la cita médica:")
                val servicio = scanner.nextLine()
                println("Ingrese fecha y hora de la cita (yyyy-mm-ddTHH:mm):")
                val fechaHora = LocalDateTime.parse(scanner.nextLine())

                val paciente = hospital.pacientes.find { it.DNI == dniPaciente }
                val medico = hospital.medicos.find { it.codigoEmpleado == codigoMedico }

                if (paciente != null && medico != null) {
                    val cita = Cita(paciente, medico, servicio, fechaHora)
                    hospital.registrarCita(cita)
                    println("Cita médica registrada exitosamente.")
                } else {
                    println("Paciente o médico no encontrado.")
                }
            }
            4 -> {
                // Listar médicos por especialidad
                scanner.nextLine() // Consumir el salto de línea
                println("Ingrese especialidad para listar médicos:")
                val especialidad = scanner.nextLine()
                val medicos = hospital.listarMedicosPorEspecialidad(especialidad)
                if (medicos.isNotEmpty()) {
                    println("Médicos de $especialidad:")
                    medicos.forEach { println("${it.nombre} ${it.apellido}") }
                } else {
                    println("No se encontraron médicos para la especialidad $especialidad.")
                }
            }
            5 -> {
                // Listar pacientes atendidos por médico
                scanner.nextLine() // Consumir el salto de línea
                println("Ingrese código del médico:")
                val codigoMedico = scanner.nextLine()
                val pacientes = hospital.listarPacientesAtendidosPorMedico(codigoMedico)
                if (pacientes.isNotEmpty()) {
                    println("Pacientes atendidos por el médico con código $codigoMedico:")
                    pacientes.forEach { println("${it.nombre} ${it.apellido}") }
                } else {
                    println("No se encontraron pacientes atendidos por el médico con código $codigoMedico.")
                }
            }
            6 -> {
                // Salir
                println("Saliendo del programa...")
                return
            }
            else -> {
                println("Opción inválida. Intente nuevamente.")
            }
        }
    }
}
