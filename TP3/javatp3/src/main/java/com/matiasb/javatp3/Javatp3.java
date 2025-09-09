/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.matiasb.javatp3;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Javatp3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Ejercicio = input.nextInt(); input.nextLine();
        System.out.println("Ejecutando el ejercicio " + Ejercicio);
        
        if (Ejercicio == 1) EJ1();
        else if (Ejercicio == 2) EJ2();
        else if (Ejercicio == 3) EJ3();
        else if (Ejercicio == 4) EJ4();
        else if (Ejercicio == 5) EJ5();
        else System.out.println("El ejercicio no existe");
    }
    
    public static void EJ1()
    {
        Estudiante estudiante = new Estudiante();
        
        estudiante.nombre = "Matias";
        estudiante.apellido = "Boyer";
        estudiante.curso = "Progra II";
        estudiante.mostrarInfo();
        
        estudiante.subirCalificacion(10);
        estudiante.mostrarInfo();
        
        estudiante.bajarCalificacion(5);
        estudiante.mostrarInfo();
    }
    
    public static void EJ2()
    {
        Mascota mascota = new Mascota();
        mascota.nombre = "Felipe";
        mascota.especie = "Perro";
        mascota.mostrarInfo();
        
        for(int i = 0; i < 5; i++)
        {
            mascota.cumplirAnios();
            mascota.mostrarInfo();
        }
    }
    
    public static void EJ3()
    {
        Libro libro = new Libro();
        
        // datos correctos
        libro.setTitulo("El eternauta");
        libro.setAutor("Hector German Oesterheld");
        
        // tarea - intentar modificar el año con un valor inválido
        libro.setAñoPublicacion(2027);
        libro.setAñoPublicacion(1000);
        
        // tarea - luego con uno válido
        libro.setAñoPublicacion(1957);
        
        libro.mostrarInfo();
    }
    
    public static void EJ4()
    {
        Gallina pedro = new Gallina();
        pedro.idGallina = 1;
        
        Gallina enrique = new Gallina();
        enrique.idGallina = 2;
        
        pedro.envejecer();
        pedro.ponerHuevo();
        pedro.ponerHuevo();
        pedro.ponerHuevo();
        
        enrique.envejecer();
        enrique.envejecer();
        enrique.envejecer();
        enrique.ponerHuevo();
        
        pedro.mostrarEstado();
        enrique.mostrarEstado();        
    }
    
    public static void EJ5()
    {
        // creo una nave, tiene combustible 50
        NaveEspacial saturn_v = new NaveEspacial();
        saturn_v.setNombre("Saturn V");
        
        // intento avanzar sin despegar
        saturn_v.avanzar(1);
        
        // recargo 55 de combustible, supera el limite
        saturn_v.recargarCombustible(55);

        // recargo 50 de combustible, llega a 100
        saturn_v.recargarCombustible(50);
        
        // despego, nos gasta 50 de combustible
        saturn_v.despegar();
        
        // intento avanzar 26, supera el gasto de combustible
        saturn_v.avanzar(26);
        
        // avanzo 25, gasta 50 de combustible
        saturn_v.avanzar(25);
        
        // muestro el estado. debería decir 0 combustible
        saturn_v.mostrarEstado();
    }
}
