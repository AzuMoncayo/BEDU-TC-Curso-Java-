import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int eleccion;

        do{
            System.out.println();
            System.out.println(" ✈ BIENVENIDO A BEDUVUELOS ✈");
            System.out.println("¿Qué deseas realizar?");
            System.out.println("1-Reservar vuelo");
            System.out.println("2-Consultar itinerario");
            System.out.println("3-Cancelar vuelo");
            System.out.println("4-Salir");
            System.out.println();
            System.out.print("->");
            eleccion = sc.nextInt();


            switch (eleccion) {
                case 1 -> {
                    System.out.println("📝 Haz elegido reservar un vuelo");
                    Vuelo v1 = new Vuelo("XYZ008", "Corea del Sur", "12:30");
                    boolean reservar = Vuelo.reservarAsiento("Dona", "XY90");
                    if(reservar==true){
                        System.out.println("Vuelo reservado exitosamente!");
                    }else{
                        System.out.println("No hemos podido reservar tu vuelo");
                    }



                }

                case 2 ->
                        System.out.println("\uD83D\uDCDD Haz elegido consultar el itinerario\"");
                //System.out.println("Pasajero: "+p1.getNombre());
                //System.out.println("Pasaporte: "+p1.getPasaporte());


                case 3 ->
                        System.out.println("\uD83D\uDCDD Haz elegido cancelar un vuelo\"");
            }

        }while(eleccion!=4);


    }
}