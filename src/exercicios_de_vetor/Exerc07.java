package exercicios_de_vetor;

import Vetor.Contato;
import java.util.ArrayList;
import java.util.Scanner;

public class Exerc07 extends Exerc06 {
    public static void main(String[] args) {
        // Criação de variaveis
        Scanner scan = new Scanner(System.in);

        // criar e adicionar 20 contatos
        ArrayList<Contato> ArrayList = new ArrayList<Contato>(20);

        // criar e adicionar 5 a 30 contatos
        criarcontatosDinamicamente(5, ArrayList);

        // criar um menu para que o usuário escolha a opção .
        int opc = 1;
        while (opc != 0) {
            opc = obterOpcaoMenu(scan);

            switch (opc) {
                case 1:
                    adicionarContatoFinal(scan, ArrayList);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, ArrayList);
                    break;
                case 3:
                    obtemContatoPosicao(scan, ArrayList);
                    break;
                case 4:
                    obtemContato(scan, ArrayList);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, ArrayList);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, ArrayList);
                    break;
                case 7:
                    excluirPorPosicao(scan, ArrayList);
                    break;
                case 8:
                    excluirContato(scan, ArrayList);
                    break;
                case 9:
                    imprimirTamanhoVetor(ArrayList);
                    break;
                case 10:
                    LimparVetor(ArrayList);
                    break;
                case 11:
                    imprimirVetor(ArrayList);
                    break;

                default:
                    break;
            }

        }
        System.out.println("Usuario digitou 0 programa terminado!!!");

    }

    private static void imprimirVetor(ArrayList<Contato> lista) {

        System.out.println(lista);

    }

    private static void LimparVetor(ArrayList<Contato> lista) {
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluidos ");

    }

    private static void imprimirTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("O tamanho do vetor é de :" + lista.size());

    }

    private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> ArrayList) {
        int pos = leInformacaoInt("Entre com a posição a ser removida ", scan);

        try {
            ArrayList.remove(pos);
            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida ", scan);

        try {
            Contato contato = lista.get(pos);

            lista.remove(contato);
            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);
            boolean existe = lista.contains(contato);
            if (existe) {
                System.out.println("Contato existe, seguem dados:");
                System.out.println(contato);

            } else {
                System.out.println("Contato não existe !");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.lastIndexOf(contato);
            System.out.println("Contato encontrado no índice:" + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contato);
            System.out.println("Contato encontrado na posição" + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome:", scan);
        String telefone = leInformacao("Entre com telefone:", scan);
        String email = leInformacao("Entre com email:", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome:", scan);
        String telefone = leInformacao("Entre com telefone:", scan);
        String email = leInformacao("Entre com email:", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = leInformacaoInt("Entre com  a posição para adicionar o contato:", scan);

        try {
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }

    }

    private static void criarcontatosDinamicamente(int quantContatos, ArrayList<Contato> lista) {
        Contato contato;
        for (int i = 1; i <= quantContatos; i++) {
            contato = new Contato();
            contato.setNome("Contado" + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }

}
