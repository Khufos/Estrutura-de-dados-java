package exercicios_de_pilha;
/* Utilize  a classe Pilha(criada durante as aulas) e desenvolva os 
seguintes items:
1.Crie uma pilha com capacidade para 20 livros
2.Insira 6 livros na pilha: Cada livro contém nome,isbn, ano de lançamento e autor.
3. Crie um exemplo para ullizar cada método da classe Pilha.
*/

import Pilha.Pilha;

public class Exerc03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<Livro>(20);

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
        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);

        System.out.println("livros foram empilhados:" + pilha.tamanho());
        System.out.println(pilha);
        System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.estaVazia());
        System.out.println("Espiando o topo da pilha:" + pilha.topo());
        System.out.println("Desempilhando livros da pilha:");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro" + pilha.desempilha());

        }
        System.out.println("Todos os livros foram desempilhados,pilha vazia:" + pilha.estaVazia());

    }

}
