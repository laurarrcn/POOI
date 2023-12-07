
package com.mycompany.main;


public class Investimento {
    private int id;
    private double valor;
    Administradora administradora;

    public Investimento(int id, double valor) {
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
    
    public void setAdministradora(Administradora administradora){
        this.administradora = administradora;
    }

  
    
}
