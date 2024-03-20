package Mundopc;

import Mundopc.Modelo.Computadora;
import Mundopc.Modelo.Monitor;
import Mundopc.Modelo.Raton;
import Mundopc.Modelo.Teclado;
import Mundopc.Servicio.Orden;

public class VentasComputadorasApp {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth","lenovo");

        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetootg","lenovo");
       // System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("lenovo",27);
      //  System.out.println(monitorLenovo);
        //creamos un objeto tipo computadora
        Computadora computadoraLenovo = new Computadora("computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
      //  System.out.println(computadoraLenovo);
        //Objeto computadora
        Monitor monitordell = new Monitor("dell",15);
        Teclado tecladodell = new Teclado("usb","dell");
        Raton ratondell= new Raton("usb","dell");
        Computadora computadoradell = new Computadora("computadora dell",monitordell,tecladodell,ratondell);
        //computadora mac
        Monitor monitormac = new Monitor("MAC",27);
        Teclado tecladomac = new Teclado("bouetooth","mac");
        Raton ratonmac = new Raton("BLUETOOTH","Mac");
        Computadora computadoramac = new Computadora("IMAC",monitormac,tecladomac,ratonmac);

        //crear orden
        Orden orden1= new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoradell);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoramac);
        orden2.agregarComputadora(computadoradell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();

    }
}