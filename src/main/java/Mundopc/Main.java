package Mundopc;

import Mundopc.Modelo.Computadora;
import Mundopc.Modelo.Monitor;
import Mundopc.Modelo.Raton;
import Mundopc.Modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth","lenovo");

        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetootg","lenovo");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("lenovo",27);
        System.out.println(monitorLenovo);
        //creamos un objeto tipo computadora
        Computadora computadoraLenovo = new Computadora("computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
        System.out.println(computadoraLenovo);

    }
}