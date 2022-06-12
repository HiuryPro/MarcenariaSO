/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;
import pessoa.Cliente;

/**
 *
 * @author Hiury
 */
public class DadosCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form DadosClien
     */
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public DadosCliente(TelaPrincipal vai, ArrayList<Cliente> cliente) {
        initComponents();
        clientes = cliente;
        pegaC();
    }

    public void pegaC() {

        clien.addItem(" ");
        for (int i = 0; i < clientes.size(); i++) {

            clien.addItem(clientes.get(i).getNome());
        }

    }

    public void pegaDados() {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equals(String.valueOf(clien.getSelectedItem()))) {

                edtNome.setText(clientes.get(i).getNome());
                cpfField.setText(clientes.get(i).getCpf().replaceAll("[^0-9]+", ""));
                emailField.setText(clientes.get(i).getEmail());
                telefoneField.setText(clientes.get(i).getTelefone().replaceAll("[^0-9]+", ""));
                estadoField.setText(clientes.get(i).getEstado());
                cidadeField.setText(clientes.get(i).getCidade());
                enderecoField.setText(clientes.get(i).getEndereco());
                descricaoTA.setText(clientes.get(i).descricao);
                descontoField.setText(String.valueOf(clientes.get(i).desconto));
                i = clientes.size();
            }

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

        jLabel1 = new javax.swing.JLabel();
        clien = new javax.swing.JComboBox<>();
        telaC = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoTA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        altera = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cidadeField = new javax.swing.JTextField();
        estadoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        descontoField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cpfField = new javax.swing.JFormattedTextField();
        telefoneField = new javax.swing.JFormattedTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cliente");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        clien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienActionPerformed(evt);
            }
        });
        getContentPane().add(clien, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 130, 30));

        telaC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Descrição");
        telaC.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        telaC.add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome");
        telaC.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        descricaoTA.setColumns(20);
        descricaoTA.setRows(5);
        jScrollPane1.setViewportView(descricaoTA);

        telaC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 410, 90));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("CPF:");
        telaC.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Cidade");
        telaC.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Estado");
        telaC.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        altera.setText("Alterar");
        altera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteraActionPerformed(evt);
            }
        });
        telaC.add(altera, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        telaC.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));

        cidadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeFieldActionPerformed(evt);
            }
        });
        telaC.add(cidadeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 230, 35));
        telaC.add(estadoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Email:");
        telaC.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telaC.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 230, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Telefone:");
        telaC.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        enderecoField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telaC.add(enderecoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 320, 30));

        descontoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoFieldActionPerformed(evt);
            }
        });
        telaC.add(descontoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Desconto (porcentagem):");
        telaC.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Endereço:");
        telaC.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        try {
            cpfField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpfField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfFieldKeyReleased(evt);
            }
        });
        telaC.add(cpfField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 125, 35));

        try {
            telefoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });
        telaC.add(telefoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 120, 35));

        getContentPane().add(telaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienActionPerformed
        if (!" ".equals(String.valueOf(clien.getSelectedItem()))) {
            pegaDados();
            telaC.setVisible(true);
        } else {
            telaC.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_clienActionPerformed

    private void cpfFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfFieldKeyReleased

    }//GEN-LAST:event_cpfFieldKeyReleased

    private void descontoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteraActionPerformed

    }//GEN-LAST:event_alteraActionPerformed

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void cidadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altera;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JComboBox<String> clien;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JTextField descontoField;
    private javax.swing.JTextArea descricaoTA;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JTextField estadoField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel telaC;
    private javax.swing.JFormattedTextField telefoneField;
    // End of variables declaration//GEN-END:variables
}
