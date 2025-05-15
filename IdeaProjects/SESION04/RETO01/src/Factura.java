public class Factura {

    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override //Sobreescrito
    public String toString() {
        return "Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Método equals para comparar si dos facturas tienen el mismo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // Se compara nada mas el folio
    }

    // Método hashCode() consistente con equals(), basado en el folio
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
