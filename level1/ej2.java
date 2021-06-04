package level1;

import java.util.Scanner;

public class ej2 {
    /*
    Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta,
    multiplicación, división y módulo (resto de la división) de ambos números.
     */
    public static int suma(int a, int b) {
         return (a + b);
    }

    public static int resta (int a, int b) {
        return (a - b);
    }

    public static int producto (int a, int b) {
        return (a * b);
    }

    public static double division (int a, int b) {
         return a/b;
    }

    public static int modulo (int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = scan.nextInt();
        System.out.println(a + " + " + b + " = " + suma(a,b));
        System.out.println(a + " - " + b + " = " + resta(a,b));
        System.out.println(a + " * " + b + " = " + producto(a,b));
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + division(a, b));
            System.out.println(a + " modulo " + b + " = " + modulo(a, b));
        } else {
            System.out.println("No se puede dividir un numero entre cero.");
        }
    }
}
