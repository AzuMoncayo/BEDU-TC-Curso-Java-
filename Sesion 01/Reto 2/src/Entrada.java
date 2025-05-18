

public class Entrada {
    private String nomEvento;
    private double precio;

    public Entrada(String nomEvento, double precio){
        this.nomEvento = nomEvento;
        this.precio = precio;
    }

    public void imprimirInformacion(){
        System.out.println("Evento: "+ nomEvento+" | Precio: "+ precio);
    }
}
