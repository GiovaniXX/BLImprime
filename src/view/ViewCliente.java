package view;

import controller.ControllerCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;

public class ViewCliente extends javax.swing.JFrame {

    ControllerCliente controllerClientes = new ControllerCliente();
    ModelCliente modelClientes = new ModelCliente();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    String alterarSalvar;

    public ViewCliente() {
        initComponents();
        carregarClientes();
        desabilitaHabilitaCampos(false);
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTFcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFendereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFbairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFcidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JCBuf = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JTFcep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTFtelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTcliente = new javax.swing.JTable();
        JBcancelar = new javax.swing.JButton();
        JBexcluir = new javax.swing.JButton();
        JBrelClientes = new javax.swing.JButton();
        JBnovo = new javax.swing.JButton();
        JBalterar = new javax.swing.JButton();
        JBsalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface Cliente");

        jPanel1.setBackground(new java.awt.Color(8, 13, 32));

        jLabel1.setText("Codigo :");

        JTFcodigo.setBackground(new java.awt.Color(73, 128, 231));

        jLabel2.setText("Nome :");

        JTFnome.setBackground(new java.awt.Color(73, 128, 231));

        jLabel3.setText("Endereco :");

        JTFendereco.setBackground(new java.awt.Color(73, 128, 231));

        jLabel4.setText("Bairro :");

        JTFbairro.setBackground(new java.awt.Color(73, 128, 231));

        jLabel5.setText("Cidade :");

        JTFcidade.setBackground(new java.awt.Color(73, 128, 231));

        jLabel6.setText("UF :");

        JCBuf.setBackground(new java.awt.Color(73, 128, 231));
        JCBuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("CEP :");

        JTFcep.setBackground(new java.awt.Color(73, 128, 231));

        jLabel8.setText("Telefone :");

        JTFtelefone.setBackground(new java.awt.Color(73, 128, 231));

        JTcliente.setBackground(new java.awt.Color(73, 128, 231));
        JTcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome Cliente", "Cidade", "telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTcliente.setGridColor(new java.awt.Color(73, 128, 231));
        JTcliente.setSelectionBackground(new java.awt.Color(73, 128, 231));
        JTcliente.setSelectionForeground(new java.awt.Color(73, 128, 231));
        jScrollPane1.setViewportView(JTcliente);
        if (JTcliente.getColumnModel().getColumnCount() > 0) {
            JTcliente.getColumnModel().getColumn(0).setResizable(false);
            JTcliente.getColumnModel().getColumn(1).setResizable(false);
            JTcliente.getColumnModel().getColumn(2).setResizable(false);
            JTcliente.getColumnModel().getColumn(3).setResizable(false);
        }

        JBcancelar.setBackground(new java.awt.Color(73, 128, 231));
        JBcancelar.setText("Cancelar");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });

        JBexcluir.setBackground(new java.awt.Color(73, 128, 231));
        JBexcluir.setText("Excluir");
        JBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexcluirActionPerformed(evt);
            }
        });

        JBrelClientes.setBackground(new java.awt.Color(73, 128, 231));
        JBrelClientes.setText("Rel. Clientes");
        JBrelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBrelClientesActionPerformed(evt);
            }
        });

        JBnovo.setBackground(new java.awt.Color(73, 128, 231));
        JBnovo.setText("Novo");
        JBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnovoActionPerformed(evt);
            }
        });

        JBalterar.setBackground(new java.awt.Color(73, 128, 231));
        JBalterar.setText("Alterar");
        JBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBalterarActionPerformed(evt);
            }
        });

        JBsalvar.setBackground(new java.awt.Color(73, 128, 231));
        JBsalvar.setText("Salvar");
        JBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTFendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTFbairro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTFcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JCBuf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTFcep, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTFtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBrelClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBrelClientes)
                    .addComponent(JBexcluir)
                    .addComponent(JBcancelar)
                    .addComponent(JBnovo)
                    .addComponent(JBalterar)
                    .addComponent(JBsalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnovoActionPerformed
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
        alterarSalvar = "salvar";
    }//GEN-LAST:event_JBnovoActionPerformed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_JBcancelarActionPerformed

    private void JBrelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBrelClientesActionPerformed
        ControllerCliente.gerarRelatorioCliente();
    }//GEN-LAST:event_JBrelClientesActionPerformed

    private void JBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalvarActionPerformed
        try {
            modelClientes.setIdCliente(Integer.parseInt(this.JTFcodigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelClientes.setCliNome(this.JTFnome.getText());
        modelClientes.setCliEndereco(this.JTFendereco.getText());
        modelClientes.setCliBairro(this.JTFbairro.getText());
        modelClientes.setCliCidade(this.JTFcidade.getText());
        modelClientes.setCliUf(this.JCBuf.getSelectedItem().toString());
        modelClientes.setCliCep(this.JTFcep.getText());
        modelClientes.setCliTelefone(this.JTFtelefone.getText());

        if (alterarSalvar.equals("salvar")) {
            if (controllerClientes.salvarClienteController(modelClientes) > 0) {
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarClientes();
                desabilitaHabilitaCampos(false);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar registro!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (controllerClientes.atualizarClienteController(modelClientes)) {
                JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarClientes();
                desabilitaHabilitaCampos(false);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar registro!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JBsalvarActionPerformed

    private void JBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexcluirActionPerformed
        int linha = JTcliente.getSelectedRow();
        int codigoProduto = (int) JTcliente.getValueAt(linha, 0);
        if (controllerClientes.excluirClienteController(codigoProduto)) {
            JOptionPane.showMessageDialog(this, "Cliente excluido com successo!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarClientes();
            //habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBexcluirActionPerformed

    private void JBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBalterarActionPerformed
        int linha = JTcliente.getSelectedRow();
        int codigoCliente = (int) JTcliente.getValueAt(linha, 0);
        alterarSalvar = "alterar";

        modelClientes = controllerClientes.getClienteController(codigoCliente);
        JTFcodigo.setText(String.valueOf(modelClientes.getIdCliente()));
        JTFnome.setText(modelClientes.getCliNome());
        JTFendereco.setText(modelClientes.getCliEndereco());
        JTFbairro.setText(modelClientes.getCliBairro());
        JTFcidade.setText(modelClientes.getCliCidade());
        JCBuf.setSelectedItem(modelClientes.getCliUf());
        JTFcep.setText(modelClientes.getCliCep());
        JTFtelefone.setText(modelClientes.getCliTelefone());

        this.desabilitaHabilitaCampos(true);
    }//GEN-LAST:event_JBalterarActionPerformed

    private void desabilitaHabilitaCampos(boolean condicao) {
        JTFnome.setEnabled(condicao);
        JTFendereco.setEnabled(condicao);
        JTFbairro.setEnabled(condicao);
        JTFcidade.setEnabled(condicao);
        JCBuf.setEnabled(condicao);
        JTFcep.setEnabled(condicao);
        JTFtelefone.setEnabled(condicao);
        JBsalvar.setEnabled(condicao);
    }

    // Carregar clientes na tabela
    private void carregarClientes() {
        listaModelClientes = controllerClientes.getListaClientesController();
        DefaultTableModel modelo = (DefaultTableModel) JTcliente.getModel();
        modelo.setNumRows(0);

        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getIdCliente(),
                listaModelClientes.get(i).getCliNome(),
                listaModelClientes.get(i).getCliCidade(),
                listaModelClientes.get(i).getCliTelefone()
            });
        }
    }

    private void limparCampos() {
        JTFnome.setText("");
        JTFendereco.setText("");
        JTFbairro.setText("");
        JTFcidade.setText("");
        JTFcep.setText("");
        JTFtelefone.setText("");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBalterar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JButton JBexcluir;
    private javax.swing.JButton JBnovo;
    private javax.swing.JButton JBrelClientes;
    private javax.swing.JButton JBsalvar;
    private javax.swing.JComboBox<String> JCBuf;
    private javax.swing.JTextField JTFbairro;
    private javax.swing.JTextField JTFcep;
    private javax.swing.JTextField JTFcidade;
    private javax.swing.JTextField JTFcodigo;
    private javax.swing.JTextField JTFendereco;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTextField JTFtelefone;
    private javax.swing.JTable JTcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
