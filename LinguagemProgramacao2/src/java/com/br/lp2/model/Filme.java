package com.br.lp2.model;

import java.io.Serializable;

/**
 * @version 1.0
 * @author thomazpicelli
 */
public class Filme implements Serializable{
    private int pk;
    private Diretor diretor;
    private Genero genero;
    private ListaAtores listaAtores;
    private Distribuidora distribuidora;
    private String nome;
    private int classificacao;
    private int ano;
    private int duracao;
    private String situacao;
    private String idioma;
    private boolean legenda;
    public enum tiposituacao{
        CARTAZ, ESTREIA, LANÇAMENTO
    }

    public Filme(int pk, Diretor diretor, Genero genero, ListaAtores listaAtores, Distribuidora distribuidora, String nome, int classificacao, int ano, int duracao, String situacao, String idioma, boolean legenda) {
        this.pk = pk;
        this.diretor = diretor;
        this.genero = genero;
        this.listaAtores = listaAtores;
        this.distribuidora = distribuidora;
        this.nome = nome;
        this.classificacao = classificacao;
        this.ano = ano;
        this.duracao = duracao;
        this.situacao = situacao;
        this.idioma = idioma;
        this.legenda = legenda;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ListaAtores getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(ListaAtores listaAtores) {
        this.listaAtores = listaAtores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isLegenda() {
        return legenda;
    }

    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }

    @Override
    public String toString() {
        return "Filme{" + "pk=" + pk + ", diretor=" + diretor + ", genero=" + genero + ", listaAtores=" + listaAtores + ", nome=" + nome + ", classificacao=" + classificacao + ", ano=" + ano + ", duracao=" + duracao + ", situacao=" + situacao + ", idioma=" + idioma + ", legenda=" + legenda + '}';
    }

   
            
}
