package org.elavincho;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;
        String fraseMayusculas;
        String fraseMinusculas;

        System.out.println("");
        System.out.println("Introducción a Java");
        System.out.println("");
        System.out.println("Ejercicio 2");
        System.out.println("");
        System.out.println("Escribir un programa que pida una frase y la muestre toda en mayúsculas\n" +
                " y después toda en minúsculas.\n" +
                " Nota: investigar la función toUpperCase() y toLowerCase() en Java.");
        System.out.println("");

        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        System.out.println("");
        System.out.println("Te muestro la frase en MAYUSCULAS:");
        System.out.println("");
        fraseMayusculas = frase.toUpperCase();
        System.out.println(fraseMayusculas);
        System.out.println("");
        System.out.println("Te muestro la frase en minusculas:");
        System.out.println();
        fraseMinusculas = frase.toLowerCase();
        System.out.println(fraseMinusculas);

    }
}
