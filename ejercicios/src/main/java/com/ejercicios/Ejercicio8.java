// Ejercicio 8: Subcadena
package com.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Ingrese una cadena: ");
            String s = scanner.nextLine();

            System.out.print("Ingrese el índice de inicio: ");
            int start = scanner.nextInt();

            System.out.print("Ingrese el índice de fin: ");
            int end = scanner.nextInt();

            System.out.println("Subcadena: " + s.substring(start, end));
            scanner.close();
        }
    }
}
