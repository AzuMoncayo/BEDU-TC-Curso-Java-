//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Factura f1 = new Factura("F001", "Dona Perez", 15000);
        Factura f1 = new Factura("F001", "Santi Roman", 50090);
        Factura f2 = new Factura("F001", "comercial ABC", 50090);

        f1.toString();
        f2.toString();

        if(f1.equals(f1,f2) == true){
            System.out.println("Facturas iguales");
        }else{
            System.out.println("Facturas distintas");
        }
    }
}