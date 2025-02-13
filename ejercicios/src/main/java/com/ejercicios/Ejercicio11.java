// Ejercicio: Simulación de depositos en una cuenta bancaria con intereses 
package com.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Ingrese el depósito mensual fijo: ");
        double depositoMensual = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteresAnual = scanner.nextDouble() / 100;

        System.out.print("Ingrese el número de meses de simulación: ");
        int meses = scanner.nextInt();

        double saldo = saldoInicial;
        double tasaMensual = tasaInteresAnual / 12;

        System.out.println("\nMes\tSaldo Inicial\tDepósito\tInterés\tSaldo Final");
        for (int i = 1; i <= meses; i++) {
            double interes = saldo * tasaMensual;
            saldo += depositoMensual + interes;
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f%n", i, saldo - depositoMensual - interes, depositoMensual, interes, saldo);
        }

        scanner.close();
    }
  }
}
