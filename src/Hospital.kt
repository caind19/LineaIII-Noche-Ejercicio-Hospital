import java.time.LocalDate
import java.time.LocalDateTime

class Hospital {
    private val empleados = mutableListOf<Empleado>()
    private val pacientes = mutableListOf<Paciente>()
    private val medicos = mutableListOf<Medico>()
    private val citas = mutableListOf<Cita>()

    // Registrar datos de empleado
    fun registrarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
        if (empleado is Medico) {
            medicos.add(empleado)
        }
    }

    // Registrar datos de paciente
    fun registrarPaciente(paciente: Paciente) {
        pacientes.add(paciente)
    }

    // Registrar datos de médico
    fun registrarMedico(medico: Medico) {
        medicos.add(medico)
    }

    // Registrar una cita médica
    fun registrarCita(cita: Cita) {
        citas.add(cita)
    }

    // Listar médicos por especialidad
    fun listarMedicosPorEspecialidad(especialidad: String): List<Medico> {
        return medicos.filter { it.especialidad == especialidad }
    }

    // Listar pacientes atendidos por un médico determinado
    fun listarPacientesAtendidosPorMedico(codigoMedico: String): List<Paciente> {
        return citas.filter { it.medico.codigoEmpleado == codigoMedico }
            .map { it.paciente }
    }
}

// Clase Cita
class Cita(
    val paciente: Paciente,
    val medico: Medico,
    val servicio: String,
    val fechaHora: LocalDateTime
)
