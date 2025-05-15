
import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {

        // Crear objeto "Scanner
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0; // Saldo inicial
        int opcion; // Es una variable para almacenar la opción del menú

        // Se repite el menú mientras la opción no sea salir 4
        do {
            // Mostrar menú de opciones
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt(); // Leer la opción seleccionada
            switch (opcion) {
                case 1 -> {
                    // Consultar saldo
                    System.out.println("🔎 Tu saldo actual es: $" + saldo);
                }
                case 2 -> {
                    // Depositar dinero
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; // Regresar al menú sin modificar el saldo
                    }

                    saldo += deposito; // Aumentar el saldo
                    System.out.println("Depósito realizado. Saldo actualizado: $" + saldo);
                }
                case 3 -> {
                    // Retirar dinero
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; // Regresar al menú sin hacer nada
                    }

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; // Restar el monto del saldo total
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                    }
                }
                case 4 -> {
                    // Salir del programa
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                }
                default -> {
                    // Opción INVALIDA
                    System.out.println("Opción inválida. Intentalo nuevamente.");
                }
            }

        } while (opcion != 4); // Salir cuando el usuario elija la opción 4 de salir

        scanner.close();
    }
}