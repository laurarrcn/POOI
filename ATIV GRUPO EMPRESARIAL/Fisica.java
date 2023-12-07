
package com.mycompany.main;


public class Fisica extends Cliente {
    private String nome;
    private String cpf;

    public Fisica(String nome, String cpf, String usuario) {
        super(usuario);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Nome: "+nome);
         System.out.println("Cpf: "+cpf);
    }
    
    private boolean validarCPF(){
        if(cpf.length() < 1){
            return false;
        }
        if(cpf.length() > 1){
            return true;
        }
        return true;
    }
}
