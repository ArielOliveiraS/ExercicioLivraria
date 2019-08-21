package br.digitalhouse.livraria;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Livro livro1 = new Livro(000, "Mulheres que correm com os lobos", "Clarissa Pinkola", 1992, 123, 2, 35);
        Livro livro2 = new Livro(001, "O Alquimista", "Paulo Coelho", 1990, 321, 7, 30);
        Livro livro3 = new Livro(002, "Pai rico, pai pobre", "Robert K", 1992, 213, 5, 40);

        Scanner telaInicial = new Scanner(System.in);
        System.out.println("O que você deseja : \n" + "1 para consultar \n" + "2 para comprar");
        int compraouconsulta = telaInicial.nextInt();

        if (compraouconsulta == 1) {

        } else {
        }


        List<Livro> listaDeLivros = new ArrayList<>();
        try {
            listaDeLivros.add(livro1);
            listaDeLivros.add(livro2);
            listaDeLivros.add(livro3);

//            public void consultar(){
//            for (Livro valor : listaDeLivros) {
//                Scanner menu = new Scanner(System.in);
//                System.out.println("Qual livro você deseja consultar:  \n "+"0 para Mulheres que correm com os lobos \n"+" 1 para O alquimista \n" + " 2 para Pai rico, pai pobre");
//                int escolha = menu.nextInt();
//                System.out.println(listaDeLivros.get(escolha)); }
//        } catch (Exception ex) {
//            System.out.println("Livro não encontrado"); }}


            for (Livro valor : listaDeLivros) {
                Scanner menu = new Scanner(System.in);
                System.out.println("Qual livro você deseja comprar: \n " + "0 para Mulheres que correm com os lobos \n" + " 1 para O alquimista \n" + " 2 para Pai rico, pai pobre");
                int escolha = menu.nextInt();
                System.out.println(listaDeLivros.get(escolha));
                if (escolha > 0)
                    listaDeLivros.remove(escolha);
                System.out.println("Compra efetuada com sucesso!");
            }

        } catch (Exception ex) {
            System.out.println("Estoque esgotado!");
        }


    }
}