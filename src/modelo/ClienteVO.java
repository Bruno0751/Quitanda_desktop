//PROJECT NAME: prjBruno-quitanda
package modelo;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:00
 * @version 1.0 beta
 */
public class ClienteVO {
    
    private long idCliente;
    private String nome;
    private String cpf;
    private int  idade;

    public ClienteVO() {
    }

    public ClienteVO(long idCliente, String nome, String cpf, int idade) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ClieteVO{" + "idCliente=" + idCliente + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + '}';
    }
}
