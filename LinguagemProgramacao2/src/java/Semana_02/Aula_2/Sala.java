package Semana_02.Aula_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

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
        carregarSala();
        salvaSalas();
    }
    
    public static void salvaSalas() throws IOException{
        File arquivoSai = new File("saida.txt");
        String sal = "";
        for (Sala s : salas) {
            sal += s.getNumero() + "," + s.getLotacao() + "," + s.getOcupados() + ";";
        }
        System.out.println(sal);
        salvar(arquivoSai, sal);
    }
    
    public static void carregarSala() throws UnsupportedEncodingException, IOException{
        File arquivoEnt = new File("entrada.txt");
        byte[] arrbyte = carregar(arquivoEnt);
        String fileString = new String(arrbyte, "UTF-8");
        
        System.out.println(fileString);
        
        String[] salaSTR = fileString.split(";");
        
        salas = new ArrayList<>();
        
        for (String sala : salaSTR) {
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
