package Clases;

public class Ticket {
    private Pasajero pasajero;
    private String fecha;
    private Servicio servicio;

    public Ticket() {}

    public Ticket(Pasajero pasajero, String fecha, Servicio servicio) {
        this.pasajero = pasajero;
        this.fecha = fecha;
        this.servicio = servicio;
    }

    // Getters y Setters
    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void mostrarInformacion() {
        System.out.println("\n---- INFORMACIÓN DEL TICKET ----");
        pasajero.mostrarInformacion();
        System.out.println("Fecha de viaje: " + fecha);
        servicio.mostrarInformacion();
    }
}