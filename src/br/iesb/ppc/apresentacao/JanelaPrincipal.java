/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.ppc.apresentacao;

/**
 *
 * @author david
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormReferenciaBibliografica
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraMenu = new javax.swing.JMenuBar();
        menuAta = new javax.swing.JMenu();
        menuItemListarAta = new javax.swing.JMenuItem();
        menuItemCadastrarAta = new javax.swing.JMenuItem();
        menuDisciplina = new javax.swing.JMenu();
        menuItemListarDisciplina = new javax.swing.JMenuItem();
        menuItemCadastrarDisciplina = new javax.swing.JMenuItem();
        menuGrade = new javax.swing.JMenu();
        menuItemListarGrade = new javax.swing.JMenuItem();
        menuItemCadastrarGrade = new javax.swing.JMenuItem();
        menuReferenciaBibliografica = new javax.swing.JMenu();
        menuItemListarReferenciaBibliografica = new javax.swing.JMenuItem();
        menuItemCadastrarReferenciaBibliografica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuAta.setText("Ata");

        menuItemListarAta.setText("Listar");
        menuItemListarAta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarAtaActionPerformed(evt);
            }
        });
        menuAta.add(menuItemListarAta);

        menuItemCadastrarAta.setText("Cadastrar");
        menuAta.add(menuItemCadastrarAta);

        BarraMenu.add(menuAta);

        menuDisciplina.setText("Disciplina");

        menuItemListarDisciplina.setText("Listar");
        menuItemListarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarDisciplinaActionPerformed(evt);
            }
        });
        menuDisciplina.add(menuItemListarDisciplina);

        menuItemCadastrarDisciplina.setText("Cadastrar");
        menuDisciplina.add(menuItemCadastrarDisciplina);

        BarraMenu.add(menuDisciplina);

        menuGrade.setText("Grade");

        menuItemListarGrade.setText("Listar");
        menuItemListarGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarGradeActionPerformed(evt);
            }
        });
        menuGrade.add(menuItemListarGrade);

        menuItemCadastrarGrade.setText("Cadastrar");
        menuGrade.add(menuItemCadastrarGrade);

        BarraMenu.add(menuGrade);

        menuReferenciaBibliografica.setText("Referência Bibliográfica");

        menuItemListarReferenciaBibliografica.setText("Listar");
        menuItemListarReferenciaBibliografica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarReferenciaBibliograficaActionPerformed(evt);
            }
        });
        menuReferenciaBibliografica.add(menuItemListarReferenciaBibliografica);

        menuItemCadastrarReferenciaBibliografica.setText("Cadastrar");
        menuReferenciaBibliografica.add(menuItemCadastrarReferenciaBibliografica);

        BarraMenu.add(menuReferenciaBibliografica);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemListarAtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarAtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListarAtaActionPerformed

    private void menuItemListarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListarDisciplinaActionPerformed

    private void menuItemListarGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListarGradeActionPerformed

    private void menuItemListarReferenciaBibliograficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarReferenciaBibliograficaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListarReferenciaBibliograficaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu menuAta;
    private javax.swing.JMenu menuDisciplina;
    private javax.swing.JMenu menuGrade;
    private javax.swing.JMenuItem menuItemCadastrarAta;
    private javax.swing.JMenuItem menuItemCadastrarDisciplina;
    private javax.swing.JMenuItem menuItemCadastrarGrade;
    private javax.swing.JMenuItem menuItemCadastrarReferenciaBibliografica;
    private javax.swing.JMenuItem menuItemListarAta;
    private javax.swing.JMenuItem menuItemListarDisciplina;
    private javax.swing.JMenuItem menuItemListarGrade;
    private javax.swing.JMenuItem menuItemListarReferenciaBibliografica;
    private javax.swing.JMenu menuReferenciaBibliografica;
    // End of variables declaration//GEN-END:variables
}
