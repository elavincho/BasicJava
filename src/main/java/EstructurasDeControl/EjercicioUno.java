package EstructurasDeControl;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;


        System.out.println("Ejercicio 1");
        System.out.println("");
        System.out.println("Crear un programa que dado un número determine si es par o impar.");
        System.out.println("");
        System.out.println("Ingrese un número:");
        numero = leer.nextInt();


        if (numero % 2 == 0) {
            System.out.println("El número ingresado es Par.");
        } else {
            System.out.println("El número ingresado es Impar.");
        }
    }
}
