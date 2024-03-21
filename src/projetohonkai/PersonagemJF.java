package projetohonkai;

import Classes.Cone;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import Classes.Personagem;
import Classes.Reliquia;

public class PersonagemJF extends javax.swing.JFrame {
    
    Cone c1 = new Cone();
    Cone c2 = new Cone();
    Cone c3 = new Cone();
    Cone c4 = new Cone();
    Reliquia r1 = new Reliquia();
    Reliquia r2 = new Reliquia();
    Reliquia r3 = new Reliquia();
    Reliquia r4 = new Reliquia();
    Reliquia r5 = new Reliquia();
    Personagem p = new Personagem();
    
    public PersonagemJF(int id) {
        Info(id);
        initComponents();
    }
    
    public PersonagemJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPPersonagemPJF = new javax.swing.JPanel();
        JLTituloPJF = new javax.swing.JLabel();
        JLNomePJF = new javax.swing.JLabel();
        JLMEstatisticasPJF = new javax.swing.JLabel();
        JLEstatistica1PJF = new javax.swing.JLabel();
        JLEstatistica2PJF = new javax.swing.JLabel();
        JLEstatistica3PJF = new javax.swing.JLabel();
        JLEstatistica4PJF = new javax.swing.JLabel();
        JLMAtualizacaoPJF = new javax.swing.JLabel();
        JLMaterial1PJF = new javax.swing.JLabel();
        JLMaterial2PJF = new javax.swing.JLabel();
        JLMaterial3PJF = new javax.swing.JLabel();
        JLMaterial4PJF = new javax.swing.JLabel();
        JLMConesPJF = new javax.swing.JLabel();
        JLCone1PJF = new javax.swing.JLabel();
        JLCone2PJF = new javax.swing.JLabel();
        JLCone3PJF = new javax.swing.JLabel();
        JLCone4PJF = new javax.swing.JLabel();
        JLMReliquiasOrnamentosPJF = new javax.swing.JLabel();
        JLReliquia1PJF = new javax.swing.JLabel();
        JLReliquia2PJF = new javax.swing.JLabel();
        JLReliquia3PJF = new javax.swing.JLabel();
        JLOrnamento1PJF = new javax.swing.JLabel();
        JLOrnamento2PJF = new javax.swing.JLabel();
        BVoltarPJF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPPersonagemPJF.setBackground(new java.awt.Color(153, 153, 255));

        JLTituloPJF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        JLTituloPJF.setText("Honkai: Star Rail Build");

        JLNomePJF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        JLNomePJF.setText(p.getNome()
        );

        JLMEstatisticasPJF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLMEstatisticasPJF.setText("Melhores Estatísticas:");

        JLEstatistica1PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLEstatistica1PJF.setText(Personagem.Estatisticas.get(0));

        JLEstatistica2PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLEstatistica2PJF.setText(Personagem.Estatisticas.get(1));

        JLEstatistica3PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLEstatistica3PJF.setText(Personagem.Estatisticas.get(2));

        JLEstatistica4PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLEstatistica4PJF.setText(Personagem.Estatisticas.get(3));

        JLMAtualizacaoPJF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLMAtualizacaoPJF.setText("Materiais de Atualização:");

        JLMaterial1PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLMaterial1PJF.setText(Personagem.Materiais.get(0));

        JLMaterial2PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLMaterial2PJF.setText(Personagem.Materiais.get(1));

        JLMaterial3PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLMaterial3PJF.setText(Personagem.Materiais.get(2));

        JLMaterial4PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLMaterial4PJF.setText(Personagem.Materiais.get(3));

        JLMConesPJF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLMConesPJF.setText("Melhores Cones de Luz:");

        JLCone1PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLCone1PJF.setText(c1.getNome());

        JLCone2PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLCone2PJF.setText(c2.getNome());

        JLCone3PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLCone3PJF.setText(c3.getNome());

        JLCone4PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLCone4PJF.setText(c4.getNome());

        JLMReliquiasOrnamentosPJF.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        JLMReliquiasOrnamentosPJF.setText("Melhores Relíquias/Ornamentos:");

        JLReliquia1PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLReliquia1PJF.setText(r1.getNome());

        JLReliquia2PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLReliquia2PJF.setText(r2.getNome());

