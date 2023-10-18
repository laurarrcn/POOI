package com.mycompany.aula2018;

import java.util.*;

public class Livro {
   private String titulo;
   private int anoPublicacao;
   private Editora edt;
   private List<Autor> autores;

    public Livro(String titulo, int anoPublicacao, Editora edt) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.edt = edt;
        this.autores = new ArrayList<Autor>();
    }

    public void adicionarAutor(Autor a){
        this.autores.add(a);
    }

    public Editora getEdt() {
        return edt;
    }

    public void setEdt(Editora edt) {
        this.edt = edt;
    }
    
    public void RemoverAutor(Autor a){
        this.autores.remove(a);
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

 
   
   
   
}
