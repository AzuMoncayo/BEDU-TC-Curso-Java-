import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenid@ al BEDUhospital");
        System.out.println("Ingresa los datos de tu paciente: ");
        System.out.print("Nombre-> ");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.print("Edad-> ");
        int edad = sc.nextInt();
        System.out.println();
        System.out.print("Expediente-> ");
        String expediente = sc.nextLine();

        Paciente p = new Paciente(nombre, edad, expediente);

        System.out.println();
        System.out.println("Resumen de datos");
        p.mostrarInformacion();

        sc.close();
    }
}