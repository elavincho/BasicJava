package EstructurasDeControl;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Ejercicio 4");
        System.out.println("");
        System.out.println("Escriba un programa que pida una frase o palabra y valide si la primera\n" +
                " letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de\n" +
                " imprimir un mensaje por pantalla que diga “CORRECTO”, en caso\n" +
                " contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función\n" +
                " Substring y equals() de Java.");
        System.out.println("");

        System.out.println("Ingrese una Frase:");
        frase = leer.nextLine();
        frase = frase.toUpperCase();

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("La frase ingresada es: " + frase);
            System.out.println("Correcto. La frase empieza con A.");
        }else {
            System.out.println("La frase ingresada es: " + frase);
            System.out.println("Incorrecto. La frase debe empezar con A.");
        }

    }
}
