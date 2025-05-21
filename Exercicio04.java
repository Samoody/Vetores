// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[8];
        double soma = 0;

        System.out.println("Digite 8 números reais:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        double media = soma / vetor.length;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A média dos números é: " + df.format(media));

        scanner.close();
    }
}
