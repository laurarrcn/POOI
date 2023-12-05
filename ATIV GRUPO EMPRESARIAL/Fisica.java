
package com.mycompany.main;
import java.util.*;
public class Fisica extends Cliente{
    private String nome;
    private String cpf;

    public Fisica(String cpf, String nome) {
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
    
    
    private boolean validarCPF(String cpf){
        if(cpf.length() < 1){
            return false;
        }
        if(cpf.length() > 1){
            return true;
        }
        return true;
    }
    
}
