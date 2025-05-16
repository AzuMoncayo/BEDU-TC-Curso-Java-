import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el medicamento: ");
        var nombre = sc.nextLine();

        System.out.println("Ingresa el precio unitario: ");
        double precio = sc.nextDouble();

        System.out.println("Ingresa la cantidad: ");
        int cantidad = sc.nextInt();


        var totalCliente = precio * cantidad;

        boolean descuentoSi = totalCliente > 500;

        double descuento = descuentoSi ? totalCliente * 0.15 : 0;

        var totalDescuento = totalCliente - descuento;

        System.out.println("Medicamento: "+nombre);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio unitario: $"+String.format("%.2f ",precio));
        System.out.println("Total sin descuento: $"+String.format("%.2f",totalCliente));
        System.out.println("¿Aplica descuento?"+String.format("%b",descuentoSi));
        System.out.println("Descuento: $"+String.format("%.2f",descuento));
        System.out.println("Total a pagar: "+String.format("%.2f",totalDescuento));
        sc.close();
    }
}
