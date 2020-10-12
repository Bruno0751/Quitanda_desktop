//PROJECT NAME: prjBruno-quitanda
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.FrutasVO;
import persistencia.ConexaoBanco;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:10
 * @version 1.0 beta
 */
public class FrutasDAO {
    
    public void insertFruta(FrutasVO cVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement sta = con.createStatement();
        try {
            String sql;
            
            sql = "INSERT INTO fruta(id_fruta, nome, valor, quantidade)"
                    + "VALUES (NULL, '" + cVO.getNome() + "'," + cVO.getValorCusto() + "," + cVO.getQuantidade() + ")";
            sta.execute(sql);
        } catch (SQLException e) {
            throw  new SQLException("Erro Ao Cadastrar Fruta " + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }
    }

    public ArrayList<FrutasVO> selectFruta() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
          
            sql = "SELECT * FROM fruta";
            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<FrutasVO> fs = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                FrutasVO f = new FrutasVO();
                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                f.setIdFruta(rs.getLong("id_fruta"));
                f.setNome(rs.getString("nome"));
                f.setValorCusto(rs.getFloat("valor"));
                f.setQuantidade(rs.getInt("quantidade"));
                /* Inserindo o objeto pVO no ArrayList */
                fs.add(f);
            }//fecha while
            //Retornando o ArrayList com todos objetos
            return fs;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Buscar Fruta " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<FrutasVO> selectFromFruta(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
                      
            sql = "SELECT * FROM fruta "+query;
            /* Executando o SQL  e armazenando
            o ResultSet em um objeto do tipo
            ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);
            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<FrutasVO> fs = new ArrayList<>();
            /* Enquanto houver uma próxima linha no 
            banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                FrutasVO c = new FrutasVO();
                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                c.setIdFruta(rs.getLong("id_fruta"));
                c.setNome(rs.getString("nome"));
                c.setValorCusto(rs.getFloat("valor"));
                c.setQuantidade(rs.getInt("quantidade"));
                /* Inserindo o objeto pVO no ArrayList */
                fs.add(c);
            }
            //Retornando o ArrayList com todos objetos
            return fs;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Filtrar Fruta " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarFruta(long id) throws SQLException{       
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();    
        try{
            String sql = "DELETE FROM fruta WHERE id_fruta = " + id;
            stat.execute(sql);
        } catch (Exception e) {
            throw  new SQLException("Erro ao Deletar Fruta " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void atualizaFruta(FrutasVO cVO) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();
        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL */
            sql = "UPDATE fruta SET nome='"+cVO.getNome()+"', valor="+cVO.getValorCusto()+", quantidade="+cVO.getQuantidade()+" WHERE id_fruta = "+cVO.getIdFruta();

            //Executando o sql
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao Atualizar Fruta " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
