package Principal;

import Clases.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----        Transportes El Buho      ----");
        System.out.println("                   Bienvenidos");
        // Pasajeros con valores nulos
        Pasajero p1 = new Pasajero();

        // Setear los atributos delos pasasjeros
        p1.setNombre("Luis Recalvo"); p1.setCedula("129339403938");p1.setEdad(31);



        // Crear rutas disponibles con valores iniciales

        Ruta quitoGuayaquil = new Ruta("Quito", "Guayaquil", 20.00);
        Ruta quitoTulcan = new Ruta("Quito", "Tulcán", 17.50);
        Ruta quitoPuyo = new Ruta("Quito", "Puyo", 15.00);
        Ruta quitoRiobamba = new Ruta("Quito", "Riobamba", 17.50);
        Ruta guayaquilQuito = new Ruta("Guayaquil", "Quito", 20.00);
        Ruta tulcanQuito = new Ruta("Tulcán", "Quito", 17.50);
        Ruta puyoQuito = new Ruta("Puyo", "Quito", 15.00);
        Ruta riobambaQuito = new Ruta("Riobamba", "Quito", 17.50);

        // Crear servicios
        Servicio normal = new Servicio("Normal", 1);
        Servicio vip = new Servicio("VIP", 2);

        // Crear servicios extra
        ServicioExtra maletaExtra1 = new ServicioExtra(1);
        ServicioExtra maletaExtra0 = new ServicioExtra(0);

        // Crear boletos con valores iniciales
        BoletoNormal boleto1 = new BoletoNormal(p1, "2025-11-08", normal, quitoGuayaquil, "Ventana", maletaExtra1);

        //Asigna boletos a pasjeros
        p1.asignarBoleto(boleto1);

        // Mostrar información de todos los boletos de cada pasjero

        p1.mostrarBoleto();
    }
}