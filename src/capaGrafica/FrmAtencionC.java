
package capaGrafica;

import capaLogicaNegocios.Adicional;
import capaLogicaNegocios.AppProyecto;
import capaLogicaNegocios.Combo;
import capaLogicaNegocios.Contado;
import capaLogicaNegocios.Credito;
import capaLogicaNegocios.Cuenta;
//import capaLogicaNegocios.DetalleTemporal;
import capaLogicaNegocios.LineaDetalle;
import capaLogicaNegocios.Moneda;
import capaLogicaNegocios.Pago;
import capaLogicaNegocios.PlatoPrincipal;
import capaLogicaNegocios.Producto;
import capaLogicaNegocios.Refresco;
import capaLogicaNegocios.Tamanio;
import capaLogicaNegocios.TipoTarjeta;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class FrmAtencionC extends javax.swing.JFrame {
    Pago pago;
    private Combo combo;
    private Producto producto;
    private Cuenta cuentaTemp;
    private int contPP=0;
    private int contRef=0;
    private LineaDetalle lineaDetalleTemp;
    private ArrayList<Producto>arrayP;
    private DefaultListModel modeloLista=new DefaultListModel();
    private DefaultListModel modeloListaPedido=new DefaultListModel();
    public FrmAtencionC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLblNombreUsuario = new javax.swing.JLabel();
        jPnlPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSpnNumeroMesa = new javax.swing.JSpinner();
        jSpnCantidad = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLblNumeroCuenta = new javax.swing.JLabel();
        jCboProductos = new javax.swing.JComboBox<>();
        jPnlTamanio = new javax.swing.JPanel();
        jRdbGrande = new javax.swing.JRadioButton();
        jRdbPequenio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstProductos = new javax.swing.JList<>();
        jBtnAceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPnlIndicaciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxaIndicaciones = new javax.swing.JTextArea();
        jChkCombo = new javax.swing.JCheckBox();
        jTxtSubTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLstPedido = new javax.swing.JList<>();
        jLblPedido = new javax.swing.JLabel();
        jBtnEliminarProducto = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jChkRefill = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxaPrueba = new javax.swing.JTextArea();
        jChkAgrandado = new javax.swing.JCheckBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTxaCombo = new javax.swing.JTextArea();
        jLblFondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLblVuelto = new javax.swing.JLabel();
        jCboTipoPago = new javax.swing.JComboBox<>();
        jCboTipoTarjeta = new javax.swing.JComboBox<>();
        jTxtNumeroTarjeta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtCodigoTarjeta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnPagar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTxtPagaCon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCboMoneda = new javax.swing.JComboBox<>();
        jLblTotalPagar = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTxaCuenta = new javax.swing.JTextArea();
        jLblTipoMoneda = new javax.swing.JLabel();
        jLBL = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLblFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        jLblNombreUsuario.setText("Usuario");
        getContentPane().add(jLblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        jPnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSpnNumeroMesa.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpnNumeroMesa.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpnNumeroMesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jSpnNumeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 54, -1));

        jSpnCantidad.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpnCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jSpnCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jSpnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 80, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Número Mesa:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 59, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Número Cuenta:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 17, -1, -1));

        jLblNumeroCuenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLblNumeroCuenta.setText("cuenta");
        jPanel1.add(jLblNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jCboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plato Principal", "Refresco", "Adicional" }));
        jCboProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Producto"));
        jCboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboProductosActionPerformed(evt);
            }
        });
        jPanel1.add(jCboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 87, 164, 53));

        jPnlTamanio.setBackground(new java.awt.Color(255, 255, 255));
        jPnlTamanio.setBorder(javax.swing.BorderFactory.createTitledBorder("Refresco/Adicional"));

        buttonGroup1.add(jRdbGrande);
        jRdbGrande.setText("Grande");
        jRdbGrande.setContentAreaFilled(false);

        buttonGroup1.add(jRdbPequenio);
        jRdbPequenio.setText("Pequeño");
        jRdbPequenio.setContentAreaFilled(false);

        javax.swing.GroupLayout jPnlTamanioLayout = new javax.swing.GroupLayout(jPnlTamanio);
        jPnlTamanio.setLayout(jPnlTamanioLayout);
        jPnlTamanioLayout.setHorizontalGroup(
            jPnlTamanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTamanioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPnlTamanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbPequenio)
                    .addComponent(jRdbGrande))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPnlTamanioLayout.setVerticalGroup(
            jPnlTamanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTamanioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jRdbGrande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRdbPequenio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPnlTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 207, -1, -1));

        jLstProductos.setModel(modeloLista);
        jLstProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLstProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 207, 164, -1));

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
        jPanel1.add(jBtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 110, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Subtotal:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jPnlIndicaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Plato Principal"));

        jLabel4.setText("Indicaciones");

        jTxaIndicaciones.setColumns(20);
        jTxaIndicaciones.setRows(5);
        jScrollPane2.setViewportView(jTxaIndicaciones);

        javax.swing.GroupLayout jPnlIndicacionesLayout = new javax.swing.GroupLayout(jPnlIndicaciones);
        jPnlIndicaciones.setLayout(jPnlIndicacionesLayout);
        jPnlIndicacionesLayout.setHorizontalGroup(
            jPnlIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlIndicacionesLayout.createSequentialGroup()
                .addGroup(jPnlIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlIndicacionesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addGroup(jPnlIndicacionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPnlIndicacionesLayout.setVerticalGroup(
            jPnlIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlIndicacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPnlIndicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 280, 110));

        jChkCombo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jChkCombo.setText("Combo");
        jChkCombo.setContentAreaFilled(false);
        jChkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkComboActionPerformed(evt);
            }
        });
        jPanel1.add(jChkCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));
        jPanel1.add(jTxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 200, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Productos");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 180, -1, -1));

        jLstPedido.setModel(modeloListaPedido);
        jLstPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstPedidoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jLstPedido);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 179, 185, 137));

        jLblPedido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblPedido.setText("Pedido");
        jPanel1.add(jLblPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 157, -1, -1));

        jBtnEliminarProducto.setBackground(new java.awt.Color(255, 0, 0));
        jBtnEliminarProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jBtnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEliminarProducto.setText("Eliminar Producto");
        jBtnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 179, -1, -1));

        jBtnAgregar.setBackground(new java.awt.Color(255, 102, 0));
        jBtnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAgregar.setText("Agregar Producto");
        jBtnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 326, 150, 40));

        jChkRefill.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jChkRefill.setText("Refill");
        jChkRefill.setContentAreaFilled(false);
        jChkRefill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkRefillActionPerformed(evt);
            }
        });
        jPanel1.add(jChkRefill, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jtxaPrueba.setEditable(false);
        jtxaPrueba.setColumns(20);
        jtxaPrueba.setRows(5);
        jScrollPane4.setViewportView(jtxaPrueba);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 270, 380));

        jChkAgrandado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jChkAgrandado.setText("Agrandar");
        jChkAgrandado.setContentAreaFilled(false);
        jPanel1.add(jChkAgrandado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jTxaCombo.setColumns(20);
        jTxaCombo.setRows(5);
        jTxaCombo.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo"));
        jScrollPane6.setViewportView(jTxaCombo);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 250, -1));

        jLblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAtencionC.png"))); // NOI18N
        jPanel1.add(jLblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 500));

        jPnlPrincipal.addTab("Cuenta", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblVuelto.setText("0");
        jPanel2.add(jLblVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, 30));

        jCboTipoPago.setBackground(new java.awt.Color(255, 255, 255));
        jCboTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Tarjeta" }));
        jCboTipoPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCboTipoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCboTipoPagoMouseClicked(evt);
            }
        });
        jCboTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboTipoPagoActionPerformed(evt);
            }
        });
        jCboTipoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCboTipoPagoKeyPressed(evt);
            }
        });
        jPanel2.add(jCboTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 41));

        jCboTipoTarjeta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCboTipoTarjeta.setEnabled(false);
        jCboTipoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboTipoTarjetaActionPerformed(evt);
            }
        });
        jPanel2.add(jCboTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 184, 220, -1));

        jTxtNumeroTarjeta.setEditable(false);
        jTxtNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroTarjetaActionPerformed(evt);
            }
        });
        jTxtNumeroTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtNumeroTarjetaKeyPressed(evt);
            }
        });
        jPanel2.add(jTxtNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 220, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Número de Tarjeta");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 244, -1, -1));

        jTxtCodigoTarjeta.setEditable(false);
        jPanel2.add(jTxtCodigoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 97, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Código");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jBtnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pagar2.png"))); // NOI18N
        jBtnPagar.setBorderPainted(false);
        jBtnPagar.setContentAreaFilled(false);
        jBtnPagar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagar3.png"))); // NOI18N
        jBtnPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pagar1.png"))); // NOI18N
        jBtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPagarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 150, 60));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Total a Pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTxtPagaCon.setEditable(false);
        jPanel2.add(jTxtPagaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 213, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Paga con:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Vuelto:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jCboMoneda.setBackground(new java.awt.Color(255, 255, 255));
        jCboMoneda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCboMoneda.setEnabled(false);
        jCboMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboMonedaActionPerformed(evt);
            }
        });
        jPanel2.add(jCboMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, -1));

        jLblTotalPagar.setText("--------0---------");
        jPanel2.add(jLblTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTxaCuenta.setEditable(false);
        jTxaCuenta.setColumns(20);
        jTxaCuenta.setRows(5);
        jScrollPane5.setViewportView(jTxaCuenta);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 418, 369));

        jLblTipoMoneda.setText("Moneda");
        jPanel2.add(jLblTipoMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 110, 30));

        jLBL.setText("()");
        jPanel2.add(jLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Tipo de tarjeta");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Tipo de pago");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Moneda");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
        jButton1.setToolTipText("Cerrar y volver al menú");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar3.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 70, 70));

        jLblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAtencionC.png"))); // NOI18N
        jPanel2.add(jLblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 460));

        jPnlPrincipal.addTab("Pago", jPanel2);

        getContentPane().add(jPnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboProductosActionPerformed
        if(jCboProductos.getSelectedIndex()==0){ //Plato principal
            jPnlIndicaciones.setVisible(true);
            jPnlTamanio.setVisible(false);
            modeloLista.clear();
            llenarListaPlatoPrincipal();
        }
        if(jCboProductos.getSelectedIndex()==1){ //Refresco
            jPnlIndicaciones.setVisible(false);
            
            modeloLista.clear();
            llenarListaRefrescos();
            if(!jChkCombo.isSelected()){
                jPnlTamanio.setVisible(true);
            }
        }
        if(jCboProductos.getSelectedIndex()==2){ //Adicional
            jPnlIndicaciones.setVisible(false);
            modeloLista.clear();
            llenarListaAdicionales();
            if(!jChkCombo.isSelected()){
                jPnlTamanio.setVisible(true);
            }
        }
    }//GEN-LAST:event_jCboProductosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cuentaTemp=new Cuenta();
        jLblTipoMoneda.setVisible(false);
        jLblNumeroCuenta.setText(cuentaTemp.getNumeroCuenta()+"");
        jChkRefill.setVisible(false);
        jChkAgrandado.setVisible(false);
        jLblNombreUsuario.setText(AppProyecto.getUsuario().getNombre());
        jCboProductos.setSelectedIndex(-1);
        jPnlIndicaciones.setVisible(false);
        jPnlTamanio.setVisible(false);
        jPnlPrincipal.setEnabledAt(1, false);
        for (TipoTarjeta tarjeta  : TipoTarjeta.values()) {
            jCboTipoTarjeta.addItem(tarjeta);
        }
        for (Moneda coin : Moneda.values()) {
            jCboMoneda.addItem(coin);
        }
        jCboTipoPago.setSelectedIndex(-1);
    }//GEN-LAST:event_formWindowOpened

    private void jChkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkComboActionPerformed
           if(jChkCombo.isSelected()){ 
              jChkRefill.setVisible(true);
              jPnlTamanio.setVisible(false);
              jChkAgrandado.setVisible(true);
              jSpnCantidad.setValue(1);              
              combo=new Combo();
              combo.setNombre("Combo");
              modeloListaPedido.addElement(combo.getNombre());
          }else{
              
              if(!combo.confirmar()){
                modeloListaPedido.removeElement("Combo");
              }
               combo=null;
              
              
              
              
              jChkRefill.setVisible(false);
              jChkAgrandado.setVisible(false);
              jSpnCantidad.setVisible(true);
              jChkAgrandado.setSelected(false);
              jChkRefill.setSelected(false);
              contPP=0;
              contRef=0;
              if(jCboProductos.getSelectedIndex()==1||jCboProductos.getSelectedIndex()==2){
                  jPnlTamanio.setVisible(true);
              }
          }        
    }//GEN-LAST:event_jChkComboActionPerformed

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed

    if(cuentaTemp.total()==0){   
        JOptionPane.showMessageDialog(null, "No ha agregado ningun producto a la cuenta.");
        return;
    }
        int n=JOptionPane.showConfirmDialog(null, "Desea proceder a pagar?");
        if(n==0){  //Presiona si
            jPnlPrincipal.setEnabledAt(0, false);
            jPnlPrincipal.setEnabledAt(1, true);
            jPnlPrincipal.setSelectedIndex(1);
            
            //aun no he creado la instancia de Pago.
            jLblTotalPagar.setText(Pago.montoLetras((int)cuentaTemp.total()));
            jLBL.setText("("+cuentaTemp.total()+")");
            cuentaTemp.setNumeroMesa((int)jSpnNumeroMesa.getValue());
            
            jTxaCuenta.setText(cuentaTemp.toString());
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jCboTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboTipoPagoActionPerformed
        if(jCboTipoPago.getSelectedIndex()==1){  //tarjeta
            jCboTipoTarjeta.setEnabled(true);
            jTxtNumeroTarjeta.setEditable(true);
            jTxtCodigoTarjeta.setEditable(true);
            jCboMoneda.setEnabled(false);
            jTxtPagaCon.setEditable(false);
            
            pago=new Credito();

            jLBL.setText("("+cuentaTemp.total()+")");
            jLblTotalPagar.setText(Pago.montoLetras((int)cuentaTemp.total()));
            
        }else{
            pago=null;
        }
        if(jCboTipoPago.getSelectedIndex()==0){ //contado
            jCboTipoTarjeta.setEnabled(false);
            jTxtNumeroTarjeta.setEditable(false);
            jTxtCodigoTarjeta.setEditable(false);
            jCboMoneda.setEnabled(true);
            jTxtPagaCon.setEditable(true);
            pago=new Contado();
        }else{
            pago=null;
        }
    }//GEN-LAST:event_jCboTipoPagoActionPerformed

    private void jCboTipoPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCboTipoPagoKeyPressed

    }//GEN-LAST:event_jCboTipoPagoKeyPressed

    private void jCboTipoPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCboTipoPagoMouseClicked
        
    }//GEN-LAST:event_jCboTipoPagoMouseClicked

    private void jCboTipoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboTipoTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboTipoTarjetaActionPerformed

    private void jLstProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstProductosMouseClicked
