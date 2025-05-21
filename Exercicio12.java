// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] idades = new int[10];
        double[] alturas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\nDados das pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i] + ", Altura: " + alturas[i] + "m");
        }

        scanner.close();
    }
}
