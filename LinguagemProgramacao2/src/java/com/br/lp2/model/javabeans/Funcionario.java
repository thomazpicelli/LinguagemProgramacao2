package com.br.lp2.model.javabeans;

import java.io.Serializable;

/**
 * @version 1.0
 * @author thomazpicelli
 */
public abstract class Funcionario implements Serializable{
    private int pk;
    private String nome;
    private String login;
    private String senha;

    public Funcionario(int pk, String nome, String login, String senha) {
        this.pk = pk;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

}
