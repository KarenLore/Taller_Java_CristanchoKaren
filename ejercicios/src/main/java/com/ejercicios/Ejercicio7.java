// Ejercicio 7: Adivina el número (Random) - Nivel 1
package com.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; 
        try(Scanner scanner = new Scanner(System.in)){
            int intento;

            System.out.println("Adivina el número entre 1 y 100");
            do {
                System.out.println("Introduce tu intento: ");
                intento = scanner.nextInt();

                if(intento < numeroSecreto){
                    System.out.println("El número es mayor");
                } else if (intento > numeroSecreto){
                    System.out.println("El número es menor.");
                } else {
                    System.out.println("Correcto, el número era: " + numeroSecreto);
                }
            } while (intento != numeroSecreto);
        }
    }
}
