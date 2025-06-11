package Clases;

public class BoletoNormal extends Boleto {
    public BoletoNormal() {}

    public BoletoNormal(Pasajero pasajero, String fecha, Servicio servicio, Ruta ruta, String asiento, ServicioExtra servicioExtra) {
        super(pasajero, fecha, servicio, ruta, asiento, servicioExtra);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n----------------------------------------------");
        System.out.println("-----------     BOLETO NORMAL      -----------");
        System.out.println("----------------------------------------------");
        super.mostrarInformacion();
    }
}