package Clases;

public class Pasajero {
    private String nombre;
    private String cedula;
    private int edad;
    private Boleto boleto;

    public Pasajero() {}

    public Pasajero(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public void asignarBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    public void mostrarBoleto() {
        if (boleto != null) {
            boleto.mostrarInformacion();
        } else {
            System.out.println("El pasajero no tiene un boleto asignado.");
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("--- INFORMACIÓN DEL PASAJERO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
    }
}