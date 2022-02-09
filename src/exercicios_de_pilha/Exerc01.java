package exercicios_de_pilha;

import java.util.Scanner;

import Pilha.Pilha;

/*
Escreva um programa que leia 10 números. Para cada número lido, verfique e codifique  de acordo
com as regras a seguir:
-Se o numero for par, empilhe na pilha;
-Se o número for impar, desempilhe um número da pilha.Caso a pilha esteja vazia ,mostre uma mensagem
Se  ao final do programa a pilha não estiver vazia, desempilhe todos os elementos,imprimindo-os na tela.
*/

public class Exerc01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.print("Entre com um número:");

            int num = scan.nextInt();

            if (num % 2 == 0) {

                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
            } else {

                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: "
                            + desempilhado);
                }
            }
        }

        System.out.println("Todos os número foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()) {

            System.out.println("Desempilhando um elemento da pilha: "
                    + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }

}
