package level2;
import java.util.ArrayList;
import java.util.Scanner;

public class ej2 {
    /*
    Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al
    final. Iterar e imprimir los elementos de la lista y el tamaño de la misma.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i= 0; i<5; i++) {
            System.out.print("Ingrese el "+ (i+1) +"º numero: ");
            int num = scan.nextInt();
            numeros.add(num);
        }
        System.out.println("Lista de numeros: ");
        for (int nro: numeros) {
            System.out.println(nro);
        }
        System.out.println("Tamaño de la lista: "+ numeros.toArray().length);
        System.out.println("----------------------------------------");
        System.out.print("Numero que desea agregar al comienzo de la lista: ");
        int a = scan.nextInt();
        numeros.add(0, a);
        System.out.print("Numero que desea agregar al final de la lsita: ");
        int b = scan.nextInt();
        numeros.add(b);
        /*
        lista ya modificada.
         */
        System.out.println("Lista modificada:");
        for (int nro: numeros) {
            System.out.println(nro);
        }
        System.out.println("Tamaño de la lista luego de la modificacion: "+ numeros.toArray().length);
        scan.close();
    }
}
