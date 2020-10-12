//PROJECT NAME: prjBruno-quitanda
package visual;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.FrutasVO;
import servicos.FrutasServicos;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:06
 * @version 1.0 beta
 */
public class GUICadastroDeFrutas extends javax.swing.JInternalFrame {
    public GUICadastroDeFrutas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpAcoesDeCadatro = new javax.swing.JLayeredPane();
        jbCadastroCoisas = new javax.swing.JButton();
        jbLimparCadastroCoisas = new javax.swing.JButton();
        jlpDadosCadastroCoisas = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtValor = new javax.swing.JTextField();
        jtQuantidade = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CADASTRO");

        jlpAcoesDeCadatro.setBorder(new javax.swing.border.MatteBorder(null));

        jbCadastroCoisas.setText("Cadastrar");
        jbCadastroCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroCoisasActionPerformed(evt);
            }
        });
        jbCadastroCoisas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastroCoisasKeyPressed(evt);
            }
        });

        jbLimparCadastroCoisas.setText("Limpar");
        jbLimparCadastroCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparCadastroCoisasActionPerformed(evt);
            }
        });

        jlpAcoesDeCadatro.setLayer(jbCadastroCoisas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoesDeCadatro.setLayer(jbLimparCadastroCoisas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesDeCadatroLayout = new javax.swing.GroupLayout(jlpAcoesDeCadatro);
        jlpAcoesDeCadatro.setLayout(jlpAcoesDeCadatroLayout);
        jlpAcoesDeCadatroLayout.setHorizontalGroup(
            jlpAcoesDeCadatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesDeCadatroLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jbCadastroCoisas)
                .addGap(85, 85, 85)
                .addComponent(jbLimparCadastroCoisas)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jlpAcoesDeCadatroLayout.setVerticalGroup(
            jlpAcoesDeCadatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesDeCadatroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jlpAcoesDeCadatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastroCoisas)
                    .addComponent(jbLimparCadastroCoisas))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jlpDadosCadastroCoisas.setBorder(new javax.swing.border.MatteBorder(null));

        jlNome.setText("Nome");

        jlValor.setText("Valor");

        jlQuantidade.setText("Quantidade");

        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeKeyPressed(evt);
            }
        });

        jtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtValorKeyPressed(evt);
            }
        });

        jtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtQuantidadeKeyPressed(evt);
            }
        });

        jlpDadosCadastroCoisas.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jlValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jlQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jtValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jtQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosCadastroCoisasLayout = new javax.swing.GroupLayout(jlpDadosCadastroCoisas);
        jlpDadosCadastroCoisas.setLayout(jlpDadosCadastroCoisasLayout);
        jlpDadosCadastroCoisasLayout.setHorizontalGroup(
            jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosCadastroCoisasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlQuantidade)
                    .addComponent(jlValor)
                    .addComponent(jlNome))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jtQuantidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpDadosCadastroCoisasLayout.setVerticalGroup(
            jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosCadastroCoisasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValor)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQuantidade)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpDadosCadastroCoisas)
                    .addComponent(jlpAcoesDeCadatro))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDadosCadastroCoisas)
                .addGap(18, 18, 18)
                .addComponent(jlpAcoesDeCadatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroCoisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroCoisasActionPerformed
        CadastrarFruta();
    }//GEN-LAST:event_jbCadastroCoisasActionPerformed

    private void jbLimparCadastroCoisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparCadastroCoisasActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparCadastroCoisasActionPerformed

    private void jtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jtValor.grabFocus();
        }
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtValorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jtQuantidade.grabFocus();
        }
    }//GEN-LAST:event_jtValorKeyPressed

    private void jtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jbCadastroCoisas.grabFocus();
        }
    }//GEN-LAST:event_jtQuantidadeKeyPressed

    private void jbCadastroCoisasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastroCoisasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            CadastrarFruta();
        }
    }//GEN-LAST:event_jbCadastroCoisasKeyPressed

    private void CadastrarFruta(){
        try {
            FrutasVO fVO = new FrutasVO();
            
            fVO.setNome(jtNome.getText());
            fVO.setValorCusto(Float.parseFloat(jtValor.getText()));
            fVO.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
              
            FrutasServicos fs = servicos.ServicosFactory.getFrutasServicos();
            
            fs.insertFrutas(fVO);
            
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Fruta Cadastrada");
            limpar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro GUICadastro Fruta " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpar(){
        jtNome.setText(null);
        jtValor.setText(null);
        jtQuantidade.setText(null);
        jtNome.grabFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastroCoisas;
    private javax.swing.JButton jbLimparCadastroCoisas;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLayeredPane jlpAcoesDeCadatro;
    private javax.swing.JLayeredPane jlpDadosCadastroCoisas;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
