
package com.mycompany.main;


public class Venda {
    private int id;
    private double valor;
Comercio comercio;
    
    public Venda(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setComercio(Comercio comercio){
        this.comercio = comercio;
    }
  
    
}
