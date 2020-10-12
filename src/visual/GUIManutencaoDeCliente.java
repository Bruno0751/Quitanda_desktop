//PROJECT NAME: prjBruno-quitanda
package visual;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClienteVO;
import servicos.ClienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:03
 * @version 1.0 beta
 */
public class GUIManutencaoDeCliente extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "CPF", "Idade"});
    /**
     * Creates new form GUIManutencaoDeCliente
     */
    public GUIManutencaoDeCliente() {
        initComponents();
        atualizaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtPesqCliente = new javax.swing.JTextField();
        jComboCliete = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliete = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbAtualizarCliete = new javax.swing.JButton();
        jbLimparCliete = new javax.swing.JButton();
        jbAlterarCliete = new javax.swing.JButton();
        jbDeletarCliete = new javax.swing.JButton();
        jtIdCliente = new javax.swing.JTextField();
        jtNomeCliente = new javax.swing.JTextField();
        jtCPF = new javax.swing.JTextField();
        jtIdadeCliente = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manutenção de Cliente");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtPesqCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqClienteKeyReleased(evt);
            }
        });

        jComboCliete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Sobre Nome", "Idade" }));
        jComboCliete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboClieteItemStateChanged(evt);
            }
        });
        jComboCliete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboClieteKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jtPesqCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jComboCliete, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCliete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTableCliete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Idade"
            }
        ));
        jTableCliete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClieteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliete);
        if (jTableCliete.getColumnModel().getColumnCount() > 0) {
            jTableCliete.getColumnModel().getColumn(0).setResizable(false);
            jTableCliete.getColumnModel().getColumn(1).setResizable(false);
            jTableCliete.getColumnModel().getColumn(2).setResizable(false);
            jTableCliete.getColumnModel().getColumn(3).setResizable(false);
        }

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAtualizarCliete.setText("Atualizar");
        jbAtualizarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarClieteActionPerformed(evt);
            }
        });

        jbLimparCliete.setText("Limpar");
        jbLimparCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparClieteActionPerformed(evt);
            }
        });

        jbAlterarCliete.setText("Alterar");
        jbAlterarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarClieteActionPerformed(evt);
            }
        });

        jbDeletarCliete.setText("Deletar");
        jbDeletarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarClieteActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jbAtualizarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimparCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbAlterarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbDeletarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jbAtualizarCliete)
                .addGap(64, 64, 64)
                .addComponent(jbAlterarCliete)
                .addGap(66, 66, 66)
                .addComponent(jbDeletarCliete)
                .addGap(78, 78, 78)
                .addComponent(jbLimparCliete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizarCliete)
                    .addComponent(jbLimparCliete)
                    .addComponent(jbAlterarCliete)
                    .addComponent(jbDeletarCliete))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jtIdCliente.setEnabled(false);

        jLabelID.setText("Código");

        jLabelNome.setText("Nome");

        jLabelCPF.setText("cpf");

        jLabelIdade.setText("Idade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jtNomeCliente))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtIdadeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jtCPF))))
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabelID)
                        .addGap(178, 178, 178)
                        .addComponent(jLabelCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabelNome)
                        .addGap(203, 203, 203)
                        .addComponent(jLabelIdade)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparTabela(){
        dtm.setNumRows(0);
        jtNomeCliente.setText(null);
        jtCPF.setText(null);
        jtIdadeCliente.setText(null);
    }
    
    private void atualizaTabela() {
        try {
            //Buscando objeto ProdutoServicos     
            ClienteServicos cs = ServicosFactory.getClieteServicos();
            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<ClienteVO> cls = new ArrayList<>();
            //Recebendo o ArrayList cheio em produtos
            cls = cs.buscarCliente();

            for (int i = 0; i < cls.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(cls.get(i).getIdCliente()),
                    String.valueOf(cls.get(i).getNome()),
                    String.valueOf(cls.get(i).getCpf()),
                    String.valueOf(cls.get(i).getIdade()),    
                });
            }//fecha for
            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jTableCliete.setModel(dtm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Erro No GUIManutecaoCliente " + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }//fecha catch
        jtIdCliente.setText(null);
    }//fecha preencherTabela
    
    private void deletarFruta(){
       try {
           int linha = jTableCliete.getSelectedRow();
           if (linha == -1){
               JOptionPane.showMessageDialog(
                       this,
                       "Selecione Uma Linha");
           } else{
               String id = jTableCliete.getValueAt(linha, 0).toString();
               ClienteServicos cls = ServicosFactory.getClieteServicos();
               cls.deletarCliente(Long.parseLong(id));
               
               JOptionPane.showMessageDialog(
                       this,
                       "Cliente Deletado");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(
                   this,
                   "Erro no GUIManutencaoCliente " + e.getMessage(),
                   "ERRO",
                   JOptionPane.ERROR_MESSAGE);
        }   
       jtIdCliente.setText(null);
    }//fecha método
    
    private void filtrarCliente(){
       try {
           if (jtPesqCliente.getText().isEmpty()){
               atualizaTabela();
           } else{
                String pesq = jtPesqCliente.getText();
                String filtro = jComboCliete.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Código")){
                    query = "WHERE id_cliente LIKE '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("Nome")){
                    query = "WHERE nome LIKE '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("CPF")){
                    query = "WHERE cpf LIKE '%" + pesq + "%'";        
                } else if (filtro.equalsIgnoreCase("Idade")){
                    query = "WHERE idade LIKE '%" + pesq + "%'";
                }
                
                ClienteServicos cls = ServicosFactory.getClieteServicos();
                ArrayList<ClienteVO> clis = cls.filtrarCliente(query);
                
                for (int i = 0 ; i < clis.size() ; i ++){
                    dtm.addRow(new String[]{
                        String.valueOf(clis.get(i).getIdCliente()),
                        clis.get(i).getNome(),
                        clis.get(i).getCpf(),
                        String.valueOf(clis.get(i).getIdade()),
                    
                    });
                }
                jTableCliete.setModel(dtm);
            }
           
        } catch (Exception e) {           
            jtPesqCliente.setText(null);
            JOptionPane.showMessageDialog(this,
                    "Erro no GUIManutencaoCliente " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//fecha método
    
    private void alterarCliente(){
         try {
            int linha = jTableCliete.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione uma linha!");
            } else {
                String id = jTableCliete.getValueAt(linha, 0).toString();
                String nome = jTableCliete.getValueAt(linha, 1).toString();
                String cpf = jTableCliete.getValueAt(linha, 2).toString();
                String idade = jTableCliete.getValueAt(linha, 3).toString();
                
                jtIdCliente.setText(id);
                jtNomeCliente.setText(nome);
                jtCPF.setText(cpf);
                jtIdadeCliente.setText(idade);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro no GUIManutencaoCliete " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//fecha método
    
    private void confirmarAlteracao() {
        try {
            ClienteVO clVO = new ClienteVO();
            clVO.setIdCliente(Long.parseLong(jtIdCliente.getText()));
            clVO.setNome(jtNomeCliente.getText());
            clVO.setCpf(jtCPF.getText());
            clVO.setIdade(Integer.parseInt(jtIdadeCliente.getText()));
            
            ClienteServicos cls = servicos.ServicosFactory.getClieteServicos();
            
            cls.alterarCliente(clVO);
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Cliente Alterado Com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro no GUIManutencaoCliente " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
        jtIdCliente.setText(null);
    }
    
    private void jbLimparClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparClieteActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparClieteActionPerformed

    private void jbAtualizarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarClieteActionPerformed
        limparTabela();
        atualizaTabela();
    }//GEN-LAST:event_jbAtualizarClieteActionPerformed

    private void jtPesqClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqClienteKeyReleased
        limparTabela();
        filtrarCliente();
    }//GEN-LAST:event_jtPesqClienteKeyReleased

    private void jComboClieteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboClieteItemStateChanged
        limparTabela();
        filtrarCliente();
    }//GEN-LAST:event_jComboClieteItemStateChanged

    private void jComboClieteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboClieteKeyReleased
        limparTabela();
        filtrarCliente();
    }//GEN-LAST:event_jComboClieteKeyReleased

    private void jbDeletarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarClieteActionPerformed
        deletarFruta();
        limparTabela();
        atualizaTabela();
    }//GEN-LAST:event_jbDeletarClieteActionPerformed

    private void jbAlterarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarClieteActionPerformed
        confirmarAlteracao();
        limparTabela();
        atualizaTabela();
    }//GEN-LAST:event_jbAlterarClieteActionPerformed

    private void jTableClieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClieteMouseClicked
        alterarCliente();
    }//GEN-LAST:event_jTableClieteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboCliete;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliete;
    private javax.swing.JButton jbAlterarCliete;
    private javax.swing.JButton jbAtualizarCliete;
    private javax.swing.JButton jbDeletarCliete;
    private javax.swing.JButton jbLimparCliete;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtIdadeCliente;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JTextField jtPesqCliente;
    // End of variables declaration//GEN-END:variables
}//fecha classe GUIManutencaoDeCliete
