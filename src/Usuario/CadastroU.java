package Usuario;

import Conexao.Conexao;
import Criptografia.Criptografia;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetohonkai.ConeJF;
import projetohonkai.PersonagemJF;
import projetohonkai.ReliquiaJF;

public class CadastroU extends javax.swing.JFrame {
    
    Usuario u = new Usuario();
    int i = 1;
    private int PassaID;

    public int getPassaID() {
        return PassaID;
    }

    public void setPassaID(int PassaID) {
        this.PassaID = PassaID;
    }
    
    public CadastroU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro = new javax.swing.JPanel();
        TituloCU = new javax.swing.JLabel();
        SubTituloCU = new javax.swing.JLabel();
        LoginCU = new javax.swing.JLabel();
        LoginTxtCU = new javax.swing.JTextField();
        SenhaCU = new javax.swing.JLabel();
        SenhaTxtCU = new javax.swing.JTextField();
        BVoltarCU = new javax.swing.JButton();
        BCadastrarCU = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastro.setBackground(new java.awt.Color(153, 153, 255));

        TituloCU.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TituloCU.setText("Projeto Honkai");
        TituloCU.setToolTipText("");

        SubTituloCU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubTituloCU.setText("Cadastro de Usuário");

        LoginCU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LoginCU.setText("Login/e-mail:");

        LoginTxtCU.setBackground(new java.awt.Color(204, 204, 255));
        LoginTxtCU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LoginTxtCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTxtCUActionPerformed(evt);
            }
        });

        SenhaCU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SenhaCU.setText("Senha:");

        SenhaTxtCU.setBackground(new java.awt.Color(204, 204, 255));
        SenhaTxtCU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        BVoltarCU.setBackground(new java.awt.Color(204, 204, 255));
        BVoltarCU.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BVoltarCU.setText("VOLTAR");
        BVoltarCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarCUActionPerformed(evt);
            }
        });

        BCadastrarCU.setBackground(new java.awt.Color(204, 204, 255));
        BCadastrarCU.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BCadastrarCU.setText("CADASTRAR");
        BCadastrarCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarCUActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("* ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("* ");

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(SenhaCU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(CadastroLayout.createSequentialGroup()
                            .addComponent(BVoltarCU)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BCadastrarCU))
                        .addComponent(LoginTxtCU, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                        .addComponent(SenhaTxtCU)
                        .addGroup(CadastroLayout.createSequentialGroup()
                            .addComponent(LoginCU)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                .addGap(0, 195, Short.MAX_VALUE)
                .addComponent(SubTituloCU)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloCU)
                .addGap(105, 105, 105))
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(TituloCU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubTituloCU)
                .addGap(39, 39, 39)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginCU)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginTxtCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SenhaCU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SenhaTxtCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCadastrarCU)
                    .addComponent(BVoltarCU))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarCUActionPerformed
        // TODO add your handling code here:
        // Voltar para a Tela Inicial
        dispose();
    }//GEN-LAST:event_BVoltarCUActionPerformed

    private void BCadastrarCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarCUActionPerformed
        // TODO add your handling code here:
        // Declaraçõa de variáveis
        String sql;
        // Try - Catch
        try {
            // Conexão com o banco de dados
            Conexao conector = new Conexao();
            conector.conectar();
            Statement st = conector.conn.createStatement();
            // Preenchimento dos campos
            u.setID(i);
            PassaID = u.getID();
            u.setLogin(LoginTxtCU.getText());
            u.setSenha(Criptografia.getMD5(SenhaTxtCU.getText()));
            // Comando para o MySQL
            sql = "insert into Usuario (ID, Senha, Login) values ('" + u.getID() + "', '" + u.getSenha() + "', '" + u.getLogin() + "')";
            st.executeUpdate(sql);

            u.setCadastrado(true);
            Usuario.adicionar(u);
            i++;
        } catch (SQLException ex) {
            Logger.getLogger(LoginU.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar os valores");
        }
    }//GEN-LAST:event_BCadastrarCUActionPerformed

    private void LoginTxtCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTxtCUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginTxtCUActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastrarCU;
    private javax.swing.JButton BVoltarCU;
    private javax.swing.JPanel Cadastro;
    private javax.swing.JLabel LoginCU;
    private javax.swing.JTextField LoginTxtCU;
    private javax.swing.JLabel SenhaCU;
    private javax.swing.JTextField SenhaTxtCU;
    private javax.swing.JLabel SubTituloCU;
    private javax.swing.JLabel TituloCU;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
