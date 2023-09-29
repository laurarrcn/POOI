package com.mycompany.aula0929;

import java.util.*;

public class Aula0929 {

    public static void main(String[] args) {
        
        Esporte e1 = new Esporte("Volei", 12);
        Esporte e2 = new Esporte("Futbol", 22);
        Esporte e3 = new Esporte("Tenis", 2);
        Esporte e4 = new Esporte("Xadres", 2);

        Map<String, Esporte> mapEsportes = new HashMap<String, Esporte>();
        mapEsportes.put("vo", e1);
        mapEsportes.put("fu", e2);
        mapEsportes.put("te", e3);
        mapEsportes.put("xa", e4);
        
        for(String x: mapEsportes.keySet()){
            System.out.println("Esporte: "+mapEsportes.get(x).getNome());
        }
        
        Time t1 = new Time("Flamengo");
        t1.cadastraAtleta("Cassio", e1);
        t1.cadastraAtleta("Joao", e1);
        t1.cadastraAtleta("Pedro", e1);

        t1.imprimirAtletas();

        
        Set<Time> liga = new HashSet<Time>();
        liga.add(t1);

    }
}
