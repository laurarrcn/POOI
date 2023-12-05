
package com.mycompany.main;
import java.util.*;

public class Admnistradora extends Juridica implements InstituicaoFinanceira{
    private double taxaCorretagem;
    private boolean plataformaOnline;
    List<Investimento>investimentos;
    public static int contIv;

    public Admnistradora(double taxaCorretagem, boolean plataformaOnline, String nomeFantasia, String cnpj, String nome) {
        super(nomeFantasia, cnpj, nome);
        this.taxaCorretagem = taxaCorretagem;
        this.plataformaOnline = plataformaOnline;
        investimentos = new ArrayList<>();
    }

    public double getTaxaCorretagem() {
        return taxaCorretagem;
    }

    public boolean isPlataformaOnline() {
        return plataformaOnline;
    }

    public void setTaxaCorretagem(double taxaCorretagem) {
        this.taxaCorretagem = taxaCorretagem;
    }

    public void setPlataformaOnline(boolean plataformaOnline) {
        this.plataformaOnline = plataformaOnline;
    }
    
    public void adicionarInvestimento(Investimento v){
        investimentos.add(v);
        contIv++;
    }
    
    @Override
    public void calcularAtivosFinanceiros(){
        System.out.println("Investimento: " +contIv);
    }
    
    
    
    
}
