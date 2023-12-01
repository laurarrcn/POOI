
package com.mycompany.avaliacao2b;
/****************************************************************************/
public class Livro extends Publicacao implements iFisico, iOnline{
    private int capitulos;
    private String sobreAutor;
    public Livro(int capitulos, String sobreAutor, String titulo) {
        this.capitulos = capitulos;
        this.sobreAutor = sobreAutor;
        this.titulo = titulo;
    }
    @Override
    public void imiprimirInformacaoes() {
         System.out.println("Titulo: "+this.titulo);
         System.out.println("Sobre Autores: "+this.sobreAutor);
         System.out.println("Quantidade Capitulos: "+this.capitulos);
    }
    public int getCapitulos() {
        return capitulos;
    }
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    public String getSobreAutor() {
        return sobreAutor;
    }
    public void setSobreAutor(String sobreAutor) {
        this.sobreAutor = sobreAutor;
    }
    @Override
    public void folhear() {
        System.out.println("Folheando Livro Fisico");
    }
    @Override
    public void rolar() {
        System.out.println("Rolando Livro Digital");
    }
}
