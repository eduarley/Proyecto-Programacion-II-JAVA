
package capaLogicaNegocios;

import java.io.Serializable;
import java.util.ArrayList;

public class Combo extends Producto implements Serializable{
    private String nombre;
    private PlatoPrincipal plato;
    private Refresco refresco;
    private ArrayList<Adicional> arrayAdicionales=new ArrayList();
    private boolean agrandado;
    private boolean refill;
    private int cont=0;//contador que solo permite dos adicionales
    public Combo() {
        
    }
    
    
     public boolean agregarAdicional(Adicional adicional){//recibe en el frame un t o f para mostrar mensaje de negación
         
         if(cont!=2){
             arrayAdicionales.add(adicional);
             cont++;
             return true;
         }else{
             return false;
         }
         
     }
     
     public double montoRefill(){
        double ref=0;
        if(refill){
            if(refresco.getTipoRefresco()==TipoRefresco.Gaseoso){
                ref+=200;
            }else{
                ref+=100;
            }
        }
        return ref;
     }
     
     
     
    @Override
    public double montoExtra(){        
        return agrandado?300:0;
    }
    public double subTotal(){
       double sub= plato.getPrecioBasico()+refresco.precioCombo();
        for (Adicional adic : arrayAdicionales) {
            sub+=adic.precioCombo();
        }
       return sub;
    }
    @Override
    public double precioTotalProducto(){
        return subTotal()-rebajo()+montoRefill()+montoExtra();
    }
    public double rebajo(){
        double rebajo=0;
        rebajo +=subTotal()*0.2;
        return rebajo;
    }
    
    
    
    
    public boolean confirmar(){
        return plato!=null&&refresco!=null&&arrayAdicionales.size()==2;
    }
    
    
    
    

    @Override
    public String toString() {
        String hilera="\nCombo\n";
        hilera+="Plato Principal: "+plato
                +"\nRefresco: "+refresco+"\n";
                hilera+=refill?"Refill: "+montoRefill()+"\n":"";
                hilera+=agrandado?"Agrandado: "+montoExtra()+"\n":""
                +"\nAdicionales: \n";
        for (Adicional adicion : arrayAdicionales) {
            hilera+=adicion.getNombre()+"\n";
        }
        hilera+="\nSubtotal: "+subTotal();
        hilera+="\nRebajo del 20%: "+rebajo();
        hilera+="\n----------------------------------\n";
        hilera+="\nTotal: "+precioTotalProducto();
        
        return hilera;
    }

    @Override
    public String display() {
        String hilera="\nCombo\n";
        hilera+="Plato Principal: "+plato
                +"\nRefresco: "+refresco+"\n";
                hilera+=refill?"Refill: "+montoRefill()+"\n":"";
                hilera+=agrandado?"Agrandado: "+montoExtra()+"\n":""
                +"\nAdicionales: \n";
        for (Adicional adicion : arrayAdicionales) {
            hilera+=adicion.getNombre()+"\n";
        }
        hilera+="\nSubtotal: "+subTotal();
        hilera+="\nRebajo del 20%: "+rebajo();
        hilera+="\n----------------------------------\n";
        hilera+="\nTotal: "+precioTotalProducto();
        
        return hilera;
    }
    
    
    
    
    
    public PlatoPrincipal getPlato() {
        return plato;
    }

    public void setPlato(PlatoPrincipal plato) {
        this.plato = plato;
    }

    public Refresco getRefresco() {
        return refresco;
    }

    public void setRefresco(Refresco refresco) {
        this.refresco = refresco;
    }

    public ArrayList<Adicional> getArrayAdicionales() {
        return arrayAdicionales;
    }

    public void setArrayAdicionales(ArrayList<Adicional> arrayAdicionales) {
        this.arrayAdicionales = arrayAdicionales;
    }

    public boolean isAgrandado() {
        return agrandado;
    }

    public void setAgrandado(boolean agrandado) {
        this.agrandado = agrandado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRefill() {
        return refill;
    }

    public void setRefill(boolean refill) {
        this.refill = refill;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
    
    
}
