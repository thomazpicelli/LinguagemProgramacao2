package Semana_01.Aula_02;

import java.util.Date;

public class Pessoa {
   public String nome;
   private String rg;
   private Date dataNasc;

    public Pessoa(String nome, String rg, Date dataNasc) {
        this.nome = nome;
        this.rg = rg;
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public Date getDataNasc() {
        return dataNasc;
    } 
}
