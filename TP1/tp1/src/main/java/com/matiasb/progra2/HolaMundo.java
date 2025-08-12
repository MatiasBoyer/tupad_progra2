/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.matiasb.progra2;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class HolaMundo {
    
    public static void main(String[] args) {
        ej8();
    }
    
    public static void ej2() {
        System.out.println("¡Hola, Java! ");
    }
    
    public static void ej3() {
        String nombre = "Matias";
        int edad = 23;
        double altura = 1.70;
        boolean estudiante = true;
        
        System.out.println("Nombre" + nombre);
        System.out.println("Edad: " + edad) ;
        System.out.println("Altura: " + altura) ;
        System.out.println("Estudiante: " + estudiante);
    }
    
    public static void ej4() {
        Scanner input = new Scanner(System.in);
        String nombre = input.nextLine();
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public static void ej5() {
        Scanner input = new Scanner(System.in);
        int numero_a = input.nextInt();
        int numero_b = input.nextInt();
        
        System.out.println("A: " + numero_a);
        System.out.println("B: " + numero_b);
        
        System.out.println("Resultados entre A y B:");
        System.out.println("Suma:" + (numero_a + numero_b));
        System.out.println("Resta:" + (numero_a - numero_b));
        System.out.println("Multiplicacion: " + (numero_a * numero_b));
        System.out.println("Division: " + (numero_a / numero_b));
    }
    
    public static void ej6() {
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
    }
    
    public static void ej8() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Division utilizando int");
        int int_numero_a = input.nextInt();
        int int_numero_b = input.nextInt();
        System.out.println("Resultado: " + (int_numero_a / int_numero_b));
        
        System.out.println("Division utilizando double");
        double dbl_numero_a = input.nextInt();
        double dbl_numero_b = input.nextInt();
        System.out.println("Resultado: " + (dbl_numero_a / dbl_numero_b));
    }
}
