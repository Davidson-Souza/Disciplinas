/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.util.function.Function;

public class FrmMainApplication extends javax.swing.JFrame {
    
    Function obj = e ->
        {
            this.setVisible(true);
            return null;
        };
    /** Creates new form FrmMainApplication */
    public FrmMainApplication() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        btnAluno = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bem-vindo ao aplicativo de gerência do Departamento Acadêmico");

        btnAluno.setText("Aluno");
        btnAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlunoActionPerformed(evt);
            }
        });

        btnProfessor.setText("Professor");
        btnProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfessor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfessor)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAlunoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlunoActionPerformed
    {//GEN-HEADEREND:event_btnAlunoActionPerformed
        FrmAluno a = new FrmAluno(this.obj);
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_btnAlunoActionPerformed

    private void btnProfessorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProfessorActionPerformed
    {//GEN-HEADEREND:event_btnProfessorActionPerformed
        FrmProfessor a = new FrmProfessor(this.obj);
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_btnProfessorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAluno;
    private javax.swing.JButton btnProfessor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
