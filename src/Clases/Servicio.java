package Clases;

public class Servicio {
    private String tipo;
    private int maletasIncluidas;

    public Servicio() {}

    public Servicio(String tipo, int maletasIncluidas) {
        this.tipo = tipo;
        this.maletasIncluidas = maletasIncluidas;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public int getMaletasIncluidas() {
        return maletasIncluidas;
    }

    public void setMaletasIncluidas(int maletasIncluidas) {
        this.maletasIncluidas = maletasIncluidas;
    }

    public void mostrarInformacion() {
        System.out.println("---- INFORMACIÓN DEL SERVICIO ----");
        System.out.println("Tipo: " + tipo);
        System.out.println("Maletas incluidas: " + maletasIncluidas);
    }
}