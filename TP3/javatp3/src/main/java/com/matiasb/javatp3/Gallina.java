package com.matiasb.javatp3;

public class Gallina {
    
    public int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void mostrarEstado()
    {
        System.out.println("-- Gallina "+idGallina+" --");
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos puestos: " + this.huevosPuestos);
    }
    
    public void ponerHuevo()
    {
        this.huevosPuestos += 1;
    }
    
    public void envejecer()
    {
        this.edad += 1;
    }

}
