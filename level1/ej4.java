package level1;

import java.util.Scanner;

public class ej4 {
    /*
    Realizar un programa que calcule el factorial de un número.
     */
    public static int factorial(int num){
        int numero = 1;
        for (int i = num; i > 0; i--) {
            numero = numero * i;
        }
        return numero;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int num = scan.nextInt();
        System.out.println("El factorial de "+ num +" es "+ factorial(num));
    }
}
