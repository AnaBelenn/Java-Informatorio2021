package level1;

import java.util.Scanner;

public class ej5 {
    /*
    Solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas.
     */
    public static int producto(int a, int b) {
        int result = 0;
        for (int i = 1; i <= b; i++){
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();
        System.out.println(a +" * "+ b +" = "+ producto(a,b));
    }
}
