//PROJECT NAME: prjBruno-quitanda
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ClienteVO;
import persistencia.ConexaoBanco;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:08
 * @version 1.0 beta
 */
public class ClienteDAO {
    
    public void cadatrarCliente(ClienteVO clVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement sta = con.createStatement();
        try {
            String sql;
            
            sql = "INSET INTO cliente(id_cliente, nome, cpf, idade)"
                    + "VALUES (NULL,'" + clVO.getNome() + "','" + clVO.getCpf()+ "'," + clVO.getIdade() + ")";
            sta.execute(sql);
        } catch (SQLException e) {
            throw  new SQLException("Erro Ao Cadastrar Cliente " + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public ArrayList<ClienteVO> buscarCliete() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
          
            sql = "SELECT * FROM cliente";

            ResultSet rs = stat.executeQuery(sql);


            ArrayList<ClienteVO> cs = new ArrayList<>();


            while (rs.next()) {

                ClienteVO c = new ClienteVO();

                c.setIdCliente(rs.getLong("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf((rs.getString("cpf")));
                c.setIdade(rs.getInt("idade"));

                cs.add(c);
            }

            return cs;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Buscar Cliente " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<ClienteVO> filtrarCliente(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "SELECT * FROM cliente " + query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<ClienteVO> cs = new ArrayList<>();

            while (rs.next()) {

                ClienteVO c = new ClienteVO();

                c.setIdCliente(rs.getLong("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setIdade(rs.getInt("idade"));

                cs.add(c);
            }

            return cs;
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar Cliente " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarCliente(long id) throws SQLException{       
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();    
        try{
            String sql = "DELETE FROM cliente WHERE id_cliente = " + id;
            stat.execute(sql);
        } catch (Exception e) {
            throw  new SQLException("Erro ao Deletar Cliente " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void atualizarCliente(ClienteVO cVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();

        Statement stat = con.createStatement();
        try {

            String sql;

            sql = "UPDATE cliente SET nome = '" + cVO.getNome() + "', cpf = '" + cVO.getCpf()+ "', idade = '" + cVO.getIdade() + "' WHERE id_cliente = " + cVO.getIdCliente();

            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao Atualizar Cliente " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
