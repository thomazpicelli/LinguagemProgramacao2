package Semana_01.Aula_02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa{
    public String tia;
    private double nota;
    
    public Aluno(String nome, String rg, Date dataNasc) {
        super(nome, rg, dataNasc);
    }

    public Aluno(String tia, double nota, String nome, String rg, Date dataNasc) {
        super(nome, rg, dataNasc);
        this.tia = tia;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getTia() {
        return tia;
    }

    public String getNome() {
        return nome;
    }
    
    public boolean verificaNota(){
        return this.nota >= 7.5;
    }
    
    @Override
    public String toString(){
        String resultado = "";
        resultado += "Nome: " + this.nome + "\n";
        resultado += "RG: " + this.getRg() + "\n";
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        resultado += "Data Nascimento: " + df.format(this.getDataNasc()) + "\n";
        resultado += "Tia: " + this.tia + "\n";
        resultado += "Nota: " + this.nota + "\n"; 
        return resultado;
    }
}
