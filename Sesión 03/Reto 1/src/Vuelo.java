

public class Vuelo {
    String codigo = "XYU8880";
    String destino;
    String horaSalida;
    static Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida){
        this.codigo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;

    }

    public static boolean reservarAsiento(Pasajero p){
        if(asientoReservado==null){
            asientoReservado = p;
            return true;
        }else {
            return false;
        }
    }

    public static boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero p = new Pasajero(nombre,pasaporte);
        return reservarAsiento(p);
    }

    public void cancelarVuelo(){
        asientoReservado=null;
    }

    public void consultarVuelo(){
        System.out.println("✈\uFE0F Itinerario del vuelo:");
        System.out.println("Código: "+ codigo);
        System.out.println("Destino: "+ destino);
        System.out.println("Hora salida: "+ horaSalida);
    }
}

