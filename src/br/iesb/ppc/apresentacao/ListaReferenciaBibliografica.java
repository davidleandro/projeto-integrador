/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ppc.apresentacao;

import br.iesb.ppc.dados.DadosException;
import br.iesb.ppc.dados.ReferenciaBibliograficaDAO;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import br.iesb.ppc.entidade.ReferenciaBibliografica;
import br.iesb.ppc.negocio.BO;
import br.iesb.ppc.negocio.NegocioException;
import br.iesb.ppc.negocio.ReferenciaBibliograficaBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class ListaReferenciaBibliografica extends javax.swing.JDialog {

    /**
     * Creates new form ListaReferenciaBibliografica
     */
    public ListaReferenciaBibliografica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarTodos();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void popularFormulario(List<ReferenciaBibliografica> lista) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        for (ReferenciaBibliografica referencia_bibliografica : lista) {
            String[] linha = {String.valueOf(referencia_bibliografica.getID()), referencia_bibliografica.getAutor(), referencia_bibliografica.getTitulo(), referencia_bibliografica.getEditora(), referencia_bibliografica.getAno(), referencia_bibliografica.getQuantidade()};
            modelo.addRow(linha);
        }
    }
    
    public void listarTodos() {
        BO<ReferenciaBibliografica> bo = new ReferenciaBibliograficaBO();
        try {
            List<ReferenciaBibliografica> lista = bo.listar();
            popularFormulario(lista);
        } catch (NegocioException ex) {
            int tipoMsg = JOptionPane.WARNING_MESSAGE;
            if (ex.getCause() != null) {
                tipoMsg = JOptionPane.ERROR_MESSAGE;
            }

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Mensagem", tipoMsg);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, ""}
            },
            new String [] {
                "ID", "Autor", "Título", "Editora", "Ano", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Referências Bibliográficas");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar lista");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int row = jTable1.getSelectedRow();
        int id = Integer.parseInt((String) jTable1.getValueAt(row, 0));
        ReferenciaBibliograficaDAO referencia_bibliografica_dao = new ReferenciaBibliograficaDAO();
        ReferenciaBibliografica referencia_bibliografica = new ReferenciaBibliografica();
        
        try {
            referencia_bibliografica = referencia_bibliografica_dao.consultar(id);
            FormAlterarReferenciaBibliografica dialog = new FormAlterarReferenciaBibliografica(new javax.swing.JFrame(), true, referencia_bibliografica);
        } catch (DadosException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ReferenciaBibliografica referencia_bibliografica = new ReferenciaBibliografica();
        
        int row = jTable1.getSelectedRow();
        int id = Integer.parseInt((String) jTable1.getValueAt(row, 0));
        referencia_bibliografica.setID(id);
        ReferenciaBibliograficaDAO referencia_bibliografica_dao = new ReferenciaBibliograficaDAO();
        try {
            referencia_bibliografica_dao.excluir(referencia_bibliografica);
        } catch (DadosException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
        listarTodos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        listarTodos();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
