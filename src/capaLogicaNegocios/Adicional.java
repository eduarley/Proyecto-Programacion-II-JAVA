
package capaLogicaNegocios;

import java.io.Serializable;

public class Adicional extends Producto implements Serializable{
    private double precioBasico;
    
    
    
    public Adicional(String codigo,String nombre,double precioBasico) {
        super(codigo,nombre,precioBasico);
    }
    

    @Override
    public double precioTotalProducto(){
        return precioBasico;
    }
    @Override
    public String display(){
        return super.display();
    }
    
    public double precioCombo(){
        //esto con el fin de no ponerle precio adicional a los frescos en caso de ser combo agrandado
        return precioBasico;
    }

    @Override
    public String toString() {
        return super.toString()+"";
    }

    @Override
    public double getPrecioBasico() {
        return precioBasico;
    }

    @Override
    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }


    
}
