package ejPropuestos;
import java.io.File;
import java.util.*;

public class ej5 {
        // Lista de empleados
    public static List<empleado> listarPersonal() {
        Scanner scan = new Scanner(System.in);
        File archivo = new File("empleados.txt");
        List<empleado> personal = new ArrayList<>();

        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            String[] eltos = linea.split(",");
            empleado per = new empleado(eltos[0], eltos[1], eltos[2], Double.parseDouble(eltos[3]));
            personal.add(per);
        }
        scan.close();
        return personal;
    }
        // Empleados cuyos apellidos comienzan con una letra dada.
    public static List<empleado> apellidos(List<empleado> lista, char letra) {
        List<empleado> salida = new ArrayList<>();
        for (empleado personal: lista) {
            if (personal.getApellido().charAt(0) == letra) {
                salida.add(personal);
            }
        }
        return salida;
    }

        // Devuelvo un diccionario clave(mayor o menor)/valor(dato-empleado) con el empleado mas joven y empleado mayor.
    public static Map<String, ArrayList<empleado>> menor_mayor(List<empleado> lista) {
        Map<String, ArrayList<empleado>> salida = new HashMap<String, ArrayList<empleado>>();
        ArrayList<empleado> mayor = new ArrayList<>();
        ArrayList<empleado> menor = new ArrayList<>();
        // Auxiliares para almacenar las edades y luego comparar.
        int mayor_edad= lista.get(0).calcularEdad();
        int menor_edad = lista.get(0).calcularEdad();

        for (empleado personal: lista) {
            int edad = personal.calcularEdad();
            // actualizo variables
            if (edad < menor_edad) {
                menor_edad = edad;
                menor.remove(menor);
                menor.add(personal);
            } else if (edad == personal.calcularEdad()) {
                menor.add(personal);
            }
            // actualizo variables
            if (edad > mayor_edad) {
                mayor_edad = edad;
                mayor.remove(mayor);
                mayor.add(personal);
            } else if (edad == personal.calcularEdad()) {
                mayor.add(personal);
            }
        }
        salida.put("Mas joven: ", menor);
        salida.put("Mayor: ", mayor);
        return salida;
    }


    public static Map<String, ArrayList<empleado>> Sueldos(List<empleado> lista) {
        Map<String, ArrayList<empleado>> salida = new HashMap<String, ArrayList<empleado>>();
        ArrayList<empleado> mayor = new ArrayList<>();
        ArrayList<empleado> menor = new ArrayList<>();
        // Auxiliares para almacenar los sueldos y luego comparar.
        Double mayor_sueldo= lista.get(0).getSueldo();
        Double menor_sueldo = lista.get(0).getSueldo();

        for (empleado personal: lista) {
            Double salario = personal.getSueldo();
            // actualizo variables
            if (salario < menor_sueldo) {
                menor_sueldo = salario;
                menor.remove(menor);
                menor.add(personal);
            } else if (salario == personal.getSueldo()) {
                menor.add(personal);
            }
            // actualizo variables
            if (salario > mayor_sueldo) {
                mayor_sueldo = salario;
                mayor.remove(mayor);
                mayor.add(personal);
            } else if (salario== personal.getSueldo()) {
                mayor.add(personal);
            }
        }
        salida.put("Menor sueldo: ", menor);
        salida.put("Mayor sueldo: ", mayor);
        return salida;
    }

    public static void ordenarLista(List<empleado> lista) {
        //No me toma SORT   -   CORREGIR
        Collections.sort(lista);
        for (empleado personal: lista) {
            System.out.println(personal.toString());
        }
    }

    public static void main(String[] args) {
        listarPersonal();
        apellidos(listarPersonal(), 'a');
        menor_mayor(listarPersonal());
        Sueldos(listarPersonal());
        ordenarLista(listarPersonal());
    }

}
