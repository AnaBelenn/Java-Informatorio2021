package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class ej5 {
    /*
    Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas
    semanal de un empleado, se debe generar otra lista que contenga los totales e imprimir el total final a cobrar.
    [6, 7, 8, 4, 5]
    [350, 345, 550, 600, 320]
    [2100, 2415, 4400, 2400, 1600]
    Total Final: $ 12915
     */

    public static void main(String[] args) {
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<Integer> pago_xhora = new ArrayList<>();
        ArrayList<Integer> pago_xdia = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        int h_dia, p_hora, p_dia;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese horas trabajadas el "+ (i+1) +"º dia: ");
            h_dia = scan.nextInt();
            horas.add(h_dia);
            System.out.print("Ingrese pago por hora del dia "+ (i+1)+": ");
            p_hora = scan.nextInt();
            pago_xhora.add(p_hora);
            p_dia = h_dia * p_hora;
            pago_xdia.add(p_dia);
            total += p_dia;
        }
        int dia = 1;
        for (int elto: pago_xdia) {
            System.out.println("Pago del dia "+ dia +": $"+elto);
            dia++;
        }
        System.out.println("Total final: $"+ total);
    }
}
