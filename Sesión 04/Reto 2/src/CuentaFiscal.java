

public class CuentaFiscal {
    private String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible;
    }


    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }
}
