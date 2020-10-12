//PROJECT NAME: prjBruno-quitanda
package modelo;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:00
 * @version 1.0 beta
 */
public class FrutasVO {
    
    private long idFruta;
    private String nome;
    private float valorCusto;
    private int quantidade;

    public FrutasVO() {
    }

    public FrutasVO(long idProduto, String nome, float valorCusto, int quantidade) {
        this.idFruta = idProduto;
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.quantidade = quantidade;
    }

    public long getIdFruta() {
        return idFruta;
    }

    public void setIdFruta(long idProduto) {
        this.idFruta = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Coisas{" + "idProduto=" + idFruta + ", nome=" + nome + ", valorCusto=" + valorCusto + ", quantidade=" + quantidade + '}';
    }
    
    
    
}
