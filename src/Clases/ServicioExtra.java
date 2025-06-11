package Clases;

public class ServicioExtra {
    private int maletasExtra;
    private double precioMaletaExtra;

    public ServicioExtra() {
        this.precioMaletaExtra = 5.0;
    }

    public ServicioExtra(int maletasExtra) {
        this();
        this.maletasExtra = maletasExtra;
    }

    // Getters y Setters
    public int getMaletasExtra() {
        return maletasExtra;
    }

    public void setMaletasExtra(int maletasExtra) {
        this.maletasExtra = maletasExtra;
    }

    public double getPrecioMaletaExtra() {
        return precioMaletaExtra;
    }

    public void setPrecioMaletaExtra(double precioMaletaExtra) {
        this.precioMaletaExtra = precioMaletaExtra;
    }

    public double calcularCostoMaletasExtra() {
        return maletasExtra * precioMaletaExtra;
    }

    public void mostrarInformacion() {
        System.out.println("---- INFORMACIÓN DE SERVICIOS EXTRA ----");
        System.out.println("Maletas extra: " + maletasExtra);
        System.out.println("Precio por maleta extra: $" + precioMaletaExtra);
        System.out.println("Total por maletas extra: $" + calcularCostoMaletasExtra());
    }
}