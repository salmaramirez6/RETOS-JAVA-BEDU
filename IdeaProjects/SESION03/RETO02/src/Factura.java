import java.util.Optional;

public class Factura {
    // Estos son los atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor que convierte el RFC en Optional, tambien puede ser null
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Método público que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "Factura generada:";
        resumen += "Descripción: " + descripcion;
        resumen += "Monto: $" + monto;

        // Si el RFC está presente, se muestra. Si no, se muestra mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No ha sido proporcionado]");

        return resumen;
    }
}
