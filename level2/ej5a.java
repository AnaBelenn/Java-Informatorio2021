package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class ej5a {
    /*
    Modificacion del ej5.
     */
    public static void carga_semanal() {
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<Integer> pago_xhora = new ArrayList<>();
        ArrayList<Integer> pago_xdia = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        int h_dia, p_hora, p_dia;
        int total = 0;
        /*
        Carga de la matriz por horas trabajadas.
         */
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese horas trabajadas el "+ (i+1) +"º dia: ");
            h_dia = scan.nextInt();
            horas.add(h_dia);
        }
        /*
        Carga de la matriz del valor por hora.
         */
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese pago por hora del dia "+ (i+1)+": ");
            p_hora = scan.nextInt();
            pago_xhora.add(p_hora);
        }
        /*
        Cálculo y carga de la matriz del pago total por día y sumatoria total semanal.
         */
        for (int i = 0; i<5; i++) {
            p_dia = horas.get(i) * pago_xhora.get(i);
            pago_xdia.add(p_dia);
            total += p_dia;
        }
        System.out.println("Horas trabajadas por dia: "+horas);
        System.out.println("Pago por hora de cada dia: "+ pago_xhora);
        System.out.println("Pago semanal: "+ pago_xdia);
        System.out.println("Pago total: $"+ total);
    }

    public static void main(String[] args) {
        carga_semanal();
    }
}
