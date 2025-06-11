package Clases;

public class BoletoVIP extends Boleto {
    private boolean tv;
    private boolean internet;
    private String servicio1;
    private String servicio2;

    public BoletoVIP() {}

    public BoletoVIP(Pasajero pasajero, String fecha, Servicio servicio, Ruta ruta, String asiento,
                     ServicioExtra servicioExtra, boolean tv, boolean internet, String servicio1, String servicio2) {
        super(pasajero, fecha, servicio, ruta, asiento, servicioExtra);
        this.tv = tv;
        this.internet = internet;
        this.servicio1 = servicio1;
        this.servicio2 = servicio2;
    }

    // Getters y Setters
    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public String getServicio1() {
        return servicio1;
    }

    public void setServicio1(String servicio1) {
        this.servicio1 = servicio1;
    }

    public String getServicio2() {
        return servicio2;
    }

    public void setServicio2(String servicio2) {
        this.servicio2 = servicio2;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() * 1.30; // 30% de recargo
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n----------------------------------------------");
        System.out.println("-----------        BOLETO VIP      -----------");
        System.out.println("----------------------------------------------");
        super.mostrarInformacion();

        System.out.println("---- SERVICIOS VIP -----");

        if (tv) {
            System.out.println("TV incluida: Sí");
        } else {
            System.out.println("TV incluida: No");
        }

        if (internet) {
            System.out.println("Internet incluido: Sí");
        } else {
            System.out.println("Internet incluido: No");
        }

        System.out.println("Servicio adicional 1: " + servicio1);
        System.out.println("Servicio adicional 2: " + servicio2);
    }
}