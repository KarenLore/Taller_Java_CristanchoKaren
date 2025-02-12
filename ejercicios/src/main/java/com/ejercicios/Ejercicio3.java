// Ejercicos 3: Entrada de Datos con Scanner - Nivel 0
package com.ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            System.out.println("Hola " + nombre + ", tienes " + edad);
        }
    }
}
