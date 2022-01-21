
package capaGrafica;

import capaLogicaNegocios.AppProyecto;
import capaLogicaNegocios.TipoUsuario;
import static capaLogicaNegocios.TipoUsuario.Salonero;
import capaLogicaNegocios.Usuario;

public class FrmMenu extends javax.swing.JFrame {

   
    public FrmMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuAdministrador = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMnuSalonero = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblUsuario.setText("jLabel1");
        getContentPane().add(jLblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar Sesion2.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar Sesion3png.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar Sesion1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 340, 220, 70));

        jLblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.png"))); // NOI18N
        getContentPane().add(jLblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 680, 460));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMnuAdministrador.setText("Administrador");
        jMnuAdministrador.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Mantenimineto de Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMnuAdministrador.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Atencion de Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMnuAdministrador.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("Reportes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMnuAdministrador.add(jMenuItem3);

        jMenuBar1.add(jMnuAdministrador);

        jMnuSalonero.setText("Salonero");
        jMnuSalonero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setText("Atencion de Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMnuSalonero.add(jMenuItem4);

        jMenuBar1.add(jMnuSalonero);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmMantenimientoP frmMantenimientoP=new FrmMantenimientoP();
        frmMantenimientoP.setVisible(true);
        frmMantenimientoP.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmAtencionC frmAtencionC=new FrmAtencionC();
        frmAtencionC.setVisible(true);
        frmAtencionC.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrmReporte frmReporte=new FrmReporte();
        frmReporte.setVisible(true);
        frmReporte.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmAtencionC frmAtencionC=new FrmAtencionC();
        frmAtencionC.setVisible(true);
        frmAtencionC.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        AppProyecto.setUsuario(jDlgPassword.getUsuarioGeneral());
        jLblUsuario.setText(AppProyecto.getUsuario().getNombre());
        if(AppProyecto.getUsuario().getTipoUsuario()==TipoUsuario.Salonero){
            jMnuSalonero.setLocation(0, 0);
            jMnuAdministrador.setVisible(false);
        }
        if(AppProyecto.getUsuario().getTipoUsuario()==TipoUsuario.Administrador){          
            jMnuSalonero.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AppProyecto.setUsuario(null);
        
       
        this.setVisible(false);
        jDlgPassword jdDlgPassword=new jDlgPassword(null, true);
        jdDlgPassword.setLocationRelativeTo(null);
        jdDlgPassword.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblFondo;
    private javax.swing.JLabel jLblUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMnuAdministrador;
    private javax.swing.JMenu jMnuSalonero;
    // End of variables declaration//GEN-END:variables
}
