// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[10];
        int contadorVogais = 0;

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            vetor[i] = scanner.next().charAt(0);

            char c = Character.toLowerCase(vetor[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + contadorVogais);

        scanner.close();
    }
}
