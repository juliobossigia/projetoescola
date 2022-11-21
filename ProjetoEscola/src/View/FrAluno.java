/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import classes.Aluno;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class FrAluno extends javax.swing.JFrame {
    List<Aluno> lista;
    Aluno alunoEdit = null;
    
    public FrAluno() {
        initComponents();
        lista = new ArrayList<>();
        this.habilitarCampus(false);
        this.limparCampus();
        this.loadAlunos();
    }
    
    public String criarListaAlunosCSV(){
        String texto ="";
        Aluno a = new Aluno();
        texto = a.cabecalho();
        for (int i= 0; i<=this.lista.size()-1; i++){
            Aluno a1= this.lista.get(i);
            texto = texto + a1.atributoToCSV();
        }
        return texto;
    }
    
    public void salvarAlunos(String texto){
        try {
            FileWriter arq = null;
            arq= new FileWriter("ListagemAlunos.csv");
            PrintWriter gravaArq = new PrintWriter(arq);
            gravaArq.print(texto);
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(FrAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void habilitarCampus(boolean flag){
        edtnome.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtMatricula.setEnabled(flag);
        edtSexo.setEnabled(flag);
    }
    
    public void objetosParaCampus(Aluno a1){
        edtnome.setText(a1.getNome());
        edtIdade.setText(a1.getIdade()+"");
        edtMatricula.setText(a1.getMatricula()+"");
        edtSexo.setText(a1.getSexo()+"");
    }
    public void limparCampus(){
        edtnome.setText("");
        edtIdade.setText("");
        edtMatricula.setText("");
        edtSexo.setText("");
    }
    
    public Aluno campusParaObjetos(){
        Aluno a1 = new Aluno();
        a1.setNome(edtnome.getText());
        a1.setSexo(edtSexo.getText().charAt(0));
       int a = Integer.parseInt(edtIdade.getText());
       a1.setIdade(a);
       a1.setMatricula(edtMatricula.getText());
       
       
      return a1;
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        edtMatricula = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtnome = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAD. ALUNO");

        lblnome.setText("Nome");

        lblIdade.setText("Idade");

        lblSexo.setText("Sexo");

        lblMatricula.setText("Matricula");

        edtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtIdadeActionPerformed(evt);
            }
        });

        edtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtnomeActionPerformed(evt);
            }
        });

        edtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSexoActionPerformed(evt);
            }
        });

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/note_edit_12872.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(108, 38));
        btnEditar.setMinimumSize(new java.awt.Dimension(108, 38));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancel_stop_exit_1583.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Save_37110.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblnome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtIdadeActionPerformed

    private void edtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtnomeActionPerformed

    private void edtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSexoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampus(true);
        this.limparCampus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String MatriculaEscolhido =   JOptionPane.showInputDialog("Informe o CPF do professor que deseja editar", "");
        alunoEdit =  this.pesquisaAluno(MatriculaEscolhido);
        if (alunoEdit == null){
            JOptionPane.showMessageDialog(this, "Não existe Professor com esse CPF");
        }else{
            this.limparCampus();
            this.habilitarCampus(true);
            this.objetosParaCampus(alunoEdit);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampus();
        this.habilitarCampus(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String MatriculaEscolhido =   JOptionPane.showInputDialog("Informe o CPF do professor que deseja excluir", "");

        Aluno a1 = this.pesquisaAluno(MatriculaEscolhido);

        if(a1==null){
            JOptionPane.showMessageDialog(this,"Não existe professor com esse CPF");
        }else{
            lista.remove(a1);
            JOptionPane.showMessageDialog(this,"Excluido com sucesso!");
        }
        edtListagem.setText(this.imprimirListaAlunos());
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(this.alunoEdit == null){
            Aluno a1 = new Aluno();
            a1=this.campusParaObjetos();
            lista.add(a1);

        }else{
            this.lista.remove(this.alunoEdit);
            this.alunoEdit = this.campusParaObjetos();
            this.lista.add(alunoEdit);
        }
        this.campusParaObjetos();
        this.limparCampus();
        edtListagem.setText(this.imprimirListaAlunos());
        this.habilitarCampus(false);

        //edtListagem.setText(p.imprimirParaString());
        String texto = this.criarListaAlunosCSV();
        this.salvarAlunos(texto);

    }//GEN-LAST:event_btnSalvarActionPerformed

    public void loadAlunos(){
        try {
            FileReader f = null;
            f= new FileReader("ListagemAlunos.csv");
            Scanner arquivoLido = new Scanner (f);
            arquivoLido.useDelimiter("\n");
            String linhaLida = arquivoLido.next();
            while(arquivoLido.hasNext()){
            linhaLida = arquivoLido.next();
            Aluno a1 = new Aluno();
            a1.CSVToAtributo(linhaLida);
            this.lista.add(a1);
        }
            edtListagem.setText(imprimirListaAlunos());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public String imprimirListaAlunos(){
          String listagemTotal="";
          
            for(int i=0; i<=lista.size()-1; i++){
                listagemTotal= listagemTotal + lista.get(i).imprimirParaString();
            }
           return listagemTotal; 
        }
    
    
    
    
    public Aluno pesquisaAluno(String matricula){
        for (int i=0; i<=lista.size()-1; i++){
            if (matricula.equals(lista.get(i).getMatricula())){
                return lista.get(i);
            }
        }
            return null;
     }
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FrAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtMatricula;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JTextField edtnome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblnome;
    // End of variables declaration//GEN-END:variables
}
