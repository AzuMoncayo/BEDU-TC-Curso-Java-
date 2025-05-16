//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura(1800,"Colegiatura de TECNOLOCHICAS","MOGD0212");
        Factura f2 = new Factura(19292, "Transportes", null);

        if(f1.getRFC().isPresent()){
            System.out.println("Monto: "+f1.getMonto());
            System.out.println("Descripcion: "+f1.getDescripcion());
            System.out.println("RFC: "+f1.getRFC());
            System.out.println();

        }else{
            System.out.println("Monto: "+f1.getMonto());
            System.out.println("Descripcion: "+f1.getDescripcion());
            System.out.println("Sin RFC disponible ");
        }
        if(f2.getRFC().isPresent()){
            System.out.println("Monto: "+f2.getMonto());
            System.out.println("Descripcion: "+f2.getDescripcion());
            System.out.println("RFC: "+f2.getRFC());
        }else {
            System.out.println();
            System.out.println("Monto: "+f2.getMonto());
            System.out.println("Descripcion: "+f2.getDescripcion());
            System.out.println("Sin RFC disponible ");
        }


    }
}