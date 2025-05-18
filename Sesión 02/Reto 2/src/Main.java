import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var saldoUsuario = 1000;
        var saldoDepositar = 0;
        var saldoRetirar = 0;

        int eleccion;

        do {
            System.out.println("\n\n *  M  E  N  U  * ");
            System.out.println("✅ 1. Consultar saldo");
            System.out.println("\uD83D\uDCB0 2. Depositar dinero");
            System.out.println("\uD83D\uDCB8 3. Retirar dinero");
            System.out.println("❌ 4. Salir");
            System.out.print("\nEleccion -> ");
            eleccion = sc.nextInt();

            switch (eleccion){
                case 1 -> {
                    System.out.println("CONSULTAR");
                    System.out.println("Saldo actual: $"+saldoUsuario);
                }
                case 2 -> {
                    System.out.println("DEPOSITAR");
                    System.out.print("Depositar ->");
                    saldoDepositar = sc.nextInt();
                    System.out.println("Saldo depositado exitosamente");
                    saldoUsuario = saldoUsuario +saldoDepositar;
                }
                case 3 -> {
                    System.out.println("RETIRAR ");
                    System.out.print("Retirar ->");
                    saldoRetirar = sc.nextInt();
                    if(saldoRetirar>saldoUsuario){
                        System.out.println("No cuentas con saldo suficiente ☹");
                    }else{
                        System.out.println("Saldo retirado exitosamente 😀");
                        saldoUsuario = saldoUsuario - saldoRetirar;
                    }
                }

                case 4 -> {
                    System.out.println("¡Gracias vuelve pronto!");
                }

                default -> {
                    System.out.println("Opción inválida");
                }

            }
        } while (eleccion != 4);


        sc.close();
    }
}