Sistema de Registro de datos Hospital "Sanitel" (Ejemplo) 

Soy estudiante de la Universidad de Cundinamarca, del núcleo temático de Línea de Profundización III Noche. 
Este es un proyecto para gestionar datos un hospital usando Kotlin.
Descripción

Esta aplicación en Kotlin permite:

    Registrar empleados, pacientes y médicos.
    Agendar citas médicas.
    Consultar médicos por especialidad.
    Ver pacientes atendidos por un médico.

Cómo Empezar

    Clona el Repositorio:

    bash

    git clone https://github.com/tu_usuario/Hospital-Management-System.git

    Abre y Ejecuta el Proyecto en IntelliJ IDEA.

    Corre la Aplicación: Ejecuta la clase HospitalApp.kt en la consola.

Estructura del Código

Aquí te dejo un breve resumen de las clases y cómo están organizadas:

    Persona: Clase base para atributos comunes (DNI, nombre, etc.).
    Paciente: Hereda de Persona, agrega información específica de pacientes.
    Empleado: Hereda de Persona, incluye atributos de empleados, con un booleano para determinar si es por planilla.
    Medico: Hereda de Empleado, agrega detalles de médicos (especialidad, consultorio).
    Cita: Maneja las citas médicas entre pacientes y médicos.
    
Créditos

Desarrollado por Cain Martinez

¡Gracias por visitar el repositorio!
