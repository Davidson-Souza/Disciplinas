package gui;

import classes.Professor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmProfessor extends javax.swing.JFrame
{
    List<Professor> professores;
    boolean enabled;
    private final Function obj;

    public FrmProfessor(Function obj)
    {
        initComponents();
        edtLog.setEditable(false);
        this.professores = new ArrayList<>();
        this.enabled = false;
        this.setEdt(false);
        this.obj = obj;
        this.lerCSV();
    }
    public void setEdt(boolean state)
    {
        edtCPF.setEnabled(state);
        edtIdade.setEnabled(state);
        edtNome.setEnabled(state);
        edtSexo.setEnabled(state);
    }
     public void printToFilds(Professor p)
    {
        edtIdade.setText(Integer.toString(p.getIdade()));
        edtNome.setText(p.getNome());
        edtSexo.setText((p.getSexo() + " "));
        edtCPF.setText(p.getCPF());
    }
    private Professor getProfessorFromForms()
    {
        Professor p = new Professor();
        
        p.setIdade(Integer.parseInt(edtIdade.getText()));
        p.setNome(edtNome.getText());
        p.setSexo(edtSexo.getText().charAt(0));
        p.setCPF(edtCPF.getText());
        
        return p;
    }
    private void clearFields()
    {
        edtIdade.setText("");
        edtNome.setText("");
        edtSexo.setText("");
        edtCPF.setText("");
    }
    private String imprimeToString()
    {
        String txt = "";
        for (int i = 0; i<this.professores.size(); i++)
            txt = txt + professores.get(i).imprimeParaString();
        return txt;
    }
    private Professor getElementByCPF(String matricula)
    {
        for (int i = 0; i<this.professores.size(); i++)
            if (this.professores.get(i).getCPF().equals(matricula))
                return this.professores.get(i);
        return null;
                        
    }
    private String createHeder()
    {
        return "nome;sexo;idade;cpf\n";
    }
    public String printToCSV()
    {
        String csv = "";
        csv += this.createHeder();
        for (int i = 0; i<this.professores.size(); i++)
            csv += this.professores.get(i).impriteToCSV();
        return csv;
    }
    public void lerCSV()
    {
        FileReader  f = null;
        try
        {
            f = new FileReader("professores.csv");
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(FrmProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner arquivo = new Scanner(f);
        arquivo.useDelimiter("\n");
        if (!arquivo.hasNext())
            return ;
        String linhaLida = arquivo.next();
        
        while(arquivo.hasNext())
        {
            linhaLida = arquivo.next();

            Professor p = new Professor();
            p.CSVToAtributo(linhaLida);
            this.professores.add(p);
        }
        edtLog.setText (this.imprimeToString());
    }
    public void salvarProfessores() throws IOException
    {
        try (FileWriter arq = new FileWriter("professores.csv"))
        {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(this.printToCSV());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        edtCPF = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSavar = new javax.swing.JButton();
        edtNome = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edtIdade.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                edtIdadeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Sexo");

        jLabel5.setText("Idade");

        jLabel6.setText("CPF");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Cadastro de professores");

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSavar.setText("Salvar");
        btnSavar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSavar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSavarActionPerformed(evt);
            }
        });

        edtNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                edtNomeActionPerformed(evt);
            }
        });

        edtLog.setColumns(20);
        edtLog.setRows(5);
        jScrollPane1.setViewportView(edtLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edtSexo)
                                    .addComponent(edtNome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtIdade)
                                    .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel7)
                                .addGap(0, 125, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSavar)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSavar)
                    .addComponent(btnCancelar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtIdadeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_edtIdadeActionPerformed
    {//GEN-HEADEREND:event_edtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtIdadeActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.obj.apply(evt);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
    {//GEN-HEADEREND:event_btnNovoActionPerformed
        this.enabled = true;
        clearFields();
        this.setEdt(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        String cpf = JOptionPane.showInputDialog("Informe o CPF do professor para excluír", "");
        Professor p = this.getElementByCPF(cpf);
        if (p != null)
        {
            this.setEdt(true);
            this.printToFilds(p);
        }
        else
        JOptionPane.showMessageDialog(this, "Erro: professor não encontrado no sistema");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        String cpf = JOptionPane.showInputDialog("Informe o CPF do professor para excluír", "");
        Professor p = this.getElementByCPF(cpf);
        if (p != null)
        {
            JOptionPane.showMessageDialog(this, "Professor excluído com suscesso!");
            this.professores.remove(p);
            edtLog.setText (this.imprimeToString());
        }
        else
        JOptionPane.showMessageDialog(this, "Erro: Professor não encontrado no sistema");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSavarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSavarActionPerformed
    {//GEN-HEADEREND:event_btnSavarActionPerformed
        if (!enabled)
        return;
        Professor p = getProfessorFromForms();
        if(this.getElementByCPF(p.getCPF()) == null)
        {
            this.professores.add(p);
            edtLog.setText (this.imprimeToString());
            this.clearFields();
            this.setEdt(false);
        }
        else
        {
            this.professores.set (this.professores.indexOf(this.getElementByCPF(p.getCPF())), p);
            edtLog.setText (this.imprimeToString());
            this.clearFields();
            this.setEdt(false);
        }
        try
        {
            this.salvarProfessores();
        } catch (IOException ex)
        {
            Logger.getLogger(FrmProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSavarActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_edtNomeActionPerformed
    {//GEN-HEADEREND:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSavar;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextArea edtLog;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
