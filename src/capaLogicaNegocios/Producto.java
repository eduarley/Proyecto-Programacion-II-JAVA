
package capaLogicaNegocios;

import java.io.Serializable;
import capaPersistencia.ProductoBD;
import java.util.ArrayList;


//sirve hacer abstracta
public class Producto implements Serializable{
    private String nombre;
    private String codigo;
    private double precioBasico;
    public Producto() {
    }

    public Producto(String codigo,String nombre,double precioBasico) {
        this.precioBasico=precioBasico;
        this.codigo=codigo;
        this.nombre = nombre;
    }
    public double montoExtra(){//ABSTRACTA
        return 0;
    }
    public double precioTotalProducto(){//ABSTRACTA
        return 0;   
    }

    
    
    
    @Override
    public String toString() {
        return nombre;
    }
    
    public String display(){
        return "Código: "+codigo+" "+
                "\nNombre: "+nombre+" "+
                "\nPrecio básico: "+precioBasico;
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }
    
    
    
    
    public static Producto consultarProducto(String codigo) throws Exception {
        return ProductoBD.getInstance().consultarProducto(codigo);
    }
    public static void agregarProducto(Producto prod) throws Exception {
        ProductoBD.getInstance().agregarProducto(prod);
    }
    public static void eliminarProducto(String codigo) throws Exception{
      ProductoBD.getInstance().eliminarProducto(codigo);
    }
    public static void modificarProducto(Producto prod) throws Exception{
        ProductoBD.getInstance().modificarProducto(prod);
    }
    public static ArrayList<Producto> listadoProducto() throws Exception {
       return ProductoBD.getInstance().listaProductos();
    }

    
    
    
}
