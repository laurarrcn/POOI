package com.mycompany.aula0929;

public class Atleta {
    private String nome;
    private Esporte e;  

    public Atleta(String nome, Esporte e) {
        this.nome = nome;
        this.e = e;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Esporte getE() {
        return e;
    }

    public void setE(Esporte e) {
        this.e = e;
    }
    
}