        JLReliquia3PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLReliquia3PJF.setText(r3.getNome());

        JLOrnamento1PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLOrnamento1PJF.setText(r4.getNome());

        JLOrnamento2PJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLOrnamento2PJF.setText(r5.getNome());

        BVoltarPJF.setBackground(new java.awt.Color(204, 204, 255));
        BVoltarPJF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BVoltarPJF.setText("Voltar");
        BVoltarPJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarPJFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPPersonagemPJFLayout = new javax.swing.GroupLayout(JPPersonagemPJF);
        JPPersonagemPJF.setLayout(JPPersonagemPJFLayout);
        JPPersonagemPJFLayout.setHorizontalGroup(
            JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLCone3PJF)
                                    .addComponent(JLCone4PJF))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JLCone2PJF)
                            .addComponent(JLCone1PJF))
                        .addGap(497, 497, 497)
                        .addComponent(BVoltarPJF))
                    .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                                .addComponent(JLTituloPJF)
                                .addGap(18, 18, 18)
                                .addComponent(JLNomePJF))
                            .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                                .addComponent(JLMEstatisticasPJF)
                                .addGap(59, 59, 59)
                                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLMReliquiasOrnamentosPJF)
                                    .addComponent(JLReliquia3PJF)
                                    .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLReliquia1PJF)
                                            .addComponent(JLReliquia2PJF))
                                        .addGap(45, 45, 45)
                                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLOrnamento2PJF)
                                            .addComponent(JLOrnamento1PJF)))))
                            .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLEstatistica2PJF)
                                            .addComponent(JLEstatistica1PJF)
                                            .addComponent(JLEstatistica3PJF)
                                            .addComponent(JLEstatistica4PJF)))
                                    .addComponent(JLMConesPJF))
                                .addGap(75, 75, 75)
                                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLMaterial1PJF)
                                    .addComponent(JLMAtualizacaoPJF)
                                    .addComponent(JLMaterial2PJF)
                                    .addComponent(JLMaterial3PJF)
                                    .addComponent(JLMaterial4PJF))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPPersonagemPJFLayout.setVerticalGroup(
            JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTituloPJF)
                    .addComponent(JLNomePJF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLMEstatisticasPJF)
                    .addComponent(JLMReliquiasOrnamentosPJF))
                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLReliquia1PJF)
                            .addComponent(JLOrnamento1PJF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLReliquia2PJF)
                            .addComponent(JLOrnamento2PJF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLReliquia3PJF)
                        .addGap(49, 49, 49)
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLMConesPJF)
                            .addComponent(JLMAtualizacaoPJF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCone1PJF)
                            .addComponent(JLMaterial1PJF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCone2PJF)
                            .addComponent(JLMaterial2PJF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCone3PJF)
                            .addComponent(JLMaterial3PJF)))
                    .addGroup(JPPersonagemPJFLayout.createSequentialGroup()
                        .addComponent(JLEstatistica1PJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLEstatistica2PJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLEstatistica3PJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLEstatistica4PJF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPersonagemPJFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLCone4PJF)
                        .addComponent(BVoltarPJF))
                    .addComponent(JLMaterial4PJF))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPPersonagemPJF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPPersonagemPJF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarPJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarPJFActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BVoltarPJFActionPerformed

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
            java.util.logging.Logger.getLogger(PersonagemJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonagemJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonagemJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonagemJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonagemJF().setVisible(true);
            }
        });
    }
    
    private void Info(int id){
        try{
            switch (id) {
                case 1 -> {
                    p.setNome("Argenti");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 2 -> {
                    p.setNome("Bailu");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 3 -> {
                    p.setNome("Blade");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 4 -> {
                    p.setNome("Bronya");
                    Personagem.Estatisticas.set(0, "SPD");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "Taxa CRIT");
                    Personagem.Materiais.set(0, "Sintonia Harmonica");
                    Personagem.Materiais.set(1, "Módulo Artifex");
                    Personagem.Materiais.set(2, "Coroa Dourada da Sombra Passada");
                    Personagem.Materiais.set(3, "A Estrada Final do Destruidor");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Mosqueteira do trigo Selvagem");
                    r2.setNome("Andarilho do Deserto da Bandidagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 5 -> {
                    p.setNome("Clara");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 6 -> {
                    p.setNome("Dan Lunae");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 7 -> {
                    p.setNome("Fu Xuan");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 8 -> {
                    p.setNome("Gepard");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 9 -> {
                    p.setNome("Himeko");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 10 -> {
                    p.setNome("Huohuo");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 11 -> {
                    p.setNome("Jing Yuan");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 12 -> {
                    p.setNome("Jingliu");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 13 -> {
                    p.setNome("Kafka");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 14 -> {
                    p.setNome("Luocha");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 15 -> {
                    p.setNome("Seele");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 16 -> {
                    p.setNome("Silver Wolf");
                    Personagem.Estatisticas.set(0, "SPD");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "Taxa CRIT");
                    Personagem.Materiais.set(0, "Sintonia Harmonica");
                    Personagem.Materiais.set(1, "Módulo Artifex");
                    Personagem.Materiais.set(2, "Coroa Dourada da Sombra Passada");
                    Personagem.Materiais.set(3, "A Estrada Final do Destruidor");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Mosqueteira do trigo Selvagem");
                    r2.setNome("Andarilho do Deserto da Bandidagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 17 -> {
                    p.setNome("Topaz");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 18 -> {
                    p.setNome("TrailblazerF");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 19 -> {
                    p.setNome("TrailblazerP");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 20 -> {
                    p.setNome("Welt");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 21 -> {
                    p.setNome("Yanqing");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 22 -> {
                    p.setNome("Arlan");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 23 -> {
                    p.setNome("Asta");
                    Personagem.Estatisticas.set(0, "SPD");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "Taxa CRIT");
                    Personagem.Materiais.set(0, "Sintonia Harmonica");
                    Personagem.Materiais.set(1, "Módulo Artifex");
                    Personagem.Materiais.set(2, "Coroa Dourada da Sombra Passada");
                    Personagem.Materiais.set(3, "A Estrada Final do Destruidor");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Mosqueteira do trigo Selvagem");
                    r2.setNome("Andarilho do Deserto da Bandidagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 24 -> {
                    p.setNome("Dan Heng");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 25 -> {
                    p.setNome("Guinaifen");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 26 -> {
                    p.setNome("Hanya");
                    Personagem.Estatisticas.set(0, "SPD");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "Taxa CRIT");
                    Personagem.Materiais.set(0, "Sintonia Harmonica");
                    Personagem.Materiais.set(1, "Módulo Artifex");
                    Personagem.Materiais.set(2, "Coroa Dourada da Sombra Passada");
                    Personagem.Materiais.set(3, "A Estrada Final do Destruidor");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Mosqueteira do trigo Selvagem");
                    r2.setNome("Andarilho do Deserto da Bandidagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 27 -> {
                    p.setNome("Herta");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 28 -> {
                    p.setNome("Hook");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 29 -> {
                    p.setNome("Luka");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 30 -> {
                    p.setNome("Lynx");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 31 -> {
                    p.setNome("March 7th");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 32 -> {
                    p.setNome("Natasha");
                    Personagem.Estatisticas.set(0, "HP%");
                    Personagem.Estatisticas.set(1, "HP");
                    Personagem.Estatisticas.set(2, "SPD");
                    Personagem.Estatisticas.set(3, "RES");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Semente da Abundância");
                    Personagem.Materiais.set(2, "Coroa Relâmpago da Sombra Passada");
                    Personagem.Materiais.set(3, "Lamento do Guardião");
                    c1.setNome("O Tempo Não Espera Por Nunguém(5*)");
                    c2.setNome("Conversa Pós-Operatória(4*)");
                    c3.setNome("Sentimento Compartilhado(4*)");
                    c4.setNome("Quid Pro Quo(4*)");
                    r1.setNome("Mensageira Atravessando o Hackerspace");
                    r2.setNome("Transeunte da Núvem Errante");
                    r3.setNome("Dicípula Longeva");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 33 -> {
                    p.setNome("Pela");
                    Personagem.Estatisticas.set(0, "SPD");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "Taxa CRIT");
                    Personagem.Materiais.set(0, "Sintonia Harmonica");
                    Personagem.Materiais.set(1, "Módulo Artifex");
                    Personagem.Materiais.set(2, "Coroa Dourada da Sombra Passada");
                    Personagem.Materiais.set(3, "A Estrada Final do Destruidor");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Mosqueteira do trigo Selvagem");
                    r2.setNome("Andarilho do Deserto da Bandidagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 34 -> {
                    p.setNome("Qingque");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 35 -> {
                    p.setNome("Sampo");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 36 -> {
                    p.setNome("Serval");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 37 -> {
                    p.setNome("Sushang");
                    Personagem.Estatisticas.set(0, "Taxa CRIT");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "SPD");
                    Personagem.Materiais.set(0, "Núcleo Extinto");
                    Personagem.Materiais.set(1, "Chave de inspiração");
                    Personagem.Materiais.set(2, "Token do Submundo");
                    Personagem.Materiais.set(3, "Arrependimento do Infinito Ochema");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Campeã do Boxe de Rua");
                    r2.setNome("Mosqueteira do trigo Selvagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Linha de Frente: Firmamento de Glamoth");
                    r5.setNome("Arena Rutilante");
                }
                case 38 -> {
                    p.setNome("Tingyun");
                    Personagem.Estatisticas.set(0, "SPD");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "Taxa CRIT");
                    Personagem.Materiais.set(0, "Sintonia Harmonica");
                    Personagem.Materiais.set(1, "Módulo Artifex");
                    Personagem.Materiais.set(2, "Coroa Dourada da Sombra Passada");
                    Personagem.Materiais.set(3, "A Estrada Final do Destruidor");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Mosqueteira do trigo Selvagem");
                    r2.setNome("Andarilho do Deserto da Bandidagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                case 39 -> {
                    p.setNome("Yukong");
                    Personagem.Estatisticas.set(0, "SPD");
                    Personagem.Estatisticas.set(1, "Dano CRIT");
                    Personagem.Estatisticas.set(2, "ATK%");
                    Personagem.Estatisticas.set(3, "Taxa CRIT");
                    Personagem.Materiais.set(0, "Sintonia Harmonica");
                    Personagem.Materiais.set(1, "Módulo Artifex");
                    Personagem.Materiais.set(2, "Coroa Dourada da Sombra Passada");
                    Personagem.Materiais.set(3, "A Estrada Final do Destruidor");
                    c1.setNome("Um Instante Eternamente Adorado(5*)");
                    c2.setNome("Antes do Amanhecer(5*)");
                    c3.setNome("Hoje é Mais um Dia de Paz(4*)");
                    c4.setNome("Repouso dos Gênios(4*)");
                    r1.setNome("Mosqueteira do trigo Selvagem");
                    r2.setNome("Andarilho do Deserto da Bandidagem");
                    r3.setNome("Mensageira Atravessando o Hackerspace");
                    r4.setNome("Frota dos Eternos");
                    r5.setNome("Quilha Quebrada");
                }
                default -> {
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar os valores");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVoltarPJF;
    private javax.swing.JLabel JLCone1PJF;
    private javax.swing.JLabel JLCone2PJF;
    private javax.swing.JLabel JLCone3PJF;
    private javax.swing.JLabel JLCone4PJF;
    private javax.swing.JLabel JLEstatistica1PJF;
    private javax.swing.JLabel JLEstatistica2PJF;
    private javax.swing.JLabel JLEstatistica3PJF;
    private javax.swing.JLabel JLEstatistica4PJF;
    private javax.swing.JLabel JLMAtualizacaoPJF;
    private javax.swing.JLabel JLMConesPJF;
    private javax.swing.JLabel JLMEstatisticasPJF;
    private javax.swing.JLabel JLMReliquiasOrnamentosPJF;
    private javax.swing.JLabel JLMaterial1PJF;
    private javax.swing.JLabel JLMaterial2PJF;
    private javax.swing.JLabel JLMaterial3PJF;
    private javax.swing.JLabel JLMaterial4PJF;
    private javax.swing.JLabel JLNomePJF;
    private javax.swing.JLabel JLOrnamento1PJF;
    private javax.swing.JLabel JLOrnamento2PJF;
    private javax.swing.JLabel JLReliquia1PJF;
    private javax.swing.JLabel JLReliquia2PJF;
    private javax.swing.JLabel JLReliquia3PJF;
    private javax.swing.JLabel JLTituloPJF;
    private javax.swing.JPanel JPPersonagemPJF;
    // End of variables declaration//GEN-END:variables
}
