
package com.mycompany.main;
import java.util.*;

public class Comercio extends Juridica{
    private String ramoOperacao;
    List<Venda> vendas;
    

    public Comercio(String ramoOperacao, String nomeFantasia, String cnpj, String nome) {
        super(nomeFantasia, cnpj, nome);
        this.ramoOperacao = ramoOperacao;
        vendas = new ArrayList<>();
    }

    public String getRamoOperacao() {
        return ramoOperacao;
    }

    public void setRamoOperacao(String ramoOperacao) {
        this.ramoOperacao = ramoOperacao;
    }

    public void adicionarVendas(Venda v){
        vendas.add(v);
    }

    
    
    
}
