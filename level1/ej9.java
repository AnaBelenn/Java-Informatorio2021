package level1;

import java.util.Scanner;

public class ej9 {
    /*
    Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
     */
    public static int cantidadLetra(String texto, char a) {
        int cont = 0;
        for (int i=0; i<texto.length(); i++) {
            if (texto.charAt(i) == a) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una oracion: ");
        String texto = scan.nextLine();
        System.out.print("Letra que desea contar su repeticion: ");
        String a = scan.next();
        char letra = a.charAt(0);
        System.out.println("La letra '" + a + "' se repite "+ cantidadLetra(texto, letra) + " veces.");
    }
}
