
package TodoApp;

import java.sql.Connection;
import util.ConnectionFactory;

public class Main {
   
    public static void main(String[] args) {
        
        // classe ConnectionFactory me devolve uma conex�o
        Connection c = ConnectionFactory.getConnection();   
        
        // ConnectionFactory feche a conex�o, n�o preciso mais dela
        ConnectionFactory.closeConnection(c); 
    }
}
