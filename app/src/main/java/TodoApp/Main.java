
package TodoApp;

import java.sql.Connection;
import util.ConnectionFactory;

public class Main {
   
    public static void main(String[] args) {
        
        // classe ConnectionFactory me devolve uma conexão
        Connection c = ConnectionFactory.getConnection();   
        
        // ConnectionFactory feche a conexão, não preciso mais dela
        ConnectionFactory.closeConnection(c); 
    }
}
