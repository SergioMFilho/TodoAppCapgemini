
package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    // metodo estatico, não é preciso criar um objeto para executá-lo
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);  // carrega para mim esse 
            return DriverManager.getConnection(URL, USER, PASS); // estabelecendo conexão com esses parâmetros
        } catch(Exception ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }
    
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null){  // a conexão existe? 
                connection.close();  // se sim, feche essa conexão
            }
        } catch(Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }
    
    
}