//        int[] arregloIndices = jLstProductos.getSelectedIndices();
//        for (int indice : arregloIndices) {
//            modeloListaPedido.addElement(modeloLista.get(indice));
//        }
            
    }//GEN-LAST:event_jLstProductosMouseClicked

    private void jBtnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarProductoActionPerformed
        int indice=jLstPedido.getSelectedIndex();
        
    if(combo==null){
        if(modeloListaPedido.getSize()>0){
            if(jLstPedido.getSelectedIndex()>-1){
                modeloListaPedido.remove(indice);
                try {
                    cuentaTemp.eliminarProducto(indice);   // el try para que no se caiga si hay dos combos vacios
                } catch (Exception e) {
                }
                jtxaPrueba.setText(cuentaTemp.display());
                jTxtSubTotal.setText(cuentaTemp.subTotal()+"");
               
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
            
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay productos en la lista de compra");
        }
    
    }else{   //  DE EXISTIR COMBO:
        contPP=0;
        contRef=0;
        JOptionPane.showMessageDialog(null, "Combo eliminado");
        
        combo=null;
            
        
      
        try {
            cuentaTemp.eliminarProducto(indice);   //sin el try se cae cuando no he terminado el combo y trato de eliminarlo
        } catch (Exception e) {
            
        }
            
        
        modeloListaPedido.remove(indice);
 
        jChkCombo.setSelected(false);
        jChkAgrandado.setVisible(false);
        jChkRefill.setVisible(false);

        
        jChkAgrandado.setSelected(false);
        jChkRefill.setSelected(false);
        
    }
        jTxtSubTotal.setText(cuentaTemp.subTotal()+"");
    }//GEN-LAST:event_jBtnEliminarProductoActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        
        
        
        if(jLstProductos.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto.");
            jLstProductos.requestFocus();
            return;
        }
        if(jCboProductos.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo.");
            jCboProductos.requestFocus();
            return;
        }
        
        
        
        
