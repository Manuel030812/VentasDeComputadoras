package Mundopc.Modelo;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static  int contadorRatones;

    //Contructor

    public Raton(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "} "+super.toString();
    }
}
