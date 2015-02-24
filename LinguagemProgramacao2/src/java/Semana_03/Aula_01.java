package Semana_03;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aula_01 {
    
    public static void main(String[] args){
        Pessoa p = new Pessoa("Thomaz", "Picelli", "37751788-4");
        
        try {
            FileOutputStream fos = new FileOutputStream("sterializaçao_sai.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            fos.close();
            oos.close();
        } catch (IOException iOException) {
            System.out.println("Problema IO");
        }
        try {
            FileInputStream fis = new FileInputStream("sterializaçao_sai.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Pessoa p2 = (Pessoa) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(p2.toString());
            //ATENÇÃO - perceber que o rg transiente 
        } catch (IOException iOException) {
            printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aula_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
