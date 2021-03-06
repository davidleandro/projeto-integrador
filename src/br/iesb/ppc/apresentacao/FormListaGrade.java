/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ppc.apresentacao;

import br.iesb.ppc.entidade.GerenciarGrade;
import br.iesb.ppc.negocio.BO;
import br.iesb.ppc.negocio.GradeBO;
import br.iesb.ppc.negocio.NegocioException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author tom
 */
public class FormListaGrade extends javax.swing.JDialog {

    /**
     * Creates new form FormGrade
     */
    public FormListaGrade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modalidadeRadioButton = new javax.swing.ButtonGroup();
        modalidadeLabel = new javax.swing.JLabel();
        radioEAD = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cursoComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        turmaComboBox = new javax.swing.JComboBox<>();
        voltarFormGrade = new javax.swing.JButton();
        continuarFormGrade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        semestreComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        modalidadeLabel.setText("Modalidade:*");

        modalidadeRadioButton.add(radioEAD);
        radioEAD.setText("EAD");
        radioEAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEADActionPerformed(evt);
            }
        });

        modalidadeRadioButton.add(radioPresencial);
        radioPresencial.setText("Presencial");
        radioPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPresencialActionPerformed(evt);
            }
        });

        jLabel2.setText("Curso:");

        cursoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Turma:");

        turmaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmaComboBoxActionPerformed(evt);
            }
        });

        voltarFormGrade.setText("Voltar");
        voltarFormGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarFormGradeActionPerformed(evt);
            }
        });

        continuarFormGrade.setText("Continuar");
        continuarFormGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarFormGradeActionPerformed(evt);
            }
        });

        jLabel1.setText("Semestre:");

        semestreComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestreComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Grade:");

        jList1.setEnabled(false);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cursoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modalidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioEAD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioPresencial))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turmaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semestreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuarFormGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarFormGrade)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modalidadeLabel)
                    .addComponent(radioEAD)
                    .addComponent(radioPresencial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cursoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(turmaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(semestreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarFormGrade)
                    .addComponent(continuarFormGrade))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarFormGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarFormGradeActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarFormGradeActionPerformed

    private void continuarFormGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarFormGradeActionPerformed
        BO<GerenciarGrade> bo = new GradeBO();
        
        try {
            GerenciarGrade gerenciarGrade = criarEntidade();
            
            bo.validar(gerenciarGrade);
            
            this.dispose();
        } catch (NegocioException e) {
            int tipoMsg = JOptionPane.WARNING_MESSAGE;
            if (e.getCause() != null) {
                tipoMsg = JOptionPane.ERROR_MESSAGE;
            }
            JOptionPane.showMessageDialog(this, e.getMessage(), "Mensagem", tipoMsg);
        }
    }//GEN-LAST:event_continuarFormGradeActionPerformed

    private void radioEADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEADActionPerformed
        FormGrade();
    }//GEN-LAST:event_radioEADActionPerformed

    private void radioPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresencialActionPerformed
        FormGrade();
    }//GEN-LAST:event_radioPresencialActionPerformed

    private void cursoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoComboBoxActionPerformed
        int modalidade = getId();
        
        if(radioEAD.isSelected()){
            modalidade = 1;
        }else if(radioPresencial.isSelected()){
            modalidade = 2;
        }
        if(getId() == modalidade){
            BO<GerenciarGrade> bo = new GradeBO();
        
            try {
                List lista = getLista();

                int id = idCursoComboBox(lista);

                List<GerenciarGrade> listaTurma = bo.listarTurma(id);
                popularComboBoxTurma(listaTurma);
            } catch (Exception e) {
                int tipoMsg = JOptionPane.WARNING_MESSAGE;

                if (e.getCause() != null) {
                    tipoMsg = JOptionPane.ERROR_MESSAGE;
                }

                JOptionPane.showMessageDialog(this, e.getMessage(), "Mensagem", tipoMsg);
            }
        }
    }//GEN-LAST:event_cursoComboBoxActionPerformed

    private void turmaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turmaComboBoxActionPerformed

    }//GEN-LAST:event_turmaComboBoxActionPerformed

    private void semestreComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestreComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestreComboBoxActionPerformed
    
    private void FormGrade(){
        BO<GerenciarGrade> bo = new GradeBO();
        GerenciarGrade gerenciar = new GerenciarGrade();
        
        int modalidade = 0;
        if(radioEAD.isSelected()){
            modalidade = 1;
        }else if(radioPresencial.isSelected()){
            modalidade = 2;
        }
        
        try {
            List<GerenciarGrade> lista = bo.listar(modalidade);
            popularComboBoxCurso(lista);
            
            setLista(lista);
            
            int id = idCursoComboBox(lista);
            
            List<GerenciarGrade> listaTurma = bo.listarTurma(id);
            int idTurma = popularComboBoxTurma(listaTurma);
            
            setId(modalidade);
            
            List<GerenciarGrade> listaSemestre = (List<GerenciarGrade>) bo.listarSemestre(idTurma);
            
            popularComboBoxSemestre(listaSemestre);
            
            int idGrade = idSemestreComboBox(listaSemestre);
            
        } catch (Exception e) {
            int tipoMsg = JOptionPane.WARNING_MESSAGE;
            
            if (e.getCause() != null) {
                tipoMsg = JOptionPane.ERROR_MESSAGE;
            }
            
            JOptionPane.showMessageDialog(this, e.getMessage(), "Mensagem", tipoMsg);
        }
    }

    private void popularComboBoxCurso(List<GerenciarGrade> lista){
        DefaultComboBoxModel modelCurso = new DefaultComboBoxModel();
        
        cursoComboBox.removeAllItems();
        
        for(GerenciarGrade gerenciarGrade : lista){
            String linha = gerenciarGrade.getNomeCurso();
            
            modelCurso.addElement(linha);
        }
        cursoComboBox.setModel(modelCurso);
    }
    
    private int idCursoComboBox(List<GerenciarGrade> lista){
        int id = 0;
        for(GerenciarGrade gerenciarGrade : lista){
            String linha = gerenciarGrade.getNomeCurso();
            if(cursoComboBox.getSelectedItem() == linha){
                id = gerenciarGrade.getIdCurso();
                break;
            }
        }
        return id;
    }
    
    private int popularComboBoxTurma(List<GerenciarGrade> listaTurma){
        DefaultComboBoxModel modelTurma = new DefaultComboBoxModel();
        int id = 0;
        
        turmaComboBox.removeAllItems();
        
        for(GerenciarGrade gerenciarGrade : listaTurma){
                String linha = gerenciarGrade.getNomeTurma();
                id = gerenciarGrade.getIdTurma();
                modelTurma.addElement(linha);
        }
        turmaComboBox.setModel(modelTurma);
        return id;
    }
    
    private void popularComboBoxSemestre(List<GerenciarGrade> listaSemestre) {
        DefaultComboBoxModel modelSemestre = new DefaultComboBoxModel();
        
        semestreComboBox.removeAllItems();
        
        for(GerenciarGrade gerenciarGrade : listaSemestre){
//                String linha = String.valueOf(gerenciarGrade.getQuantidadeSemestre());
                int linha = gerenciarGrade.getQuantidadeSemestre();
                modelSemestre.addElement(linha);
        }
        semestreComboBox.setModel(modelSemestre);
    }

    
    private int idSemestreComboBox(List<GerenciarGrade> lista){
        int id = 0;
        for(GerenciarGrade gerenciarGrade : lista){
            String linha = String.valueOf(gerenciarGrade.getQuantidadeSemestre());
            if(semestreComboBox.getSelectedItem() == linha){
                id = gerenciarGrade.getIdGrade();
                break;
            }
        }
        return id;
    }
    
    private void popularListGrade(List<GerenciarGrade> listaGrade){
        
    }
    
    private int idListGrade(List<GerenciarGrade> listaGrade){
//        int id = 0;
//        
//        for(GerenciarGrade gerenciarGrade : listaGrade){
//            String linha = gerenciarGrade.getNomeDisciplina();
//            if(listGrade.getSelectedValuesList() == linha){
//                id = gerenciarGrade.getIdGrade();
//                break;
//            }
//        }
        return id;
    }

    private GerenciarGrade criarEntidade() {
        List listaCurso = getLista();
        int idCurso = idCursoComboBox(listaCurso);
        
        GerenciarGrade gerenciarGrade = new GerenciarGrade();
        gerenciarGrade.setModalidadeTipo(getId());
        gerenciarGrade.setIdCurso(idCurso);
        gerenciarGrade.setIdTurma(getIdTurma());
        
        return gerenciarGrade;
    }
    
    private List lista;
    private int id;
    private int idTurma;
    private int modifica;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private int getIdTurma(){
        return idTurma;
    }
    
    private void setIdTurma(int idTurma){
        this.idTurma = idTurma;
    }
    
    private List getLista() {
        return lista;
    }

    private void setLista(List lista) {
        this.lista = lista;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarFormGrade;
    private javax.swing.JComboBox<String> cursoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modalidadeLabel;
    private javax.swing.ButtonGroup modalidadeRadioButton;
    private javax.swing.JRadioButton radioEAD;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JComboBox<String> semestreComboBox;
    private javax.swing.JComboBox<String> turmaComboBox;
    private javax.swing.JButton voltarFormGrade;
    // End of variables declaration//GEN-END:variables

}
