/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ppc.apresentacao;

import br.iesb.ppc.entidade.Ata;
import br.iesb.ppc.entidade.Professor;
import br.iesb.ppc.negocio.AtaBO;
import br.iesb.ppc.negocio.NegocioException;
import br.iesb.ppc.negocio.ProfessorBO;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class FormProfessor extends javax.swing.JDialog {

    /**
     * Creates new form FormReferenciaBibliografica
     */
    public FormProfessor(java.awt.Frame parent, boolean modal) {
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
        inputNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        inputMaiorTitulacao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputFormacao = new javax.swing.JTextField();
        inputCurriculoLattes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputDataAtualizacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome*");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Cadastrar Docente");

        jLabel6.setText("CPF:*");

        inputCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfActionPerformed(evt);
            }
        });

        inputMaiorTitulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMaiorTitulacaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Maior Titulaçao");

        jLabel3.setText("Formaçao Principal:");

        inputFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFormacaoActionPerformed(evt);
            }
        });

        inputCurriculoLattes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCurriculoLattesActionPerformed(evt);
            }
        });

        jLabel4.setText("Curriculo Lattes - Link:");

        inputDataAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataAtualizacaoActionPerformed(evt);
            }
        });

        jLabel7.setText("Data de atualizaçao do curriculo lates:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(283, 283, 283))
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputCurriculoLattes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                        .addComponent(inputFormacao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputMaiorTitulacao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNome, javax.swing.GroupLayout.Alignment.LEADING))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputMaiorTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCurriculoLattes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputDataAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Professor professor = new Professor();

        professor.setNome(inputNome.getText());
        professor.setCpf(Integer.parseInt(inputCpf.getText()));
        professor.setMaiorTitulacao(inputMaiorTitulacao.getText());
        professor.setFormacaoTitulacao(inputFormacao.getText());
        professor.setCurriculoLates(inputCurriculoLattes.getText());
        professor.setAtualizacaoCurriculo(inputDataAtualizacao.getText());

        
        ProfessorBO professorBO = new ProfessorBO();

        try {
            professorBO.validar(professor);
            professorBO.inserir(professor);
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

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int valida = JOptionPane.showConfirmDialog(null, "Deseja sair, sem salvar!", "Sim", JOptionPane.YES_NO_OPTION);
        if (valida == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCpfActionPerformed

    private void inputMaiorTitulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMaiorTitulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMaiorTitulacaoActionPerformed

    private void inputFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFormacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFormacaoActionPerformed

    private void inputCurriculoLattesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCurriculoLattesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCurriculoLattesActionPerformed

    private void inputDataAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataAtualizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataAtualizacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputCurriculoLattes;
    private javax.swing.JTextField inputDataAtualizacao;
    private javax.swing.JTextField inputFormacao;
    private javax.swing.JTextField inputMaiorTitulacao;
    private javax.swing.JTextField inputNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
