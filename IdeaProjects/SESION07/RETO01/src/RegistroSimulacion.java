import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
public class RegistroSimulacion {
    public static void main(String[] args) {
        Path rutaCarpeta = Paths.get("src/RETO01/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        String parametros = "Tiempo de ciclo: 56 segundos"
                + "Velocidad de línea: 1.2 m/s"
                + "Número de estaciones: 8";
        try {

            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println("Carpeta creada.");
            }

            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente.");

            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo se creó exitosamente en: " + rutaArchivo.toAbsolutePath());
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("Archivo no creado.");
            }
        } catch (IOException e) {
            System.out.println("Error en el archivo!!!: " + e.getMessage());
        }
    }
}