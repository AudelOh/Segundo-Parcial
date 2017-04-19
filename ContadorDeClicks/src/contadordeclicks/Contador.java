package contadordeclicks;
//autor Audel Oh

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Contador extends javax.swing.JFrame {

    public Contador() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("Cursor.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLContador = new javax.swing.JLabel();
        jTextField = new javax.swing.JTextField();
        jBAumentar = new javax.swing.JButton();
        jBDisminuir = new javax.swing.JButton();
        jBReset = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jLNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador de Click's");

        jLContador.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLContador.setText("Contador:");

        jTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField.setText("0");
        jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldKeyTyped(evt);
            }
        });

        jBAumentar.setBackground(new java.awt.Color(0, 51, 204));
        jBAumentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contadordeclicks/Aumentar.gif"))); // NOI18N
        jBAumentar.setText("Aumentar");
        jBAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAumentarActionPerformed(evt);
            }
        });

        jBDisminuir.setBackground(new java.awt.Color(0, 51, 204));
        jBDisminuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contadordeclicks/Disminuir.gif"))); // NOI18N
        jBDisminuir.setText("Disminuir");
        jBDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDisminuirActionPerformed(evt);
            }
        });

        jBReset.setBackground(new java.awt.Color(0, 51, 204));
        jBReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contadordeclicks/Reset.gif"))); // NOI18N
        jBReset.setText("Resetear");
        jBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetActionPerformed(evt);
            }
        });

        jLNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLContador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBReset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAumentar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDisminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLNombre)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLContador)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jBAumentar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBDisminuir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBReset))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLNombre))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int contador=0;
    String numero;
    
    private void jBAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAumentarActionPerformed
        contador ++;
        numero = String.valueOf(contador);
        jTextField.setText(numero);
    }//GEN-LAST:event_jBAumentarActionPerformed

    private void jBDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDisminuirActionPerformed
        contador --;
        numero = String.valueOf(contador);
        jTextField.setText(numero);
    }//GEN-LAST:event_jBDisminuirActionPerformed

    private void jBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetActionPerformed
        contador=0;
        numero = String.valueOf(contador);
        jTextField.setText(numero);
    }//GEN-LAST:event_jBResetActionPerformed

    private void jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKeyTyped
        jTextField.setEditable(false);
        int bandera=0;
        JOptionPane.showMessageDialog(this,"El contador solo puede ser\n editado por los botones.","Error",JOptionPane.ERROR_MESSAGE);
        if (contador==0){
            jTextField.setText("0");
        }else{
            jTextField.setText(numero);
        }
    }//GEN-LAST:event_jTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAumentar;
    private javax.swing.JButton jBDisminuir;
    private javax.swing.JButton jBReset;
    private javax.swing.JLabel jLContador;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}
