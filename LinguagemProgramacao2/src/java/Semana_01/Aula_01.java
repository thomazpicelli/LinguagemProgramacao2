
package Semana_01;

import java.util.ArrayList;

/**
 *
 * @author 31452760
 */
public class Aula_01 {
    
    public static ArrayList<Integer> treino(int num1, int num2){
        int menor, maior;
        ArrayList<Integer> conjunto = new ArrayList<Integer>();
 
        if (num1 < num2){
            menor = num1;
            maior = num2;
        }
        else{
            menor = num2;
            maior = num1;
        }
        
        if (menor % 2 != 0 ){
            menor = menor + 1;
        }
        
        for (int i = menor; i <= maior; i = i + 2){
           conjunto.add(i);
        }
        
        return conjunto;
    }
    
    public static int Fatorial (int n){
	if (n==0)
            return 1;
	else 
            return n * Fatorial(n-1);
    }
    
    public static String imc(double p, double a){
        String result = "";
        double imc = p / Math.pow(a,2);
        if(imc < 17){
            result = "magro, etc...";
        }
        return result;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> pares = new ArrayList<Integer>();
        pares = treino(20,30);
        for(int i = 0; i <pares.size(); i++){
            System.out.println(pares.get(i) + ", ");
        }
        int a = Fatorial(5);
        System.out.println(a);
        String b = imc(70,160);
        System.out.println(b);
    }
}
