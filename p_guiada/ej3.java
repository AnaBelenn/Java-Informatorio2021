package p_guiada;
import java.util.Scanner;
public class ej3 {
    /*
    Debemos clasificar el resultado de una evaluación.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean band = true;
        do {
            System.out.print("Ingrese la calificación del alumno: ");
            int a = scan.nextInt();
            scan.close();
            if (a <= 59) {
                System.out.println("Desaprobado");
            } else if (a <= 74) {
                System.out.println("Bueno");
            } else if (a<= 84) {
                System.out.println("Distinguido");
            } else if (a <= 92) {
                System.out.println("Sobresaliente");
            } else {
                System.out.println("Excelente");
            }
            System.out.println("Desea ingresar otra calificacion? Presione 'N' para salir");
            String conf = scan.next();
            if (conf.equals("n") || conf.equals("N")) {
                band = false;
            }
        } while (band);

    }
}
