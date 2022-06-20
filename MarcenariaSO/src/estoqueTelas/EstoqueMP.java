/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoqueTelas;

import Principal.TelaPrincipal;
import compravenda.Materia_Prima;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hiury
 */
public class EstoqueMP extends javax.swing.JInternalFrame {

    /**
     * Creates new form EstoqueMP
     */
    ArrayList<Materia_Prima> materiasP = new ArrayList<Materia_Prima>();
    TelaPrincipal tp;

    public EstoqueMP(TelaPrincipal tP, ArrayList<Materia_Prima> mP) {
        initComponents();
        this.tp = tP;
        materiasP = mP;
        pegaMP();

    }

    public void pegaMP() {

        mPCombo.addItem(" ");
        for (int i = 0; i < materiasP.size(); i++) {
            mPCombo.addItem(materiasP.get(i).nome);
        }

    }

    public void pegaDados() {

        for (int i = 0; i < materiasP.size(); i++) {
            if (String.valueOf(mPCombo.getSelectedItem()).equals(materiasP.get(i).nome)) {
                nomeMPField.setText(materiasP.get(i).nome);
                quantMPField.setText(String.valueOf(materiasP.get(i).quantEstoque));
                descricaoMPField.setText(materiasP.get(i).descricao);
                precoMPField.setText(String.valueOf(materiasP.get(i).precoUnit));

                i = materiasP.size();
            }

        }

    }

    public void atualizaMP() {

        materiasP.get(mPCombo.getSelectedIndex() - 1).nome = nomeMPField.getText();
        materiasP.get(mPCombo.getSelectedIndex() - 1).precoUnit = Float.parseFloat(precoMPField.getText());
        materiasP.get(mPCombo.getSelectedIndex() - 1).quantEstoque = Integer.parseInt(quantMPField.getText());
        materiasP.get(mPCombo.getSelectedIndex() - 1).descricao = descricaoMPField.getText();
        tp.materiasprimas = this.materiasP;
    }

    public void deletaMP() {
        materiasP.remove(mPCombo.getSelectedIndex() - 1);
        tp.materiasprimas = this.materiasP;
    }

    public void ConfirmaDMP() {
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja Deletar todos os Dados da Matéria Prima?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            deletaMP();
            mPCombo.removeAllItems();
            pegaMP();
            pr.setVisible(false);

        } else {
            // tabela.setValueAt()
        }

    }

    public void ConfirmaAMP() {
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja Alterar os Dados da Matéria Prima?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            atualizaMP();
            mPCombo.removeAllItems();
            pegaMP();

            mPCombo.setSelectedItem(nomeMPField.getText());

        } else {
            // tabela.setValueAt()
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        mPCombo = new javax.swing.JComboBox<>();
        pr = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        quantMPField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nomeMPField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoMPField = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        del = new javax.swing.JButton();
        alt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        precoMPField = new javax.swing.JTextField();

        setClosable(true);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Matéria Prima");

        mPCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPComboActionPerformed(evt);
            }
        });

        pr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Nome do Produto");
        pr.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        quantMPField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantMPFieldActionPerformed(evt);
            }
        });
        pr.add(quantMPField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Quantidade");
        pr.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));
        pr.add(nomeMPField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 30));

        descricaoMPField.setColumns(20);
        descricaoMPField.setRows(5);
        jScrollPane1.setViewportView(descricaoMPField);

        pr.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 500, 100));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Descrição do Produto");
        pr.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        del.setText("Deletar");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        pr.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 90, 30));

        alt.setText("Alterar");
        alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altActionPerformed(evt);
            }
        });
        pr.add(alt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Preço unitario (MP)");
        pr.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        precoMPField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoMPFieldActionPerformed(evt);
            }
        });
        pr.add(precoMPField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mPCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12)))
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mPCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mPComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPComboActionPerformed
        if (!" ".equals(String.valueOf(mPCombo.getSelectedItem()))) {
            pr.setVisible(true);
            pegaDados();
        } else {
            pr.setVisible(false);
        }
    }//GEN-LAST:event_mPComboActionPerformed

    private void quantMPFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantMPFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantMPFieldActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        ConfirmaDMP();
    }//GEN-LAST:event_delActionPerformed

    private void altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altActionPerformed
        ConfirmaAMP();
    }//GEN-LAST:event_altActionPerformed

    private void precoMPFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoMPFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoMPFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alt;
    private javax.swing.JButton del;
    private javax.swing.JTextArea descricaoMPField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mPCombo;
    private javax.swing.JTextField nomeMPField;
    private javax.swing.JPanel pr;
    private javax.swing.JTextField precoMPField;
    private javax.swing.JTextField quantMPField;
    // End of variables declaration//GEN-END:variables
}
