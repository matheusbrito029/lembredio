/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elrafa
 */
public class CadastroInternal extends javax.swing.JInternalFrame {
    ValidarLogin vlogin = new ValidarLogin();
    Pessoa plogin = new Pessoa();
    int type;
    Médico medico = new Médico();
    /**
     * Creates new form CadastroInternal
     */
    public CadastroInternal() {
        this.type = -1;
        initComponents();
        setVisible(true);
        RadioButtonHandler handler = new RadioButtonHandler();
        jRadioButton3.addItemListener(handler);
        jRadioButton1.addItemListener(handler);
        jRadioButton2.addItemListener(handler);
        jLabel4.setVisible(false);
        CRM.setVisible(false);
    }
    public void cadastroInfo() throws IOException{
        if(vlogin.verificaCadastro() && plogin.verificaEmail()){
                      
        FileWriter outputfile = new FileWriter("CADASTRADOS.txt");
        PrintWriter out = new PrintWriter(outputfile);
        out.flush();
        out.close();
        }else{
            
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

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        EfetuarCadastro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        loginDesejado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SENHA = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        CRM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomePessoa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setTitle("Cadastro");
        setToolTipText("");

        EfetuarCadastro.setText("Continuar");
        EfetuarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfetuarCadastroActionPerformed(evt);
            }
        });

        jLabel6.setText("O que você é para com o aplicativo?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Médico");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Enfermeiro(a)");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Paciente");

        jLabel2.setText("Digite o login desejado:");

        loginDesejado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginDesejadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite a senha:");

        SENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENHAActionPerformed(evt);
            }
        });

        jLabel4.setText("Digite seu CRM");

        CRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRMActionPerformed(evt);
            }
        });

        jLabel5.setText("Digite seu nome");

        nomePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePessoaActionPerformed(evt);
            }
        });

        jLabel7.setText("Digite seu e-mail");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CRM, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EfetuarCadastro)))
                        .addGap(6, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(nomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EfetuarCadastro)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePessoaActionPerformed
        plogin.nome = evt.getActionCommand();
        
       // TODO add your handling code here:
    }//GEN-LAST:event_nomePessoaActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        plogin.email = evt.getActionCommand();
// TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void loginDesejadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginDesejadoActionPerformed
        vlogin.login = evt.getActionCommand();
        // TODO add your handling code here:
    }//GEN-LAST:event_loginDesejadoActionPerformed

    private void SENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENHAActionPerformed
        vlogin.senha = evt.getActionCommand();
        // TODO add your handling code here:
    }//GEN-LAST:event_SENHAActionPerformed

    private void CRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRMActionPerformed
       medico.setCRM(Integer.parseInt(evt.getActionCommand()));
// TODO add your handling code here:
    }//GEN-LAST:event_CRMActionPerformed

    private void EfetuarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfetuarCadastroActionPerformed
        try {
            if(vlogin.verificaCadastro() && plogin.verificaEmail() && type != -1){
               //Copia o primeiro arquivo pro segundo alterando a quantidade de cadastros ( primeira linha)
               swapFile("CADASTRADOS.txt", "CADASTRADOS2.txt", true); 
               //Copia o segundo arquivo, após ter sido alterado para o primeiro.
               swapFile("CADASTRADOS2.txt", "CADASTRADOS.txt", false);
               
            } // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(CadastroInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EfetuarCadastroActionPerformed

    public class RadioButtonHandler implements ItemListener{
        @Override
        public void itemStateChanged (ItemEvent evt){
                    
        if(evt.getSource()== jRadioButton3){
            jLabel4.setVisible(false);
            CRM.setVisible(false);
            type = 0;
            
        }else if(evt.getSource()== jRadioButton1){
            jLabel4.setVisible(true);
            CRM.setVisible(true);
            type = 1;
        }
        else if(evt.getSource()== jRadioButton2){
            jLabel4.setVisible(false);
            CRM.setVisible(false);
            type = 3;
        }
        
        
        }
    }
    
    public void swapFile(String file1, String file2, boolean t) throws FileNotFoundException, IOException{
                boolean endOfFile = true;
                
                InputStream is = new FileInputStream(file1);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                
                FileWriter outputfile = new FileWriter(file2);
                PrintWriter out = new PrintWriter(outputfile);
               
                if(t){
                int a = Integer.parseInt(br.readLine()) + 1;
                out.println(a);
               }

               do{ 
                    String b = br.readLine();    
                    if(b == null){
                        endOfFile = false;
                        continue;
                    }
                    out.println(b);
                    out.flush();
                }while(endOfFile);
               
               if(t){
                    out.println(type);
                    out.println(vlogin.login);
                    out.println(vlogin.senha);
                    out.println(plogin.nome);
                    out.println(plogin.email);
                    if(type==1) out.println(medico.getCRM());
                    
               }else{
                   File file = new File(file1);
                   file.delete();
               }
              out.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CRM;
    private javax.swing.JButton EfetuarCadastro;
    private javax.swing.JPasswordField SENHA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField loginDesejado;
    private javax.swing.JTextField nomePessoa;
    // End of variables declaration//GEN-END:variables
}
