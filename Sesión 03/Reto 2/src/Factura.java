import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public Optional <String> getRFC(){
        return rfc;
    }

    public double getMonto(){
        return monto;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
