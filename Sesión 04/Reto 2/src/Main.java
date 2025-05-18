//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("💰 Declaración de impuestos 💰");
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("MOGD0212", 3700.0);

        System.out.println("📜 Crear una cuenta fiscal 📜");
        CuentaFiscal cuenta = new CuentaFiscal("MOGD0212", 8080.0);


        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfc() +
                " por $" + declaracion.monto());

        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() +
                ", saldo disponible: $" + cuenta.getSaldoDisponible());


        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);


    }
}