if(!jChkCombo.isSelected()){
        
        producto =jLstProductos.getSelectedValue();
        lineaDetalleTemp=new LineaDetalle(producto, (int)jSpnCantidad.getValue());
        if(producto instanceof Refresco){
            if(jRdbGrande.isSelected()){
 
                 lineaDetalleTemp.setTamanio(Tamanio.Grande);
            }else{
 
                lineaDetalleTemp.setTamanio(Tamanio.Pequenio);
            }
        }
        if(producto instanceof Adicional){
            if(jRdbGrande.isSelected()){
                lineaDetalleTemp.setTamanio(Tamanio.Grande);
            }else{
                lineaDetalleTemp.setTamanio(Tamanio.Pequenio);
            }
        }
        
        
        
        
        int[] arregloIndices = jLstProductos.getSelectedIndices();
        for (int indice : arregloIndices) {
            modeloListaPedido.addElement(modeloLista.get(indice));
        }
        
        
        
        lineaDetalleTemp.setIndicaciones(jTxaIndicaciones.getText());
        cuentaTemp.agregarLineaDetalle(lineaDetalleTemp);
        jTxtSubTotal.setText(""+cuentaTemp.subTotal());
        jtxaPrueba.setText(cuentaTemp.display());
}
        //----------------------------------------------------------------------------------------------------//
        
        
        
        
        
        
        
        
        if(jChkCombo.isSelected()){
            producto =jLstProductos.getSelectedValue();
            
            
            
            if(jChkRefill.isSelected()){
                combo.setRefill(true);
            }else{
                combo.setRefill(false);
            }
            if(jChkAgrandado.isSelected()){
                combo.setAgrandado(true);
            }else{
                combo.setAgrandado(false);
            }
            
            
            
            if(producto instanceof PlatoPrincipal){
                if(contPP!=1){
                combo.setPlato((PlatoPrincipal)producto);
                JOptionPane.showMessageDialog(null, "Plato agregado al combo: "+producto.getNombre());
                
                contPP++;
                }else{
                    JOptionPane.showMessageDialog(null, "Máximo un Plato Principal");
                    return;
                }
            }
            if(producto instanceof Refresco){
                if(contRef!=1){
                 
                combo.setRefresco((Refresco)producto);
                JOptionPane.showMessageDialog(null, "Refresco agregado al combo: "+producto.getNombre());
 
                
                contRef++;
                }else{
                     JOptionPane.showMessageDialog(null, "Máximo un Refresco");
                     return;
                }
            }
            if(producto instanceof Adicional){
                
                if(combo.agregarAdicional((Adicional)producto)){
                     
                    JOptionPane.showMessageDialog(null, "Adicional agregado al combo: "+producto.getNombre());

                   
                }
                else{
                    JOptionPane.showMessageDialog(null, "Máximo 2 adicionales");
                    return;
                }
            } 
           
            
            
            
            
            jTxtSubTotal.setText("Calculando precio del combo...");
            
            
            if(combo.confirmar()){
                
                lineaDetalleTemp=new LineaDetalle((Producto)combo, (int)jSpnCantidad.getValue());
                cuentaTemp.agregarLineaDetalle(lineaDetalleTemp);
                
                
                jtxaPrueba.setText(cuentaTemp.display());
             
               jTxaCombo.setText(combo.toString());
                jTxtSubTotal.setText(""+cuentaTemp.subTotal());
                 
            }
            
            
              
        }
       
        
           
        
        
        
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jChkRefillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkRefillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChkRefillActionPerformed

    private void jLstPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstPedidoMouseClicked
             
