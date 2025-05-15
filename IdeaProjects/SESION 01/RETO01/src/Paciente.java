public class Paciente {

        String nombre;
        int edad;
        String numeroExpediente;

        // Mostrar los datos del pacientes
        void mostrarInformacion() {
            System.out.println("Información del paciente:");
            System.out.println("Paciente: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Expediente: " + numeroExpediente);
        }
    }

