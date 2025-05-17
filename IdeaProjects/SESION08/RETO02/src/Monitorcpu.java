import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Monitorcpu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> registroscpu = new HashSet<>();

        try {
            System.out.println("Ingresa consumos de CPU en porcentaje (enteros). Escribe -1 para terminar.");

            while (true) {
                System.out.print("CPU (%): ");
                int valor = scanner.nextInt();

                if (valor == -1) {
                    break;
                }

                if (valor < 0 || valor > 100) {
                    System.out.println("El valor esta fuera de rango. Debe estar entre 0 y 100.");
                    continue;
                }

                if (!registroscpu.add(valor)) {
                    System.out.println("Valor duplicado: " + valor + "%");
                    continue;
                }

                if (valor > 95) {
                    throw new ConsumoCriticoExcepcion("¡¡ALERTA!!: Consumo crítico detectado (" + valor + "%)");
                }

                System.out.println("Registro aceptado: " + valor + "%");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Se debe de ingresar un número entero válido.");
        } catch (ConsumoCriticoExcepcion e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Hubo un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Recursos cerrados correctamente!");
        }
    }
}
