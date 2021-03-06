/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ppc.apresentacao;

import br.iesb.ppc.entidade.Ata;
import br.iesb.ppc.negocio.AtaBO;
import br.iesb.ppc.negocio.NegocioException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class FormAtas extends javax.swing.JDialog {

    /**
     * Creates new form FormReferenciaBibliografica
     */
    public FormAtas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        inputData = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputHoraInicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputHoraFim = new javax.swing.JTextField();
        inputAssunto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputSede = new javax.swing.JTextField();
        inputSala = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Data:*");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        inputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Atas");

        jLabel6.setText("Hora Inicio:*");

        inputHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHoraInicioActionPerformed(evt);
            }
        });

        jLabel7.setText("Hora Fim:*");

        inputHoraFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHoraFimActionPerformed(evt);
            }
        });

        inputAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAssuntoActionPerformed(evt);
            }
        });

        jLabel2.setText("Assunto:*");

        jLabel3.setText("Sede:*");

        inputSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSedeActionPerformed(evt);
            }
        });

        inputSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSalaActionPerformed(evt);
            }
        });

        jLabel4.setText("Sala:*");

        jLabel5.setText("Descriçao:*");

        inputDescricao.setColumns(20);
        inputDescricao.setLineWrap(true);
        inputDescricao.setRows(5);
        inputDescricao.setWrapStyleWord(true);
        jScrollPane1.setViewportView(inputDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(inputHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(inputHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(inputSede, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(inputSala, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(inputAssunto)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Ata ata = new Ata();

        ata.setData(inputData.getText());
        ata.setHoraInicio(inputHoraInicio.getText());
        ata.setHoraFim(inputHoraFim.getText());
        ata.setAssunto(inputAssunto.getText());
        ata.setSede(inputSede.getText());
        ata.setSala(inputSala.getText());
        ata.setDescricao(inputDescricao.getText());

        
        AtaBO ataBO = new AtaBO();

        try {
            ataBO.validar(ata);
            ataBO.inserir(ata);
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            // SAVE AQUI
        } catch (NegocioException e) {
            int tipoMsg = JOptionPane.WARNING_MESSAGE;
            if (e.getCause() != null) {
                tipoMsg = JOptionPane.ERROR_MESSAGE;
            }
            JOptionPane.showMessageDialog(this,
                    e.getMessage(), "Mensagem", tipoMsg);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void inputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int valida = JOptionPane.showConfirmDialog(null, "Deseja sair, sem salvar!", "Sim", JOptionPane.YES_NO_OPTION);
        if (valida == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHoraInicioActionPerformed

    private void inputHoraFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHoraFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHoraFimActionPerformed

    private void inputAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAssuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAssuntoActionPerformed

    private void inputSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSedeActionPerformed

    private void inputSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSalaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField inputAssunto;
    private javax.swing.JTextField inputData;
    private javax.swing.JTextArea inputDescricao;
    private javax.swing.JTextField inputHoraFim;
    private javax.swing.JTextField inputHoraInicio;
    private javax.swing.JTextField inputSala;
    private javax.swing.JTextField inputSede;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
