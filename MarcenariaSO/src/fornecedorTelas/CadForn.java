/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedorTelas;

import Principal.TelaPrincipal;
import Principal.Validacao;
import java.util.ArrayList;
import pessoa.Fornecedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Hiury
 */
public class CadForn extends javax.swing.JInternalFrame {

    /**
     * Creates new form cadForn
     */
    TelaPrincipal vaiCaralho;
    ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    Validacao valida = new Validacao();
    public int count = 0;

    public CadForn(TelaPrincipal teste3, ArrayList<Fornecedor> forn) {
        initComponents();
        vaiCaralho = teste3;
        vaiCaralho.teste = "deu bom";
        fornecedores = forn;
        count = fornecedores.size();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inscEField = new javax.swing.JFormattedTextField();
        telefoneField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cnpjField = new javax.swing.JFormattedTextField();
        estadoCb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoTA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeField = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        Cad = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro Fornecedor");

        try {
            inscEField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inscEField.setText("   .   .   .");
        inscEField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inscEField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inscEFieldKeyReleased(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Estado:");

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Descrição");

        try {
            cnpjField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpjField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cnpjField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnpjFieldKeyReleased(evt);
            }
        });

        estadoCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estadoCb.setMaximumRowCount(4);
        estadoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        estadoCb.setSelectedIndex(12);

        descricaoTA.setColumns(20);
        descricaoTA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoTA.setLineWrap(true);
        descricaoTA.setRows(5);
        descricaoTA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descricaoTA);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Inscrição Estadual");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("CNPJ:");

        nomeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeFieldKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Cidade:");

        Cad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Cad.setText("Cadastrar");
        Cad.setEnabled(false);
        Cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(inscEField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel7)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(estadoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(Cad)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inscEField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Cad)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscEFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inscEFieldKeyReleased
        Cad.setEnabled(valida.HabilitaCadastro(nomeField.getText(), inscEField, cnpjField));        // TODO add your handling code here:
    }//GEN-LAST:event_inscEFieldKeyReleased

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void cnpjFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpjFieldKeyReleased
        Cad.setEnabled(valida.HabilitaCadastro(nomeField.getText(), inscEField, cnpjField));// TODO add your handling code here:
    }//GEN-LAST:event_cnpjFieldKeyReleased

    private void nomeFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFieldKeyReleased
        Cad.setEnabled(valida.HabilitaCadastro(nomeField.getText(), inscEField, cnpjField));  // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldKeyReleased

    private void inserirFornecedor() {
        fornecedores.add(new Fornecedor());
        fornecedores.get(count).setNome(nomeField.getText());
        fornecedores.get(count).cnpj = cnpjField.getText().replaceAll("[^0-9]+", "");
        fornecedores.get(count).setEstado(String.valueOf(estadoCb.getSelectedItem()));
        fornecedores.get(count).setCidade(cidade.getText());
        fornecedores.get(count).setEmail(emailField.getText());
        fornecedores.get(count).inscE = inscEField.getText().replaceAll("[^0-9]+", "");
        fornecedores.get(count).setTelefone(telefoneField.getText().replaceAll("[^0-9]+", ""));
        fornecedores.get(count).descricao = descricaoTA.getText();
        count++;

        vaiCaralho.fornecedores = this.fornecedores;
    }


    private void CadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadActionPerformed
        if (valida.validaCNPJ(cnpjField.getText().replaceAll("[^0-9]+", "")) == true) {
            inserirFornecedor();
            cidade.setText(null);
            descricaoTA.setText(null);
            cnpjField.setText(null);
            nomeField.setText(null);
            emailField.setText(null);
            telefoneField.setText(null);
            inscEField.setText(null);

        } else {
            JOptionPane.showMessageDialog(null, "CNPJ invalido", "ERRO", 0);
        }
    }//GEN-LAST:event_CadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cad;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cnpjField;
    private javax.swing.JTextArea descricaoTA;
    private javax.swing.JTextField emailField;
    private javax.swing.JComboBox<String> estadoCb;
    private javax.swing.JFormattedTextField inscEField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField nomeField;
    private javax.swing.JFormattedTextField telefoneField;
    // End of variables declaration//GEN-END:variables

}
