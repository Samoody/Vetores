// Nome: Samuel Kleber Vieira Silva
// RA: 12123150
// Data: 21/05/2025

public class Exercicio11 {
    public static void main(String[] args) {
        String[] palavras = {"Olá", "mundo", "em", "Java"};

        String resultado = "";
        for (String palavra : palavras) {
            resultado += palavra + " ";
        }

        System.out.println("Frase completa: " + resultado.trim());
    }
}
