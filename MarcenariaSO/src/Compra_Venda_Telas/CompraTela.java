/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra_Venda_Telas;

import Principal.TelaPrincipal;
import compravenda.Compra;
import compravenda.Materia_Prima;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pessoa.Fornecedor;

/**
 *
 * @author Hiury
 */
public class CompraTela extends javax.swing.JInternalFrame {

    /**
     * Creates new form cadMov
     */
    ArrayList<Materia_Prima> materiasP = new ArrayList<Materia_Prima>();
    ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    ArrayList<Compra> compras = new ArrayList<Compra>();

    TelaPrincipal tP;
    public int rowCount = 0;
    public int contador = 0;

    public CompraTela(TelaPrincipal tP, ArrayList<Materia_Prima> mp, ArrayList<Fornecedor> forn, ArrayList<Compra> comp) {
        initComponents();
        this.tP = tP;
        materiasP = mp;
        fornecedores = forn;
        compras = comp;

        AdicionaTabela();
        contador = tabela.getRowCount();

        pegaF();
        pegaMP();

    }

    public void pegaF() {

        cbFornecedor.addItem(" ");

        for (int i = 0; i < fornecedores.size(); i++) {
            cbFornecedor.addItem(fornecedores.get(i).getNome());

        }

    }

    public void pegaMP() {
        cbMateriaP.addItem(" ");
        for (int i = 0; i < fornecedores.size(); i++) {
            if (fornecedores.get(i).getNome().equals(String.valueOf(cbFornecedor.getSelectedItem()))) {
                for (int j = 0; j < fornecedores.get(i).nomeMP.size(); j++) {
                    cbMateriaP.addItem(fornecedores.get(i).nomeMP.get(j));

                }
            }

        }

    }

    public void AdicionaTabela() {
        for (int i = 0; i < compras.size(); i++) {
            ((DefaultTableModel) tabela.getModel()).setRowCount(i + 1);
            tabela.setValueAt(compras.get(i).nomeMP, i, 0);
            tabela.setValueAt(compras.get(i).getPrecoU(), i, 1);
            tabela.setValueAt(compras.get(i).getQuantidade(), i, 2);
            tabela.setValueAt(compras.get(i).getFrete(), i, 3);
            tabela.setValueAt(compras.get(i).getPrecoTotal(), i, 4);
            tabela.setValueAt(compras.get(i).nomeFornecedor, i, 5);
            tabela.setValueAt(compras.get(i).data, i, 6);

        }

    }

    public void calculaCustoTotal() {
        float compra = 0;
        if (!" ".equals(String.valueOf(cbFornecedor.getSelectedItem())) && !" ".equals(String.valueOf(cbMateriaP.getSelectedItem())) && !"".equals(qtd.getText())) {
            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getNome().equals(String.valueOf(cbFornecedor.getSelectedItem()))) {
                    for (int j = 0; j < fornecedores.get(i).nomeMP.size(); j++) {
                        if (fornecedores.get(i).nomeMP.get(j).equals(String.valueOf(cbMateriaP.getSelectedItem()))) {
                            compra = Float.parseFloat(fornecedores.get(i).precoF.get(j)) * Integer.parseInt(qtd.getText()) + Integer.parseInt(fornecedores.get(i).frete.get(j));
                        }

                    }
                }

            }
        }
        custoTotal.setText(String.valueOf(compra));
    }

    public void salvaCompra() {
        compras.add(new Compra(fornecedores, materiasP));
        compras.get(contador).nomeFornecedor = String.valueOf(cbFornecedor.getSelectedItem());
        compras.get(contador).nomeMP = String.valueOf(cbMateriaP.getSelectedItem());
        compras.get(contador).CalculaPrecoT(Integer.parseInt(qtd.getText()), String.valueOf(cbMateriaP.getSelectedItem()), String.valueOf(cbFornecedor.getSelectedItem()));
        compras.get(contador).data = dataE.getText();
        compras.get(contador).setQuantidade(Integer.parseInt(qtd.getText()));
        compras.get(contador).setFrete(String.valueOf(cbFornecedor.getSelectedItem()), String.valueOf(cbMateriaP.getSelectedItem()));
        compras.get(contador).setPrecoU(pegaPrecoUnit());
        tP.materiasprimas = compras.get(contador).getEstoqueA();
    }

    public int pegaPrecoUnit() {
        int precoUnit = 0;
        for (int i = 0; i < fornecedores.size(); i++) {
            if (fornecedores.get(i).getNome().equals(String.valueOf(cbFornecedor.getSelectedItem()))) {
                for (int j = 0; j < fornecedores.get(i).nomeMP.size(); j++) {
                    if (fornecedores.get(i).nomeMP.get(j).equals(String.valueOf(cbMateriaP.getSelectedItem()))) {
                        precoUnit = Integer.parseInt(fornecedores.get(i).precoF.get(j));
                    }

                }
            }

        }
        return precoUnit;
    }

    public void Confirma() {
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resultado == JOptionPane.YES_OPTION) {
            salvaCompra();
            tabela.removeAll();
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
            AdicionaTabela();
            contador++;
            tP.compras = this.compras;

        } else {

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

        jLabel11 = new javax.swing.JLabel();
        custoTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        Cad = new javax.swing.JButton();
        cbFornecedor = new javax.swing.JComboBox<>();
        qtd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbMateriaP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dataE = new javax.swing.JFormattedTextField();

        setClosable(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Total");

        custoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matéria Prima", "Preço", "Quantidade", "Frete", "Total", "Fornecedor", "Data entrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela.setColumnSelectionAllowed(true);
        tabela.setRowHeight(30);
        tabela.getTableHeader().setResizingAllowed(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        Cad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Cad.setText("Comprar");
        Cad.setToolTipText("Salva no banco de dados os dados da tabela acima");
        Cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadActionPerformed(evt);
            }
        });

        cbFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFornecedorActionPerformed(evt);
            }
        });

        qtd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdActionPerformed(evt);
            }
        });
        qtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtdKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Quantidade");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Data De Emissão");

        cbMateriaP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMateriaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriaPActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Fornecedor");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Matéria Prima");

        try {
            dataE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cbMateriaP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dataE, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(503, 503, 503)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(custoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMateriaP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(dataE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)
                        .addComponent(custoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadActionPerformed
        Confirma();
    }//GEN-LAST:event_CadActionPerformed

    private void cbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFornecedorActionPerformed
        if (String.valueOf(cbFornecedor.getSelectedItem()).equals(" ")) {
            cbMateriaP.removeAllItems();

        } else {
            cbMateriaP.removeAllItems();
            pegaMP();
            calculaCustoTotal();
        }
    }//GEN-LAST:event_cbFornecedorActionPerformed

    private void cbMateriaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriaPActionPerformed
        calculaCustoTotal();
    }//GEN-LAST:event_cbMateriaPActionPerformed

    private void qtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtdKeyReleased
        calculaCustoTotal();
    }//GEN-LAST:event_qtdKeyReleased

    private void qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cad;
    private javax.swing.JComboBox<String> cbFornecedor;
    private javax.swing.JComboBox<String> cbMateriaP;
    private javax.swing.JLabel custoTotal;
    private javax.swing.JFormattedTextField dataE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qtd;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
