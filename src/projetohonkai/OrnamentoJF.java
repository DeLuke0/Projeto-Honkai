package projetohonkai;

public class OrnamentoJF extends javax.swing.JFrame {

    public OrnamentoJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ornamento = new javax.swing.JPanel();
        JLTitulo1OJF = new javax.swing.JLabel();
        JLTitulo2OJF = new javax.swing.JLabel();
        JLNomeOJF = new javax.swing.JLabel();
        JL2PecasOJF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAEfeitoOJF = new javax.swing.JTextArea();
        BVoltarOJF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ornamento.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo1OJF.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        JLTitulo1OJF.setText("Honkai: Star Rail - ");

        JLTitulo2OJF.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        JLTitulo2OJF.setText("Ornamento");

        JLNomeOJF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLNomeOJF.setText("Nome da Reliquia");

        JL2PecasOJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JL2PecasOJF.setText("2 Peças:");

        JTAEfeitoOJF.setEditable(false);
        JTAEfeitoOJF.setColumns(20);
        JTAEfeitoOJF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTAEfeitoOJF.setRows(5);
        JTAEfeitoOJF.setText("Aumenta o ATK do usuário em 12%. Quando o SPD do Usuário\nfor maior que 120, o usuário causa 12% mais dano.");
        jScrollPane1.setViewportView(JTAEfeitoOJF);

        BVoltarOJF.setBackground(new java.awt.Color(204, 204, 255));
        BVoltarOJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BVoltarOJF.setText("Voltar");
        BVoltarOJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarOJFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrnamentoLayout = new javax.swing.GroupLayout(Ornamento);
        Ornamento.setLayout(OrnamentoLayout);
        OrnamentoLayout.setHorizontalGroup(
            OrnamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrnamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrnamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrnamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BVoltarOJF))
                    .addGroup(OrnamentoLayout.createSequentialGroup()
                        .addGroup(OrnamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL2PecasOJF)
                            .addComponent(JLNomeOJF)
                            .addComponent(JLTitulo2OJF)
                            .addComponent(JLTitulo1OJF))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OrnamentoLayout.setVerticalGroup(
            OrnamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrnamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo1OJF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLTitulo2OJF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLNomeOJF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL2PecasOJF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BVoltarOJF)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ornamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ornamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarOJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarOJFActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BVoltarOJFActionPerformed

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
            java.util.logging.Logger.getLogger(OrnamentoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrnamentoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrnamentoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrnamentoJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrnamentoJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVoltarOJF;
    private javax.swing.JLabel JL2PecasOJF;
    private javax.swing.JLabel JLNomeOJF;
    private javax.swing.JLabel JLTitulo1OJF;
    private javax.swing.JLabel JLTitulo2OJF;
    private javax.swing.JTextArea JTAEfeitoOJF;
    private javax.swing.JPanel Ornamento;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
