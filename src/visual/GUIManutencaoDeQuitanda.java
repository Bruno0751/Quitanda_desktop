//PROJECT NAME: prjBruno-quitanda
package visual;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.QuitandaVO;
import servicos.QuitandaServicos;
import servicos.ServicosFactory;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:01
 * @version 1.0 beta
 */
public class GUIManutencaoDeQuitanda extends javax.swing.JInternalFrame {   
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Identificação", "Nome Quitanda", "Cliete", "funcionário"});
    /**
     * Creates new form GUIManutencaoDeQuitanda
     */
    public GUIManutencaoDeQuitanda() {
        initComponents();
        atualizaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuitanda = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtPesqQuitanda = new javax.swing.JTextField();
        jComboQuitanda = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jtIdQuitanda = new javax.swing.JTextField();
        jtNomeQuitanda = new javax.swing.JTextField();
        jtClienteQuitanda = new javax.swing.JTextField();
        jtFuncionarioQuitanda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbDeletarQuitanda = new javax.swing.JButton();
        jbAtualizarQuitanda = new javax.swing.JButton();
        jbAlterarQuitanda = new javax.swing.JButton();
        jbLimparQuitanda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manutenção de Quitanda");

        jTableQuitanda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificação", "Nome Quitanda", "Cliente", "Funcionário"
            }
        ));
        jTableQuitanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQuitandaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableQuitanda);
        if (jTableQuitanda.getColumnModel().getColumnCount() > 0) {
            jTableQuitanda.getColumnModel().getColumn(0).setResizable(false);
            jTableQuitanda.getColumnModel().getColumn(1).setResizable(false);
            jTableQuitanda.getColumnModel().getColumn(2).setResizable(false);
            jTableQuitanda.getColumnModel().getColumn(3).setResizable(false);
        }

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtPesqQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqQuitandaKeyReleased(evt);
            }
        });

        jComboQuitanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "identificação", "Nome Quitanda", "Cliente", "Funcionário" }));
        jComboQuitanda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboQuitandaItemStateChanged(evt);
            }
        });
        jComboQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboQuitandaKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jtPesqQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtPesqQuitanda)
                    .addComponent(jComboQuitanda, 0, 192, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jtPesqQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jComboQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtIdQuitanda.setEnabled(false);

        jLabel1.setText("Identificação");

        jLabel2.setText("Nome da Quitanda");

        jLabel3.setText("Funcionário");

        jLabel4.setText("Cliete");

        jLayeredPane2.setLayer(jtIdQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtNomeQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtClienteQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtFuncionarioQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtClienteQuitanda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jtNomeQuitanda, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtIdQuitanda, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtFuncionarioQuitanda))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNomeQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtClienteQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtFuncionarioQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbDeletarQuitanda.setText("Deletar");
        jbDeletarQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarQuitandaActionPerformed(evt);
            }
        });

        jbAtualizarQuitanda.setText("Atualizar");
        jbAtualizarQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarQuitandaActionPerformed(evt);
            }
        });

        jbAlterarQuitanda.setText("Alterar");
        jbAlterarQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarQuitandaActionPerformed(evt);
            }
        });

        jbLimparQuitanda.setText("Limpar");
        jbLimparQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparQuitandaActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jbDeletarQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbAtualizarQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbAlterarQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbLimparQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbDeletarQuitanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jbAtualizarQuitanda)
                .addGap(125, 125, 125)
                .addComponent(jbAlterarQuitanda)
                .addGap(110, 110, 110)
                .addComponent(jbLimparQuitanda)
                .addGap(71, 71, 71))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDeletarQuitanda)
                    .addComponent(jbAtualizarQuitanda)
                    .addComponent(jbAlterarQuitanda)
                    .addComponent(jbLimparQuitanda))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane2))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparQuitandaActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparQuitandaActionPerformed

    private void jbAtualizarQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarQuitandaActionPerformed
        limparTabela();
        atualizaTabela();
    }//GEN-LAST:event_jbAtualizarQuitandaActionPerformed

    private void jtPesqQuitandaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqQuitandaKeyReleased
        limparTabela();
        filtrarQuitanda();
    }//GEN-LAST:event_jtPesqQuitandaKeyReleased

    private void jComboQuitandaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboQuitandaItemStateChanged
        limparTabela();
        filtrarQuitanda();
    }//GEN-LAST:event_jComboQuitandaItemStateChanged

    private void jComboQuitandaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboQuitandaKeyReleased
        limparTabela();
        filtrarQuitanda();
    }//GEN-LAST:event_jComboQuitandaKeyReleased

    private void jbDeletarQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarQuitandaActionPerformed
        deletarQuitanda();
        limparTabela();
        atualizaTabela();
    }//GEN-LAST:event_jbDeletarQuitandaActionPerformed

    private void jTableQuitandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuitandaMouseClicked
        alterarQuitanda();
    }//GEN-LAST:event_jTableQuitandaMouseClicked

    private void jbAlterarQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarQuitandaActionPerformed
        confirmarAlteracaoQuitanda();
        limparTabela();
        atualizaTabela();
    }//GEN-LAST:event_jbAlterarQuitandaActionPerformed

    private void atualizaTabela() {
        try {
            //Buscando objeto ProdutoServicos     
            QuitandaServicos qs = ServicosFactory.getQuitandaServicos();
            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<QuitandaVO> quis = new ArrayList<>();
            //Recebendo o ArrayList cheio em produtos
            quis = qs.buscarQuitanda();

            for (int i = 0; i < quis.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(quis.get(i).getIdQuitanda()),
                    String.valueOf(quis.get(i).getNome()),
                    String.valueOf(quis.get(i).getClientes()),
                    String.valueOf(quis.get(i).getFuncionarios())
                });
            }//fecha for
            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jTableQuitanda.setModel(dtm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Erro No GUIManutecaoQuitanda " + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }//fecha catch
        jtIdQuitanda.setText(null);
    }//fecha preencherTabela

    private void limparTabela(){
        dtm.setNumRows(0);
        jtNomeQuitanda.setText(null);
        jtClienteQuitanda.setText(null);
        jtFuncionarioQuitanda.setText(null);
    }
    
    private void filtrarQuitanda(){
       try {
           if (jtPesqQuitanda.getText().isEmpty()){
               atualizaTabela();
           } else{
                String pesq = jtPesqQuitanda.getText();
                String filtro = jComboQuitanda.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Identificação")){
                    query = "WHERE id_quitanda LIKE '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("Nome Quitanda")){
                    query = "WHERE nome LIKE '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("Cliente")){
                    query = "WHERE cliente LIKE '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("Funcionário")){
                    query = "WHERE funcionario LIKE '%" + pesq + "%'";
                }
                QuitandaServicos qs = ServicosFactory.getQuitandaServicos();
                ArrayList<QuitandaVO> quis = qs.filtrarQuitanda(query);
                
                for (int i = 0 ; i < quis.size() ; i ++){
                    dtm.addRow(new String[]{
                        String.valueOf(quis.get(i).getIdQuitanda()),
                        quis.get(i).getNome(),
                        quis.get(i).getClientes(),
                        quis.get(i).getFuncionarios(),
                    
                    });
                }//fecha for
                jTableQuitanda.setModel(dtm);
            }//fecha else
           
        } catch (Exception e) {           
            jtPesqQuitanda.setText(null);
            JOptionPane.showMessageDialog(this,
                    "Erro no GUIManutencaoQuitanda " +e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//fecha método
    
    private void deletarQuitanda(){
       try {
           int linha = jTableQuitanda.getSelectedRow();
           if (linha == -1){
               JOptionPane.showMessageDialog(
                       this,
                       "Selecione Uma Linha");
           } else{
               String id = jTableQuitanda.getValueAt(linha, 0).toString();
               QuitandaServicos qs = ServicosFactory.getQuitandaServicos();
               qs.deletarQuitanda(Long.parseLong(id));
               
               JOptionPane.showMessageDialog(
                       this,
                       "Quitanda Deletada");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(
                   this,
                   "Erro no GUIManutencaoQuitanda " + e.getMessage(),
                   "ERRO",
                   JOptionPane.ERROR_MESSAGE);
        }   
       jtIdQuitanda.setText(null);
    }//fecha método
    
    private void alterarQuitanda(){
         try {
            int linha = jTableQuitanda.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione uma Linha");
            } else {
                String id = jTableQuitanda.getValueAt(linha, 0).toString();
                String nome = jTableQuitanda.getValueAt(linha, 1).toString();
                String valorCusto = jTableQuitanda.getValueAt(linha, 2).toString();
                String qtd = jTableQuitanda.getValueAt(linha, 3).toString();
                
                jtIdQuitanda.setText(id);
                jtNomeQuitanda.setText(nome);
                jtClienteQuitanda.setText(valorCusto);
                jtFuncionarioQuitanda.setText(qtd);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro no GUIManutencaoQuitanda " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//fecha método
    
    private void confirmarAlteracaoQuitanda() {
        try {
            QuitandaVO qVO = new QuitandaVO();
            
            qVO.setIdQuitanda(Long.parseLong(jtIdQuitanda.getText()));
            qVO.setNome(jtNomeQuitanda.getText());
            qVO.setClientes(jtClienteQuitanda.getText());
            qVO.setFuncionarios(jtFuncionarioQuitanda.getText());
            
            QuitandaServicos qs = servicos.ServicosFactory.getQuitandaServicos();
            
            qs.atualizarQuitanda(qVO);
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Quitanda Alterado Com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro no GUIManutencaoQuitanda " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
        jtIdQuitanda.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboQuitanda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQuitanda;
    private javax.swing.JButton jbAlterarQuitanda;
    private javax.swing.JButton jbAtualizarQuitanda;
    private javax.swing.JButton jbDeletarQuitanda;
    private javax.swing.JButton jbLimparQuitanda;
    private javax.swing.JTextField jtClienteQuitanda;
    private javax.swing.JTextField jtFuncionarioQuitanda;
    private javax.swing.JTextField jtIdQuitanda;
    private javax.swing.JTextField jtNomeQuitanda;
    private javax.swing.JTextField jtPesqQuitanda;
    // End of variables declaration//GEN-END:variables
}//fecha classe GUIManutencaoDeQuitanda
