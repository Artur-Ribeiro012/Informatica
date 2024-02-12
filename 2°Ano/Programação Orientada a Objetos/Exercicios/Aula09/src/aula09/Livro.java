/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author artur
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    Livro(String apredendo_Java, String josé_da_Silva, int i, Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade =" +leitor.getIdade() + "\n, sexo=" + leitor.getSexo() +'}';
    }
    
    public Livro(String titulo, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual =0;
        this.aberto = false;
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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
     this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }
    
    @Override
    public void folhear(int p) {
        if( p > this.totPaginas) {
            this.pagAtual = 0;
        }
      this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
            this.pagAtual--;
    }
    
}
