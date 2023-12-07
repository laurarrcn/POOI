
package com.mycompany.main;
import java.util.*;

public class Comercio extends Juridica {
    private String ramoOperacao;
List<Venda>vendas;
 
    
    public Comercio(String ramoOperacao, String nomeFantasia, String cnpj, String usuario) {
        super(nomeFantasia, cnpj, usuario);
        this.ramoOperacao = ramoOperacao;
        vendas = new ArrayList<>();
    }

    public String getRamoOperacao() {
        return ramoOperacao;
    }

    public void setRamoOperacao(String ramoOperacao) {
        this.ramoOperacao = ramoOperacao;
    }
    
  
    
    @Override
    public void imprimir(){
        System.out.println("Ramo operacao: "+ramoOperacao);
    }
    
    public void criarVenda(int id, double valor){
         Venda v1 = new Venda(1, 1);
    }
    
    public void addVenda(Venda v1){
      vendas.add(v1);
      v1.setComercio(this);
      
      
    }
}
