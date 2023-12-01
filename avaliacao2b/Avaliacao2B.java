package com.mycompany.avaliacao2b;

import java.util.*;

public class Avaliacao2B {

    public static void main(String[] args) {
        
        Autor a1 = new Autor("João");
        Autor a2 = new Autor("Pedro");
        
        Livro l1 = new Livro(10, "sobre...", "Livro 01");
        l1.adicionaAutor(a1);
        Livro l2  = new Livro(5, "sobre...", "Livro 02");
        l2.adicionaAutor(a2);
        
        Artigo art1 = new Artigo(6, "resumindo...", "Artigo 01");
        art1.adicionaAutor(a1);
        
        Artigo art2 = new Artigo(3, "resumindo...", "Artigo 02");
        art2.adicionaAutor(a2);
        
        List<Autor> autoresMain = new ArrayList<>();
        autoresMain.add(a1);
        autoresMain.add(a2);
        
        for(Autor a : autoresMain){
            System.out.println(a.getNome());
        }
        
        List<Publicacao> publicacoesMain = new ArrayList<>();
        publicacoesMain.add(l1);
        publicacoesMain.add(l2);
        publicacoesMain.add(art1);
        publicacoesMain.add(art2);
        
        
        for(Publicacao p : publicacoesMain){
            p.imiprimirInformacaoes();
        }
        
    }
}
