package Semana_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Aula_02 {
    private static ArrayList<Jogador> jogadores;
    
    public static void main(String[] args) throws IOException{
        File arquivo = new File("teste.txt");
        carregarJogador();
        jogadores.add(new Jogador("Cacique", 20));
        String jog = salvaJogadores();
        int h = highScore();
        salvar(arquivo, jog + "HIGH_SCORE," + h + ";");
    }
    
    private static int highScore() {
        int High = 0;
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador j = jogadores.get(i);
            if(j.getPontos() > High){
                High = j.getPontos();
            }
        }
        return High;
    }
    
    public static String salvaJogadores(){
        String jog = "";
        for(int i=0; i< jogadores.size(); i++){
            Jogador j = jogadores.get(i);
            jog += j.getNome() + "," + j.getPontos() + ";";
        }
        System.out.println(jog);
        return jog;
    }
    
    public static void carregarJogador() throws UnsupportedEncodingException, IOException{
        File arquivo = new File("teste.txt");
        byte[] arrbyte = carregar(arquivo);
        String fileString = new String(arrbyte, "UTF-8");
        
        System.out.println(fileString);
        
        String[] jogadoresStr = fileString.split(";");
        
        jogadores = new ArrayList<Jogador>();
        
        for (int i = 0; i < jogadoresStr.length; i++) {
            String jogador = jogadoresStr[i];
            String[] jog = jogador.split(",");
            jogadores.add(new Jogador(jog[0], Integer.parseInt(jog[1])));
        }        
    }
    public static byte[] carregar(File arquivo) throws FileNotFoundException, IOException{
        FileInputStream stream = new FileInputStream(arquivo);
        byte[] conteudo = new byte[stream.available()];
        stream.read(conteudo);
        return conteudo;
    }
    
    public static void salvar(File arquivo, String conteudo) throws FileNotFoundException, IOException{
        FileOutputStream StreamS = new FileOutputStream(arquivo);
        StreamS.write(conteudo.getBytes());
        StreamS.close();
    }

}
