
package capaLogicaNegocios;

public enum TipoRefresco {
    Natural(600),
    Gaseoso(800);
    private double precioBasico;

    private TipoRefresco(double precio) {
        this.precioBasico = precio;
    }

    public double getPrecioBasico() {
        return precioBasico;
    }
    
}
