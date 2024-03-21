package projetohonkai;

import javax.swing.JButton;

public class ConeJF extends javax.swing.JFrame {
    
    public ConeJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cone = new javax.swing.JPanel();
        JLTituloCJF = new javax.swing.JLabel();
        JLNomeCJF = new javax.swing.JLabel();
        JLHabilidadeCJF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAEfeitoCJF = new javax.swing.JTextArea();
        BVoltarTCJF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cone.setBackground(new java.awt.Color(153, 153, 255));

        JLTituloCJF.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        JLTituloCJF.setText("Honkai: Star Rail Cone");

        JLNomeCJF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLNomeCJF.setText("Nome do Cone");

        JLHabilidadeCJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLHabilidadeCJF.setText("Habilidade:");

        JTAEfeitoCJF.setEditable(false);
        JTAEfeitoCJF.setColumns(20);
        JTAEfeitoCJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTAEfeitoCJF.setRows(5);
        JTAEfeitoCJF.setText("Aumenta a taxa CRIT do usuário em 12/15/18/21/24% . \nApós um acerto CRIT, há uma chance fixa de \n16/20/24/28/32% de dissipar 1 buff no inimigo alvo. \nEste efeito só pode ser ativado 1 vez por ataque.");
        jScrollPane1.setViewportView(JTAEfeitoCJF);

        BVoltarTCJF.setBackground(new java.awt.Color(204, 204, 255));
        BVoltarTCJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BVoltarTCJF.setText("Voltar");
        BVoltarTCJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarTCJFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConeLayout = new javax.swing.GroupLayout(Cone);
        Cone.setLayout(ConeLayout);
        ConeLayout.setHorizontalGroup(
            ConeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BVoltarTCJF))
                    .addGroup(ConeLayout.createSequentialGroup()
                        .addGroup(ConeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNomeCJF)
                            .addComponent(JLTituloCJF)
                            .addComponent(JLHabilidadeCJF))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ConeLayout.setVerticalGroup(
            ConeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JLTituloCJF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConeLayout.createSequentialGroup()
                        .addComponent(JLNomeCJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLHabilidadeCJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BVoltarTCJF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarTCJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarTCJFActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BVoltarTCJFActionPerformed

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
            java.util.logging.Logger.getLogger(ConeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConeJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVoltarTCJF;
    private javax.swing.JPanel Cone;
    private javax.swing.JLabel JLHabilidadeCJF;
    private javax.swing.JLabel JLNomeCJF;
    private javax.swing.JLabel JLTituloCJF;
    private javax.swing.JTextArea JTAEfeitoCJF;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
