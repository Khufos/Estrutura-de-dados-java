package exercicios_de_pilha;
//Conversão de decimal para binário .

import java.util.Stack;

public class Exerc07 {
    public static void main(String[] args) {
        imprimirResultado(2);
        imprimirResultado(4);
        imprimirResultado(10);
        imprimirResultado(25);
        imprimirResultado(100);

    }

    public static void imprimirResultado(int numero) {
        System.out.println(numero + " Em binário é: " + decimalBinario(numero));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }
        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();

        }
        return numBinario;
    }

}
