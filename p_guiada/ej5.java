package p_guiada;
import java.util.Locale;
import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean band = true;
        do {
            System.out.print("Ingrese un numero: ");
            int num = scan.nextInt();
            for (int i = 1; i < 11; i++) {
                System.out.println(num + "*" + i + " = " + num * i);
            }
            System.out.println("Desea ingresar otro numero? Presione 'N' para salir");
            String conf = scan.next();
            if (conf.equals("n") || conf.equals("N")) {
                band = false;
            }
        } while (band);
        System.out.println("Fin del programa.");
    }
}
