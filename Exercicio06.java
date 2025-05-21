// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {5, 8, 12, 3, 7, 9, 1, 6, 4, 10, 15, 18, 21, 25, 30};

        System.out.print("Digite um número para procurar no vetor: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado no vetor.");
        }

        scanner.close();
    }
}
