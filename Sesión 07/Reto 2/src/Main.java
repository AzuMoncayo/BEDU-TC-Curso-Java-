import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String archivoLog = "errores.log";
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoLog))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            System.out.println("📋 Resumen del Análisis:");
            System.out.println("Líneas leídas: " + totalLineas);
            System.out.println("Errores encontrados: " + totalErrores);
            System.out.println("Advertencias encontradas: " + totalWarnings);

            double porcentaje = 0;
            if (totalLineas > 0) {
                porcentaje = ((double)(totalErrores + totalWarnings) / totalLineas) * 100;
            }

            System.out.printf("Porcentaje de líneas con ERROR o WARNING: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.err.println("❌ Ocurrió un error al leer el archivo: " + e.getMessage());
            guardarErrorEnRegistro(e.getMessage());
        }
    }

    private static void guardarErrorEnRegistro(String mensajeError) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("registro_fallos.txt", true))) {
            escritor.write("Error al analizar el archivo: " + mensajeError);
            escritor.newLine();
        } catch (IOException e) {
            System.err.println("❌ No se pudo escribir en el registro de fallos: " + e.getMessage());
        }
    }
}
