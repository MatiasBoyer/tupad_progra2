/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matiasb.javatp3;

/**
 *
 * @author Matias
 */
public class Estudiante {
    
    public String nombre;
    public String apellido;
    public String curso;
    private double calificacion;
    
    
    public void mostrarInfo()
    {
        System.out.println("-- Estudiante --");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificacion: " + this.calificacion);
    }
    
    public void subirCalificacion(double puntos)
    {
        calificacion += puntos;
        
        if(calificacion < 0) calificacion = 0;
    }
    
    public void bajarCalificacion(double puntos)
    {
        calificacion -= puntos;
        
        if(calificacion > 10) calificacion = 10;
    }
}
