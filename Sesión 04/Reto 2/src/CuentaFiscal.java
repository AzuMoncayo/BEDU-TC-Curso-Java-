import java.util.Objects;

public class CuentaFiscal {
    private String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible){
        if (saldoDisponible < 0) {
            throw new IllegalArgumentException("❌ Operación inválida, saldo negativo");
        }
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible;
    }


    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfc());
    }
}
