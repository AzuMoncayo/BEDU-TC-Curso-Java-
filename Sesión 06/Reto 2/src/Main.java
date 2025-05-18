import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Educación emocional", 2));

        System.out.println("🔠 Temas ordenados alfabéticamente:");
        Collections.sort(temas); // Usa compareTo()
        for (Tema t : temas) {
            System.out.println(t);
        }

        System.out.println("\n📊 Temas ordenados por prioridad:");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temas) {
            System.out.println(t);
        }

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");
        recursos.put("Educación emocional", "https://recursos.edu/emocional");

        System.out.println("\n📚 Recursos por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println(titulo + " → " + recursos.get(titulo));
        }
    }
}
