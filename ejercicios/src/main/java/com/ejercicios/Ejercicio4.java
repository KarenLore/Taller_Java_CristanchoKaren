// Ejercicio 4: Condiciones IF/ELSE - Nivel 1
package com.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0){
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
            scanner.close();
        }   
    }
}
