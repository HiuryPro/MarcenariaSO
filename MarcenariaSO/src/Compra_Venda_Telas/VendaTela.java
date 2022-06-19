/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compra_Venda_Telas;

import Principal.TelaPrincipal;
import compravenda.Materia_Prima;
import compravenda.Movel;
import compravenda.Venda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pessoa.Cliente;

/**
 *
 * @author Hiury
 */
public class VendaTela extends javax.swing.JInternalFrame {

    /**
     * Creates new form cadMov
     */
    ArrayList<Movel> moveis = new ArrayList<Movel>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Venda> vendas = new ArrayList<Venda>();
    ArrayList<Materia_Prima> materiasP = new ArrayList<Materia_Prima>();

    TelaPrincipal tP;
    public int rowCount = 0;
    public int contador = 0;

    public VendaTela(TelaPrincipal tP, ArrayList<Movel> mov, ArrayList<Cliente> clien, ArrayList<Venda> vend, ArrayList<Materia_Prima> mP) {
        initComponents();
        this.tP = tP;
        moveis = mov;
        clientes = clien;
        vendas = vend;
        materiasP = mP;

        AdicionaTabela();
        contador = tabela.getRowCount();

        pegaMov();
        pegaC();

    }

    public void pegaC() {

        cbClientes.addItem(" ");

        for (int i = 0; i < clientes.size(); i++) {
            cbClientes.addItem(clientes.get(i).getNome());

        }

    }

    public void pegaMov() {
        cbMovel.addItem(" ");
        for (int i = 0; i < moveis.size(); i++) {
            cbMovel.addItem(moveis.get(i).nome);
        }

    }

    public void AdicionaTabela() {
        for (int i = 0; i < vendas.size(); i++) {
            ((DefaultTableModel) tabela.getModel()).setRowCount(i + 1);
            tabela.setValueAt(vendas.get(i).nomeMovel + " ", i, 0);
            tabela.setValueAt(vendas.get(i).getPrecoU(), i, 1);
            tabela.setValueAt(vendas.get(i).getQuantidade(), i, 2);
            tabela.setValueAt(vendas.get(i).getPrecoBruto(), i, 3);
            tabela.setValueAt(vendas.get(i).acrescento, i, 4);
            tabela.setValueAt(vendas.get(i).getDesconto(), i, 5);
            tabela.setValueAt(vendas.get(i).getPrecoTotal(), i, 6);
            tabela.setValueAt(vendas.get(i).nomeCliente + " ", i, 7);
            tabela.setValueAt(vendas.get(i).data, i, 8);

        }

    }

    public void calculaCustoTotal() {
        float venda = 0;
        float acrescento = 0;
        int qtd = 0;

        acrescento = Float.parseFloat(acresc.getText());
        qtd = Integer.parseInt(this.qtd.getText());

        if (!" ".equals(String.valueOf(cbClientes.getSelectedItem())) && !" ".equals(String.valueOf(cbMovel.getSelectedItem())) && !"".equals(this.qtd.getText())) {
            for (int i = 0; i < moveis.size(); i++) {
                if (moveis.get(i).nome.equals(String.valueOf(cbMovel.getSelectedItem()))) {
                    for (int j = 0; j < clientes.size(); j++) {
                        if (clientes.get(j).getNome().equals(String.valueOf(cbClientes.getSelectedItem()))) {
                            venda = (qtd * (moveis.get(i).custoDeProducao + acrescento)) - ((qtd * (moveis.get(i).custoDeProducao + acrescento)) * (clientes.get(j).desconto / 100));
                        }
                    }

                }

            }
        }
        custoTotal.setText(String.valueOf(venda));
    }

    public void salvaCompra() {
        vendas.add(new Venda(moveis, clientes, materiasP));
        vendas.get(contador).nomeCliente = String.valueOf(cbClientes.getSelectedItem());
        vendas.get(contador).nomeMovel = String.valueOf(cbMovel.getSelectedItem());
        vendas.get(contador).acrescento = Float.parseFloat(acresc.getText());
        vendas.get(contador).CalculaPrecoT(Integer.parseInt(qtd.getText()), String.valueOf(cbMovel.getSelectedItem()), String.valueOf(cbClientes.getSelectedItem()));
        vendas.get(contador).data = dataE.getText();
        vendas.get(contador).setQuantidade(Integer.parseInt(qtd.getText()));
        vendas.get(contador).setDesconto(String.valueOf(cbClientes.getSelectedItem()));
        vendas.get(contador).setPrecoU(pegaPrecoUnit());
        vendas.get(contador).CalculaPrecoT(Integer.parseInt(qtd.getText()), String.valueOf(cbMovel.getSelectedItem()));
        vendas.get(contador).atualizaEstoque(String.valueOf(cbMovel.getSelectedItem()), Integer.parseInt(qtd.getText()));
        vendas.get(contador).status = 0;
        tP.materiasprimas = vendas.get(contador).getEstoqueA();
    }

    public float pegaPrecoUnit() {
        float precoUnit = 0;
        for (int i = 0; i < moveis.size(); i++) {
            if (moveis.get(i).nome.equals(String.valueOf(cbMovel.getSelectedItem()))) {
                precoUnit = moveis.get(i).custoDeProducao;
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
            tP.vendas = this.vendas;

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
        cbClientes = new javax.swing.JComboBox<>();
        qtd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbMovel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dataE = new javax.swing.JFormattedTextField();
        acresc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Total");

        custoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Móvel", "Preço", "Quantidade", "Preco Bruto", "Acrescento", "Desconto", "Total", "Cliente", "Data saída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
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

        cbClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });

        qtd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtdKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Quantidade");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Data De Emissão");

        cbMovel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMovelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Cliente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Móvel");

        try {
            dataE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        acresc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acresc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                acrescKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Acrescento no preço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1)
                        .addGap(196, 196, 196)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(acresc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataE, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(243, 243, 243)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(custoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(cbMovel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMovel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)
                        .addComponent(custoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(acresc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                            .addComponent(dataE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadActionPerformed
        Confirma();
    }//GEN-LAST:event_CadActionPerformed

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        if (!" ".equals(String.valueOf(cbMovel.getSelectedItem())) && !" ".equals(String.valueOf(cbClientes.getSelectedItem())) && !"".equals(qtd.getText()) && !"".equals(acresc.getText()))
            calculaCustoTotal();
    }//GEN-LAST:event_cbClientesActionPerformed

    private void cbMovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMovelActionPerformed
        if (!" ".equals(String.valueOf(cbMovel.getSelectedItem())) && !" ".equals(String.valueOf(cbClientes.getSelectedItem())) && !"".equals(qtd.getText()) && !"".equals(acresc.getText()))
            calculaCustoTotal();
    }//GEN-LAST:event_cbMovelActionPerformed

    private void qtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtdKeyReleased
        if (!" ".equals(String.valueOf(cbMovel.getSelectedItem())) && !" ".equals(String.valueOf(cbClientes.getSelectedItem())) && !"".equals(qtd.getText()) && !"".equals(acresc.getText()))
            calculaCustoTotal();
    }//GEN-LAST:event_qtdKeyReleased

    private void acrescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acrescKeyReleased
        if (!" ".equals(String.valueOf(cbMovel.getSelectedItem())) && !" ".equals(String.valueOf(cbClientes.getSelectedItem())) && !"".equals(qtd.getText()) && !"".equals(acresc.getText()))
            calculaCustoTotal();
    }//GEN-LAST:event_acrescKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cad;
    private javax.swing.JTextField acresc;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbMovel;
    private javax.swing.JLabel custoTotal;
    private javax.swing.JFormattedTextField dataE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qtd;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
