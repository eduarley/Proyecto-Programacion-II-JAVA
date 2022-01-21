
package capaLogicaNegocios;

import capaPersistencia.CuentaBD;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cuenta implements Serializable{
    
    private static int conCuenta=1;
    private int numeroCuenta;
    private Date fecha;
    private int numeroMesa;
    private ArrayList<LineaDetalle>arrayDetalle=new ArrayList();
    private Pago pago;
    private final double  IMPUESTO_SERVICIO=0.1;
    private final double IMPUESTO_VENTAS=0.13;
    private  Usuario salonero;
    private final double PRECIODOLLAR=615;
    
    //static numero de cuenta a partir de 1
    public Cuenta(){  
       
        numeroCuenta=conCuenta++;
        
    }

    
    
    public void agregarLineaDetalle(LineaDetalle lineaDetalle){
        arrayDetalle.add(lineaDetalle);
    }
    public void eliminarProducto(int indice){
        arrayDetalle.remove(indice);
    }
    
    

    
    
    public double subTotal(){
        
        double suma=0;
        for (LineaDetalle detalle : arrayDetalle) {
            suma+=detalle.precioLinea();
        }
        
        return suma;
    }
    public double impuestoVenta(){
        
        return IMPUESTO_VENTAS*subTotal();
    }
    public double impuestoServicio(){
        
        return IMPUESTO_SERVICIO*subTotal();
    }
    public double total(){
        return (subTotal()+impuestoServicio()+impuestoVenta())-rebajoVisa();
        
        
    }
    public double rebajoVisa(){
        double rebajo=0;
        double tot=subTotal()+impuestoServicio()+impuestoVenta();
        if(pago instanceof Credito && ((Credito)pago).getTipoTarjeta()==TipoTarjeta.VISA){
            rebajo+=tot*0.25;
        }
        return rebajo;
    }
    
    
    public double totalDolar(){
        return total()/PRECIODOLLAR;
    }
 

    @Override
    public String toString() {
        fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy  'Hora: ' hh:mm:ss");
        
        String fecha1=formatoFecha.format(fecha);
        DecimalFormat decimales=new DecimalFormat("################.##");
        String hilera="Número de cuenta: "+this.numeroCuenta+
                "\nMesa número: "+this.numeroMesa
                + "\nFecha: "+fecha1
                +"\nSalonero: "+AppProyecto.getUsuario().getNombre()
                +"\nDetalle:"
                +"\n**********************************************************************************\n";
                
        
        
                for (LineaDetalle lineaDetalle : arrayDetalle) {
                    hilera+=lineaDetalle.toString();
                    
                }
               hilera+="\nSubtotal: "+subTotal(); 
               hilera+="\n**********************************************************************************\n";
               hilera+= pago==null?"Aún en cobro" :"Pago: "+pago; 
               hilera+="\nImpuesto de venta: "+decimales.format(impuestoVenta());
               hilera+="\nImpuesto de servicio: "+decimales.format(impuestoServicio());
               hilera+="\n-----------------------------------------------------------------------------------------------------\n";
               //hilera+="Total a pagar: "+total()+"\n";
               
               hilera+=pago instanceof Contado&&((Contado)pago).getMoneda()==Moneda.Colones?"Total a pagar: "+decimales.format(total())+" colones":"";
               hilera+=pago instanceof Contado&&((Contado)pago).getMoneda()==Moneda.Dolar?"Total a pagar: "+decimales.format(totalDolar())+" dólares":"";
               
               
               hilera+=pago instanceof Contado?"\nSu vuelto: "+decimales.format(((Contado)pago).calculaVuelto(pago.getMontoPagado())):"";
               if(pago !=null&& pago instanceof Contado){
               hilera+=pago instanceof Contado&&((Contado)pago).isDolar()?" dólares":" colones";
               }
               hilera+=pago instanceof Credito&&((Credito)pago).getTipoTarjeta()==TipoTarjeta.VISA?"\nRebajo del 20% por ser VISA: "+/*((Credito)pago).descuento()*/rebajoVisa():"";
               hilera+=pago instanceof Credito?"\nTotal cobro a tarjeta: "+total():"";
        
               hilera+="\n**********************************************************************************\n\n\n\n";
                         
               return hilera;
    }
    
    public String display(){
        String hilera="\nDetalle\n------------------------------------\n";
        for (LineaDetalle lineaDetalle : arrayDetalle) {
            hilera+=lineaDetalle.toString();
            
        }
        
        return hilera;
    }

    
    
    
    
    
    
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

  

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public ArrayList<LineaDetalle> getArrayDetalle() {
        return arrayDetalle;
    }

    public void setArrayDetalle(ArrayList<LineaDetalle> arrayDetalle) {
        this.arrayDetalle = arrayDetalle;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public  Usuario getSalonero() {
        return salonero;
    }

    public  void setSalonero(Usuario salonero) {
        this.salonero = salonero;
    }

    
    

    public static int getConCuenta() {
        return conCuenta;
    }

    public static void setConCuenta(int conCuenta) {
        Cuenta.conCuenta = conCuenta;
    }

     public static Cuenta consultarCuenta(String codigo) throws Exception {
        return CuentaBD.getInstance().consultarCuenta(codigo);
    }
    public static void agregarCuenta(Cuenta cuenta) throws Exception {
        CuentaBD.getInstance().agregarCuenta(cuenta);
    }
      
    public static ArrayList<Cuenta> listadoCuentas() throws Exception {
       return CuentaBD.getInstance().listaCuentas();
    }
    
}
