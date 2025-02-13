// Ejercicio: Cálculo de intereses compuestos sobre una inversión
package com.ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Ingrese el monto inicial de inversión: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteresAnual = scanner.nextDouble() / 100;

        System.out.print("Ingrese el número de años de inversión: ");
        int anios = scanner.nextInt();

        System.out.print("Seleccione la frecuencia de capitalización (1: Mensual, 2: Trimestral, 3: Semestral, 4: Anual): ");
        int opcion = scanner.nextInt();

        int n = switch (opcion) {
            case 1 -> 12;  // Mensual
            case 2 -> 4;   // Trimestral
            case 3 -> 2;   // Semestral
            default -> 1;  // Anual
        };

        double saldo = capitalInicial;

        System.out.println("\nAño\tCapital Inicial\tInterés Ganado\tSaldo Final");
        for (int i = 1; i <= anios; i++) {
            double interesGanado = saldo * Math.pow(1 + (tasaInteresAnual / n), n) - saldo;
            saldo += interesGanado;
            System.out.printf("%d\t%.2f\t%.2f\t%.2f%n", i, saldo - interesGanado, interesGanado, saldo);
        }
        scanner.close();
    }
  }
}
