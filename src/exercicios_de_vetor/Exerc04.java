package exercicios_de_vetor;

import Vetor.Lista;

//Melhore a class Lista e implemente o método obtém(int posicao),
//onde sera  possível obter o elemento dada uma posicão do vetor,
//esse método é semelhante ao método get(int posicao) da class Array 

public class Exerc04 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona("F");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));

    }
}
