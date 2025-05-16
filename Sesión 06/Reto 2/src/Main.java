import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Ortografía", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Tecnología e IA", 1));


        System.out.println("🔠 Temas ordenados alfabéticamente:");
        Collections.sort(temas); // Usa compareTo()
        for (Tema t : temas) {
            System.out.println(t);
        }
    }
}