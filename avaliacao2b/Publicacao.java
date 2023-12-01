
package com.mycompany.avaliacao2b;

import java.util.*;
/****************************************************************************/
public abstract class Publicacao {
    
    public String titulo;
    public int caracteres;
    public List<Autor> autores = new ArrayList<>();

    
    public abstract void imiprimirInformacaoes();
    
    public void imprimirAutres(){
        System.out.println("Autores de: "+this.titulo);
        if(!autores.isEmpty()){
            for(Autor a : autores){
                System.out.println(a.getNome());
            }
        }else{
            System.out.println("Sem registros.");
        }
    }
    
    public void adicionaAutor(Autor a){
        autores.add(a);
    } 
}
