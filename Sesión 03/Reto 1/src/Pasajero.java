

public class Pasajero {
    private String nomPasajero;
    private String pasaporte;

    public Pasajero(String nomPasajero, String pasaporte){
        this.nomPasajero = nomPasajero;
        this.pasaporte = pasaporte;
    }

    public String getNombre(){
        return  nomPasajero;
    }

    public String getPasaporte(){
        return pasaporte;
    }

}
