package level2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class ej3 {
    /*
    Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores,
    no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar
    (mezclar) el arrayList y volver a imprimir.
     */
    public static ArrayList<Integer> cartas() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> cartas = new ArrayList<>();
        for (int i = 1; i<14; i++) {
            cartas.add(i);
        }
        return cartas;
    }
    public static void imprimirCartas(ArrayList<Integer> cartas) {
        for (int carta: cartas) {
            if (carta==13) {
                System.out.println(carta);
            } else {
                System.out.print(carta + ", ");
            }
        }
    }

    public static void impInverso(ArrayList<Integer> cartas) {
        for (int i = (cartas.size() - 1); i>=0; i--) {
            if (cartas.get(i)==1) {
                System.out.println(cartas.get(i));
            } else {
                System.out.print(cartas.get(i) + ", ");
            }
        }
    }

    public static void mezcla(ArrayList<Integer> cartas) {
        Arrays.asList(cartas);
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }

    public static void main(String[] args) {
        cartas();
        System.out.println("Cartas: ");
        imprimirCartas(cartas());
        System.out.println("------------------------------");
        System.out.println("Orden inverso: ");
        impInverso(cartas());
        System.out.println("------------------------------");
        System.out.println("Mescla: ");
        mezcla(cartas());
        System.out.println("---------------");
    }
}
