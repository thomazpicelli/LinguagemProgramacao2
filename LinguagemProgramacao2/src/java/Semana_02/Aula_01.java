package Semana_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aula_01 {
    public static void main(String[] args){
        try{
            InputStreamReader dados = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(dados);
            System.out.println("Digite alguma coisa");
            String frase = teclado.readLine();
            System.out.println("vc digitou " + frase);
            File arquivo = new File("teste.txt");
            //salvar(arquivo,frase);
            byte[] arrbyte = carregar(arquivo);
            String fileString = new String(arrbyte, "UTF-8");
            //System.out.println(fileString);
            //salvar2(arquivo, fileString, frase);
            salvar(arquivo, fileString + frase);
        } catch(IOException IOException){
            System.out.println("Erro de leitura");
        }
    }
    
    public static byte[] carregar(File arquivo) throws FileNotFoundException, IOException{
        FileInputStream stream = new FileInputStream(arquivo);
        byte[] conteudo = new byte[stream.available()];
        stream.read(conteudo);
        return conteudo;
    }
    
    public static void salvar2(File arquivo, String conteudo, String frase) throws FileNotFoundException, IOException{
        FileOutputStream StreamS = new FileOutputStream(arquivo);
        StreamS.write(frase.getBytes());
        StreamS.write(conteudo.getBytes());
        StreamS.close();
    }

    public static void salvar(File arquivo, String conteudo) throws FileNotFoundException, IOException{
        FileOutputStream StreamS = new FileOutputStream(arquivo);
        StreamS.write(conteudo.getBytes());
        StreamS.close();
    }
}
