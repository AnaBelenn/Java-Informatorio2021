package level1;
import java.util.Scanner;
public class ej1 {
    public static String saludo(String name) {
        return "¡Hola, "+ name +"!";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String name = scan.nextLine();
        System.out.println(saludo(name));

    }
}
