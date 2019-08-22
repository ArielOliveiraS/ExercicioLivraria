package br.digitalhouse.livraria;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Livraria novaLivraria = new Livraria();
        Livro livro1 = new Livro(000, "Mulheres que correm com os lobos", "Clarissa Pinkola", 1992, 123, 2, 35);
        Livro livro2 = new Livro(001, "O Alquimista", "Paulo Coelho", 1990, 321, 7, 30);
        Livro livro3 = new Livro(002, "Pai rico, pai pobre", "Robert K", 1992, 213, 5, 40);

        List<Livro> listaDeLivros = new ArrayList<>();

        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);

        Scanner telaInicial = new Scanner(System.in);
        System.out.println("O que você deseja : \n" + "1 para consultar \n" + "2 para comprar \n" + "3 para cadastrar");
        int compraouconsulta = telaInicial.nextInt();
        System.out.println(listaDeLivros.get(compraouconsulta));

        if (compraouconsulta == 1) {
//                Scanner telaConsulta = new Scanner(System.in);
//                System.out.println("Qual livro você deseja consultar:  \n "+"0 para Mulheres que correm com os lobos \n"+" 1 para O alquimista \n" + " 2 para Pai rico, pai pobre");
//                int escolha = telaConsulta.nextInt();
          //      System.out.println(listaDeLivros.get(escolha));
            novaLivraria.consultar(livro1);
        } else if (compraouconsulta == 2) {
            novaLivraria.efetuarVenda(livro2);
        } else {
            novaLivraria.cadastrar(livro3);
        }

    }
}


