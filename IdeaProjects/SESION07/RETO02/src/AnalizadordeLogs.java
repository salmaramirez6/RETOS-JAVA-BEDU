import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadordeLogs {

    public static void main(String[] args) {
        Path rutaLog = Paths.get("src/RETO02/errores.log");
        Path rutaError = Paths.get("src/RETO02/registro_fallos.txt");
        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            System.out.println("Análisis completo:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Total de errores: " + conteoErrores);
            System.out.println("Total de advertencias: " + conteoWarnings);

            double porcentajeErrores = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%", porcentajeWarnings);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de logs: " + e.getMessage());

            try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                escritor.write("Se produjo un error al leer el archivo!!: " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("No se logró escribir en el archivo de registro de fallos.");
            }
        }
    }
}
