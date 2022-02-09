package exercicios_de_vetor;

import Vetor.Lista;

//Melhore a classe Lista e implemente o método contém,
//semelhante ao método contains da classe ArrayList

public class Exerc01 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("D"));

    }

}