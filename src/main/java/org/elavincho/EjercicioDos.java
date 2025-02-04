package org.elavincho;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Introducción a Java");
        System.out.println("");
        System.out.println("Ejercicio 2");
        System.out.println("");
        System.out.println(" Escribir un programa que pida tu nombre, lo guarde en una variable y lo\n" +
                " muestre por pantalla.");
        System.out.println("");

        Scanner leer = new Scanner(System.in);
        String nombre;

        System.out.println("¡¡Hola!! ¿Cómo te llamas?");
        System.out.println("");
        nombre = leer.next();
        System.out.println("");
        System.out.println("¿Cómo estas " + nombre + "?" + " !!es un placer conocerte¡¡");




    }
}
