
public class Entrada {
    String evento;
    double precio;

    // Constructor
    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    // Mostrar los datos de la entrada
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
