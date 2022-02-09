package exercicios_de_vetor;

import Vetor.Lista;

import java.util.ArrayList;

public class Exerc05 {

    // Melhore a classe Lista e Implemente o método limpar,
    // onde todos os elementos da lista são removidos. Esse
    // método é semelhante ao método clear da classe ArrayList.

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("K");
        lista.adiciona("P");

        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);

    }

}
