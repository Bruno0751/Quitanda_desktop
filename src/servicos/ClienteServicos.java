//PROJECT NAME: prjBruno-quitanda
package servicos;
import dao.ClienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ClienteVO;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class ClienteServicos {
    
    public void cadastrarCliete(ClienteVO cVO) throws SQLException{
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadatrarCliente(cVO);
    }
    
    public ArrayList<ClienteVO> buscarCliente() throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.buscarCliete();
    }
    
    public ArrayList<ClienteVO> filtrarCliente(String query) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.filtrarCliente(query);
    }
    
    public  void deletarCliente(long id) throws SQLException {
      ClienteDAO cDAO = DAOFactory.getClienteDAO();
      cDAO.deletarCliente(id);
    }
    
    public void alterarCliente(ClienteVO cVO) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.atualizarCliente(cVO);
    }
}
