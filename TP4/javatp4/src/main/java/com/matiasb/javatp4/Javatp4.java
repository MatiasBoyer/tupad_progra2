package com.matiasb.javatp4;

public class Javatp4 {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Matias Boyer", "Tester");
        Empleado emp2 = new Empleado(10, "Lionel Messi", "Futbolista", 999999);
        Empleado emp3 = new Empleado(30, "Charly Garcia", "Musico", 500000);
        
        emp1.actualizarSalario(25.0);
        emp2.actualizarSalario(1500000);
        emp3.actualizarSalario(-50.0);
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        System.out.println("Total de empleados: "+Empleado.mostrarTotalEmpleados());
    }
}
