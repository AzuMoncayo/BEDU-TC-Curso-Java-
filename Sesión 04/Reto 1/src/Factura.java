
public class Factura {
    private String folio;
    private String nomCliente;
    private double total;

    public Factura(String folio, String nomCliente, double total){
        this.folio = folio;
        this.nomCliente = nomCliente;
        this.total = total;
    }

    public String toString(){
        System.out.println("Factura [folio= "+ folio +", cliente= "+ nomCliente +", total=$ "+ total +"]");
        return null;
    }

    public boolean equals(Factura f1, Factura f2){
        return f1.equals(f2);
    }


    public String getFolio(){
        return folio;
    }

    public  String getNomCliente(){
        return nomCliente;
    }

    public double getTotal(){
        return total;
    }
}
