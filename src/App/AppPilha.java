package App;

import java.util.Stack;

import Pilha.*;

public class AppPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }
        /*
         * System.out.println("Valores dentro da pilha :" + pilha);
         * System.out.println("Qual é o tamanho da pilha:" + pilha.tamanho());
         * System.out.println("A pilha está vazia?" + pilha.estaVazia());
         * System.out.println("Qual é o topo da pilha:" + pilha.topo());
         * System.out.println("Desempilhando:" + pilha.desempilhar())
         */

        /* Api java */
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Está vazia ? " + stack.empty());
        /* Empilhar = push */
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Elementos da Pilha:" + stack);
        System.out.println("Está vazia? " + stack.empty());
        System.out.println("Tamanho:" + stack.size());
        System.out.println("Espiar:" + stack.peek());
        System.out.println("Desempilhar:" + stack.pop());
        System.out.println("Elementos da Pilha:" + stack);

    }

}
