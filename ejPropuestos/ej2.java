package ejPropuestos;

import java.util.Scanner;

public class ej2 {
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scan.nextInt();
        System.out.println("Factorial de "+ a +": "+factorial(a));
    }
}
