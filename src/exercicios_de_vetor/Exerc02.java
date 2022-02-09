package exercicios_de_vetor;

import Vetor.Lista;
import java.util.ArrayList;

//Melhore a classe Lista e implemente o método ultimoIndice
//semelhante ao método lastIndexOf da classe ArrayList

public class Exerc02 {
    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<String>(5);
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("A");
        // ela retorna o indico do ultimo elemento especificado na lista ou
        // entao retorna menos -1 se está lista não contém o elemento .
        System.out.println("Aqui é Arraylist:" + arraylist.lastIndexOf("A"));

        ///
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona("F");
        System.out.println("Aqui é Lista:" + lista.UltimoLast("A"));
        lista.removeE("A");
        lista.removeE("C");
        lista.removeE("E");
        System.out.println(lista);
    }

}
