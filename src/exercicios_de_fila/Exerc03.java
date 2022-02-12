package exercicios_de_fila;

import Fila.Fila;

public class Exerc03 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(1);
        fila.enfileira(2);

        System.out.println(fila.espiar());
        System.out.println(fila.toString());
    }
}
