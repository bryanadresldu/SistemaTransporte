package Clases;

public class Ruta {
    private String origen;
    private String destino;
    private double precio;

    public Ruta() {}

    public Ruta(String origen, String destino, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    // Getters y Setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("--- INFORMACIÓN DE LA RUTA ---");
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Precio inicial: $" + precio);
    }
}