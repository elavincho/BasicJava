package EstructurasDeControl;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase;

        System.out.println("Ejercicio 2");
        System.out.println("");
        System.out.println("Crear un programa que pida una frase y si esa frase es igual a “eureka” el\n" +
                " programa pondrá un mensaje de Correcto, sino mostrará un mensaje de\n" +
                " Incorrecto. Nota: investigar la función equals() en Java.");
        System.out.println("");
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto.");
        }else {
            System.out.println("Incorrecto.");
        }
    }
}
