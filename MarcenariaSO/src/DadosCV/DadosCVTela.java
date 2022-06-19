/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DadosCV;

import Compra_Venda_Telas.*;
import Principal.TelaPrincipal;
import compravenda.Compra;
import compravenda.Materia_Prima;
import compravenda.Movel;
import compravenda.Venda;
import java.util.ArrayList;
import pessoa.Cliente;
import pessoa.Fornecedor;

/**
 *
 * @author Hiury
 */
public class DadosCVTela extends javax.swing.JInternalFrame {

    /**
     * Creates new form Estoque
     */
   
    public ArrayList<Compra> compras = new ArrayList<Compra>();
    public ArrayList<Venda> vendas = new ArrayList<Venda>();
    public TelaPrincipal tP;

    public DadosCVTela(TelaPrincipal vai, ArrayList<Compra> comp, ArrayList<Venda> vend) {
        initComponents();
        tP = vai;
        compras = comp;
        vendas = vend;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estoque1 = new javax.swing.JButton();
        telaCV = new javax.swing.JDesktopPane();
        estoque2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Realizar compra ou venda");

        estoque1.setBackground(new java.awt.Color(255, 168, 0));
        estoque1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estoque1.setText("Compra");
        estoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoque1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCVLayout = new javax.swing.GroupLayout(telaCV);
        telaCV.setLayout(telaCVLayout);
        telaCVLayout.setHorizontalGroup(
            telaCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        telaCVLayout.setVerticalGroup(
            telaCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        estoque2.setBackground(new java.awt.Color(255, 168, 0));
        estoque2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estoque2.setText("Venda");
        estoque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoque2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoque2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(telaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(estoque2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(telaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estoque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoque2ActionPerformed
        RelatorioC tela = new RelatorioC(compras);
        telaCV.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_estoque2ActionPerformed

    private void estoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoque1ActionPerformed
        CompraTela tela = new CompraTela(tP, materiasP, fornecedores, compras);
        telaCV.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_estoque1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton estoque1;
    private javax.swing.JButton estoque2;
    private javax.swing.JDesktopPane telaCV;
    // End of variables declaration//GEN-END:variables
}