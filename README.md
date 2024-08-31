Sistema de Registro de datos Hospital "Sanitel" (Ejemplo) 

¡Hola! Soy estudiante de la Universidad de Cundinamarca, del núcleo temático de Línea de Profundización III Noche. 
Este es un proyecto para gestionar datos un hospital usando Kotlin. 🚀
📋 Descripción

Esta aplicación en Kotlin permite:

    Registrar empleados, pacientes y médicos.
    Agendar citas médicas.
    Consultar médicos por especialidad.
    Ver pacientes atendidos por un médico.

🚀 Cómo Empezar

    Clona el Repositorio:

    bash

    git clone https://github.com/tu_usuario/Hospital-Management-System.git

    Abre y Ejecuta el Proyecto en IntelliJ IDEA.

    Corre la Aplicación: Ejecuta la clase HospitalApp.kt en la consola.

📚 Estructura del Código

Aquí te dejo un breve resumen de las clases y cómo están organizadas:

    Persona: Clase base que contiene información común a todas las personas (DNI, nombre, etc.).
    Paciente: Hereda de Persona y añade atributos específicos de pacientes.
    Empleado: Hereda de Persona y contiene información sobre empleados (código, área, etc.).
    Medico: Hereda de Empleado y añade atributos relacionados con médicos (especialidad, consultorio, etc.).
    Cita: Clase para gestionar citas médicas entre pacientes y médicos.
    Hospital: Clase principal que gestiona la lista de empleados, pacientes, médicos y citas.
    
👨‍🎓 Créditos

Desarrollado por Cain Martinez

¡Gracias por visitar el repositorio! 😄
