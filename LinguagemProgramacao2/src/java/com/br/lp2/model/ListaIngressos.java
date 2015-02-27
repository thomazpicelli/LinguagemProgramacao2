package com.br.lp2.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @version 1.0
 * @author thomazpicelli
 */
public class ListaIngressos implements Serializable{
    private int pk;
    private static ArrayList<Ingresso> lista;
    
    
    public ListaIngressos(){
        lista = new ArrayList<>();
    }
    
    public void adicionaIngresso(Ingresso ingresso){
        lista.add(ingresso);
    }
    
    public void removeIngresso(Ingresso ingresso){
        for (Ingresso i : lista) {
            if (i.compara(ingresso))
            lista.remove(ingresso);
        }
    }
    
    public void substituiIngresso(Ingresso ingresso1, Ingresso ingresso2){
        removeIngresso(ingresso1);
        adicionaIngresso(ingresso2);
    }
    
    public boolean procuraIngresso(Ingresso ingresso){
        boolean resp = false;
        for (Ingresso i : lista) {
            if(ingresso.compara(i))
                resp = true;
        }
        return resp;
    }
}