//PROJECT NAME: prjBruno-quitanda
package modelo;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:00
 * @version 1.0 beta
 */
public class QuitandaVO {
    
    private long idQuitanda;
    private String nome;
    private String clientes;
    private String funcionarios;

    public QuitandaVO() {
    }

    public QuitandaVO(long idQuitanda, String nome, String clientes, String funcionarios) {
        this.idQuitanda = idQuitanda;
        this.nome = nome;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
    }

    public long getIdQuitanda() {
        return idQuitanda;
    }

    public void setIdQuitanda(long idQuitanda) {
        this.idQuitanda = idQuitanda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "QuitandaVO{" + "idQuitanda=" + idQuitanda + ", nome=" + nome + ", clientes=" + clientes + ", funcionarios=" + funcionarios + '}';
    }
}//fecha método
