
package projetohonkai;

import javax.swing.JButton;

public class ReliquiaJF extends javax.swing.JFrame {
    
    public ReliquiaJF(int id) {
        initComponents();
    }
    
    public ReliquiaJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLTituloRJF = new javax.swing.JLabel();
        JLNomeRJF = new javax.swing.JLabel();
        JL2PecasRJF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAEfeito2PecasRJF = new javax.swing.JTextArea();
        JL4PecasRJF = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTAEfeito4PecasRJF = new javax.swing.JTextArea();
        BVoltarRJF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        JLTituloRJF.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        JLTituloRJF.setText("Honkai: Star Rail Relíquia");

        JLNomeRJF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLNomeRJF.setText("Nome da Reliquia");

        JL2PecasRJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL2PecasRJF.setText("2 Peças:");

        JTAEfeito2PecasRJF.setEditable(false);
        JTAEfeito2PecasRJF.setColumns(20);
        JTAEfeito2PecasRJF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTAEfeito2PecasRJF.setRows(5);
        JTAEfeito2PecasRJF.setText("Aumenta o Dano Causado por ataques \nsubsequentes em 20%.");
        jScrollPane1.setViewportView(JTAEfeito2PecasRJF);

        JL4PecasRJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL4PecasRJF.setText("4 Peças:");

        JTAEfeito4PecasRJF.setEditable(false);
        JTAEfeito4PecasRJF.setColumns(20);
        JTAEfeito4PecasRJF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTAEfeito4PecasRJF.setRows(5);
        JTAEfeito4PecasRJF.setText("Aumenta o Efeito de Quebra em 16%.\nQuando o Usuário Inflinge Quebra de\nFraqueza, regenera 3 de Energia.");
        jScrollPane2.setViewportView(JTAEfeito4PecasRJF);

        BVoltarRJF.setBackground(new java.awt.Color(204, 204, 255));
        BVoltarRJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BVoltarRJF.setText("Voltar");
        BVoltarRJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarRJFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BVoltarRJF)
                            .addComponent(JLTituloRJF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLNomeRJF)
                                    .addComponent(JL2PecasRJF))
                                .addGap(93, 93, 93)
                                .addComponent(JL4PecasRJF)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLTituloRJF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLNomeRJF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL2PecasRJF)
                    .addComponent(JL4PecasRJF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BVoltarRJF))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarRJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarRJFActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BVoltarRJFActionPerformed

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
            java.util.logging.Logger.getLogger(ReliquiaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReliquiaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReliquiaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReliquiaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReliquiaJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVoltarRJF;
    private javax.swing.JLabel JL2PecasRJF;
    private javax.swing.JLabel JL4PecasRJF;
    private javax.swing.JLabel JLNomeRJF;
    private javax.swing.JLabel JLTituloRJF;
    private javax.swing.JTextArea JTAEfeito2PecasRJF;
    private javax.swing.JTextArea JTAEfeito4PecasRJF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
