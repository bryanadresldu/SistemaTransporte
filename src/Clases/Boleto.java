package Clases;

public class Boleto extends Ticket {
    private Ruta ruta;
    private String asiento;
    private ServicioExtra servicioExtra;

    public Boleto() {}

    public Boleto(Pasajero pasajero, String fecha, Servicio servicio, Ruta ruta, String asiento, ServicioExtra servicioExtra) {
        super(pasajero, fecha, servicio);
        this.ruta = ruta;
        this.asiento = asiento;
        this.servicioExtra = servicioExtra;
    }

    // Getters y Setters
    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public ServicioExtra getServicioExtra() {
        return servicioExtra;
    }

    public void setServicioExtra(ServicioExtra servicioExtra) {
        this.servicioExtra = servicioExtra;
    }

    public double calcularPrecio() {
    double precioBase = ruta.getPrecio() ;
    double precioMaletasExtra = 0;

    if (servicioExtra != null) {
        precioMaletasExtra = servicioExtra.calcularCostoMaletasExtra();
    }

    return precioBase + precioMaletasExtra;
}

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        ruta.mostrarInformacion();
        System.out.println("Asiento: " + asiento);

        if (servicioExtra != null) {
            servicioExtra.mostrarInformacion();
        }

        System.out.println("\n-----TOTAL A PAGAR----");
        System.out.println("$" + calcularPrecio());
    }
}