public class Vuelo {
    final String codigoVuelo;       // Constante
    String destino;
    String horaSalida;
    Pasajero asientoReservado;      // Se asignará una instancia o null

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método con parámetro y valor de retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    // Metodo con sobrecarga permita reservar con un string
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    // Método que no tiene retonro
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // Método que retorna un String
    public String obtenerItinerario() {
        String info = "Itinerario del vuelo:";
        info += "Código: " + codigoVuelo;
        info += "Destino: " + destino;
        info += "Salida: " + horaSalida;
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre;
        } else {
            info += "Pasajero: [Sin reserva]";
        }
        return info;
    }
}