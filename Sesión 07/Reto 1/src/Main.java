import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main{

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("config", "parametros.txt");

        guardarParametros(rutaArchivo);
        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ El archivo fue creado correctamente.");
            leerParametros(rutaArchivo);
        } else {
            System.out.println("❌ El archivo no fue encontrado.");
        }
    }

    public static void guardarParametros(Path ruta) {
        try {
            if (!Files.exists(ruta.getParent())) {
                Files.createDirectories(ruta.getParent());
            }
            String parametros = """
                    Tiempo de ciclo: 55.8 segundos
                    Velocidad de línea: 1.2 m/s
                    Número de estaciones: 8
                    """;

            Files.write(ruta, parametros.getBytes());
            System.out.println("📝 Parámetros guardados en: " + ruta);

        } catch (IOException e) {
            System.err.println("❌ Error al guardar parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros(Path ruta) {
        try {
            String contenido = Files.readString(ruta);
            System.out.println("\n📄 Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.err.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
