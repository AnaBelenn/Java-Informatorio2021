package level2.ej6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ej6_impEmpleado {
    /*
    Se dispone de una lista de Empleados, de cada empleado se conoce:
    ○ Nombre y Apellido         ○ DNI           ○ horasTrabajadas           ○ valorPorHora
    Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora)
    de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value)
    es el sueldo calculado.
     */

    public static void main(String[] args) {
        HashSet<Empleado> empleado = new HashSet<>();
        Map<Integer, String> pagoEmpleados =  new HashMap<>();

        /*
        Cargo las listas de los empleados y sus pagos.
         */
        Empleado emp1 = new Empleado("Juan Perez", 12345678, 12, 25.3);
        empleado.add(emp1);
        pagoEmpleados.put(emp1.getDni(), " $"+emp1.getPago());

        Empleado emp2 = new Empleado("Lucas Gomez", 13467925, 13, 24);
        empleado.add(emp2);
        pagoEmpleados.put(emp2.getDni(), " $"+emp2.getPago());

        Empleado emp3 = new Empleado("Pedro Sanchez", 31649785, 15, 27.2);
        empleado.add(emp3);
        pagoEmpleados.put(emp3.getDni(), " $"+emp3.getPago());

        Empleado emp4 = new Empleado("Lucia Romero", 85967423, 18, 25);
        empleado.add(emp4);
        pagoEmpleados.put(emp4.getDni(), " $"+emp4.getPago());

        Empleado emp5 = new Empleado("Karen Gonzalez", 25368941, 11, 20);
        empleado.add(emp5);
        pagoEmpleados.put(emp5.getDni(), " $"+emp5.getPago());


        System.out.println("Lista de empleados: ");

        for(Empleado personal: empleado) {
            System.out.println("Nombre: "+ personal.getName());
            System.out.println("DNI: "+ personal.getDni());
            System.out.println("Horas trabajadas: "+ personal.getH_trab());
            System.out.println("Pago por hora: $"+ personal.getV_hora());
            System.out.println("Pago total: $"+ personal.getPago());
            System.out.println("--------------------------------------------");
        }

        System.out.println("Lista de pagos por DNI:");

        for (Integer DNI : pagoEmpleados.keySet()) {
            System.out.println("DNI: " + DNI + " - Pago: $" + pagoEmpleados.get(DNI));
        }
    }
}
