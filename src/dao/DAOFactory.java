//PROJECT NAME: prjBruno-quitanda
package dao;
import modelo.QuitandaVO;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:09
 * @version 1.0 beta
 */
public class DAOFactory {
    
    private static FrutasDAO fDAO = new FrutasDAO();
    private static QuitandaDAO QDAO = new QuitandaDAO();
    private static ClienteDAO CDAO = new ClienteDAO();
    
    public static FrutasDAO getFrutasDAO(){
        return fDAO;
    }
    
    public static QuitandaDAO getQuitandaDAO(){
        return QDAO;
    }
    
    public static ClienteDAO getClienteDAO(){
        return CDAO;
    }
}
