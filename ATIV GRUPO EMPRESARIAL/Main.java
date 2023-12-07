
package com.mycompany.main;
import java.util.*;

public class Main {

    public static void main(String[] args) {

      Administradora adm  = new Administradora(0.1, true, "Nome", "111", "1111");
      adm.calcularAtivosFinanceiros();
      
      Juridica j1 = new Juridica("usuario1", "Nome1", "111111");
      j1.imprimir();
      
      Fisica f1 = new Fisica("usuario2", "nome2", "222222");
      f1.imprimir();
      
     
      
      
       
    }

   
