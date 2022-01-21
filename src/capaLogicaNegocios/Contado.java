
package capaLogicaNegocios;

import java.io.Serializable;

public class Contado extends Pago implements Serializable{
    
    private Moneda moneda;
    private final double PRECIO_DOLAR=615;

    public Contado() {
    }
    

    public double calculaVuelto(double pagaCon){
        double monto=0;
        
        
        
        


        if(moneda==Moneda.Colones){ //COLONES
            if(pagaCon>=getMontoPago()){
                monto+=pagaCon-super.getMontoPago();
            }else{
                monto=-1;
            }
            
            
        }
        
        
        if(moneda==Moneda.Dolar){  //DÓLARES
            if(pagaCon>=getMontoPago()){
                monto+=pagaCon-super.getMontoPago();
            }else{
                monto=-1;
            }
        }
        
        return monto;
        
        
        
    }
    
    
    
    public  double convierteDolares(double total){

    if(moneda==Moneda.Dolar){
        return total/this.PRECIO_DOLAR;
    }else{
        return total;
    }
    

    }

    
    
    
    
    @Override
    public String toString() {
        return "Contado";
    }

    
    
    
    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    
        
}
