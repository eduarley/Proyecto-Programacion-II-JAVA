
package capaLogicaNegocios;

import java.io.Serializable;

public class PlatoPrincipal extends Producto implements Serializable{

  
    private double precioBasico;
    public PlatoPrincipal(String codigo,String nombre,double precioBasico) {
        super(codigo,nombre,precioBasico);
    }
    
    
    
    @Override
    public double montoExtra(){
        String doble="doble";
        double monto=0;
        String nombre=super.getNombre().toLowerCase();
        if(nombre.contains(doble)){
            monto+=precioBasico*0.1;
        }
        return monto;
    
    }
    @Override
    public double precioTotalProducto(){
        return precioBasico+montoExtra();
    }

    @Override
    public String toString() {
        return super.toString()+"";
    }
    @Override
    public String display(){
        return super.display();
    }

    public double getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }
    
    
}
