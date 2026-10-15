package entities;
import java.time.LocalDate;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int totalPaginas;
    private int paginaAtual;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, int totalPaginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.disponivel = true;

    }

    public Livro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.totalPaginas = 100;
        this.paginaAtual = 0;
        this.disponivel = true;
    }

    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Autor desconhecido";
        this.anoPublicacao = 0;
        this.totalPaginas = 100;
        this.paginaAtual = 0;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        int anoAtual = LocalDate.now().getYear();
        if (anoPublicacao >= 1000 && anoPublicacao <= anoAtual) {
            this.anoPublicacao = anoPublicacao;
        }
        else {
            System.out.println("Ano de publicação inválido.");
        }

    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        if (totalPaginas > 0 && totalPaginas >= paginaAtual) {
            this.totalPaginas = totalPaginas;
        }
        else {
            System.out.println("Total de páginas inválido.");
        }
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        if (paginaAtual >= 0 && paginaAtual <= totalPaginas) {
            this.paginaAtual = paginaAtual;
        }
        else {
            System.out.println("Página atual inválida.");
        }
    }

    public void emprestar() {
        if (disponivel) {
            System.out.println("Livro emprestado com sucesso!");
            disponivel = false;
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            System.out.println("Livro devolvido com sucesso!");
            disponivel = true;
            paginaAtual = 0;
        } else {
            System.out.println("O livro já está na biblioteca.");
        }
    }

    public void avancarPaginas(int quantidade) {
        if (disponivel) {
            System.out.println("O livro precisa estar emprestado para avançar páginas.");
        } else if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
        } else {
            paginaAtual += quantidade;
            if (paginaAtual > totalPaginas) {
                paginaAtual = totalPaginas;
            }
        }
    }

    public void avancarPaginas() {
        avancarPaginas(1);
    }

    public double calcularProgresso() {
        return (double) paginaAtual / totalPaginas * 100;
    }

    public void exibirFicha(){
        String status = disponivel ? "Disponível" : "Emprestado";
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Total de páginas: " + totalPaginas);
        System.out.println("Página atual: " + paginaAtual);
        System.out.printf("Progresso: %.1f%%%n", calcularProgresso());
        System.out.println("O livro está disponível ou emprestado? " + status);
    }
}