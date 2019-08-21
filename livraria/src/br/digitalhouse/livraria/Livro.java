package br.digitalhouse.livraria;

import java.util.ArrayList;
import java.util.List;

public class Livro {



    public int  codigo;
    public String titulo;
    public String autor;
    public int anoDeLancamento;
    public int codigoISBN;
    public int quantidadeEstoque;
    public float preco;

    public Livro(int codigo, String titulo, String autor, int anoDeLancamento, int codigoISBN, int quantidadeEstoque, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
               titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", preco=" + preco +
                '}';
    }
}
