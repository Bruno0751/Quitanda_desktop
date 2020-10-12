//PROJECT NAME: prjBruno-quitanda
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.QuitandaVO;
import persistencia.ConexaoBanco;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:11
 * @version 1.0 beta
 */
public class QuitandaDAO {
    
    public void cadatrarQuitanda(QuitandaVO qVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement sta = con.createStatement();
        try {
            String sql;
            
            sql = "INSERT INTO quitanda(id_quitanda, nome, cliente, funcionario)"
                    + "VALUES (NULL,'" + qVO.getNome() + "','" + qVO.getClientes() + "','" + qVO.getFuncionarios() + "')";
            sta.execute(sql);
        } catch (SQLException e) {
            throw  new SQLException("Erro Ao Cadastrar Quitanda " + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public ArrayList<QuitandaVO> buscarQuitanda() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
          
            sql = "SELECT * FROM quitanda";
            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<QuitandaVO> qs = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                QuitandaVO q = new QuitandaVO();
                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                q.setIdQuitanda(rs.getLong("id_quitanda"));
                q.setNome(rs.getString("nome"));
                q.setClientes(rs.getString("cliente"));
                q.setFuncionarios(rs.getString("funcionario"));
                /* Inserindo o objeto pVO no ArrayList */
                qs.add(q);
            }//fecha while
            //Retornando o ArrayList com todos objetos
            return qs;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Buscar Quitanda " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<QuitandaVO> filtrarQuitanda(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
                      
            sql = "SELECT * FROM quitanda "+query;
            /* Executando o SQL  e armazenando
            o ResultSet em um objeto do tipo
            ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);
            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<QuitandaVO> qs = new ArrayList<>();
            /* Enquanto houver uma próxima linha no 
            banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                QuitandaVO q = new QuitandaVO();
                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                q.setIdQuitanda(rs.getLong("id_quitanda"));
                q.setNome(rs.getString("nome"));
                q.setClientes(rs.getString("cliente"));
                q.setFuncionarios(rs.getString("funcionario"));
                /* Inserindo o objeto pVO no ArrayList */
                qs.add(q);
            }
            //Retornando o ArrayList com todos objetos
            return qs;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Filtrar Quitanda " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarQuitanda(long id) throws SQLException{       
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();    
        try{
            String sql = "DELETE FROM quitanda WHERE id_quitanda = " + id;
            stat.execute(sql);
        } catch (Exception e) {
            throw  new SQLException("Erro ao Deletar Quitanda " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void atualizarQuitanda(QuitandaVO qVO) throws SQLException {
        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();
        try {
            //String que receberá instrução SQL
            String sql;

            sql = "UPDATE quitanda SET nome = '" + qVO.getNome() + "', cliente = '" + qVO.getClientes() + "', funcionario = '" + qVO.getFuncionarios() + "' WHERE id_quitanda = " + qVO.getIdQuitanda();
            //Executando o sql
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao Atualizar Quitanda " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}

