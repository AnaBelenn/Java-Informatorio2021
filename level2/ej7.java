package level2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ej7 {
    /*
    Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings.
    Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
    “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
    Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar
    (no se incluye en el cálculo) Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
     */
    public static String[] fizzBuzz(int a, int b) {
        ArrayList<String> arreglo = new ArrayList<>();
        for (int i=a; i<b; i++) {
            if (i%2==0 && i%3==0) {
                arreglo.add("FizzBuzz");
            } else if (i%2==0) {
                arreglo.add("Fizz");
            } else if (i%3==0) {
                arreglo.add("Buzz");
            } else {
                /*
                al ser un arreglo de tipo String, no puedo agregar solo i, así que agrego un vacio.
                 */
                arreglo.add(i+"");
            }
        }
        return arreglo.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        /*
        Comprobamos que a<b
         */
        if (a >= b) {
            System.out.println("El primer numero debe ser mayor al segundo.");
        } else {
            System.out.println(Arrays.toString(fizzBuzz(a, b)));
        }
        scan.close();
    }
}
