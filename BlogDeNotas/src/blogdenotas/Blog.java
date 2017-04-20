package blogdenotas;
 //@autor Audel Oh

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Blog extends javax.swing.JFrame {

    JFileChooser seleccionado=new JFileChooser();
    File archivo;
    GestionDeDatos gestion=new GestionDeDatos();
    
    public Blog() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("Notebook.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPantallaTexto = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPFormato = new javax.swing.JPanel();
        jCursiva = new javax.swing.JButton();
        jSubrayado = new javax.swing.JButton();
        jColor = new javax.swing.JButton();
        jNegrita = new javax.swing.JButton();
        jNormal = new javax.swing.JButton();
        jPArchivo = new javax.swing.JPanel();
        jAbrir = new javax.swing.JButton();
        jNuevo = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jTexto = new javax.swing.JLabel();
        jFH = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenu = new javax.swing.JMenuBar();
        jArchivo = new javax.swing.JMenu();
        jMAAbrir = new javax.swing.JMenu();
        jMAGuardar = new javax.swing.JMenu();
        jMANuevo = new javax.swing.JMenu();
        jAyuda = new javax.swing.JMenu();
        jMAAAcercaDe = new javax.swing.JMenu();
        jFormato = new javax.swing.JMenu();
        jMFNormal = new javax.swing.JMenu();
        jMFNegrita = new javax.swing.JMenu();
        jMFCursiva = new javax.swing.JMenu();
        jMFSubrayado = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMFColor = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPantallaTexto.setViewportView(jTextPane1);

        jCursiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Cursiva.png"))); // NOI18N
        jCursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCursivaActionPerformed(evt);
            }
        });

        jSubrayado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Subrayado.png"))); // NOI18N
        jSubrayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubrayadoActionPerformed(evt);
            }
        });

        jColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Color.gif"))); // NOI18N
        jColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColorActionPerformed(evt);
            }
        });

        jNegrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Negrita.png"))); // NOI18N
        jNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNegritaActionPerformed(evt);
            }
        });

        jNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Normal.gif"))); // NOI18N
        jNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFormatoLayout = new javax.swing.GroupLayout(jPFormato);
        jPFormato.setLayout(jPFormatoLayout);
        jPFormatoLayout.setHorizontalGroup(
            jPFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFormatoLayout.createSequentialGroup()
                .addComponent(jNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNegrita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCursiva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSubrayado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPFormatoLayout.setVerticalGroup(
            jPFormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jNormal)
            .addComponent(jNegrita)
            .addComponent(jCursiva)
            .addComponent(jSubrayado)
            .addComponent(jColor)
        );

        jAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Abrir.gif"))); // NOI18N
        jAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAbrirActionPerformed(evt);
            }
        });

        jNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Nuevo.gif"))); // NOI18N
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Guardar.gif"))); // NOI18N
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPArchivoLayout = new javax.swing.GroupLayout(jPArchivo);
        jPArchivo.setLayout(jPArchivoLayout);
        jPArchivoLayout.setHorizontalGroup(
            jPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPArchivoLayout.createSequentialGroup()
                .addComponent(jAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPArchivoLayout.setVerticalGroup(
            jPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAbrir)
            .addComponent(jNuevo)
            .addComponent(jGuardar)
        );

        jTexto.setText("Nombre del Archivo");

        jFH.setText("FYH");

        jNombre.setText("Audel Oh");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jArchivo.setText("Archivo");

        jMAAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Abrir.gif"))); // NOI18N
        jMAAbrir.setText("Abrir");
        jArchivo.add(jMAAbrir);

        jMAGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Guardar.gif"))); // NOI18N
        jMAGuardar.setText("Guardar");
        jArchivo.add(jMAGuardar);

        jMANuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Nuevo.gif"))); // NOI18N
        jMANuevo.setText("Nuevo");
        jArchivo.add(jMANuevo);

        jMenu.add(jArchivo);

        jAyuda.setText("Ayuda");

        jMAAAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Ayuda.gif"))); // NOI18N
        jMAAAcercaDe.setText("Acerca de...");
        jAyuda.add(jMAAAcercaDe);

        jMenu.add(jAyuda);

        jFormato.setText("Formato");

        jMFNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Normal.gif"))); // NOI18N
        jMFNormal.setText("Normal");
        jFormato.add(jMFNormal);

        jMFNegrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Negrita.png"))); // NOI18N
        jMFNegrita.setText("Negrita");
        jFormato.add(jMFNegrita);

        jMFCursiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Cursiva.png"))); // NOI18N
        jMFCursiva.setText("Cursiva");
        jFormato.add(jMFCursiva);

        jMFSubrayado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Subrayado.png"))); // NOI18N
        jMFSubrayado.setText("Subrayado");
        jFormato.add(jMFSubrayado);
        jFormato.add(jSeparator1);

        jMFColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blogdenotas/Color.gif"))); // NOI18N
        jMFColor.setText("Color");
        jFormato.add(jMFColor);

        jMenu.add(jFormato);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFH))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPantallaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPantallaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAbrirActionPerformed
        if(seleccionado.showDialog(this,"Abrir archivo")==JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String contenido=gestion.AbrirArchivo(archivo);
                    jTextPane1.setText(contenido);
                }else{
                    JOptionPane.showMessageDialog(this,"El formato del archivo no es compatible","Archivo invalido",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jAbrirActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        if(seleccionado.showDialog(this,"Guardar archivo")==JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String contenido=jTextPane1.getText();
                String respuesta=gestion.GuardarArchivo(archivo, contenido);
                if(respuesta!=null){
                    JOptionPane.showMessageDialog(this,respuesta);
                }else{
                    JOptionPane.showMessageDialog(this,"Error al guardar texto","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this,"El archivo debe guardarse en formato txt","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNormalActionPerformed

    private void jNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNegritaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNegritaActionPerformed

    private void jCursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCursivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCursivaActionPerformed

    private void jSubrayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubrayadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSubrayadoActionPerformed

    private void jColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jColorActionPerformed
        JColorChooser Selectorcolor=new JColorChooser();
        Color color=Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLACK);
    }//GEN-LAST:event_jColorActionPerformed

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
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAbrir;
    private javax.swing.JMenu jArchivo;
    private javax.swing.JMenu jAyuda;
    private javax.swing.JButton jColor;
    private javax.swing.JButton jCursiva;
    private javax.swing.JLabel jFH;
    private javax.swing.JMenu jFormato;
    private javax.swing.JButton jGuardar;
    private javax.swing.JMenu jMAAAcercaDe;
    private javax.swing.JMenu jMAAbrir;
    private javax.swing.JMenu jMAGuardar;
    private javax.swing.JMenu jMANuevo;
    private javax.swing.JMenu jMFColor;
    private javax.swing.JMenu jMFCursiva;
    private javax.swing.JMenu jMFNegrita;
    private javax.swing.JMenu jMFNormal;
    private javax.swing.JMenu jMFSubrayado;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JButton jNegrita;
    private javax.swing.JLabel jNombre;
    private javax.swing.JButton jNormal;
    private javax.swing.JButton jNuevo;
    private javax.swing.JPanel jPArchivo;
    private javax.swing.JPanel jPFormato;
    private javax.swing.JScrollPane jPantallaTexto;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jSubrayado;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel jTexto;
    // End of variables declaration//GEN-END:variables
}

//javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");