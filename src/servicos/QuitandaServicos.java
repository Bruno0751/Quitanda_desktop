//PROJECT NAME: prjBruno-quitanda
package servicos;
import dao.DAOFactory;
import dao.FrutasDAO;
import dao.QuitandaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.QuitandaVO;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class QuitandaServicos {
    
    public void cadastrarQuitanda(QuitandaVO qVO) throws SQLException{
        QuitandaDAO qDAO = DAOFactory.getQuitandaDAO();
        qDAO.cadatrarQuitanda(qVO);
    }
    
    public ArrayList<QuitandaVO> buscarQuitanda() throws SQLException {
        QuitandaDAO qDAO = DAOFactory.getQuitandaDAO();
        return qDAO.buscarQuitanda();
    }
    
    public ArrayList<QuitandaVO> filtrarQuitanda(String query) throws SQLException {
        QuitandaDAO qDAO = DAOFactory.getQuitandaDAO();
        return qDAO.filtrarQuitanda(query);
    }
    
    public  void deletarQuitanda(long id) throws SQLException {
      QuitandaDAO qDAO = DAOFactory.getQuitandaDAO();
      qDAO.deletarQuitanda(id);
    }
    
    public void atualizarQuitanda(QuitandaVO qVO) throws SQLException {
        QuitandaDAO qDAO = DAOFactory.getQuitandaDAO();
        qDAO.atualizarQuitanda(qVO);
    }
}
