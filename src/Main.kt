fun main() {
    val empleados = mutableListOf<Empleado>()
    val pacientes = mutableListOf<Paciente>()
    val medicos = mutableListOf<Medico>()
    val citas = mutableListOf<Cita>()

    while (true) {
        println("|||| Registro de datos del Hospital Sanitel:  ||")
        println("|||| 1. Registrar Empleado                    ||")
        println("|||| 2. Registrar Paciente                    ||")
        println("|||| 3. Registrar Médico                      ||")
        println("|||| 4. Registrar Cita                        ||")
        println("|||| 5. Listar Médicos por Especialidad       ||")
        println("|||| 6. Listar Pacientes atendidos por Médico ||")
        println("|||| 7. Salir                                 ||")
        print(">>>> Seleccione una opción:>>                 ")
        when (readLine()!!.toInt()) {
            1 -> {
                // Registro de Empleado
                println("Ingrese el DNI del empleado:")
                val dni = readLine()!!
                println("Ingrese el nombre del empleado:")
                val nombre = readLine()!!
                println("Ingrese el apellido del empleado:")
                val apellido = readLine()!!
                println("Ingrese la fecha de nacimiento del empleado:")
                val fechaNacimiento = readLine()!!
                println("Ingrese la dirección del empleado:")
                val direccion = readLine()!!
                println("Ingrese la ciudad de procedencia del empleado:")
                val ciudadProcedencia = readLine()!!
                println("Ingrese el código de empleado:")
                val codigoEmpleado = readLine()!!
                println("Ingrese las horas extras trabajadas:")
                val horasExtras = readLine()!!.toInt()
                println("Ingrese la fecha de ingreso:")
                val fechaIngreso = readLine()!!
                println("Ingrese el área de trabajo:")
                val area = readLine()!!
                println("Ingrese el cargo:")
                val cargo = readLine()!!
                println("¿Es empleado por planilla? (true/false):")
                val esPorPlanilla = readLine()!!.toBoolean()
                if (esPorPlanilla) {
                    println("Ingrese el salario mensual:")
                    val salario = readLine()!!.toDouble()
                    empleados.add(
                        Empleado(
                            dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                            codigoEmpleado, horasExtras, fechaIngreso, area, cargo, true, salario, 0.0
                        )
                    )
                } else {
                    println("Ingrese los honorarios por hora:")
                    val honorariosPorHora = readLine()!!.toDouble()
                    empleados.add(
                        Empleado(
                            dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                            codigoEmpleado, horasExtras, fechaIngreso, area, cargo, false, 0.0, honorariosPorHora
                        )
                    )
                }
                println("Empleado registrado con éxito.")
            }
            2 -> {
                // Registro de Paciente
                println("Ingrese el DNI del paciente:")
                val dni = readLine()!!
                println("Ingrese el nombre del paciente:")
                val nombre = readLine()!!
                println("Ingrese el apellido del paciente:")
                val apellido = readLine()!!
                println("Ingrese la fecha de nacimiento del paciente:")
                val fechaNacimiento = readLine()!!
                println("Ingrese la dirección del paciente:")
                val direccion = readLine()!!
                println("Ingrese la ciudad de procedencia del paciente:")
                val ciudadProcedencia = readLine()!!
                println("Ingrese el número de historia clínica:")
                val numeroHistoriaClinica = readLine()!!
                println("Ingrese el sexo del paciente:")
                val sexo = readLine()!!
                println("Ingrese el grupo sanguíneo del paciente:")
                val grupoSanguineo = readLine()!!
                println("Ingrese la lista de medicamentos a los que es alérgico (separados por comas):")
                val medicamentosAlergicos = readLine()!!.split(",").map { it.trim() }

                pacientes.add(
                    Paciente(
                        dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                        numeroHistoriaClinica, sexo, grupoSanguineo, medicamentosAlergicos
                    )
                )
                println("Paciente registrado con éxito.")
            }
            3 -> {
                // Registro de Médico
                println("Ingrese el DNI del médico:")
                val dni = readLine()!!
                println("Ingrese el nombre del médico:")
                val nombre = readLine()!!
                println("Ingrese el apellido del médico:")
                val apellido = readLine()!!
                println("Ingrese la fecha de nacimiento del médico:")
                val fechaNacimiento = readLine()!!
                println("Ingrese la dirección del médico:")
                val direccion = readLine()!!
                println("Ingrese la ciudad de procedencia del médico:")
                val ciudadProcedencia = readLine()!!
                println("Ingrese el código de empleado del médico:")
                val codigoEmpleado = readLine()!!
                println("Ingrese las horas extras trabajadas por el médico:")
                val horasExtras = readLine()!!.toInt()
                println("Ingrese la fecha de ingreso del médico:")
                val fechaIngreso = readLine()!!
                println("Ingrese el área de trabajo del médico:")
                val area = readLine()!!
                println("Ingrese el cargo del médico:")
                val cargo = readLine()!!
                println("Ingrese el salario mensual del médico:")
                val salario = readLine()!!.toDouble()
                println("Ingrese la especialidad del médico:")
                val especialidad = readLine()!!
                println("Ingrese el servicio del médico:")
                val servicio = readLine()!!
                println("Ingrese el número de consultorio del médico:")
                val numeroConsultorio = readLine()!!.toInt()

                medicos.add(
                    Medico(
                        dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                        codigoEmpleado, horasExtras, fechaIngreso, area, cargo, true, salario, 0.0,
                        especialidad, servicio, numeroConsultorio
                    )
                )
                println("Médico registrado con éxito.")
            }
            4 -> {
                // Registro de Cita
                println("Ingrese el DNI del paciente:")
                val dniPaciente = readLine()!!
                val paciente = pacientes.find { it.DNI == dniPaciente }
                if (paciente == null) {
                    println("Paciente no encontrado.")
                    continue
                }
                println("Ingrese el código del médico:")
                val codigoMedico = readLine()!!
                val medico = medicos.find { it.codigoEmpleado == codigoMedico }
                if (medico == null) {
                    println("Médico no encontrado.")
                    continue
                }
                println("Ingrese la fecha de la cita:")
                val fecha = readLine()!!
                println("Ingrese la hora de la cita:")
                val hora = readLine()!!
                println("Ingrese el servicio para la cita (Ejemplo: cirugía, oftalmología):")
                val servicio = readLine()!!

                citas.add(Cita(paciente, medico, fecha, hora, servicio))
                println("Cita registrada con éxito.")
            }
            5 -> {
                // Listar Médicos por Especialidad
                println("Ingrese la especialidad para listar médicos:")
                val especialidad = readLine()!!
                val medicosEspecialidad = medicos.filter { it.especialidad == especialidad }
                if (medicosEspecialidad.isEmpty()) {
                    println("No se encontraron médicos con esa especialidad.")
                } else {
                    medicosEspecialidad.forEach {
                        println("DNI: ${it.DNI}, Nombre: ${it.nombre} ${it.apellido}, Servicio: ${it.servicio}, Consultorio: ${it.numeroConsultorio}")
                    }
                }
            }
            6 -> {
                // Listar Pacientes atendidos por Médico
                println("Ingrese el código del médico:")
                val codigoMedico = readLine()!!
                val citasMedico = citas.filter { it.medico.codigoEmpleado == codigoMedico }
                if (citasMedico.isEmpty()) {
                    println("No se encontraron citas para el médico con ese código.")
                } else {
                    val pacientesAtendidos = citasMedico.map { it.paciente }
                    pacientesAtendidos.forEach {
                        println("Nombre: ${it.nombre} ${it.apellido}")
                    }
                }
            }
            7 -> {
                println("Saliendo del programa...")
                break
            }
            else -> {
                println("Opción no válida. Intente nuevamente.")
            }
        }
    }
}
