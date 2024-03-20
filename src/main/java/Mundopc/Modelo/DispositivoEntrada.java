package Mundopc.Modelo;

public class DispositivoEntrada {
    private String tipoDeEntrada,marca;



    //contructor
    public DispositivoEntrada(String tipoDeEntrada,String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
