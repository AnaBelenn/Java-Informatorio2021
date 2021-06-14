package ejPropuestos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej3 {
    /*
    Dado un archivo de texto, crear una función que lea todos los nombres de los alumnos y los imprima por pantalla.
    - Los nombres fueron generados con *generatedata.com
     */

    public static void alumnos() throws IOException {
        BufferedReader arc = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\alumnos.txt"));
        String linea = arc.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = arc.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        alumnos();
    }
}
