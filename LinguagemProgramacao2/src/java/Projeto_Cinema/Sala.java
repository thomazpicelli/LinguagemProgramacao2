package Projeto_Cinema;

import Semana_02.Jogador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Sala {
    private int numero;
    private int lotacao;
    private int ocupados;
    private static ArrayList<Sala> salas;
    
    public Sala(int numero, int lotacao, int ocupados) {
        this.numero = numero;
        this.lotacao = lotacao;
        this.ocupados = ocupados;
    }

    public int getNumero() {
        return numero;
    }

    public int getOcupados() {
        return ocupados;
    }

    public int getLotacao() {
        return lotacao;
    }
        
    public static void main(String[] args) throws IOException{
        File arquivoSai = new File("saida.txt");
        carregarSala();
        String sal = salvaSalas();
        salvar(arquivoSai, sal);
    }
    
    public static String salvaSalas(){
        String sal = "";
        for(int i=0; i< salas.size(); i++){
            Sala s = salas.get(i);
            sal += s.getNumero() + "," + s.getLotacao() + "," + s.getOcupados() + ";";
        }
        System.out.println(sal);
        return sal;
    }
    
    public static void carregarSala() throws UnsupportedEncodingException, IOException{
        File arquivoEnt = new File("entrada.txt");
        byte[] arrbyte = carregar(arquivoEnt);
        String fileString = new String(arrbyte, "UTF-8");
        
        System.out.println(fileString);
        
        String[] salaSTR = fileString.split(";");
        
        salas = new ArrayList<Sala>();
        
        for (int i = 0; i < salaSTR.length; i++) {
            String sala = salaSTR[i];
            String[] sal = sala.split(",");
            salas.add(new Sala(Integer.parseInt(sal[0]), Integer.parseInt(sal[1]), Integer.parseInt(sal[2])));
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
