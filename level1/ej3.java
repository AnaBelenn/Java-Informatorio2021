package level1;

import java.util.Scanner;

public class ej3 {
    /*
    Dado un número entero como dato de entrada, imprimir la secuencia de números (incrementos de 1).
     */
    public static String secuencia(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        } return ("Fin del programa");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scan.nextInt();
        System.out.println(secuencia(num));
    }
}
