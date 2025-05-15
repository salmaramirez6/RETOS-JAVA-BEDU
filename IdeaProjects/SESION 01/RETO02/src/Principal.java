
// Clase principal
public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto en BEDU", 800.00);
        Entrada entrada2 = new Entrada("Obra de Teatro de BEDU", 450.50);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Reto adicional
        Entrada_Record entrada3= new Entrada_Record("Sinfónica de BEDU", 1200.00);
        entrada3.mostrarInformacion();
    }
}

