// Ejercicio: Generar la tabla de amortización en un préstamo bancario 
package com.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double monto = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble() / 100;

        System.out.print("Ingrese el plazo del préstamo (en años): ");
        int anios = scanner.nextInt();

        int meses = anios * 12;
        double tasaMensual = tasaAnual / 12;
        double cuotaMensual = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -meses));

        System.out.println("\nNúmero de cuota\tSaldo Inicial\tCuota Mensual\tInterés\tCapital\tSaldo Pendiente");
        double saldo = monto;

        for (int i = 1; i <= meses; i++) {
            double interes = saldo * tasaMensual;
            double capital = cuotaMensual - interes;
            saldo -= capital;

            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f%n", i, saldo + capital, cuotaMensual, interes, capital, saldo);
        }

        scanner.close();
    }
}
