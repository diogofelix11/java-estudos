package application;

import entities.Livro;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // A biblioteca guarda até 3 livros. null = espaço ainda vazio.
    static Livro livro1 = null;
    static Livro livro2 = null;
    static Livro livro3 = null;

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Exibir ficha de um livro");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Avançar páginas");
            System.out.println("7 - Alterar dados de um livro");
            System.out.println("0 - Sair");
            opcao = lerInt("Escolha uma opção: ");

            if (opcao == 1) {
                cadastrarLivro();
            } else if (opcao == 2) {
                listarLivros();
            } else if (opcao == 3) {
                Livro livro = escolherLivro();
                if (livro != null) {
                    livro.exibirFicha();
                }
            } else if (opcao == 4) {
                Livro livro = escolherLivro();
                if (livro != null) {
                    livro.emprestar();
                }
            } else if (opcao == 5) {
                Livro livro = escolherLivro();
                if (livro != null) {
                    livro.devolver();
                }
            } else if (opcao == 6) {
                avancarPaginas();
            } else if (opcao == 7) {
                alterarDados();
            } else if (opcao == 0) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }

    // ---------- CADASTRO ----------
    static void cadastrarLivro() {
        if (livro1 != null && livro2 != null && livro3 != null) {
            System.out.println("Biblioteca cheia (máximo de 3 livros).");
            return;
        }

        System.out.println("\nComo deseja cadastrar?");
        System.out.println("1 - Completo (título, autor, ano e páginas)");
        System.out.println("2 - Só título e autor");
        System.out.println("3 - Sem informações (valores padrão)");
        int tipo = lerInt("Escolha: ");

        Livro novo;

        if (tipo == 1) {
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            int ano = lerInt("Ano de publicação: ");
            int paginas = lerInt("Total de páginas: ");
            novo = new Livro(titulo, autor, ano, paginas);
        } else if (tipo == 2) {
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            novo = new Livro(titulo, autor);
        } else if (tipo == 3) {
            novo = new Livro();
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        // Guarda o livro no primeiro espaço vazio
        if (livro1 == null) {
            livro1 = novo;
        } else if (livro2 == null) {
            livro2 = novo;
        } else {
            livro3 = novo;
        }

        System.out.println("Livro cadastrado com sucesso!");
    }

    // ---------- LISTAGEM E ESCOLHA ----------
    static void listarLivros() {
        if (livro1 == null && livro2 == null && livro3 == null) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.println("\n--- Livros cadastrados ---");
        if (livro1 != null) {
            System.out.println("1 - " + livro1.getTitulo() + " (" + livro1.getAutor() + ")");
        }
        if (livro2 != null) {
            System.out.println("2 - " + livro2.getTitulo() + " (" + livro2.getAutor() + ")");
        }
        if (livro3 != null) {
            System.out.println("3 - " + livro3.getTitulo() + " (" + livro3.getAutor() + ")");
        }
    }

    // Mostra a lista e devolve o livro escolhido (ou null se for inválido)
    static Livro escolherLivro() {
        if (livro1 == null && livro2 == null && livro3 == null) {
            System.out.println("Nenhum livro cadastrado.");
            return null;
        }

        listarLivros();
        int numero = lerInt("Número do livro: ");

        Livro escolhido = null;
        if (numero == 1) {
            escolhido = livro1;
        } else if (numero == 2) {
            escolhido = livro2;
        } else if (numero == 3) {
            escolhido = livro3;
        }

        if (escolhido == null) {
            System.out.println("Livro inválido ou não cadastrado.");
        }

        return escolhido;
    }

    // ---------- AVANÇAR PÁGINAS ----------
    static void avancarPaginas() {
        Livro livro = escolherLivro();
        if (livro == null) {
            return;
        }

        System.out.println("1 - Avançar 1 página");
        System.out.println("2 - Avançar uma quantidade");
        int tipo = lerInt("Escolha: ");

        if (tipo == 1) {
            livro.avancarPaginas();
        } else if (tipo == 2) {
            int qtd = lerInt("Quantas páginas? ");
            livro.avancarPaginas(qtd);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.printf("Progresso atual: %.1f%%%n", livro.calcularProgresso());
    }

    // ---------- ALTERAR DADOS (SETTERS) ----------
    static void alterarDados() {
        Livro livro = escolherLivro();
        if (livro == null) {
            return;
        }

        System.out.println("\nO que deseja alterar?");
        System.out.println("1 - Título");
        System.out.println("2 - Autor");
        System.out.println("3 - Ano de publicação");
        System.out.println("4 - Total de páginas");
        System.out.println("5 - Página atual");
        int campo = lerInt("Escolha: ");

        if (campo == 1) {
            System.out.print("Novo título: ");
            livro.setTitulo(sc.nextLine());
        } else if (campo == 2) {
            System.out.print("Novo autor: ");
            livro.setAutor(sc.nextLine());
        } else if (campo == 3) {
            livro.setAnoPublicacao(lerInt("Novo ano: "));
        } else if (campo == 4) {
            livro.setTotalPaginas(lerInt("Novo total de páginas: "));
        } else if (campo == 5) {
            livro.setPaginaAtual(lerInt("Nova página atual: "));
        } else {
            System.out.println("Opção inválida.");
        }
    }

    // ---------- LEITURA DE INTEIROS ----------
    // Lê o número com nextInt() e depois usa nextLine() para limpar o "Enter"
    // que sobra no buffer. Sem isso, o próximo nextLine() de texto seria pulado.
    static int lerInt(String mensagem) {
        System.out.print(mensagem);
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }
}