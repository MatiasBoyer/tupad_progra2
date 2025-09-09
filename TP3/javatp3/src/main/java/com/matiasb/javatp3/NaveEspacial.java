package com.matiasb.javatp3;

public class NaveEspacial {
    
    public String nombre;
    private int combustible = 50;
    private boolean despegado = false;
    
    public void mostrarEstado()
    {
        System.out.println("-- Nave Espacial --");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Combustible: " + this.combustible);
    }
    
    public void despegar()
    {
        if(this.combustible <= 50)
        {
            System.out.println("No hay combustible suficiente.");
            return;
        }
        
        this.combustible -= 50;
        this.despegado = true;
        System.out.println("Despegue! -50 de combustible por despegar.");
    }
    
    public void avanzar(int distancia)
    {
        if(!this.despegado)
        {
            System.out.println("La nave todavía no despegó");
            return;
        }
        
        int gasto_combustible = distancia * 2;
        if(gasto_combustible > this.combustible)
        {
            System.out.println("No hay combustible suficiente");
            return;
        }
        
        this.combustible -= gasto_combustible;
        System.out.println("Gaste "+gasto_combustible+" avanzando "+distancia+" unidades.");

    }
    
    public void recargarCombustible(int cantidad)
    {
        if((this.combustible + cantidad) > 100)
        {
            System.out.println("La carga de combustible supera el máximo");
            return;
        }
        
        this.combustible += cantidad;
        System.out.println("Recargo "+cantidad+". El total ahora es "+this.combustible);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
