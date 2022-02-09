package exercicios_de_vetor;

import Vetor.Contato;

import java.util.Scanner;
import Vetor.Lista;

public class Exerc06 {
    public static void main(String[] args) {
        // Criação de variaveis
        Scanner scan = new Scanner(System.in);

        // criar e adicionar 20 contatos
        Lista<Contato> lista = new Lista<Contato>(20);

        // criar e adicionar 5 a 30 contatos
        criarcontatosDinamicamente(5, lista);

        // criar um menu para que o usuário escolha a opção .
        int opc = 1;
        while (opc != 0) {
            opc = obterOpcaoMenu(scan);

            switch (opc) {
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimirTamanhoVetor(lista);
                    break;
                case 10:
                    LimparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;

                default:
                    break;
            }

        }
        System.out.println("Usuario digitou 0 programa terminado!!!");

    }

    private static void imprimirVetor(Lista<Contato> lista) {

        System.out.println(lista);

    }

    private static void LimparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluidos ");

    }

    private static void imprimirTamanhoVetor(Lista<Contato> lista) {
        System.out.println("O tamanho do vetor é de :" + lista.tamanho());

    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida ", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida ", scan);

        try {
            Contato contato = lista.busca(pos);

            lista.remove(contato);
            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            boolean existe = lista.contem(contato);
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

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado no índice:" + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obtemContato(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição" + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome:", scan);
        String telefone = leInformacao("Entre com telefone:", scan);
        String email = leInformacao("Entre com email:", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome:", scan);
        String telefone = leInformacao("Entre com telefone:", scan);
        String email = leInformacao("Entre com email:", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = leInformacaoInt("Entre com  a posição para adicionar o contato:", scan);

        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }

    }

    protected static String leInformacao(String msg, Scanner scan) {

        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }

    protected static int leInformacaoInt(String msg, Scanner scan) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {

            try {
                System.out.println(msg);
                String entrada = scan.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada é invalida!, Digite novamente....!");
            }

        }

        return num;

    }

    protected static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opc = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println("============================");
            System.out.println("Digite a opção desejada:");
            System.out.println("============================\n");

            System.out.println("1:Adiciona contato no final  do vetor");
            System.out.println("2:Adiciona contato em uma posição específica");
            System.out.println("3:Obtém contato de uma posição específica");
            System.out.println("4:Consulta contato");
            System.out.println("5:Consulta último indice do contato");
            System.out.println("6:Verificar se contato existe");
            System.out.println("7:Remove por posição");
            System.out.println("8:Excluir contato");
            System.out.println("9:Verificar o tamanho do vetor");
            System.out.println("10:Limpar o vetor");
            System.out.println("11 Imprime vetor");
            System.out.println("0: Sair");

            try {
                entrada = scan.nextLine();
                // Convertendo string pra inteiro .
                opc = Integer.parseInt(entrada);

                if (opc >= 0 && opc <= 11) {
                    entradaValida = true;
                } else {

                    throw new Exception();

                }

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente ... \n\n");

            }

        }

        return opc;
    }

    protected static void criarcontatosDinamicamente(int quantContatos, Lista<Contato> lista) {
        Contato contato;
        for (int i = 1; i <= quantContatos; i++) {
            contato = new Contato();
            contato.setNome("Contado" + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }

}
