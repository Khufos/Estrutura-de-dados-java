package exercicios_de_pilha;

import Pilha.Pilha;

public class Exerc05 {

    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("IAGO");
        imprimeResultado("PATO");
        imprimeResultado("SAPO");
        imprimeResultado("ARARA");

    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<Character>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }
        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }
        // equalsIgnoreCase IGNORA SE É A LETRA É maiúsculo e minúsculo
        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;

    }

}
