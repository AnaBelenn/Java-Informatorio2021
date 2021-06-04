package level1;

import java.util.Scanner;

public class ej6 {
    /*
    Aolicitar 2 números enteros y realizar la operación de potencia.
     */
    public static int potencia(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a * potencia(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el numero base: ");
        int base = scan.nextInt();
        System.out.print("Ingrese el numero de la potencia: ");
        int pot = scan.nextInt();
        System.out.println(base +" elevado a "+ pot +" es "+ potencia(base, pot));
    }
}
