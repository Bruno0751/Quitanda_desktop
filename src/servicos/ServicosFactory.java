//PROJECT NAME: prjBruno-quitanda
package servicos;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class ServicosFactory {
    
    private static final FrutasServicos FS = new FrutasServicos();
    private static final QuitandaServicos QS = new QuitandaServicos();
    private static final ClienteServicos CS = new ClienteServicos();
    
    public  static FrutasServicos getFrutasServicos(){
        return FS;
    }
    
    public  static QuitandaServicos getQuitandaServicos(){
        return QS;
    }
    
    public  static ClienteServicos getClieteServicos(){
        return CS;
    }
    
}
