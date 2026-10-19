
package com.mycompany.pila;
import java.util.ArrayList;


public class TicTac extends javax.swing.JFrame {
    
     private String turno = "X";
     private ArrayList<String> tablero = new ArrayList<>();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TicTac.class.getName());

    public TicTac() {
        initComponents();
            for (int i = 0; i < 9; i++){
         tablero.add("");
}
    }
    
private boolean verificarGanador() {
    int[][] combinaciones = {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8},
        {0, 3, 6},
        {1, 4, 7},
        {2, 5, 8},
        {0, 4, 8},
        {2, 4, 6}
    };

    for (int i = 0; i < combinaciones.length; i++) {
        int a = combinaciones[i][0];
        int b = combinaciones[i][1];
        int c = combinaciones[i][2];

        if (!tablero.get(a).isEmpty()
                && tablero.get(a).equals(tablero.get(b))
                && tablero.get(a).equals(tablero.get(c))) {
            return true;
        }
    }

    return false;
}
private boolean juegoTerminado = false;
private void jugar(int posicion, javax.swing.JButton boton) {
    if (!boton.getText().isEmpty() || juegoTerminado) {
        return;
    }

    tablero.set(posicion, turno);
    boton.setText(turno);

    if (verificarGanador()) {
        lblGano.setText("GANÓ: " + turno);
        juegoTerminado = true;
        return;
    }

    if (!tablero.contains("")) {
        lblGano.setText("EMPATE");
        juegoTerminado = true;
        return;
    }

    if (turno.equals("X")) {
        turno = "O";
    } else {
        turno = "X";
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGano = new javax.swing.JLabel();
        btn1x1 = new javax.swing.JButton();
        btn1x2 = new javax.swing.JButton();
        btn2x2 = new javax.swing.JButton();
        btn2x1 = new javax.swing.JButton();
        btn1x3 = new javax.swing.JButton();
        btn2x3 = new javax.swing.JButton();
        btn3x1 = new javax.swing.JButton();
        btn3x2 = new javax.swing.JButton();
        btn3x3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 8, true));

        lblGano.setBackground(new java.awt.Color(255, 255, 255));
        lblGano.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblGano.setForeground(new java.awt.Color(255, 255, 255));
        lblGano.setText("GANÓ: ");

        btn1x1.setBackground(new java.awt.Color(0, 102, 255));
        btn1x1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn1x1.setForeground(new java.awt.Color(255, 255, 255));
        btn1x1.addActionListener(this::btn1x1ActionPerformed);

        btn1x2.setBackground(new java.awt.Color(0, 102, 255));
        btn1x2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn1x2.setForeground(new java.awt.Color(255, 255, 255));
        btn1x2.addActionListener(this::btn1x2ActionPerformed);

        btn2x2.setBackground(new java.awt.Color(0, 102, 255));
        btn2x2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn2x2.setForeground(new java.awt.Color(255, 255, 255));
        btn2x2.addActionListener(this::btn2x2ActionPerformed);

        btn2x1.setBackground(new java.awt.Color(0, 102, 255));
        btn2x1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn2x1.setForeground(new java.awt.Color(255, 255, 255));
        btn2x1.addActionListener(this::btn2x1ActionPerformed);

        btn1x3.setBackground(new java.awt.Color(0, 102, 255));
        btn1x3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn1x3.setForeground(new java.awt.Color(255, 255, 255));
        btn1x3.addActionListener(this::btn1x3ActionPerformed);

        btn2x3.setBackground(new java.awt.Color(0, 102, 255));
        btn2x3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn2x3.setForeground(new java.awt.Color(255, 255, 255));
        btn2x3.addActionListener(this::btn2x3ActionPerformed);

        btn3x1.setBackground(new java.awt.Color(0, 102, 255));
        btn3x1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn3x1.setForeground(new java.awt.Color(255, 255, 255));
        btn3x1.addActionListener(this::btn3x1ActionPerformed);

        btn3x2.setBackground(new java.awt.Color(0, 102, 255));
        btn3x2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn3x2.setForeground(new java.awt.Color(255, 255, 255));
        btn3x2.addActionListener(this::btn3x2ActionPerformed);

        btn3x3.setBackground(new java.awt.Color(0, 102, 255));
        btn3x3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn3x3.setForeground(new java.awt.Color(255, 255, 255));
        btn3x3.addActionListener(this::btn3x3ActionPerformed);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIC TAC");

        btnReiniciar.setBackground(new java.awt.Color(0, 102, 255));
        btnReiniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnReiniciar.addActionListener(this::btnReiniciarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGano)
                            .addComponent(jLabel2))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(139, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(120, 120, 120)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(lblGano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3)
                    .addContainerGap(469, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        for(int i = 0; i < 9; i++){
            tablero.set(i, "");
        }
        
        btn1x1.setText("");
        btn1x2.setText("");
        btn1x3.setText("");
        btn2x1.setText("");
        btn2x2.setText("");
        btn2x3.setText("");
        btn3x1.setText("");
        btn3x2.setText("");
        btn3x3.setText("");
        
        turno = "X";
        juegoTerminado = false;
        lblGano.setText("GANÓ: ");
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btn3x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x1ActionPerformed
          jugar(6, btn3x1);
    }//GEN-LAST:event_btn3x1ActionPerformed

    private void btn2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x1ActionPerformed
          jugar(3, btn2x1);
    }//GEN-LAST:event_btn2x1ActionPerformed

    private void btn1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x2ActionPerformed
          jugar(1, btn1x2);
    }//GEN-LAST:event_btn1x2ActionPerformed

    private void btn2x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x3ActionPerformed
        jugar(5, btn2x3);
    }//GEN-LAST:event_btn2x3ActionPerformed
  
    
    private void btn1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x1ActionPerformed
        jugar(0, btn1x1);
    }//GEN-LAST:event_btn1x1ActionPerformed

    private void btn1x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x3ActionPerformed
        jugar(2, btn1x3);
    }//GEN-LAST:event_btn1x3ActionPerformed

    private void btn2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x2ActionPerformed
          jugar(4, btn2x2);
    }//GEN-LAST:event_btn2x2ActionPerformed

    private void btn3x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x2ActionPerformed
         jugar(7, btn3x2);
    }//GEN-LAST:event_btn3x2ActionPerformed

    private void btn3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x3ActionPerformed
         jugar(8, btn3x3);
    }//GEN-LAST:event_btn3x3ActionPerformed


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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new TicTac().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1x1;
    private javax.swing.JButton btn1x2;
    private javax.swing.JButton btn1x3;
    private javax.swing.JButton btn2x1;
    private javax.swing.JButton btn2x2;
    private javax.swing.JButton btn2x3;
    private javax.swing.JButton btn3x1;
    private javax.swing.JButton btn3x2;
    private javax.swing.JButton btn3x3;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGano;
    // End of variables declaration//GEN-END:variables
}
