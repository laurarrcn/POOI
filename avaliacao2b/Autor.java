
package com.mycompany.avaliacao2b;

import java.util.*;

/****************************************************************************/
public class Autor {
    private String nome;
    private List<Publicacao> publicacoes;

    public Autor(String nome) {
        this.nome = nome;
        publicacoes = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void adicionarPublicacao(Publicacao p){
        publicacoes.add(p);
    }
    
    public void imprimirPublicacoes(){
        System.out.println("Publicaçoes de: "+this.nome);
        if(!publicacoes.isEmpty()){
            for(Publicacao p : publicacoes){
                System.out.println("Titulo: "+ p.titulo);

            }
        }else{
            System.out.println("Sem registros.");
        }
    }
    
}
