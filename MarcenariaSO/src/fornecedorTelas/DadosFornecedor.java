/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedorTelas;

import Principal.TelaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pessoa.Fornecedor;

/**
 *
 * @author Hiury
 */
public class DadosFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form DadosFornecedor
     */
    public TelaPrincipal tP;
    public ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

    public DadosFornecedor(TelaPrincipal tP, ArrayList<Fornecedor> forn) {

        initComponents();
        this.tP = tP;
        fornecedores = forn;

        pr.setVisible(true);
        mptela.setVisible(true);

        pegaF();
    }

    public void pegaF() {

        cbFornecedor.addItem(" ");

        for (int i = 0; i < fornecedores.size(); i++) {
            cbFornecedor.addItem(fornecedores.get(i).getNome());

        }

    }

    public void pegaDados() {

        for (int i = 0; i < fornecedores.size(); i++) {
            if (fornecedores.get(i).getNome().equals(String.valueOf(cbFornecedor.getSelectedItem()))) {

                nomeField.setText(fornecedores.get(i).getNome());
                cnpjField.setText(fornecedores.get(i).cnpj.replaceAll("[^0-9]+", ""));
                emailField.setText(fornecedores.get(i).getEmail());
                telefoneField.setText(fornecedores.get(i).getTelefone().replaceAll("[^0-9]+", ""));
                estadoField.setText(fornecedores.get(i).getEstado());
                cidadeField.setText(fornecedores.get(i).getCidade());
                inscEField.setText(fornecedores.get(i).inscE);
                descricaoTA.setText(fornecedores.get(i).descricao);

                comboMP();

                i = fornecedores.size();
            }

        }

    }

    public void comboMP() {
        mpCombo.removeAllItems();
        mpCombo.addItem(" ");
        for (int j = 0; j < fornecedores.get(cbFornecedor.getSelectedIndex() - 1).nomeMP.size(); j++) {
            mpCombo.addItem(fornecedores.get(cbFornecedor.getSelectedIndex() - 1).nomeMP.get(j));
        }

    }

    public void pegaMP() {
        for (int i = 0; i < fornecedores.get(cbFornecedor.getSelectedIndex() - 1).nomeMP.size(); i++) {
            if (fornecedores.get(cbFornecedor.getSelectedIndex() - 1).nomeMP.get(i).equals(String.valueOf(mpCombo.getSelectedItem()))) {
                mpNome.setText(fornecedores.get(cbFornecedor.getSelectedIndex() - 1).nomeMP.get(i));
                mpPreco.setText(fornecedores.get(cbFornecedor.getSelectedIndex() - 1).precoF.get(i));
                mpFrete.setText(fornecedores.get(cbFornecedor.getSelectedIndex() - 1).frete.get(i));
            }
        }

    }

    private void atualizaFornecedor() {

        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).setNome(nomeField.getText());
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).cnpj = cnpjField.getText().replaceAll("[^0-9]+", "");
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).setEstado(estadoField.getText());
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).setCidade(cidadeField.getText());
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).setTelefone(telefoneField.getText().replaceAll("[^0-9]+", ""));
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).descricao = descricaoTA.getText();
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).inscE = inscEField.getText().replaceAll("[^0-9]+", "");
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).setEmail(emailField.getText());
        tP.fornecedores = this.fornecedores;
    }

    public void atualizaFMP() {
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).nomeMP.set(mpCombo.getSelectedIndex() - 1, mpNome.getText());
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).precoF.set(mpCombo.getSelectedIndex() - 1, mpPreco.getText());
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).frete.set(mpCombo.getSelectedIndex() - 1, mpFrete.getText());
        tP.fornecedores = this.fornecedores;
    }

    public void deletaFMP() {
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).nomeMP.remove(mpCombo.getSelectedIndex() - 1);
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).precoF.remove(mpCombo.getSelectedIndex() - 1);
        fornecedores.get(cbFornecedor.getSelectedIndex() - 1).frete.remove(mpCombo.getSelectedIndex() - 1);
        tP.fornecedores = this.fornecedores;
    }

    public void deletaFornecedor() {
        fornecedores.remove(cbFornecedor.getSelectedIndex() - 1);
        tP.fornecedores = this.fornecedores;
    }

    public void ConfirmaDF() {
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja Deletar todos os Dados do Fornecedor?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            deletaFornecedor();
            cbFornecedor.removeAllItems();
            pegaF();
            pr.setVisible(false);

        } else {
            // tabela.setValueAt()
        }

    }

    public void ConfirmaAF() {
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja Alterar os Dados do Fornecedor?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            atualizaFornecedor();
            cbFornecedor.removeAllItems();
            pegaF();

            cbFornecedor.setSelectedItem(nomeField.getText());

        } else {
            // tabela.setValueAt()
        }

    }

    public void ConfirmaDFMP() {
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja Deletar os Dados do Produto?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            deletaFMP();
            mpCombo.removeAllItems();
            comboMP();
            mptela.setVisible(false);

        } else {
            // tabela.setValueAt()
        }

    }

    public void ConfirmaAFMP() {
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja Alterar os Dados do Produto?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            atualizaFMP();
            mpCombo.removeAllItems();
            comboMP();

            mpCombo.setSelectedItem(mpNome.getText());

        } else {
            // tabela.setValueAt()
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox<>();
        pr = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoTA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        estadoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeField = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cnpjField = new javax.swing.JFormattedTextField();
        inscEField = new javax.swing.JFormattedTextField();
        telefoneField = new javax.swing.JFormattedTextField();
        cidadeField = new javax.swing.JTextField();
        mpCombo = new javax.swing.JComboBox<>();
        mptela = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mpFrete = new javax.swing.JFormattedTextField();
        mpNome = new javax.swing.JFormattedTextField();
        mpPreco = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Fornecedores");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        cbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, 30));

        pr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Email:");
        pr.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Estado:");
        pr.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pr.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Descrição");
        pr.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        descricaoTA.setColumns(20);
        descricaoTA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoTA.setLineWrap(true);
        descricaoTA.setRows(5);
        descricaoTA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descricaoTA);

        pr.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 370, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Inscrição Estadual");
        pr.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));
        pr.add(estadoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Nome:");
        pr.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 67, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Telefone:");
        pr.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 87, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("CNPJ:");
        pr.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 67, -1));

        nomeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });
        pr.add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Cidade:");
        pr.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        try {
            cnpjField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpjField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pr.add(cnpjField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 150, 35));

        try {
            inscEField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inscEField.setText("   .   .   .");
        inscEField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pr.add(inscEField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 150, 35));

        try {
            telefoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pr.add(telefoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 150, 35));
        pr.add(cidadeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 150, 35));

        mpCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        mpCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpComboActionPerformed(evt);
            }
        });
        pr.add(mpCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 120, 30));

        mptela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Materia Prima");
        mptela.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Preco");
        mptela.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Frete");
        mptela.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mptela.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mptela.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 30));

        mpFrete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mpFrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpFreteActionPerformed(evt);
            }
        });
        mptela.add(mpFrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 160, 35));

        mpNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpNomeActionPerformed(evt);
            }
        });
        mptela.add(mpNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 160, 35));

        mpPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mpPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpPrecoActionPerformed(evt);
            }
        });
        mptela.add(mpPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 160, 35));

        pr.add(mptela, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, 240));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Alterar Dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pr.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Deletar Fornecedor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pr.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 30));

        getContentPane().add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 790, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void mpFreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpFreteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpFreteActionPerformed

    private void mpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpNomeActionPerformed

    private void mpPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpPrecoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ConfirmaAF();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mpComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpComboActionPerformed
        if (!" ".equals(String.valueOf(mpCombo.getSelectedItem()))) {
            mptela.setVisible(true);
            pegaMP();
        } else {
            mptela.setVisible(false);
        }
    }//GEN-LAST:event_mpComboActionPerformed

    private void cbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFornecedorActionPerformed
        if (!" ".equals(String.valueOf(cbFornecedor.getSelectedItem()))) {

            pr.setVisible(true);
            mptela.setVisible(true);

            pegaDados();

        } else {
            mptela.setVisible(false);
            pr.setVisible(false);

        }
    }//GEN-LAST:event_cbFornecedorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ConfirmaDF();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConfirmaAFMP(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConfirmaDFMP();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFornecedor;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JFormattedTextField cnpjField;
    private javax.swing.JTextArea descricaoTA;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField estadoField;
    private javax.swing.JFormattedTextField inscEField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mpCombo;
    private javax.swing.JFormattedTextField mpFrete;
    private javax.swing.JFormattedTextField mpNome;
    private javax.swing.JFormattedTextField mpPreco;
    private javax.swing.JPanel mptela;
    private javax.swing.JFormattedTextField nomeField;
    private javax.swing.JPanel pr;
    private javax.swing.JFormattedTextField telefoneField;
    // End of variables declaration//GEN-END:variables
}
