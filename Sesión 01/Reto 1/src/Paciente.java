public class Paciente {
    private String nomPaciente;
    private int edadPaciente;
    private  String expediente;

    public Paciente(String nomPaciente, int edadPaciente, String expediente){
        this.nomPaciente = nomPaciente;
        this.edadPaciente = edadPaciente;
        this.expediente = expediente;
    }

    public void mostrarInformacion(){
        System.out.println("Paciente: "+nomPaciente);
        System.out.println("Edad: "+edadPaciente);
        System.out.println("Expediente: "+expediente);
    }
}
