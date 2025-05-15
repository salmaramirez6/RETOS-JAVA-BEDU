
import java.util.Scanner;

public class Principal {

    // Solicitar la información
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de tipo Paciente
        Paciente paciente1 = new Paciente();

        // Solicitar / asignar los datos ingresados por los usuarios
        System.out.print(" Por favor ingresa el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();

        System.out.print("Por favor ingresa la edad: ");
        paciente1.edad = scanner.nextInt();
        scanner.nextLine(); // Se limpia el buffer

        System.out.print("Por favor ingresa el número de expediente: ");
        paciente1.numeroExpediente = scanner.nextLine();

        // Se muestran los datos ingresados
        paciente1.mostrarInformacion();

        // Cerrar el scanner
        scanner.close();
    }

}

