package exercicios_de_fila;

import java.util.LinkedList;
import java.util.Queue;

public class Exerc05 {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);

        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.remove());

        System.out.println(fila);
    }

}
