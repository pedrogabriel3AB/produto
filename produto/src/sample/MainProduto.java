package sample;


import sample.model.Produto;

import java.util.ArrayList;

public class MainProduto {




    public static void main(String[] args){

        Produto produto1 = new Produto();
        produto1.setnome("mamão");
        produto1.setpreço(4.50);


        Produto produto2 = new Produto();
        produto2.setnome("maçã");
        produto2.setpreço(2.4);

        Produto produto3 = new Produto();
        produto3.setnome("melao");
        produto3.setpreço(10.50);

       // System.out.println(produto1);
      //  System.out.println(produto2);
       // System.out.println(produto3);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        System.out.println(produtos);

        produtos.remove(produto2);
        System.out.println(produtos);

        produtos.remove(produto1);
        System.out.println(produtos);


    }
}
