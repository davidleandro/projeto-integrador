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
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sairMenuArquivo = new javax.swing.JMenuItem();
        menuAta = new javax.swing.JMenu();
        menuItemListarAta = new javax.swing.JMenuItem();
        menuItemCadastrarAta = new javax.swing.JMenuItem();
        menuPlanoDeEnsino = new javax.swing.JMenu();
        menuItemListarPlanoDeEnsino = new javax.swing.JMenuItem();
        menuItemCadastrarPlanoDeEnsino = new javax.swing.JMenuItem();
        menuGrade = new javax.swing.JMenu();
        menuItemListarGrade = new javax.swing.JMenuItem();
        menuItemCadastrarGrade = new javax.swing.JMenuItem();
        menuReferenciaBibliografica = new javax.swing.JMenu();
        menuItemListarReferenciaBibliografica = new javax.swing.JMenuItem();
        menuItemCadastrarReferenciaBibliografica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Arquivo");

        sairMenuArquivo.setText("Sair");
        sairMenuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuArquivoActionPerformed(evt);
            }
        });
        jMenu1.add(sairMenuArquivo);

        BarraMenu.add(jMenu1);

        menuAta.setText("Ata");

        menuItemListarAta.setText("Listar");
        menuItemListarAta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarAtaActionPerformed(evt);
            }
        });
        menuAta.add(menuItemListarAta);

        menuItemCadastrarAta.setText("Cadastrar");
        menuItemCadastrarAta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarAtaActionPerformed(evt);
            }
        });
        menuAta.add(menuItemCadastrarAta);

        BarraMenu.add(menuAta);

        menuPlanoDeEnsino.setText("Plano de ensino");

        menuItemListarPlanoDeEnsino.setText("Listar");
        menuItemListarPlanoDeEnsino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarPlanoDeEnsinoActionPerformed(evt);
            }
        });
        menuPlanoDeEnsino.add(menuItemListarPlanoDeEnsino);

        menuItemCadastrarPlanoDeEnsino.setText("Cadastrar");
        menuItemCadastrarPlanoDeEnsino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarPlanoDeEnsinoActionPerformed(evt);
            }
        });
        menuPlanoDeEnsino.add(menuItemCadastrarPlanoDeEnsino);

        BarraMenu.add(menuPlanoDeEnsino);

        menuGrade.setText("Grade");

        menuItemListarGrade.setText("Listar");
        menuItemListarGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarGradeActionPerformed(evt);
            }
        });
        menuGrade.add(menuItemListarGrade);

        menuItemCadastrarGrade.setText("Cadastrar");
        menuItemCadastrarGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarGradeActionPerformed(evt);
            }
        });
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
        menuItemCadastrarReferenciaBibliografica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarReferenciaBibliograficaActionPerformed(evt);
            }
        });
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
        ListaAta dialog = new ListaAta(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemListarAtaActionPerformed

    private void menuItemListarPlanoDeEnsinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarPlanoDeEnsinoActionPerformed
        ListaPlanoDeEnsino dialog = new ListaPlanoDeEnsino(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemListarPlanoDeEnsinoActionPerformed

    private void menuItemListarGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarGradeActionPerformed
        FormGrade dialog = new FormGrade(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemListarGradeActionPerformed

    private void menuItemListarReferenciaBibliograficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarReferenciaBibliograficaActionPerformed
        ListaReferenciaBibliografica dialog = new ListaReferenciaBibliografica(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemListarReferenciaBibliograficaActionPerformed

    private void menuItemCadastrarPlanoDeEnsinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarPlanoDeEnsinoActionPerformed
        FormPlanoDeEnsino dialog = new FormPlanoDeEnsino(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemCadastrarPlanoDeEnsinoActionPerformed

    private void menuItemCadastrarReferenciaBibliograficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarReferenciaBibliograficaActionPerformed
        FormReferenciaBibliografica dialog = new FormReferenciaBibliografica(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemCadastrarReferenciaBibliograficaActionPerformed

    private void menuItemCadastrarGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarGradeActionPerformed
        FormGrade dialog = new FormGrade(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemCadastrarGradeActionPerformed

    private void sairMenuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuArquivoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairMenuArquivoActionPerformed

    private void menuItemCadastrarAtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarAtaActionPerformed
        FormAtas dialog = new FormAtas(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_menuItemCadastrarAtaActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu menuAta;
    private javax.swing.JMenu menuGrade;
    private javax.swing.JMenuItem menuItemCadastrarAta;
    private javax.swing.JMenuItem menuItemCadastrarGrade;
    private javax.swing.JMenuItem menuItemCadastrarPlanoDeEnsino;
    private javax.swing.JMenuItem menuItemCadastrarReferenciaBibliografica;
    private javax.swing.JMenuItem menuItemListarAta;
    private javax.swing.JMenuItem menuItemListarGrade;
    private javax.swing.JMenuItem menuItemListarPlanoDeEnsino;
    private javax.swing.JMenuItem menuItemListarReferenciaBibliografica;
    private javax.swing.JMenu menuPlanoDeEnsino;
    private javax.swing.JMenu menuReferenciaBibliografica;
    private javax.swing.JMenuItem sairMenuArquivo;
    // End of variables declaration//GEN-END:variables
}
