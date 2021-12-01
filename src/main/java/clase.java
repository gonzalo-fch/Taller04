import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class clase {

        //leer un archivo
        public static String leerArchivo(String ruta) {
            Path archivo = Paths.get(ruta);
            String contenido = "";
            try {
                contenido = new String(Files.readAllBytes(archivo));
            } catch (IOException e) {
                System.out.println("El archivo no pudo ser leido");
            }
            return contenido;
        }
    public static String[] arr(String ruta){
        String[] arr = leerArchivo(ruta).split("\n");
        return arr;
    }

}