//        
//            Producto prod=(Producto)jLstPedido.getSelectedValue();
//            
//            if(jLstPedido.getSelectedValue() instanceof Combo){
//             //   Combo com=(Combo)jLstPedido.getSelectedValue();
//              //  JOptionPane.showMessageDialog(null, com.display()+"");
//                 JOptionPane.showMessageDialog(null, ((Combo)prod).display());
//            }else{
//                JOptionPane.showMessageDialog(null, prod.display());
//            }

    }//GEN-LAST:event_jLstPedidoMouseClicked

    private void jBtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPagarActionPerformed
       
        
        
        
        
        
////////////////////////////////////////////////////////////////////////TARJETA//////////////////////////////////////////////////////////////
    if(jCboTipoPago.getSelectedIndex()!=-1){    
        if(jCboTipoPago.getSelectedItem().equals("Tarjeta")){

            
            
  
        String numeroT=jTxtNumeroTarjeta.getText().trim();
        String codigoT=jTxtCodigoTarjeta.getText().trim();

        
        
        
    ////////////////////////////VISA/////////////////////////////////////////////////////////////////////////////
        
        if(jCboTipoTarjeta.getSelectedItem()==TipoTarjeta.VISA){
            if(numeroT.matches("[4]([0-9]{15})")){ 
                if(!((Credito)pago).VerificacioTarjeta(numeroT)){
                    JOptionPane.showMessageDialog(null, "Número de tarjeta inválido");
                    jTxtNumeroTarjeta.requestFocus();
                    return;
                }else{
                    if(codigoT.matches("[0-9]{3}")){
                    pago=new Credito();
                    ((Credito)pago).setTipoTarjeta(TipoTarjeta.VISA);
                   pago.setMontoPago(cuentaTemp.total());
                   cuentaTemp.setPago(pago);
                   jTxaCuenta.setText(cuentaTemp.toString());
                   jBtnPagar.setEnabled(false);
                   cuentaTemp.setSalonero(AppProyecto.getUsuario());
                   

                    }else{
                        JOptionPane.showMessageDialog(null, "Código inválido. Debe contener 3 dígitos");
                        jTxtCodigoTarjeta.requestFocus();
                        jTxtCodigoTarjeta.selectAll();
                        return;
                    } 
                }
            }else{
                jTxtNumeroTarjeta.requestFocus();
                jTxtNumeroTarjeta.selectAll();
                JOptionPane.showMessageDialog(null, "Número de tarjeta debe iniciar en 4 por ser VISA, "
                        + "\ny debe tener 16 Dígitos inclusive");
                return;
            } 
            
        }
        
        
        
        
        
        
        
        
        //////////////////////////////////////////////////MASTERCARD/////////////////////////////////////////////////////////////////////        
        
        
         if(jCboTipoTarjeta.getSelectedItem()==TipoTarjeta.MASTERDCARD){
       
             if(numeroT.matches("[5][1-5]([0-9]{14})")){      
                 if(!((Credito)pago).VerificacioTarjeta(numeroT)){
                    JOptionPane.showMessageDialog(null, "Número de tarjeta inválido");
                    jTxtNumeroTarjeta.requestFocus();
                    return;
                }else{
                    if(codigoT.matches("[0-9]{3}")){
                   pago=new Credito();
                   ((Credito)pago).setTipoTarjeta(TipoTarjeta.MASTERDCARD);
                   pago.setMontoPago(cuentaTemp.total());
                   cuentaTemp.setPago(pago);
                   jTxaCuenta.setText(cuentaTemp.toString());
                   jBtnPagar.setEnabled(false);
                   cuentaTemp.setSalonero(AppProyecto.getUsuario());
                  
                   
                    }else{
                        JOptionPane.showMessageDialog(null, "Código inválido. Debe contener 3 dígitos");
                        jTxtCodigoTarjeta.requestFocus();
                        jTxtCodigoTarjeta.selectAll();
                        return;
                    }
                }
             }else{
                 jTxtNumeroTarjeta.requestFocus();
                jTxtNumeroTarjeta.selectAll();
                JOptionPane.showMessageDialog(null, "Número de tarjeta debe iniciar entre los números 51 y 55 inclusive"
                        + " por ser MASTERCARD. "
                        + "\ndebe tener 16 Dígitos");
                return;
             }
         }
        
        
        
        

            
            
            
        }
        
        
        
        
        
/////////////////////////////////////////////////////////////////////////CONTADO//////////////////////////////////////////////////////////////
        



if(jCboTipoPago.getSelectedItem().equals("Contado")){
     
            if(jCboMoneda.getSelectedItem()==Moneda.Colones){       //COLÓNES
            ((Contado)pago).setMoneda(Moneda.Colones);
            pago.setMontoPago(cuentaTemp.total());
                try {
                    pago.setMontoPagado(Double.parseDouble(jTxtPagaCon.getText()));
                } catch (NumberFormatException numberFormatException) {
                    
                }
            }else{                                                  //DÓLARES
                try {
                    pago.setMontoPagado(Double.parseDouble(jTxtPagaCon.getText()));
                } catch (NumberFormatException numberFormatException) {
                    
                }
                ((Contado)pago).setMoneda(Moneda.Dolar);
                pago.setMontoPago(cuentaTemp.totalDolar());
                
            }
            cuentaTemp.setPago(pago);
            if(jCboMoneda.getSelectedIndex()!=-1){
                ((Contado)pago).setMoneda((Moneda)jCboMoneda.getSelectedItem());
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de moneda.");
                return;
            }
                    
            
            
            
            
            try {
                double monto = Double.parseDouble(jTxtPagaCon.getText());
                
                
            if(((Contado)pago).calculaVuelto(monto)!=-1){
                DecimalFormat formato =new DecimalFormat("#################,##");
                jLblVuelto.setText(/*formato.format*/(((Contado)pago).calculaVuelto(monto))+"");
                
                
                
            }else{
                JOptionPane.showMessageDialog(null, "El monto es menor al total de la factura.");
                return;
            }   
                
                
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null, "Error en el la lectura del monto.");
                jTxtPagaCon.requestFocus();
                jTxtPagaCon.selectAll();
                return;
            }
            
            
            
            
            
        }
    }else{
        JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de pago.");
        return;
    }    
        
      
         jTxaCuenta.setText(cuentaTemp.toString());
         jBtnPagar.setEnabled(false);
         cuentaTemp.setSalonero(AppProyecto.getUsuario());
         
        try {
            /////// GUARDAR CUENTA/////////
            Cuenta.agregarCuenta(cuentaTemp);
        } catch (Exception ex) {
            Logger.getLogger(FrmAtencionC.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
    }//GEN-LAST:event_jBtnPagarActionPerformed

    private void jCboMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboMonedaActionPerformed
        if(jCboMoneda.getSelectedIndex()==-1){
            jLblTipoMoneda.setVisible(false);
        }
        if(jCboMoneda.getSelectedIndex()==0){//COLONES
            jLblTipoMoneda.setVisible(true);
            Pago.setDolar(false);
            if(pago!=null){
            
            jLBL.setText("("+cuentaTemp.total()+")");
            jLblTotalPagar.setText(Pago.montoLetras((int)cuentaTemp.total()));
            jTxaCuenta.setText(cuentaTemp.toString());
            }
            jLblTipoMoneda.setText("Colones.");
            
        }
        
        
        
        
        
        if(jCboMoneda.getSelectedIndex()==1){//DÓLARES
            jLblTipoMoneda.setVisible(true);
            Pago.setDolar(true);
            jLblTotalPagar.setText(Pago.montoLetras((int)cuentaTemp.totalDolar()));
        
            if(pago!=null){
            
            
            jLBL.setText("("+cuentaTemp.totalDolar()+")");
            

            }
            
            jLblTipoMoneda.setText("Dólares.");
            
            
            
            
            
        }
        
    }//GEN-LAST:event_jCboMonedaActionPerformed

    private void jTxtNumeroTarjetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNumeroTarjetaKeyPressed
    //        if(h.matches("^([0-9]){0,15}$")){
