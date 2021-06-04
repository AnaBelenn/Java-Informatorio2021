package level1;
import java.util.Scanner;
public class ej8 {
/*
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos: ");
        System.out.print("Nombre y apellido: ");
        String name = scan.nextLine();
        System.out.print("Edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.print("Direccion: ");
        String dir = scan.nextLine();
        System.out.print("Ciudad: ");
        String cdd = scan.nextLine();
        scan.close();
        System.out.println(cdd + " - " + dir + " - " + edad + " - " + name);
    }
}
