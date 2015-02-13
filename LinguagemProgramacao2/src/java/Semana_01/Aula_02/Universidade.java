package Semana_01.Aula_02;

import java.util.Calendar;
import java.util.Date;

public class Universidade {
    public static void main(String args[]){
        
        Calendar c = Calendar.getInstance();
        c.set(1995, Calendar.DECEMBER, 24);
        Date data = c.getTime();
        
        Pessoa p1 = new Pessoa("Pedro","1234",data);
        Aluno a1 = new Aluno("1234", 10, "Pedro", "1234567", data);
        System.out.println(a1.toString());
        
        Pessoa p2 = new Aluno("4321", 9,"Marcelo","987654", data);
        System.out.println(p2.toString());
    }
    
}
