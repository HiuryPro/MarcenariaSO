/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Compra_Venda_Telas.ComVenTela;
import estoqueTelas.EstoqueTela;
import MP_Mov_Telas.MatMov;
import clienteTelas.ClieteTela;
import fornecedorTelas.FornTela;
import compravenda.Compra;
import compravenda.Materia_Prima;
import compravenda.Movel;
import compravenda.Venda;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pessoa.Cliente;
import pessoa.Fornecedor;

/**
 *
 * @author Hiury
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    public ArrayList<Materia_Prima> materiasprimas = new ArrayList<Materia_Prima>();
    public ArrayList<Movel> moveis = new ArrayList<Movel>();
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public ArrayList<Venda> vendas = new ArrayList<Venda>();
    public ArrayList<Compra> compras = new ArrayList<Compra>();

    public String teste = "deu ruim";

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        materia.setText("<html> Matérias Primas/<br> Moveis<html>");
        setIcon();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("SerraDourada.png"))); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        materia = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tela = new javax.swing.JDesktopPane();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marcenaria Serra de Ouro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 168, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Compra/Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 190, 147));

        jButton2.setBackground(new java.awt.Color(255, 168, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Estoque");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 190, 147));

        materia.setBackground(new java.awt.Color(255, 168, 0));
        materia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaActionPerformed(evt);
            }
        });
        getContentPane().add(materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 190, 147));

        jButton4.setBackground(new java.awt.Color(255, 168, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Fornecedores");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 190, 147));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serradeouroicon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 147));

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(tela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1180, 440));

        jButton5.setBackground(new java.awt.Color(255, 168, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("Clientes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 190, 147));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        EstoqueTela estoq = new EstoqueTela(this, materiasprimas, moveis);
        tela.add(estoq);
        estoq.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaActionPerformed
        MatMov estoq = new MatMov(this, materiasprimas, moveis);
        tela.add(estoq);
        estoq.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_materiaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FornTela estoq = new FornTela(this, fornecedores, materiasprimas);
        tela.add(estoq);
        estoq.setVisible(true);
// // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ClieteTela estoq = new ClieteTela(this, clientes);
        tela.add(estoq);
        estoq.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ComVenTela estoq = new ComVenTela(this, materiasprimas, moveis, fornecedores, clientes, compras, vendas);
        tela.add(estoq);
        estoq.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton materia;
    private javax.swing.JDesktopPane tela;
    // End of variables declaration//GEN-END:variables
}
