package exercicios_de_vetor;

import Vetor.Lista;

// Melhore a Class lista e implemente o método remove(T elemento),onde sera possível remover
// um elemento da lista passando o mesmo  parâmetro.

public class Exerc03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona("F");

        lista.remove("E");
        System.out.println(lista);

    }
}
