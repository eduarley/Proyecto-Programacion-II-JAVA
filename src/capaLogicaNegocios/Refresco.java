
package capaLogicaNegocios;

import java.io.Serializable;

public class Refresco extends Producto implements Serializable{

    private TipoRefresco tipoRefresco;//tiene precio en el enum
    
    
    public Refresco(String codigo,String nombre,double precioBasico) {
        super(codigo,nombre,precioBasico);
    }
    
    
    @Override
    public double precioTotalProducto(){
        return tipoRefresco.getPrecioBasico();
    }

    
    public double precioCombo(){
        //esto con el fin de no ponerle precio adicional a los frescos en caso de ser combo agrandado
        return tipoRefresco.getPrecioBasico();
    }
    
    
    
    
    @Override
    public String toString() {
        return super.toString();
    }
@Override
    public String display(){
        return super.display()+"\nTipo de refresco: "+tipoRefresco;
    }
 

    public TipoRefresco getTipoRefresco() {
        return tipoRefresco;
    }

    public void setTipoRefresco(TipoRefresco tipoRefresco) {
        this.tipoRefresco = tipoRefresco;
    }
    
}
