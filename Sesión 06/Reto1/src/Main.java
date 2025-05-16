import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> muestras = new ArrayList<>();
        muestras.add("M1");
        muestras.add("M1");
        muestras.add("M3");
        muestras.add("M6");
        muestras.add("M5");


        for(String m : muestras){
            System.out.println("* LIST: "+m);
        }

        Set<String> muestrasUnicas = new HashSet<>(muestras);

        for (String mU : muestrasUnicas){
            System.out.println("* HASH: "+mU);
        }

        Map<String,String> asociaID = new HashMap<>();
        asociaID.put("M-001", "Dr. Garcia");
        asociaID.put("M-002", "Dr. Lopez");
        asociaID.put("M-003", "Dr. Hernandez");
        asociaID.put("M-004", "Dr. Monca");
        asociaID.put("M-005", "Dr. Sanchez");

        System.out.println("ID muestras e investigador");
        for (Map.Entry<String, String> entrada : asociaID.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // 🔎 Buscar descripción a partir del código
        String codigoBuscado = "M-003";
        System.out.println("\n🔍 Descripción de la muestra " + codigoBuscado + ": " + asociaID.get(codigoBuscado));
    }

}