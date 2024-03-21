package Usuario;

import Conexao.Conexao;
import Criptografia.Criptografia;
import javax.swing.JOptionPane;
import Usuario.Usuario;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetohonkai.ConeJF;
import projetohonkai.PersonagemJF;
import projetohonkai.ReliquiaJF;
import projetohonkai.TelaInicial;

public class LoginU extends javax.swing.JFrame {
    
    Usuario u = new Usuario();
    CadastroU cu = new CadastroU();
    TelaInicial ti = new TelaInicial();
    private boolean Cadastro = false;

    public boolean isCadastro() {
        return Cadastro;
    }

    public void setCadastro(boolean Cadastro) {
        this.Cadastro = Cadastro;
    }
    
    public LoginU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        TituloLU = new javax.swing.JLabel();
        LoginLU = new javax.swing.JLabel();
        LoginTxtLU = new javax.swing.JTextField();
        SenhaLU = new javax.swing.JLabel();
        SenhaTxtLU = new javax.swing.JTextField();
        BCadastrarLU = new javax.swing.JButton();
        BLoginLU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login.setBackground(new java.awt.Color(153, 153, 255));

        TituloLU.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TituloLU.setText("Projeto Honkai");

        LoginLU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LoginLU.setText("Login/e-mail:");

        LoginTxtLU.setBackground(new java.awt.Color(204, 204, 255));
        LoginTxtLU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        SenhaLU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SenhaLU.setText("Senha:");

        SenhaTxtLU.setBackground(new java.awt.Color(204, 204, 255));
        SenhaTxtLU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        BCadastrarLU.setBackground(new java.awt.Color(204, 204, 255));
        BCadastrarLU.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BCadastrarLU.setText("CADASTRAR");
        BCadastrarLU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarLUActionPerformed(evt);
            }
        });

        BLoginLU.setBackground(new java.awt.Color(204, 204, 255));
        BLoginLU.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BLoginLU.setText("LOGIN");
        BLoginLU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginLUActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("* ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("* ");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(BCadastrarLU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                                .addComponent(BLoginLU))
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(SenhaLU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(LoginLU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(LoginTxtLU)
                            .addComponent(SenhaTxtLU)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(TituloLU)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(TituloLU)
                .addGap(37, 37, 37)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLU)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginTxtLU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaLU)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaTxtLU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BLoginLU)
                    .addComponent(BCadastrarLU))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BLoginLUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoginLUActionPerformed
        // TODO add your handling code here:
        String sql;
        try{
        Conexao conector = new Conexao();
            conector.conectar();
            Statement st = conector.conn.createStatement();
            // Preenchimento dos campos
            u.setLogin(LoginTxtLU.getText());
            u.setSenha(Criptografia.getMD5(SenhaTxtLU.getText()));
            u.setID(cu.getPassaID());
            // Comando para o MySQL
            sql = "Select Usuario.Login from Usuario where Login = '" + u.getLogin() + "' and Senha = '" + u.getSenha() + "'";
            ResultSet rs = st.executeQuery(sql);
            // Validação de usuário
            while(rs.next()){
                if(rs.getString(1).isBlank() || rs.getString(1).isEmpty()){
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos, tente novamente");
                }
                else if(u.getLogin().isBlank()){
                    JOptionPane.showMessageDialog(null, "Usuário incorreto, tente novamente");
                }
                else if(u.getSenha().isBlank()){
                    JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente");
                }
                else{
                    int id = u.getID() - 1;
                    TelaInicial ti = new TelaInicial(id);
                    ti.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar os valores!");
        }
    }//GEN-LAST:event_BLoginLUActionPerformed

    private void BCadastrarLUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarLUActionPerformed
        // TODO add your handling code here:
        // Abrir tela para o cadastro do usuário
        cu.setVisible(true);
    }//GEN-LAST:event_BCadastrarLUActionPerformed

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
            java.util.logging.Logger.getLogger(LoginU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastrarLU;
    private javax.swing.JButton BLoginLU;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel LoginLU;
    private javax.swing.JTextField LoginTxtLU;
    private javax.swing.JLabel SenhaLU;
    private javax.swing.JTextField SenhaTxtLU;
    private javax.swing.JLabel TituloLU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