//             
//         }else{
//              h = h.substring(0, h.length()-1);       
//         }
//         jTxtNumeroTarjeta.setText(h);


    }//GEN-LAST:event_jTxtNumeroTarjetaKeyPressed

    private void jTxtNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeroTarjetaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void llenarListaAdicionales(){
        try {
            arrayP=Producto.listadoProducto();
        } catch (Exception ex) {
            Logger.getLogger(FrmAtencionC.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Producto producto : arrayP) {
            if(producto instanceof Adicional){
                modeloLista.addElement(producto);
            }
        }
    }
    private void llenarListaRefrescos(){
        try {
            arrayP=Producto.listadoProducto();
        } catch (Exception ex) {
            Logger.getLogger(FrmAtencionC.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Producto producto : arrayP) {
            if(producto instanceof Refresco){
                modeloLista.addElement(producto);
            }
        }
    }
    private void llenarListaPlatoPrincipal(){
        try {
            arrayP=Producto.listadoProducto();
        } catch (Exception ex) {
            Logger.getLogger(FrmAtencionC.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Producto producto : arrayP) {
            if(producto instanceof PlatoPrincipal){
                modeloLista.addElement(producto);
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnEliminarProducto;
    private javax.swing.JButton jBtnPagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Moneda> jCboMoneda;
    private javax.swing.JComboBox<String> jCboProductos;
    private javax.swing.JComboBox<String> jCboTipoPago;
    private javax.swing.JComboBox<TipoTarjeta> jCboTipoTarjeta;
    private javax.swing.JCheckBox jChkAgrandado;
    private javax.swing.JCheckBox jChkCombo;
    private javax.swing.JCheckBox jChkRefill;
    private javax.swing.JLabel jLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblFondo;
    private javax.swing.JLabel jLblFondo1;
    private javax.swing.JLabel jLblNombreUsuario;
    private javax.swing.JLabel jLblNumeroCuenta;
    private javax.swing.JLabel jLblPedido;
    private javax.swing.JLabel jLblTipoMoneda;
    private javax.swing.JLabel jLblTotalPagar;
    private javax.swing.JLabel jLblVuelto;
    private javax.swing.JList<Producto> jLstPedido;
    private javax.swing.JList<Producto> jLstProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPnlIndicaciones;
    private javax.swing.JTabbedPane jPnlPrincipal;
    private javax.swing.JPanel jPnlTamanio;
    private javax.swing.JRadioButton jRdbGrande;
    private javax.swing.JRadioButton jRdbPequenio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpnCantidad;
    private javax.swing.JSpinner jSpnNumeroMesa;
    private javax.swing.JTextArea jTxaCombo;
    private javax.swing.JTextArea jTxaCuenta;
    private javax.swing.JTextArea jTxaIndicaciones;
    private javax.swing.JTextField jTxtCodigoTarjeta;
    private javax.swing.JTextField jTxtNumeroTarjeta;
    private javax.swing.JTextField jTxtPagaCon;
    private javax.swing.JTextField jTxtSubTotal;
    private javax.swing.JTextArea jtxaPrueba;
    // End of variables declaration//GEN-END:variables

    
}
