
package capaLogicaNegocios;

import java.io.Serializable;
import java.util.ArrayList;


public class LineaDetalle implements Serializable{
    private Producto producto;
    private int cantidad;
    private String indicaciones;
    private Tamanio tamanio;
    
    
    
    public LineaDetalle(Producto producto, int cantidad) {
       this.producto = producto;
       this.cantidad = cantidad;
    }
    
    
    public double montoAgrandado(){
        double adicional=0;
        if(producto instanceof Refresco){
            if(((Refresco)producto).getTipoRefresco()==TipoRefresco.Gaseoso){
                if(tamanio==Tamanio.Grande){
                    adicional=350;
                }
            }else{//si no es gaseoso
                if(tamanio==Tamanio.Grande){
                    adicional=200;
                }
            }
        }
        
        
        
        if(producto instanceof Adicional){
            if(tamanio==Tamanio.Grande){
            adicional=200;
                if(producto.getNombre().equalsIgnoreCase("yuquitas")){
                adicional=250;
                }   
            }     
        }        
        return adicional;
    }
    

    public double precioLinea(){
        return (producto.precioTotalProducto()+montoAgrandado())*cantidad;
        
    }
    

    
    @Override
    public String toString() {
        String hilera="";
        hilera+=producto.getNombre();
        if(producto instanceof Refresco){
            
            if(montoAgrandado()!=0){
                hilera+=" Agrandado";
            }
        }
        if(producto instanceof Adicional){
            
            if(montoAgrandado()!=0){
                hilera+=" Agrandado";
            }
        }
        if(producto instanceof PlatoPrincipal){
            
            if(!indicaciones.equalsIgnoreCase("")){
                hilera+=", Indicaciones: "+indicaciones+" ";
            }
        }
   
        hilera+=", Cantidad: "+cantidad+" Precio: "+precioLinea();
        hilera+="\n";
        return hilera;
    }
    
    
    
    
    
    
    
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    
    
}
