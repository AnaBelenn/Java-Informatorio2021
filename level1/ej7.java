package level1;
import java.util.Scanner;
public class ej7 {
    /*
    Dado un String de entrada en minúsculas convertirlo a mayúsculas sin librerias.
     */
    public static int DIFF = 32;
    public static String convertir(String str){
        StringBuilder sb = new StringBuilder();
        for (char letra : str.toCharArray()) {
            if (Character.isLowerCase(letra)) {
                sb.append((char) (letra - DIFF));
            } else {
                sb.append(letra);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una oracion: ");
        String oracion = scan.nextLine();
        System.out.println("Convirtiendo el texto en mayusculas...");
        System.out.println(convertir(oracion));
    }
}
