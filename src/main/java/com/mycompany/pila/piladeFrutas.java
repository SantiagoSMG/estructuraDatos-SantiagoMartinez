
package com.mycompany.pila;

import java.util.ArrayDeque;
import java.util.Deque;
import javax.swing.JOptionPane;

public class piladeFrutas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(piladeFrutas.class.getName());
    
    Deque<String>pilaFrutas;

   
    public piladeFrutas() {
        initComponents();
        
        pilaFrutas = new ArrayDeque<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDesapilar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNuevaFruta = new javax.swing.JLabel();
        btnApilar = new javax.swing.JButton();
        btnVerCima = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCantidadFrutas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 8));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("PILA DE FRUTAS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Apilar Fruta:");

        btnDesapilar.setBackground(new java.awt.Color(0, 204, 51));
        btnDesapilar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDesapilar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesapilar.setText("DESAPILAR");
        btnDesapilar.addActionListener(this::btnDesapilarActionPerformed);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 8));

        txtNuevaFruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNuevaFrutaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNuevaFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNuevaFruta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        btnApilar.setBackground(new java.awt.Color(0, 204, 51));
        btnApilar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnApilar.setForeground(new java.awt.Color(255, 255, 255));
        btnApilar.setText("APILAR");
        btnApilar.addActionListener(this::btnApilarActionPerformed);

        btnVerCima.setBackground(new java.awt.Color(0, 204, 51));
        btnVerCima.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerCima.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCima.setText("VER CIMA");
        btnVerCima.addActionListener(this::btnVerCimaActionPerformed);

        jLabel4.setText("FRUTAS");

        lblCantidadFrutas.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(btnDesapilar, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerCima, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(btnApilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblCantidadFrutas)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCantidadFrutas)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApilar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnVerCima, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDesapilar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarActionPerformed
    
    String frutaDesapilada = pilaFrutas.pop();
    JOptionPane.showMessageDialog(this, frutaDesapilada , "FRUTA DESAPILADA:",1);
    lblCantidadFrutas.setText(pilaFrutas.size()+"");
  
    }//GEN-LAST:event_btnDesapilarActionPerformed

    private void btnApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApilarActionPerformed
        String nuevaFruta = txtNuevaFruta.getText();
        pilaFrutas.push(nuevaFruta);
        
        lblCantidadFrutas.setText(pilaFrutas.size()+"");
        
        txtNuevaFruta.setText("");
        txtNuevaFruta.requestFocusInWindow();
    }//GEN-LAST:event_btnApilarActionPerformed

    private void btnVerCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCimaActionPerformed
    
        JOptionPane.showMessageDialog(this, pilaFrutas.peek(), "CIMA DE LA FILA",1);
    }//GEN-LAST:event_btnVerCimaActionPerformed

    private void txtNuevaFrutaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaFrutaKeyReleased
        
        System.out.println(evt.getKeyCode());
        int tecladoCode = evt.getKeyCode();
        
        if(tecladoCode == 10){
            btnApilar.doClick();
        }
        
    }//GEN-LAST:event_txtNuevaFrutaKeyReleased

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new piladeFrutas().setVisible(true));
       
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApilar;
    private javax.swing.JButton btnDesapilar;
    private javax.swing.JButton btnVerCima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCantidadFrutas;
    private javax.swing.JLabel txtNuevaFruta;
    // End of variables declaration//GEN-END:variables
}
