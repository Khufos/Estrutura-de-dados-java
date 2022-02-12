package exercicios_de_fila;

import Fila.Fila;

public class Exerc02 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println("A fila está vazia? " + fila.estaVazia());
        System.out.println(fila.tamanho()); // 3
        System.out.println(fila.toString());

    }
}
