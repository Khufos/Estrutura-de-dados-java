package exercicios_de_pilha;
//Escreva um programa para verificar se uma expressão matemática tem os

import javax.swing.text.StyledEditorKit.BoldAction;

import Pilha.Pilha;

//parênteses agrupados de forma correta,isto é :
// (1) se o número de parênteses á esquerda e á direita são iguais e;
// (2) se todo parêntese aberto é seguido posteriomente por um fechamento de parênteses.

// Veja alguns exemplos:
// - As expressões ((A+B)) ou A+B(violam a condição)
// - As expressões )A+B( - C ou (A+B)) - (C+D violam a condição 2 
// - A expressão((A+B)+D) está ok.

public class Exerc06 {
    public static void main(String[] args) {
        imprimeResul("A + B");
        imprimeResul("A + B  + (C - D )");
        imprimeResul("{[()]}[](){()}");
        imprimeResul("{[(] }[](){()}");
        imprimeResul("A + B  + C - D )");

    }

    public static void imprimeResul(String expressao) {
        System.out.println(expressao + " está balanceado? " + verificSimbolo(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificSimbolo(String expressao) {
        Pilha<Character> pilha = new Pilha<Character>();
        int index = 0;
        char simbolo, topo;
        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilha();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }

        return true;

    }
}
