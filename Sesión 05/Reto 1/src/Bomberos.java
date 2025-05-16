

public class Bomberos extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Bomberos(String unidad, Operador op){
        super(unidad);
        SistemaGPS nuevogps = new SistemaGPS();
        this.gps = nuevogps;
        Sirena nuevasirena = new Sirena();
        this.sirena = nuevasirena;
        this.operador = op;
    }

    public void responder(){
        System.out.println("Bomberos wiu wiu 🚒");
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
