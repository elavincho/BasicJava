package JavaBasic;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Introducción a Java");
        System.out.println("");
        System.out.println("Ejercicio 1");
        System.out.println(" Escribir un programa que pida dos números enteros por teclado y calcule\n" +
                " la suma de los dos. El programa deberá después mostrar el resultado de\n" +
                " la suma.");

        System.out.println("");

        Scanner leer = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        int suma;

        System.out.println("Ingrese el primer número:");
        primerNumero = leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese el segundo número:");
        segundoNumero = leer.nextInt();

        System.out.println("");
        suma = primerNumero + segundoNumero;
        System.out.println("La suma del primer número + el segundo número es: " + suma);






    }
}