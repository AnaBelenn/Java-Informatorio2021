package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ej4 {
    /*
    Cargar un arrayList con 12 nombres de estudiantes (String), separarlos en 3 cursos e imprimir dichos cursos.
     */

    public static void alumnos () {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String name;
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el nombre del "+ (i+1) +"º estudiante: ");
            name = scan.nextLine();
            nombres.add(name);
        }
        /*
        Convierto el arreglo en una lista y separo con el metodo subList(from, to-1)
         */
        Arrays.asList(nombres);
        List<String> c1 = nombres.subList(0, 4);
        List<String> c2 = nombres.subList(4, 8);
        List<String> c3 = nombres.subList(8, 12);
        System.out.println("Alumnos del curso 1: ");
        for (String alum: c1) {
            System.out.println("- " + alum);
        }
        System.out.println("Alumnos del curso 2: ");
        for (String alum: c2) {
            System.out.println("- " + alum);
        }
        System.out.println("Alumnos del curso 3: ");
        for (String alum: c3) {
            System.out.println("- " + alum);
        }
    }

    public static void main(String[] args) {
        alumnos();
    }
}
