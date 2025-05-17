public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        System.out.println("🎙Escena actual: " + paquete.getEscenaActual());
        System.out.println("Una figura misteriosa aparece y te ofrece 2 caminos....");
    }
}
