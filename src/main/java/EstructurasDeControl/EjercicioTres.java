package EstructurasDeControl;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase;

        System.out.println("Ejercicio 3");
        System.out.println("");
        System.out.println(" Realizar un programa que solo permita introducir solo frases o palabras\n" +
                " de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se\n" +
                " deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en\n" +
                " caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la\n" +
                " función Lenght() en Java.");

        System.out.println("");

        System.out.println("Ingrese una Frase:");
        frase = leer.nextLine();

        if (frase.length() >= 8) {
            System.out.println("Correcto. La frase tiene 8 o más caracteres.");
        } else {
            System.out.println("Incorrecto. La frase debe tener al menos 8 Caracteres.");
        }
    }
}
