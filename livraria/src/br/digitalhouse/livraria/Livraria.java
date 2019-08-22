package br.digitalhouse.livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livraria {
    private Livro novoLivro;
    List<Livro> listaDeLivros = new ArrayList<>();

    public void cadastrar(Livro novoLivro) {
        listaDeLivros.add(novoLivro);
    }

    public void consultar(Livro novoLivro) {
        if (listaDeLivros.contains(novoLivro)) {
            System.out.println(listaDeLivros);
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public void efetuarVenda(Livro novoLivro) {
        if (novoLivro.getQuantidadeEstoque() > 0) {
            novoLivro.setQuantidadeEstoque(novoLivro.getQuantidadeEstoque()-1);
            // listaDeLivros.remove(novoLivro);
            System.out.println("Compra efetuada com sucesso!");
        } else {
            System.out.println("Estoque esgotado!");
        }
    }
}

