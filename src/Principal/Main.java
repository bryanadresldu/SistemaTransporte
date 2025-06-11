package Principal;

import Clases.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----        Transportes El Buho      ----");
        System.out.println("                   Bienvenidos");
        // Crear 5 pasajeros con valores nulos
        Pasajero p1 = new Pasajero();
        Pasajero p2 = new Pasajero();
        Pasajero p3 = new Pasajero();
        Pasajero p4 = new Pasajero();
        Pasajero p5 = new Pasajero();

        // Mostrar informacion de pasajero con valores nuevos

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        p4.mostrarInformacion();
        p5.mostrarInformacion();

        // Setear los atributos delos pasasjeros
        p1.setNombre("Luis Recalvo"); p1.setCedula("129339403938");p1.setEdad(31);
        p2.setNombre("Alfonso Laos"); p2.setCedula("1323494032");p2.setEdad(21);
        p3.setNombre("Enner Valencia"); p3.setCedula("140384029340");p3.setEdad(12);
        p4.setNombre("Camila Vizcaino"); p4.setCedula("17778299930");p4.setEdad(19);
        p5.setNombre("Angi Torres"); p5.setCedula("124334100043");p5.setEdad(17);


        // Mostrar informacion de pasajero con valores seteados
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        p4.mostrarInformacion();
        p5.mostrarInformacion();

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
        BoletoNormal boleto2 = new BoletoNormal(p2, "2025-11-08", normal, quitoPuyo, "Pasillo", null);

        BoletoVIP boleto3 = new BoletoVIP(p3, "2025-11-08", vip, quitoTulcan, "Adelante", maletaExtra1,
                true, true, "Comida", "Bebida");

        BoletoVIP boleto4 = new BoletoVIP(p4, "2023-11-18", vip, quitoRiobamba, "Ventana", maletaExtra0,
                true, false, "Almohada", "Manta");

        // Crear boleto 5 con valores nulos y luego setear
        BoletoNormal boleto5 = new BoletoNormal();
        boleto5.setPasajero(p5);
        boleto5.setFecha("2025-11-09");
        boleto5.setServicio(normal);
        boleto5.setRuta(quitoGuayaquil);
        boleto5.setAsiento("Al final");
        boleto5.setServicioExtra(maletaExtra1);

        //Asigna boletos a pasjeros
        p1.asignarBoleto(boleto1);
        p2.asignarBoleto(boleto2);
        p3.asignarBoleto(boleto3);
        p4.asignarBoleto(boleto4);
        p5.asignarBoleto(boleto5);

        // Mostrar información de todos los boletos de cada pasjero
        System.out.println("\n----        Transportes El Buho      ----");
        System.out.println("                   Bienvenidos");
        p1.mostrarBoleto();
        p2.mostrarBoleto();
        p3.mostrarBoleto();

        p4.mostrarBoleto();
        p5.mostrarBoleto();
    }
}