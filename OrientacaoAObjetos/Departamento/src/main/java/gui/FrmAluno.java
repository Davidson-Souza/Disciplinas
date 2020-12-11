package gui;
import classes.Aluno;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FrmAluno extends javax.swing.JFrame
{
    List<Aluno> alunos;
    boolean enabled;
    private final Function obj;

    public FrmAluno(Function obj)
    {
        initComponents();
        edtLog.setEditable(false);
        this.alunos = new ArrayList<>();
        this.lerCSV();
        this.enabled = false;
        this.setEdt(false);
        this.obj = obj;
    }
    public void setEdt(boolean state)
    {
        edtAnoMatricula.setEnabled(state);
        edtIdade.setEnabled(state);
        edtNome.setEnabled(state);
        edtSexo.setEnabled(state);
        edtMatricula.setEnabled(state);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSavar = new javax.swing.JButton();
        edtNome = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtAnoMatricula = new javax.swing.JTextField();
        edtMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        edtMatricula.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                edtMatriculaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Sexo");

        jLabel3.setText("Idade");

        jLabel5.setText("Matricula");

        jLabel6.setText("Ano Ingresso");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Cadastro de aluno");

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        edtLog.setColumns(20);
        edtLog.setRows(5);
        jScrollPane1.setViewportView(edtLog);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSavar)
                                .addGap(0, 40, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edtIdade)
                                    .addComponent(edtSexo)
                                    .addComponent(edtNome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtMatricula)
                                    .addComponent(edtAnoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSavar)
                    .addComponent(btnCancelar))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtAnoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_edtNomeActionPerformed
    {//GEN-HEADEREND:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed

    private void edtMatriculaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_edtMatriculaActionPerformed
    {//GEN-HEADEREND:event_edtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtMatriculaActionPerformed

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
        String mat = JOptionPane.showInputDialog("Informe a matrícula do aluno para excluír", "");
        Aluno aluno = this.getElementByMatricula(mat);
        if (aluno != null)
        {
            this.setEdt(true);
            this.printToFilds(aluno);
        }
        else
            JOptionPane.showMessageDialog(this, "Erro: Aluno não encontrado no sistema");
    }//GEN-LAST:event_btnEditarActionPerformed
    public void printToFilds(Aluno a)
    {
        edtAnoMatricula.setText(Integer.toString(a.getAnoIngresso()));
        edtIdade.setText(Integer.toString(a.getIdade()));
        edtNome.setText(a.getNome());
        edtSexo.setText((a.getSexo() + " "));
        edtMatricula.setText(a.getMatricula());
    }
    public String printToCSV()
    {
        String csv = "";
        csv = "anoIngresso;matricula;idade;nome;sexo\n";
        for (int i = 0; i<this.alunos.size(); i++)
            csv += this.alunos.get(i).impriteToCSV();
        return csv;
    }

    public void salvarAlunos()
    {
        try (FileWriter arq = new FileWriter("alunos.csv"))
        {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(this.printToCSV());
        } catch (IOException ex)
        {
            Logger.getLogger(FrmAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Aluno getAlunoFromForms()
    {
        Aluno a = new Aluno();
        
        a.setAnoIngresso(Integer.parseInt(edtAnoMatricula.getText()));
        a.setIdade(Integer.parseInt(edtIdade.getText()));
        a.setMatricula(edtMatricula.getText());
        a.setNome(edtNome.getText());
        a.setSexo(edtSexo.getText().charAt(0));
        
        return a;
    }
    private void clearFields()
    {
        edtAnoMatricula.setText("");
        edtIdade.setText("");
        edtNome.setText("");
        edtSexo.setText("");
        edtMatricula.setText("");
    }
    private String imprimeToString()
    {
        String txt = "";
        for (int i = 0; i<this.alunos.size(); i++)
            txt = txt + alunos.get(i).imprimeParaString();
        return txt;
    }
    public void lerCSV()
    {
        FileReader  f = null;
        try
        {
            f = new FileReader("alunos.csv");
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

            Aluno a = new Aluno();
            a.CSVToAtributo(linhaLida);
            this.alunos.add(a);
        }
        edtLog.setText (this.imprimeToString());
    }
    private void btnSavarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSavarActionPerformed
    {//GEN-HEADEREND:event_btnSavarActionPerformed
        if (!enabled)
            return;
        Aluno a = getAlunoFromForms();
        if(this.getElementByMatricula(a.getMatricula()) == null)
        {
            this.alunos.add(a);
            edtLog.setText (this.imprimeToString());
            this.clearFields();
            this.setEdt(false);
        }
        else
        {
            this.alunos.set (this.alunos.indexOf(this.getElementByMatricula(a.getMatricula())), a);
            edtLog.setText (this.imprimeToString());
            this.clearFields();
            this.setEdt(false);
        }
        this.salvarAlunos();
    }//GEN-LAST:event_btnSavarActionPerformed
    private Aluno getElementByMatricula(String matricula)
    {
        for (int i = 0; i<this.alunos.size(); i++)
            if (this.alunos.get(i).getMatricula().equals(matricula))
                return this.alunos.get(i);
        return null;
                        
    }
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        String mat = JOptionPane.showInputDialog("Informe a matrícula do aluno para excluír", "");
        Aluno aluno = this.getElementByMatricula(mat);
        if (aluno != null)
        {
            JOptionPane.showMessageDialog(this, "Aluno excluído com suscesso!");
            this.alunos.remove(aluno);
            edtLog.setText (this.imprimeToString());
        }
        else
            JOptionPane.showMessageDialog(this, "Erro: Aluno não encontrado no sistema");
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSavar;
    private javax.swing.JTextField edtAnoMatricula;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextArea edtLog;
    private javax.swing.JTextField edtMatricula;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
