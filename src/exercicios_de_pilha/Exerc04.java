package exercicios_de_pilha;

import java.util.Stack;

//Repita o mesmo processo do exercicio anterior, porém ultilizando a classe Stack da Api java.
// 1 crie uma pilha com capacidade para 20 livros
// 2 insira 6 livros na pilha; cada livro contém nome, isbn, ano de lançamento e autor
// 3 crie um exemplo para ultilizar cada método de classe Pilha

public class Exerc04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<Livro>();

        Livro livro1 = new Livro();
        livro1.setNome("Mir4 livro do NTF");
        livro1.setAutor("Japones");
        livro1.setAnoLancamento(2000);
        livro1.setIsbn("0");

        Livro livro2 = new Livro();
        livro2.setNome("A tempora de beleza");
        livro2.setAutor("Brazil");
        livro2.setAnoLancamento(2001);
        livro2.setIsbn("1");

        Livro livro3 = new Livro();
        livro3.setNome("Livro");
        livro3.setAutor("alemanha");
        livro3.setAnoLancamento(2003);
        livro3.setIsbn("2");

        Livro livro4 = new Livro();
        livro4.setNome("Angel and Demon");
        livro4.setAutor("Unknow");
        livro4.setAnoLancamento(2004);
        livro4.setIsbn("3");

        Livro livro5 = new Livro();
        livro5.setNome("kbmp");
        livro5.setAutor("Machine");
        livro5.setAnoLancamento(2005);
        livro5.setIsbn("4");

        System.out.println("Pilha de livros criada");
        System.out.println("Empilhando livros:");
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);

        System.out.println("livros foram empilhados:" + pilha.size());
        System.out.println(pilha);
        System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.isEmpty());
        System.out.println("Espiando o topo da pilha:" + pilha.peek());
        System.out.println("Desempilhando livros da pilha:");

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro" + pilha.pop());

        }
        System.out.println("Todos os livros foram desempilhados,pilha vazia:" + pilha.isEmpty());

    }
}
