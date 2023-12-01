package com.mycompany.avaliacao2b;
/****************************************************************************/
public class Artigo extends Publicacao implements iOnline{
    private int topicos;
    private String resumo;
    public Artigo(int topicos, String resumo, String titulo) {
        this.topicos = topicos;
        this.resumo = resumo;
        this.titulo = titulo;
    } 
    @Override
    public void imiprimirInformacaoes() {
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Resumo: "+this.resumo);
        System.out.println("Quantidade topicos: "+this.topicos);
    }
    @Override
    public void rolar() {
        System.out.println("Rolando Artigo Digital");
    }
}
