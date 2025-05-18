import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("A) Elegir más fuerza física");
        System.out.println("B) Elegir magia y hechizos");
        System.out.print("Decisión: ");
        return scanner.nextLine().trim();
    }
}