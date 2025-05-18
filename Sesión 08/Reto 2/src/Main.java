import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> consumosRegistrados = new HashSet<>();
        final int NUM_SERVIDORES = 2;

        System.out.println("🔍 Ingrese el consumo de CPU (%) de " + NUM_SERVIDORES + " servidores:");

        int contador = 0;
        while (contador < NUM_SERVIDORES) {
            System.out.print("Servidor " + (contador + 1) + ": ");

            try {
                String entrada = scanner.nextLine();
                double consumo = Double.parseDouble(entrada);

                if (consumo < 0 || consumo > 100) {
                    System.out.println("❌ El valor debe estar entre 0 y 100.");
                    continue;
                }

                if (consumosRegistrados.contains(consumo)) {
                    System.out.println("⚠️ Valor duplicado. Ya fue registrado.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("🚨 Consumo crítico detectado: " + consumo + "%");
                }

                consumosRegistrados.add(consumo);
                System.out.println("✅ Registro aceptado.");
                contador++;

            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada no válida. Ingrese un número.");
            } catch (ConsumoCriticoException e) {
                System.out.println(e.getMessage());
            } finally {
            }
        }

        scanner.close();
        System.out.println("\n📊 Monitoreo finalizado. Valores registrados:");
        for (double valor : consumosRegistrados) {
            System.out.println("🔸 " + valor + "%");
        }
    }
}
