
package com.mycompany.main;
import java.util.*;
public class Juridica extends Cliente{
    public String nomeFantasia;
    public String cnpj;

    public Juridica(String nomeFantasia, String cnpj, String nome) {
        super(nome);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    private boolean validarCNPJ(String cnpj){
      if(cnpj.length() < 1){
          return false;
      }  
      if(cnpj.length() > 1){
          return true;
      } 
      return true;
    }
    
}
