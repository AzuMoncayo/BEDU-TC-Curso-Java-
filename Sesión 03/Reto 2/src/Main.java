//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura(1800,"Servicio de mantenimiento","MOGD0212");
        Factura f2 = new Factura(800, "Reparación de laptop", null);

        System.out.println(f1.mostrarInformacion());
        System.out.println(f2.mostrarInformacion());

    }
}