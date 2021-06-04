package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej1 {
    /*
    Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();
        boolean conf =true;
        do {
            System.out.print("Ingrese su ciudad favorita: ");
            String ciudad = scan.nextLine();
            ciudades.add(ciudad);
            System.out.println("Desea agregar otra ciudad? Presione 'N' para salir.");
            String confirm = scan.nextLine();
            if (confirm.equals("N") || confirm.equals("n")) {
                conf = false;
            }
        } while (conf);
        scan.close();
        int cont = 1;
        for (String c: ciudades) {
            System.out.println("#"+ cont + ": "+ c);
            cont++;
        }
    }
}
