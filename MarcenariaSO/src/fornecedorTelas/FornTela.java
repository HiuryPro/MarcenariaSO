/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedorTelas;

import Principal.TelaPrincipal;
import compravenda.Materia_Prima;
import java.util.ArrayList;
import pessoa.Fornecedor;

/**
 *
 * @author Hiury
 */
public class FornTela extends javax.swing.JInternalFrame {

    /**
     * Creates new form Estoque
     */
    ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    ArrayList<Materia_Prima> materiasP = new ArrayList<Materia_Prima>();
    TelaPrincipal teste2;
    CadForn telaF;
    CadFornMP telaFMP;

    public FornTela(TelaPrincipal vaiM, ArrayList<Fornecedor> forn, ArrayList<Materia_Prima> mP) {
        initComponents();
        estoque1.setText("<html> Fornecedor  Matéria Prima<html>");
        estoque2.setText("<html> Fornecedor  Dados <html>");
        teste2 = vaiM;
        fornecedores = forn;
        materiasP = mP;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estoque = new javax.swing.JButton();
        estoque2 = new javax.swing.JButton();
        tela2 = new javax.swing.JDesktopPane();
        estoque1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro e dados dos Fornecedores");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1180, 447));

        estoque.setBackground(new java.awt.Color(255, 168, 0));
        estoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estoque.setText("Fornecedor");
        estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueActionPerformed(evt);
            }
        });

        estoque2.setBackground(new java.awt.Color(255, 168, 0));
        estoque2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estoque2.setText("Relatório");
        estoque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoque2ActionPerformed(evt);
            }
        });

        tela2.setPreferredSize(new java.awt.Dimension(800, 408));

        javax.swing.GroupLayout tela2Layout = new javax.swing.GroupLayout(tela2);
        tela2.setLayout(tela2Layout);
        tela2Layout.setHorizontalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        tela2Layout.setVerticalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        estoque1.setBackground(new java.awt.Color(255, 168, 0));
        estoque1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estoque1.setText("jButton2");
        estoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoque1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoque2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(tela2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tela2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(estoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(estoque2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoque1ActionPerformed
        telaFMP = new CadFornMP(teste2, fornecedores, materiasP);
        tela2.add(telaFMP);
        telaFMP.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_estoque1ActionPerformed

    private void estoque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoque2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estoque2ActionPerformed

    private void estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueActionPerformed
        telaF = new CadForn(teste2, fornecedores);
        tela2.add(telaF);
        telaF.setVisible(true);
    }//GEN-LAST:event_estoqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton estoque;
    private javax.swing.JButton estoque1;
    private javax.swing.JButton estoque2;
    private javax.swing.JDesktopPane tela2;
    // End of variables declaration//GEN-END:variables
}
