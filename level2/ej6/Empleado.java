package level2.ej6;

public class Empleado {
    private String name;
    private int dni;
    private int h_trab;
    private double v_hora;

    public Empleado(String name, int dni, int h_trab, double v_hora) {
        this.name = name;
        this.dni = dni;
        this.h_trab = h_trab;
        this.v_hora = v_hora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getH_trab() {
        return h_trab;
    }

    public void setH_trab(int h_trab) {
        this.h_trab = h_trab;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getV_hora() {
        return v_hora;
    }

    public void setV_hora(double v_hora) {
        this.v_hora = v_hora;
    }

    public double getPago(){
        return this.h_trab * this.v_hora;

    }
}

