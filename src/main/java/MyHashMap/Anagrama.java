
package MyHashMap;
import java.util.HashMap;


public class Anagrama extends javax.swing.JFrame {
    
    HashMap<String,String> animales = new HashMap<>();
    int vidas;
    String animalActual;
    
    public Anagrama() {
        initComponents();
        animales.put("gerit", "tigre");
        animales.put("onle", "leon");
        animales.put("tefealen", "elefante");
        animales.put("fajira", "jirafa");
        animales.put("omno", "mono");
        animales.put("rreop", "perro");
        animales.put("otag", "gato");
        animales.put("balloca", "caballo");
        animales.put("cava", "vaca");
        animales.put("joonec", "conejo");
        animales.put("soo", "oso");
        animales.put("oblo", "lobo");
        animales.put("rozor", "zorro");
        animales.put("zabec", "cebra");
        animales.put("pienteser", "serpiente");
        animales.put("laguia", "aguila");
        animales.put("nelfid", "delfin");
        animales.put("nalleba", "ballena");
        animales.put("tutorga", "tortuga");
        animales.put("nopingu", "pinguino");
        
        reiniciar();
        siguiente();
    }

    public void comparar(){
        String respuesta = tfPalabra.getText().trim().toLowerCase();

        if(respuesta.equals(animalActual)){
            lblPalabraReal.setText("¡Correcto!");
        }else{
            vidas--;
            lblVidas.setText(String.valueOf(vidas));
            lblPalabraReal.setText("Incorrecto");
        }
    
    }
    
    public void reiniciar(){
    vidas = 5;
    lblVidas.setText(String.valueOf(vidas));
    }
    
    public void siguiente(){
    
        Object[] claves = animales.keySet().toArray();

        int aleatorio = (int)(Math.random() * claves.length);

        String palabra = (String) claves[aleatorio];

        animalActual = animales.get(palabra);

        lblPalabra.setText(palabra);

        tfPalabra.setText("");
        lblPalabraReal.setText("...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPalabra = new javax.swing.JLabel();
        tfPalabra = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        lblPalabraReal = new javax.swing.JLabel();
        lblVidas = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        lblPalabra.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        lblPalabra.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabra.setText("PALABRA");

        tfPalabra.addActionListener(this::tfPalabraActionPerformed);

        btnEnviar.setBackground(new java.awt.Color(51, 0, 102));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        lblPalabraReal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblPalabraReal.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabraReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabraReal.setText("...");

        lblVidas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblVidas.setForeground(new java.awt.Color(255, 255, 255));
        lblVidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVidas.setText("5");

        btnSiguiente.setBackground(new java.awt.Color(51, 0, 102));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(this::btnSiguienteActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPalabraReal, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblPalabra)
                .addGap(65, 65, 65)
                .addComponent(tfPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblPalabraReal)
                .addGap(18, 18, 18)
                .addComponent(lblVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
       comparar();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void tfPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPalabraActionPerformed
        String estado = tfPalabra.getText();
        String animal = animales.get(estado);
        
        if(animal != null){
            lblPalabraReal.setText(animal);
        }else{
            lblPalabraReal.setText("Introduce un animal ");
        }       
    }//GEN-LAST:event_tfPalabraActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        siguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(() -> new Anagrama().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lblPalabraReal;
    private javax.swing.JLabel lblVidas;
    private javax.swing.JTextField tfPalabra;
    // End of variables declaration//GEN-END:variables
}
