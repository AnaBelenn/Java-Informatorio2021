package p_guiada;
import java.util.Scanner;
public class ej6 {
    /*
    Realizar un programa que nos pregunta si queremos realizar una operación dada o si deseamos salir/terminar el programa.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean band = true;
        do {
            System.out.print("Ingrese un numero: ");
            int a = scan.nextInt();
            System.out.println("El numero ingresado es: " + a);
            System.out.println("Desea ingresar otro numero? Presione 'N' para salir.");
            String conf = scan.next();
            if (conf.equals("n") || conf.equals("N")) {
                band = false;
            }
        } while (band);
        scan.close();
        System.out.println("Fin del programa.");
    }
}

