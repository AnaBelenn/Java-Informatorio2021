package level1;

import java.util.Scanner;

public class ej4recursivo {
    public static int factorial(int num) {
            if (num == 0) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int num = scan.nextInt();
        System.out.println("El factorial de "+ num +" es "+ factorial(num));
    }

}
