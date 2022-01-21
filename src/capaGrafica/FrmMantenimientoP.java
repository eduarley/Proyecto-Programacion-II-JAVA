
package capaGrafica;

import capaLogicaNegocios.Adicional;
import capaLogicaNegocios.PlatoPrincipal;
import capaLogicaNegocios.Producto;
import capaLogicaNegocios.Refresco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmMantenimientoP extends javax.swing.JFrame {
   private String codigoProducto;
   private Producto productoBuscar=null;
    
    private static Producto productoMantenimiento=null;//Producto que se utilizará para agregar, modificar.
    private DefaultTableModel modeloTabla=new DefaultTableModel();
    public FrmMantenimientoP() {
        initComponents();
        modeloTabla=(DefaultTableModel)jTblProductos.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTblProductos = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnAgregar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnConsultar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTblProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Tipo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 204, 390, 170));

        jToolBar1.setRollover(true);

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarProducto.png"))); // NOI18N
        jBtnAgregar.setText("Agregar");
        jBtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAgregar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAgregar);

        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarProducto.png"))); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnModificar);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BorrarProducto.png"))); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEliminar);

        jBtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultarProducto.png"))); // NOI18N
        jBtnConsultar.setText("Consultar");
        jBtnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnConsultar);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelarProducto.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnCancelar);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirProducto.png"))); // NOI18N
        jButton6.setText("Salir");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 450, 102));

        jLblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMantenimineto.png"))); // NOI18N
        getContentPane().add(jLblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        jDlgProducto dlgProducto=new jDlgProducto("",TipoMantenimiento.AGREGAR);
        dlgProducto.setModal(true);//Indica que no se puede pasar a la ventana anterior mientras no se cierre esta
        dlgProducto.setLocationRelativeTo(null);
        dlgProducto.setVisible(true);
        
        
        
        
        
            if(this.productoMantenimiento!= null){
            try {
                //Agrega el prod al archivo
                
                Producto.agregarProducto(productoMantenimiento);
                
                //actualiza la tabla con el nuevo prod
                llenaTablaProductos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar el producto, el sistema se cerrará\n");
                
            }
            
        }
            
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed



 if(jTblProductos.getSelectedRow()>= 0){
        String codigo = jTblProductos.getValueAt(jTblProductos.getSelectedRow(),0).toString();  
        jDlgProducto dlgDepartamento = 
            new jDlgProducto( codigo, TipoMantenimiento.MODIFICAR);//OJO se envía al contructor del JDialog el código del prod
        dlgDepartamento.setModal(true);//Indica que no se puede pasar a la ventana anterior mientras no se cierre esta
        dlgDepartamento.setLocationRelativeTo(null);
        dlgDepartamento.setVisible(true);
          //Cuando regresa del JDialog debe traer el prod con los atributos modificados
        if(this.productoMantenimiento!= null){
            try {
                //Modifica el prod de la lista
                Producto.modificarProducto(productoMantenimiento);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar el producto, el sistema se cerrará\n"+ex.toString());
                dispose();
            }
            
            llenaTablaProductos();
           
        }
        jTblProductos.clearSelection(); ; 
      }
      else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar el producto a modificar");
            return;
        }









      desactivarBotonesModificarEliminar();
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed


 if(jTblProductos.getSelectedRow()>= 0){
          codigoProducto = jTblProductos.getValueAt(jTblProductos.getSelectedRow(),0).toString();  
        try {
            productoBuscar = Producto.consultarProducto(codigoProducto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el producto\n"+
                e.toString() + "\n" + e.getMessage());
        }  
        if(productoBuscar != null){

            JOptionPane.showMessageDialog(null, productoBuscar.display());
        }
        
 }else{
              JOptionPane.showMessageDialog(null,"Debe seleccionar el producto a consultar");
              return;
        }
        jTblProductos.clearSelection();




    }//GEN-LAST:event_jBtnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenaTablaProductos();
      desactivarBotonesModificarEliminar();
      jBtnConsultar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        if(jTblProductos.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el producto a eliminar");
            return;          
        }
        
        String codigo =jTblProductos.getValueAt(jTblProductos.getSelectedRow(),0).toString();
     try {
         Producto.eliminarProducto(codigo);
     } catch (Exception ex) {
         JOptionPane.showMessageDialog(this, "Ha ocurrido un error al eliminar el producto\n"+ex.toString());
         this.dispose();
     }
        llenaTablaProductos(); //actualiza la tabla con el nuevo prod 
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        desactivarBotonesModificarEliminar(); 
        jBtnConsultar.setEnabled(false);
        jTblProductos.setSelectionMode(0);
        limpiar();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblProductosMouseClicked
        activarBotonesModificarEliminar(); 
        jBtnConsultar.setEnabled(true);
    }//GEN-LAST:event_jTblProductosMouseClicked

private void llenaTablaProductos() {
        
     try {
         //Llama al método que llena la lista con los productos del ArrayList
         //Llena la tabla con los productos que se grabaron en el ArrayList
         modeloTabla.setRowCount(0);//Limpia la tabla
         Object[] datos = new Object[4];
         ArrayList<Producto> lista= new ArrayList<Producto>();
         
         
         lista=Producto.listadoProducto();
         
         
         
         
         
         for (int i = 0; i < lista.size(); i++) {
             datos[0] = lista.get(i).getCodigo();
             datos[1]  = lista.get(i).getNombre();
             if(lista.get(i) instanceof Adicional){
                 datos[2]="Adicional";
             }
             if(lista.get(i) instanceof Adicional){
                 datos[2]="Adicional";
             }
             if(lista.get(i) instanceof PlatoPrincipal){
                 datos[2]="Plato Principal";
             }
             if(lista.get(i) instanceof Refresco){
                 datos[2]="Refresco";
             }
             
             
             datos[3]=lista.get(i).getPrecioBasico();
             
             
             datos[3]=lista.get(i).getPrecioBasico();
             modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
             
         }
     } catch (Exception ex) {
         Logger.getLogger(FrmMantenimientoP.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    public static Producto getProductoMantenimiento() {
        return productoMantenimiento;
    }

    public static void setProductoMantenimiento(Producto product) {
        //FrmMantenimientoP.productoMantenimiento = productoMantenimiento;  
        productoMantenimiento=product;
    }
    private void desactivarBotonesModificarEliminar() {
        jBtnAgregar.setEnabled(true);
        jBtnEliminar.setEnabled(false);
        jBtnModificar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
    }
    private void activarBotonesModificarEliminar() {
        jBtnAgregar.setEnabled(false);
        jBtnEliminar.setEnabled(true);
        jBtnModificar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
    }
    private void limpiar(){
        desactivarBotonesModificarEliminar();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLblFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblProductos;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
