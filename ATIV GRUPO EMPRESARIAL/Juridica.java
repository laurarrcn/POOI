
package com.mycompany.main;

public class Juridica extends Cliente{
    public String nomeFantasia;
    public String cnpj;

    public Juridica(String nomeFantasia, String cnpj, String usuario) {
        super(usuario);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    
    
    @Override
    public void imprimir(){
        System.out.println("Nome Fantasia: "+nomeFantasia);
        
    }
    
    private boolean validarCNPJ(){
        if(cnpj.length() < 1){
            return false;
        }
        if(cnpj.length() > 1 ){
            return true;
        }
        return true;
    }
    
}
