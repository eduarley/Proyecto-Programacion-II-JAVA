/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaGrafica;

import capaLogicaNegocios.Adicional;
import capaLogicaNegocios.PlatoPrincipal;
import capaLogicaNegocios.Producto;
import capaLogicaNegocios.Refresco;
import capaLogicaNegocios.Tamanio;
import capaLogicaNegocios.TipoRefresco;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class jDlgProducto extends javax.swing.JDialog {
    private String codigoProducto;
    private TipoMantenimiento tipoMantenimiento;
    private Producto productoBuscar=null;
    public jDlgProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public jDlgProducto(String codigoProducto,TipoMantenimiento tipoMantenimiento) {
        this.codigoProducto=codigoProducto;
        this.tipoMantenimiento=tipoMantenimiento;
        
        try {
            initComponents();
        } catch (Exception e) {
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtPrecio = new javax.swing.JTextField();
        jBtnAceptar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPnlTipo = new javax.swing.JPanel();
        jRdbAdicional = new javax.swing.JRadioButton();
        jRdbRefresco = new javax.swing.JRadioButton();
        jRdbPlatoPrincipal = new javax.swing.JRadioButton();
        jRdbNatural = new javax.swing.JRadioButton();
        jRdbGaseoso = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 51, -1, -1));

        jLabel2.setText("Precio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 77, -1, -1));

        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });
        jTxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtNombreKeyPressed(evt);
            }
        });
        getContentPane().add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 49, 172, -1));

        jTxtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 75, 172, -1));

        jBtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar2.png"))); // NOI18N
        jBtnAceptar.setBorderPainted(false);
        jBtnAceptar.setContentAreaFilled(false);
        jBtnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar3.png"))); // NOI18N
        jBtnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar1.png"))); // NOI18N
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 166, 88, -1));

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar2.png"))); // NOI18N
        jBtnCancelar.setBorderPainted(false);
        jBtnCancelar.setContentAreaFilled(false);
        jBtnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar3.png"))); // NOI18N
        jBtnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar1.png"))); // NOI18N
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 166, 112, -1));

        jPnlTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione un tipo"));

        buttonGroup1.add(jRdbAdicional);
        jRdbAdicional.setText("Adicional");
        jRdbAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbAdicionalActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRdbRefresco);
        jRdbRefresco.setText("Refresco");
        jRdbRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbRefrescoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRdbPlatoPrincipal);
        jRdbPlatoPrincipal.setText("Plato Principal");
        jRdbPlatoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbPlatoPrincipalActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRdbNatural);
        jRdbNatural.setText("Natural");

        buttonGroup2.add(jRdbGaseoso);
        jRdbGaseoso.setText("Gaseoso");

        javax.swing.GroupLayout jPnlTipoLayout = new javax.swing.GroupLayout(jPnlTipo);
        jPnlTipo.setLayout(jPnlTipoLayout);
        jPnlTipoLayout.setHorizontalGroup(
            jPnlTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbAdicional)
                    .addComponent(jRdbPlatoPrincipal)
                    .addComponent(jRdbRefresco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbGaseoso)
                    .addComponent(jRdbNatural))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlTipoLayout.setVerticalGroup(
            jPnlTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTipoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRdbPlatoPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdbRefresco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdbAdicional)
                .addGap(27, 27, 27))
            .addGroup(jPnlTipoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jRdbNatural)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdbGaseoso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPnlTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 23, -1, -1));

        jLabel4.setText("Codigo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 25, -1, -1));

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 23, 172, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoDljProducto.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
         //Obtiene los datos para la actualización
         
        String cod = jTxtCodigo.getText();
        String nombre = jTxtNombre.getText();
        
        
        
        
        if(cod.equalsIgnoreCase("")&&nombre.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Por favor llenar los datos");
            jTxtCodigo.requestFocus();
            return;
        }
        
        if(cod.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Debe escribir el código del producto");
            jTxtCodigo.requestFocus();
            return;
        }
        
        if(nombre.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Debe escribir el nombre del producto");
            jTxtNombre.requestFocus();
            return;
        }
        
        double precio = 0;
        try {
            precio = Double.parseDouble(jTxtPrecio.getText());
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Error de formato del precio");
            jTxtPrecio.requestFocus();
            jTxtPrecio.selectAll();
            return;
        }
        
     
        
        
        
        
        if(jPnlTipo.isVisible()&&!jRdbAdicional.isSelected()&&!jRdbPlatoPrincipal.isSelected()&&!jRdbRefresco.isSelected()){
            JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de producto");
            jRdbAdicional.setForeground(Color.red);
            jRdbPlatoPrincipal.setForeground(Color.red);
            jRdbRefresco.setForeground(Color.red);
            return;
        }
        
            jRdbAdicional.setForeground(Color.BLACK);
            jRdbPlatoPrincipal.setForeground(Color.BLACK);
            jRdbRefresco.setForeground(Color.BLACK);
        
        
        
        
         if(jRdbRefresco.isSelected()&&jPnlTipo.isVisible()){
             if(!jRdbGaseoso.isSelected()&&!jRdbNatural.isSelected()){
                 JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de refresco");
                jRdbGaseoso.setForeground(Color.red);
                jRdbNatural.setForeground(Color.red);           
                return;
             }
         }
        
            jRdbGaseoso.setForeground(Color.BLACK);
            jRdbNatural.setForeground(Color.BLACK);
        
        
        
        
        
        
        
        
        
        
        Producto prod=null;
        if(jRdbAdicional.isSelected()){
            prod=new Adicional(cod, nombre,precio);
           
            prod.setPrecioBasico(precio);
        }
        if(jRdbPlatoPrincipal.isSelected()){
            prod=new PlatoPrincipal(cod, nombre,precio);
            prod.setPrecioBasico(precio);
            
        }
        if(jRdbRefresco.isSelected()){
            prod=new Refresco(cod, nombre,precio);
          
            if(jRdbNatural.isSelected()){
                ((Refresco)prod).setTipoRefresco(TipoRefresco.Natural);
            }
            if(jRdbGaseoso.isSelected()){
                ((Refresco)prod).setTipoRefresco(TipoRefresco.Gaseoso);
            }
            prod.setPrecioBasico(precio);
        }
        
        
        if(tipoMantenimiento==TipoMantenimiento.AGREGAR){
        try {    //aquí valido que no se repita el codigo
            if(Producto.consultarProducto(cod)!=null){
            JOptionPane.showMessageDialog(null, "Producto con código ya existente");
            jTxtCodigo.requestFocus();
            return;
            }
        } catch (Exception ex) {
            Logger.getLogger(jDlgProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
        
        
        //Actualiza el producto static del FrmMant
        //para que cuando regrese lo agregue o modifique
        FrmMantenimientoP.setProductoMantenimiento(prod);
        
        
       this.dispose();
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jRdbAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbAdicionalActionPerformed
       jRdbNatural.setVisible(false);
         jRdbGaseoso.setVisible(false);
    }//GEN-LAST:event_jRdbAdicionalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         switch(tipoMantenimiento){
            case AGREGAR:
                this.setTitle("Agregar producto");
                break;
            case CONSULTAR:
                this.setTitle("Consultar producto");
                
                jPnlTipo.setVisible(false);
                break;
            case MODIFICAR:
                this.setTitle("Modificar producto");
                jPnlTipo.setVisible(false);
                jTxtCodigo.setEditable(false);
                break;
        }
         jRdbNatural.setVisible(false);
         jRdbGaseoso.setVisible(false);
         
         
         
         
         
         
        jTxtCodigo.setText(codigoProducto);
        jTxtNombre.setText("");
        try {
            productoBuscar = Producto.consultarProducto(codigoProducto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el producto\n"+
                e.toString() + "\n" + e.getMessage());
        }  
        if(productoBuscar != null){
            jTxtNombre.setText(productoBuscar.getNombre());
            jTxtPrecio.setText(productoBuscar.getPrecioBasico()+"");
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void jRdbRefrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbRefrescoActionPerformed
        jRdbNatural.setVisible(true);
         jRdbGaseoso.setVisible(true);
    }//GEN-LAST:event_jRdbRefrescoActionPerformed

    private void jRdbPlatoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbPlatoPrincipalActionPerformed
        jRdbNatural.setVisible(false);
         jRdbGaseoso.setVisible(false);
    }//GEN-LAST:event_jRdbPlatoPrincipalActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        FrmMantenimientoP.setProductoMantenimiento(null);
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        jTxtNombre.requestFocus();
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        jTxtPrecio.requestFocus();
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jTxtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrecioActionPerformed
        jBtnAceptar.doClick();
    }//GEN-LAST:event_jTxtPrecioActionPerformed

    private void jTxtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyPressed
//        String nombre=jTxtNombre.getText();
//        String hilera="";
//        for (int i = 0; i <nombre.length(); i++) {
//            hilera=nombre.substring(0,1).toUpperCase().charAt(0)+nombre.substring(1, nombre.length());
//            
//        }       
//        jTxtNombre.setText(hilera);
    }//GEN-LAST:event_jTxtNombreKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPnlTipo;
    private javax.swing.JRadioButton jRdbAdicional;
    private javax.swing.JRadioButton jRdbGaseoso;
    private javax.swing.JRadioButton jRdbNatural;
    private javax.swing.JRadioButton jRdbPlatoPrincipal;
    private javax.swing.JRadioButton jRdbRefresco;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPrecio;
    // End of variables declaration//GEN-END:variables
}
