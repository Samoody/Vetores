// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[6];
        int soma = 0;

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
