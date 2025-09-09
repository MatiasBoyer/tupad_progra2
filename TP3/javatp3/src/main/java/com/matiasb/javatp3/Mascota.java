/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matiasb.javatp3;

/**
 *
 * @author Matias
 */
public class Mascota {
    
    public String nombre;
    public String especie;
    public int edad;
    
    
    public void mostrarInfo()
    {
        System.out.println("-- Mascota --");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad);
    }
    
    public void cumplirAnios()
    {
        edad += 1;
    }
}
