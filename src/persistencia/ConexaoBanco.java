//PROJECT NAME: prjBruno-quitanda
package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class ConexaoBanco {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bdjava";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
        
    public static Connection getConexao() throws SQLException{
       Connection c = null; 
        try {
            c = DriverManager.getConnection(URL,USUARIO,SENHA);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Conectar" + e.getMessage());
        }
        return c;    
    }    
}
