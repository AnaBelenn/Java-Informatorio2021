package ejPropuestos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class empleado {
    private String nombre;
    private String apellido;
    private LocalDate fNac;
    private double sueldo;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public empleado() {
    }

    public empleado(String nombre, String apellido, String fNac, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNac = LocalDate.parse(fNac, formatter);
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int calcularEdad() {
        LocalDate f_Act = LocalDate.now();
        int edad = 0;
        if (this.fNac.getMonth().compareTo(f_Act.getMonth()) == 0) {
            // si devuelve 0, el mes coincide y comparo el dia
            if (this.fNac.getDayOfMonth()>f_Act.getDayOfMonth()) {
                // si el dia de fNac es mayor al actual, todavía no cumple años.
                edad = f_Act.getYear() - fNac.getYear() - 1;
            } else {
                // si el dia de fNac es menor al actual, ya cumplió años.
                edad = f_Act.getYear() - fNac.getYear();
            }
        } else if (this.fNac.getMonth().compareTo(f_Act.getMonth()) < 0) {
            // si devuelve -1, el mes de nacimiento es menor al mes actual por ende solo realizo una resta de los años.
            edad = f_Act.getYear() - fNac.getYear();
        } else {
            // devuelve 1, el mes de nacimiento es mayor por lo tanto todavía no cumple el año de (Act-Nac) y resto 1.
            edad = f_Act.getYear() - fNac.getYear() - 1;
        }
        return edad;
    }
    @Override
    public String toString() {
        return "Apellido y nombre: "+ this.getApellido() +", "+ this.getNombre()
                +" - Fecha de nacimiento: "+ this.getfNac()
                +" - Sueldo: $"+ this.getSueldo();
    }
}
