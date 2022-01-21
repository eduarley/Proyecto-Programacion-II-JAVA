
package capaGrafica;

import capaLogicaNegocios.TipoUsuario;
import capaLogicaNegocios.Usuario;
import capaPersistencia.ArchivadorUsuario;
import java.util.Arrays;
import javax.swing.JOptionPane;



public class jDlgPassword extends javax.swing.JDialog {

    private static Usuario usuarioGeneral;
    private int cont=0;
    private int contPantalla=3;
    public jDlgPassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jPswPassword = new javax.swing.JPasswordField();
        jBtnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLblIntentos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 137, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, 20));

        jSeparator1.setForeground(new java.awt.Color(255, 137, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 170, 20));

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 122, -1, -1));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 171, -1, -1));

        jTxtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTxtUsuario.setBorder(null);
        jTxtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 120, 174, -1));

        jPswPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPswPassword.setBorder(null);
        jPswPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPswPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPswPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPswPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 169, 174, -1));

        jBtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresar2.png"))); // NOI18N
        jBtnIngresar.setBorderPainted(false);
        jBtnIngresar.setContentAreaFilled(false);
        jBtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresar3.png"))); // NOI18N
        jBtnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresar1.png"))); // NOI18N
        jBtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 220, 70));

        jLabel3.setText("Intentos restantes:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLblIntentos.setText("intentos");
        getContentPane().add(jLblIntentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        jButton2.setToolTipText("Cerrar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 90, 80));

        jLblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondonicio.png"))); // NOI18N
        getContentPane().add(jLblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuarioActionPerformed
    jPswPassword.requestFocus();
    }//GEN-LAST:event_jTxtUsuarioActionPerformed

    private void jBtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresarActionPerformed

        
        String cedula=jTxtUsuario.getText();
        String password=jPswPassword.getText();
        
               if (!jTxtUsuario.getText().trim().equalsIgnoreCase("")) {
            if (!jPswPassword.getText().trim().equalsIgnoreCase("")) {
                if (ArchivadorUsuario.buscarUsuario(cedula, password)!=null) {
                    
                    this.dispose();
                    FrmMenu frmMenu=new FrmMenu();
                    frmMenu.setVisible(true);
                    frmMenu.setLocationRelativeTo(null);
                } else {

                    if (cont != 3) {
                        cont++;
                        JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto.\nIntentos restantes: " + (contPantalla-1));
                        jPswPassword.requestFocus();
                        jPswPassword.selectAll();
                        contPantalla--;
                    } else {
                        JOptionPane.showMessageDialog(null, "El programa se cerrará");
                        System.exit(0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"Debe ingresar su contraseña");
                jPswPassword.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Ingresar su identificación");
            jTxtUsuario.requestFocus();
        }
        
               
               
               
               
               usuarioGeneral=ArchivadorUsuario.buscarUsuario(cedula, password);//agarré el cliente que ingresó
               
               
               
    }//GEN-LAST:event_jBtnIngresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        jTxtUsuario.requestFocus();
        jLblIntentos.setText(""+(contPantalla));
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         jLblIntentos.setText(""+contPantalla);
         
       if(contPantalla==0){
           JOptionPane.showMessageDialog(null, "El programa se cerrará.");
           System.exit(0);
       }
    }//GEN-LAST:event_formWindowActivated

    private void jPswPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPswPasswordActionPerformed
        jBtnIngresar.doClick();
    }//GEN-LAST:event_jPswPasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static Usuario getUsuarioGeneral() { //esto con el fin de tomarlo en el frameMenu y poder setearlo al Usiario del main
        return usuarioGeneral;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnIngresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblFondo;
    private javax.swing.JLabel jLblIntentos;
    private javax.swing.JPasswordField jPswPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
