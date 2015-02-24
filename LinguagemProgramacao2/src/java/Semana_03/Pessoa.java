package Semana_03;

import java.io.Serializable;

public class Pessoa implements Serializable{
    public String nome;
    public String sobrenome;
    public transient String rg; //tipo de dados que nao é repassado; <> persistent padrao quando nao coloca nada;

    /**
    *onstrutor para os objetos da classe
    * @param nome nome da pessoa
    * @param sobrenome sobrenome da pessoa
    * @param rg rg da pessoa
    **/
    public Pessoa(String nome, String sobrenome, String rg) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "[" + this.nome + "," + this.sobrenome + "," + rg + ']';
    } //boa pratica escrever o toString para a sterialização
    
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
