

public class Ambulancia extends UnidadEmergencia {

    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia(String unidad, Operador operador){
        super(unidad);
        SistemaGPS nuevogps = new SistemaGPS();
        this.gps = nuevogps;
        Sirena nuevasirena = new Sirena();
        this.sirena = nuevasirena;
        this.operador = operador;
    }

    public void responder(){
        System.out.println("Ambulancia BIUBIU 🚑");
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
