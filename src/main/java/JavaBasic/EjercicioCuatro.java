package JavaBasic;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double centigrados;
        double fahrenheit;

        System.out.println("");
        System.out.println("Introducción a Java");
        System.out.println("");
        System.out.println("Ejercicio 4");
        System.out.println();
        System.out.println("Dada una cantidad de grados centígrados se debe mostrar su\n" +
                " equivalente en grados Fahrenheit. La fórmula correspondiente es: F  32\n" +
                " + (9 * C / 5).");
        System.out.println("");

        System.out.println("Ingrese la Temperatura en Grados Centigrados:");
        centigrados = leer.nextDouble();
        System.out.println("");
        System.out.println("Ingresó " + centigrados + "° C.");
        System.out.println("");
        fahrenheit = 32 + (9 * (centigrados/5));
        System.out.println("Su equivalente en grados Fahrenheit es: " + fahrenheit + "° F.");

    }
}