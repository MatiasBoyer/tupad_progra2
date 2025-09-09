package com.matiasb.javatp4;

public class Empleado {
    
    // static: clase
    private static int totalEmpleados;
    public static int mostrarTotalEmpleados()
    {
        return totalEmpleados;
    }
    
    // instancia
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    public Empleado(int id, String nombre, String puesto, double salario)
    {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto)
    {
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 25000;
        totalEmpleados++;
    }

    // no hay setId, los id son únicos.
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    // no hay getSalario, ya que usamos actualizarSalario
    public void actualizarSalario(int salario) {
        this.salario = salario;
    }
    
    public void actualizarSalario(double porcentaje) {
        this.salario = this.salario + this.salario * (porcentaje/100);
    }
    
    @Override
    public String toString()
    {
        return "[Empleado] ID: "+this.id+" / Nombre: "+this.nombre+" / Puesto: "+this.puesto+" / Salario: "+this.salario+" ";
    }
    
}
