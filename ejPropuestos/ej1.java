package ejPropuestos;

import java.util.Scanner;

public class ej1 {
    /*
    Crear una función que realice la suma de 2 números dados.
     */
    public static void suma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();
        scan.close();
        System.out.println(a +" + "+ b +" = "+ (a+b));
    }

    public static void main(String[] args) {
        suma();
    }
}
