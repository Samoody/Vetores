// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];

        System.out.println("Digite 10 números reais:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número da posição " + i + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("\nOrdem direta:");
        for (double v : vetor) {
            System.out.println(v);
        }

        System.out.println("\nOrdem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}