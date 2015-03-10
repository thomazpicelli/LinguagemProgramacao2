

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @version 1.0
 * @author thomazpicelli
 */
public class Cinema_DB {
    public static final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    public static final String protocol = "jdbc:derby:";
    public static final String dbname = "cinema_db";
    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;
    
    public static void main(String[] args) {
        createDB();
        insert();
        readGenero();
        closeDB();
    }
    
    public static void createDB(){
        
        try {
            System.out.println("-----CREATE----");
            //System.out.println("Genero");
            //declaração do driver
            System.out.println("teste");
            Class.forName(driver).newInstance();
            
            // cria conexao
            connection = DriverManager.getConnection(protocol+dbname+";create=true");
            // criar statement
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            ex.printStackTrace();
        }
        
        try {
            //apagar tabelas antes de criar
            String SqlDrop = "Drop table Generos; Drop table Ator;";
            statement.execute(SqlDrop);
        } catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
        
        try {
            //criar tabelas
            String SqlCreate = "Create table Generos(id int, nome varchar(20)); Create table Ator(id int,nome varchar(20))";
            statement.execute(SqlCreate);
        } catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
    }
    
    public static void insert(){
        System.out.println("---INSERT----");
        //System.out.println("Generos");
        try {
            String sqlInsert = "insert into Generos values(1,'ação'),(2,'Animação'),(3,'Chanchada'),(4,'Comédia'),(5,'Cult'),(6,'Dança'),(7,'Documentário'),(8,'Drama'),(9,'Erótico'),(10,'Fantasma'),(11,'Faroeste'),(12,'Ficção Cientifica'),(13,'Guerra'),(14,'Musical'),(15,'Filme Noir'),(16,'Policial'),(17,'Romance'),(18,'Suspense'),(19,'Terror'),(20,'Trash'); Insert into Ator values(1,'Brad'),(2,'Tom')";
            statement.execute(sqlInsert);  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void readGenero(){
        System.out.println("---READ----");
        System.out.println("Generos");
        String sqlRead = "Select * from Generos";
        String sqlReadA = "Select * from Ator";
        try {
            rs = statement.executeQuery(sqlRead);
            rs = statement.executeQuery(sqlReadA);
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nome"));
            }
        } catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
    }
            
    public static void closeDB(){
        System.out.println("---CLOSE---");
        try{
            DriverManager.getConnection(protocol+";shutdown=true");
        } catch (SQLException ex) {
           if(ex.getErrorCode()==50000 && ex.getSQLState().equals("XJ015")){
               System.out.println("Desconectado corretamente");
           }
           else{
               System.out.println("Erro ao desconectar");
           }
        }
        try{
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }       
}
