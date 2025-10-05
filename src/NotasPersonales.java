import java.io.*;

public class NotasPersonales {

    public static void main(String[] args) {
        String nombreArchivo = "mis_notas.txt";

        try (
            FileWriter fw = new FileWriter(nombreArchivo);
            
            PrintWriter pw = new PrintWriter(fw)
        ) {
            pw.println("Hoy aprendí cómo manejar archivos en Java.");
            pw.println("Entendí la diferencia entre FileWriter y BufferedReader.");
            pw.println("También practiqué el uso de try-with-resources.");

            System.out.println("Archivo escrito correctamente.\n");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        // Lectura del archivo
       
        try (
            FileReader fr = new FileReader(nombreArchivo);

            BufferedReader br = new BufferedReader(fr)
        ) {
            String linea;

            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println("Nota: " + linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
