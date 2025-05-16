//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Operador op = new Operador("Dona");
        Ambulancia ambu = new Ambulancia("Ambulancia",op);
        ambu.iniciarOperacion();
}}