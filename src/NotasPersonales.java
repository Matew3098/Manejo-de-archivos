import java.io.*;

public class NotasPersonales {

    public static void main(String[] args) {
        // Nombre del archivo que vamos a crear y leer
        String nombreArchivo = "mis_notas.txt";

        // -----------------------------
        // Escritura en el archivo
        // -----------------------------
        try (
            // FileWriter permite escribir caracteres en un archivo
            FileWriter fw = new FileWriter(nombreArchivo);
            
            // PrintWriter nos facilita escribir líneas completas con println()
            PrintWriter pw = new PrintWriter(fw)
        ) {
            // Escribimos 3 líneas de notas personales
            pw.println("Hoy aprendí cómo manejar archivos en Java.");
            pw.println("Entendí la diferencia entre FileWriter y BufferedReader.");
            pw.println("También practiqué el uso de try-with-resources.");

            System.out.println("Archivo escrito correctamente.\n");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        // -----------------------------
        // Lectura del archivo
        // -----------------------------
        try (
            // FileReader para leer caracteres del archivo
            FileReader fr = new FileReader(nombreArchivo);

            // BufferedReader permite leer el archivo línea por línea
            BufferedReader br = new BufferedReader(fr)
        ) {
            String linea;

            // Leemos y mostramos cada línea del archivo
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println("Nota: " + linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
