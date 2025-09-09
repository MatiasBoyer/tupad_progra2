package com.matiasb.javatp3;

public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    
    public void mostrarInfo()
    {
        System.out.println("-- Libro --");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año publicación: " + this.añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if(añoPublicacion < 1500 || 2026 < añoPublicacion)
        {
            System.out.println("'" + añoPublicacion + "' no está en el rango permitido");
            return;
        }
        this.añoPublicacion = añoPublicacion;
    }
}
