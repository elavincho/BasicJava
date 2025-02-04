package org.elavincho;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double numero;
        double doble;
        double triple;
        double raiz;

        System.out.println("");
        System.out.println("Introducción a Java");
        System.out.println("");
        System.out.println("Ejercicio 5");
        System.out.println("");
        System.out.println(" Escribir un programa que lea un número entero por teclado y muestre\n" +
                " por pantalla el doble, el triple y la raíz cuadrada de ese número.\n" +
                " Nota: investigar la función Math.sqrt().");
        System.out.println("");
        System.out.println("Ingrese un Número:");
        numero = leer.nextDouble();
        System.out.println("");
        System.out.println("Ingresaste el Número: " + numero);
        System.out.println("");
        doble = numero * 2;
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("");
        triple = numero * 3;
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("");
        raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);

    }
}
