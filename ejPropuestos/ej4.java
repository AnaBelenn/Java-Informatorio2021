package ejPropuestos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej4 {
    /*
    Teniendo una lista de objetos Empleado, cargar la misma en un archivo empleado.txt.
     */
    public static void escribirEmpleado(List<String> lista) throws IOException {
        FileWriter archivo = new FileWriter("C:\\Users\\Admin\\Desktop\\empleado.txt");
        for (String personal: lista) {
            archivo.write(personal+"\r\n");
        }
        archivo.close();
        System.out.println("Archivo creado correctamente.");
    }

    
        public static void listaEmpleados() throws IOException {
        Scanner scan = new Scanner(System.in);
        List<String> personal = new ArrayList<String>();
        personal.add("Persona1");
        personal.add("Persona2");
        personal.add("Persona3");
        scan.close();
        escribirEmpleado(personal);
    }

    public static void main(String[] args) throws IOException {
        listaEmpleados();
    }

}
