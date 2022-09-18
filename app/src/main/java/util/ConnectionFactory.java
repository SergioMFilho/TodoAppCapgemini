
package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    // metodo estatico, n�o � preciso criar um objeto para execut�-lo
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);  // carrega para mim esse 
            return DriverManager.getConnection(URL, USER, PASS); // estabelecendo conex�o com esses par�metros
        } catch(Exception ex) {
            throw new RuntimeException("Erro na conex�o com o banco de dados", ex);
        }
    }
    
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null){  // a conex�o existe? 
                connection.close();  // se sim, feche essa conex�o
            }
        } catch(Exception ex) {
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados", ex);
        }
    }
    
    
}
