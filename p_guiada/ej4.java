package p_guiada;
import java.util.Scanner;
public class ej4 {
    /*
    Dado un número de entrada entre 1 a 7, nos devuelve el dia de la semana
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean band2 = true;
        do {
            System.out.print("Ingrese un numero del 1 al 7: ");
            int dia = scan.nextInt();
            if (dia > 7 || dia < 0) {
                boolean band = true;
                while (band) {
                    System.out.println("Fuera de rango. Intente nuevamente.");
                    System.out.print("Ingrese un numero del 1 al 7: ");
                    dia = scan.nextInt();
                    if (dia < 8 && dia > 0) {
                        band = false;
                    }
                }
            }
            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miercoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
            }
            System.out.println("Desea ingresar otro numero? Presione 'N' para salir");
            String conf = scan.next();
            if (conf.equals("n") || conf.equals("N")) {
                band2 = false;
            }
        } while (band2);
        System.out.println("Fin del programa.");
    }
}
