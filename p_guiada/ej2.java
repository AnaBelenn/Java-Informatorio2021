package p_guiada;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int c = scan.nextInt();
        scan.close();
        System.out.println("El primer numero ingresado es: " + a);
        System.out.println("El segundo numero ingresado es: " + b);
        System.out.println("El tercer numero ingresado es: " + c);
    }
}
