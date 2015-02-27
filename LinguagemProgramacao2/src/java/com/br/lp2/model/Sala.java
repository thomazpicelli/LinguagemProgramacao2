package com.br.lp2.model;

import java.io.Serializable;

/**
 * @version 1.0
 * @author thomazpicelli
 */
public class Sala implements Serializable{
    private int pk;
    private int numero;
    private int lotacao;
    private int especial;
    private Situacao situacao;
    public enum Situacao{
            MANUTENÇÃO, EXIBICAO, ESPERA
    }
    
}
