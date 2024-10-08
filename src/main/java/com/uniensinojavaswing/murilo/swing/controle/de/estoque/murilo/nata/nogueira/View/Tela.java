/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.View;

import com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.DAO.ProdutosDAO;
import com.uniensinojavaswing.murilo.swing.controle.de.estoque.murilo.nata.nogueira.model.Produto;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muril
 */
public class Tela extends javax.swing.JFrame {
    
    private ProdutosDAO DAO;
    private String tipo = "";
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        setTitle("Controle de Estoque Mercado Ataquista");
        try{
            DAO = new ProdutosDAO();
            carregarTabela();
            configuraListener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
        
    }
    
    private Produto produto = new Produto();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupPesquisa = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        textFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        radioNome = new javax.swing.JRadioButton();
        radioQuantidade = new javax.swing.JRadioButton();
        radioPreco = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        textFieldPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnRecarregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProdutos);

        jLabel1.setText("Id:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Preço");

        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(textFieldNome)
                    .addComponent(textFieldQuantidade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textFieldPreco))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        groupPesquisa.add(radioNome);
        radioNome.setSelected(true);
        radioNome.setText("Nome");

        groupPesquisa.add(radioQuantidade);
        radioQuantidade.setText("Quantidade");

        groupPesquisa.add(radioPreco);
        radioPreco.setText("Preço");

        jLabel5.setText("Pesquisa:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnRecarregar.setText("Recarregar Tabela");
        btnRecarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecarregarActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecione uma forma de pesquisa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldPesquisa)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRecarregar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radioNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioPreco)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(radioQuantidade)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNome)
                    .addComponent(radioQuantidade)
                    .addComponent(radioPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel7.setText("ATAQUISTA ESTOQUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try{
            if(!verificaCamposVazios()){
                declararProduto();
                DAO.adicionar(produto);
                esvaziarCampos();
                carregarTabela();
            } else { 
                JOptionPane.showMessageDialog(this, "Erro ao adicionar: preencha todos os campos vazios de ");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         try{
            if(!verificaCamposVazios()){
                declararProduto();
                DAO.editar(produto);
                esvaziarCampos();
                carregarTabela();
            } else { 
                JOptionPane.showMessageDialog(this, "Erro ao Editar: preencha todos os campos vazios de ");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try{
            if(!textFieldId.getText().isBlank()){
                DAO.remover(Integer.parseInt(textFieldId.getText()));
                esvaziarCampos();
                carregarTabela();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao remover: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnRecarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecarregarActionPerformed
        carregarTabela();
    }//GEN-LAST:event_btnRecarregarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String pesquisa = textFieldPesquisa.getText();
        definirTipo();
        try{
            if("quantidade".equals(tipo))
            {
                int temp = Integer.parseInt(pesquisa);
                pesquisa = String.valueOf(temp);
            } else if("preco".equals(tipo))
            {
                BigDecimal temp = new BigDecimal(pesquisa);
                pesquisa = temp.toString();
            }
            carregarPesquisa(pesquisa, tipo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao pesquisar: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void configuraListener(){
        tableProdutos.getSelectionModel().addListSelectionListener(event ->
        {
            if(event.getValueIsAdjusting())
            {
                int selectedRow = tableProdutos.getSelectedRow();
                
                if(selectedRow != -1)
                {
                    String id = tableProdutos.getValueAt(selectedRow, 0).toString();
                    String nome = tableProdutos.getValueAt(selectedRow, 1).toString();
                    String quantidade = tableProdutos.getValueAt(selectedRow, 2).toString();
                    String preco = tableProdutos.getValueAt(selectedRow, 3).toString();
                    
                    textFieldId.setText(id);
                    textFieldNome.setText(nome);
                    textFieldQuantidade.setText(quantidade);
                    textFieldPreco.setText(preco);
                }
            }
        });
    }
    
    private void declararProduto(){
        try{
            if(!textFieldPreco.getText().contains(","))
            {
                produto.setId(Integer.parseInt(textFieldId.getText()));
                produto.setNome(textFieldNome.getText());
                produto.setQuantidade(Integer.parseInt(textFieldQuantidade.getText()));
                produto.setPreco(new BigDecimal(textFieldPreco.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "Formatação inválida", "formato inválido", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e)
        {
             JOptionPane.showMessageDialog(this, "ERRO Ao declarar: " + e.getMessage(), "Error declaração", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void esvaziarCampos(){
        textFieldId.setText("");
        textFieldNome.setText("");
        textFieldQuantidade.setText("");
        textFieldPreco.setText("");
    }
    
    private boolean verificaCamposVazios(){
        JTextField[] textos = {textFieldId, textFieldNome, textFieldQuantidade, textFieldPreco};
        
        for (JTextField texto : textos) {
            if(texto.getText().isBlank())
            {
                return true;
            }
        }
        return false;
    }
    
    private void definirTipo(){
        if(radioNome.isSelected())
        {
            tipo = "nome";
        } else if(radioQuantidade.isSelected()){
            tipo = "quantidade";
        } else {
            tipo = "preco";
        }
    }
    
    private void carregarTabela(){
        try{
            DefaultTableModel model = (DefaultTableModel) tableProdutos.getModel();
            model.setRowCount(0);
            List<Produto> produtos = DAO.listarProdutos();

            for (Produto produto : produtos) {
                model.addRow(new Object[]{
                    produto.getId(),
                    produto.getNome(),
                    produto.getQuantidade(),
                    produto.getPreco() // Pode usar formatação aqui, se necessário
                });
            }
        } catch (Exception e) {
            
        } 
    }
    
    private void carregarPesquisa(String pesquisa, String tipo){
        try{
            DefaultTableModel model = (DefaultTableModel) tableProdutos.getModel();
            model.setRowCount(0);
            List<Produto> produtos = DAO.pesquisar(pesquisa, tipo);

            for (Produto produto : produtos) {
                model.addRow(new Object[]{
                    produto.getId(),
                    produto.getNome(),
                    produto.getQuantidade(),
                    produto.getPreco() 
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRecarregar;
    private javax.swing.JButton btnRemover;
    private javax.swing.ButtonGroup groupPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JRadioButton radioPreco;
    private javax.swing.JRadioButton radioQuantidade;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldPesquisa;
    private javax.swing.JTextField textFieldPreco;
    private javax.swing.JTextField textFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
