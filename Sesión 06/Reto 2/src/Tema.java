public class Tema{
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public int compareTo(Tema comparaTema){
        String temaActual = this.titulo;
        String temaSiguiente = comparaTema.titulo;

        int resultado = temaActual.compareToIgnoreCase(temaSiguiente);
        return resultado;
    }


    public String getNombre(){
        return titulo;
    }

    public int getPrioridad(){
        return prioridad;
    }


}
