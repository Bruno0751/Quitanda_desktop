//PROJECT NAME: prjBruno-quitanda
package servicos;
import dao.FrutasDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FrutasVO;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class FrutasServicos {
    
    public void insertFrutas(FrutasVO fVO) throws SQLException{
        FrutasDAO fDAO = DAOFactory.getFrutasDAO();
        fDAO.insertFruta(fVO);
    }
    
    public ArrayList<FrutasVO> selectFruta() throws SQLException {
        FrutasDAO fDAO = DAOFactory.getFrutasDAO();
        return fDAO.selectFruta();
    }
    
    public ArrayList<FrutasVO> selectFromFruta(String query) throws SQLException {
        FrutasDAO fDAO = DAOFactory.getFrutasDAO();
        return fDAO.selectFromFruta(query);
    }
    
    public  void deleteFruta(long id) throws SQLException {
      FrutasDAO fDAO = DAOFactory.getFrutasDAO();
      fDAO.deletarFruta(id);
    }
    
    public void alterarFruta(FrutasVO fVO) throws SQLException {
        FrutasDAO fDAO = DAOFactory.getFrutasDAO();
        fDAO.atualizaFruta(fVO);
    }
}
