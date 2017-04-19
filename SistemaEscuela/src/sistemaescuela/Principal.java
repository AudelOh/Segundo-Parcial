
package sistemaescuela;

import Programas.GestorDeCalificaciones;
import Programas.GestorDeExamenes;
import javax.swing.JOptionPane;
import sistemaescuela.Ayuda;
import sistemaescuela.ExamenAlumno;
import sistemaescuela.ExamenMaestro;
import sistemaescuela.NuevoExamen;


public class Principal extends javax.swing.JFrame {
    
     public Principal() {
        GDE = new GestorDeExamenes();
        GDC = new GestorDeCalificaciones();
        initComponents();
     }
    private GestorDeExamenes GDE;
    private GestorDeCalificaciones GDC;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CrearExam = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ResolverExam = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Salir.setBackground(new java.awt.Color(0, 102, 255));
        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AudiGS\\Pictures\\descarga.jpg")); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(51, 51, 255)));
        jMenuBar1.setAutoscrolls(true);

        jMenu1.setText("Maestro");

        CrearExam.setText("Crear Nuevo Examen");
        CrearExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearExamActionPerformed(evt);
            }
        });
        jMenu1.add(CrearExam);

        jMenuItem2.setText("Modificar Examen");
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Eliminar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumno");

        ResolverExam.setText("Resolver Examen");
        ResolverExam.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ResolverExamComponentAdded(evt);
            }
        });
        jMenu2.add(ResolverExam);

        jMenuItem3.setText("Calificaciones");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        Ayuda.setText("Ayuda");
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
                PrincipalMouseClicked(evt);
            }
        });

        AcercaDe.setText("Acerca de");
        AcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcercaDeMouseClicked(evt);
            }
        });
        Ayuda.add(AcercaDe);

        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResolverExamComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ResolverExamComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ResolverExamComponentAdded

    private void CrearExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearExamActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseClicked
       
    }//GEN-LAST:event_AyudaMouseClicked

    private void PrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalMouseClicked
        Ayuda informacion = new Ayuda(this, true);
        informacion.setVisible(true);
    }//GEN-LAST:event_PrincipalMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        setVisible(false);
    }//GEN-LAST:event_SalirMouseClicked

    private void AcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcercaDeMouseClicked
         Ayuda informacion = new Ayuda(this, true);
        informacion.setVisible(true);
    }//GEN-LAST:event_AcercaDeMouseClicked

     
     
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem CrearExam;
    private javax.swing.JMenuItem ResolverExam;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
