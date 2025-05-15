public class Principal {
    public static void main(String[] args) {
        // Crear un pasajer@
        Pasajero pasajero = new Pasajero("Ana Martínez", "P123456");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar un asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito");
        } else {
            System.out.println("No se pudo realizar la reserva");
        }

        // Mostrar el itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar la reserva
        System.out.println("Cancelando reserva....");
        vuelo.cancelarReserva();

        // Mostrar el itinerario ya actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Realizar una nueva reservacion
        vuelo.reservarAsiento("Mario Gomez", "K569854");
        System.out.println(vuelo.obtenerItinerario());
    }
}