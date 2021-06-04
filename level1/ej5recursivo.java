package level1;

import java.util.Scanner;

public class ej5recursivo {
    /*
    Calculo el producto con recursividad para suma sucesiva.
     */
    public static int producto(int a, int b) {
        if (a == 1){
            return b;
        } else {
            return b + producto(a-1, b);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();
        System.out.println(a +" * "+ b +" = "+ producto(a, b));
    }
}
