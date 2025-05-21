// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];
        int pares = 0;

        System.out.println("Digite 12 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);

        scanner.close();
    }
}
