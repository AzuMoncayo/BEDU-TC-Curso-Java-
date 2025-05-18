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

    public String mostrarInformacion() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("📄 Factura generada:\n");
        resumen.append("Descripción: ").append(descripcion).append("\n");
        resumen.append("Monto: $").append(monto).append("\n");

        if (rfc.isPresent()) {
            resumen.append("RFC: ").append(rfc.get()).append("\n");
        } else {
            resumen.append("RFC: [No proporcionado]\n");
        }

        return resumen.toString();
    }
}
